// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.gui.dialogs.relation;

import static org.openstreetmap.josm.gui.help.HelpUtil.ht;
import static org.openstreetmap.josm.tools.I18n.tr;
import static org.openstreetmap.josm.tools.I18n.trn;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.command.AddCommand;
import org.openstreetmap.josm.command.ChangeCommand;
import org.openstreetmap.josm.command.ConflictAddCommand;
import org.openstreetmap.josm.data.conflict.Conflict;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.data.osm.Relation;
import org.openstreetmap.josm.data.osm.RelationMember;
import org.openstreetmap.josm.gui.ConditionalOptionPaneUtil;
import org.openstreetmap.josm.gui.DefaultNameFormatter;
import org.openstreetmap.josm.gui.HelpAwareOptionPane;
import org.openstreetmap.josm.gui.SideButton;
import org.openstreetmap.josm.gui.HelpAwareOptionPane.ButtonSpec;
import org.openstreetmap.josm.gui.help.ContextSensitiveHelpAction;
import org.openstreetmap.josm.gui.help.HelpUtil;
import org.openstreetmap.josm.gui.layer.OsmDataLayer;
import org.openstreetmap.josm.gui.tagging.TagEditorPanel;
import org.openstreetmap.josm.gui.tagging.ac.AutoCompletingTextField;
import org.openstreetmap.josm.gui.tagging.ac.AutoCompletionList;
import org.openstreetmap.josm.gui.tagging.ac.AutoCompletionManager;
import org.openstreetmap.josm.tools.ImageProvider;
import org.openstreetmap.josm.tools.Shortcut;
import org.openstreetmap.josm.tools.WindowGeometry;

/**
 * This dialog is for editing relations.
 *
 */
public class GenericRelationEditor extends RelationEditor  {
    @SuppressWarnings("unused")
    static private final Logger logger = Logger.getLogger(GenericRelationEditor.class.getName());

    /** the tag table and its model */
    private TagEditorPanel tagEditorPanel;
    private ReferringRelationsBrowser referrerBrowser;
    private ReferringRelationsBrowserModel referrerModel;

    /** the member table */
    private MemberTable memberTable;
    private MemberTableModel memberTableModel;

    /** the model for the selection table */
    private SelectionTableModel selectionTableModel;

    private AutoCompletingTextField tfRole;

    /**
     * Creates a new relation editor for the given relation. The relation will be saved if the user
     * selects "ok" in the editor.
     *
     * If no relation is given, will create an editor for a new relation.
     *
     * @param layer the {@see OsmDataLayer} the new or edited relation belongs to
     * @param relation relation to edit, or null to create a new one.
     * @param selectedMembers a collection of members which shall be selected initially
     */
    public GenericRelationEditor(OsmDataLayer layer, Relation relation, Collection<RelationMember> selectedMembers) {
        super(layer, relation, selectedMembers);

        setRememberWindowGeometry(getClass().getName() + ".geometry",
                WindowGeometry.centerInWindow(Main.parent, new Dimension(700, 650)));

        // init the various models
        //
        memberTableModel = new MemberTableModel(getLayer());
        memberTableModel.register();
        selectionTableModel = new SelectionTableModel(getLayer());
        selectionTableModel.register();
        referrerModel = new ReferringRelationsBrowserModel(relation);

        tagEditorPanel = new TagEditorPanel();
        // populate the models
        //
        if (relation != null) {
            tagEditorPanel.getModel().initFromPrimitive(relation);
            //this.tagEditorModel.initFromPrimitive(relation);
            this.memberTableModel.populate(relation);
            if (!getLayer().data.getRelations().contains(relation)) {
                // treat it as a new relation if it doesn't exist in the
                // data set yet.
                setRelation(null);
            }
        } else {
            tagEditorPanel.getModel().clear();
            this.memberTableModel.populate(null);
        }
        tagEditorPanel.getModel().ensureOneTag();

        JSplitPane pane = buildSplitPane();
        pane.setPreferredSize(new Dimension(100, 100));

        JPanel pnl = new JPanel();
        pnl.setLayout(new BorderLayout());
        pnl.add(pane, BorderLayout.CENTER);
        pnl.setBorder(BorderFactory.createRaisedBevelBorder());

        getContentPane().setLayout(new BorderLayout());
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add(tr("Tags and Members"), pnl);
        referrerBrowser = new ReferringRelationsBrowser(getLayer(), referrerModel, this);
        tabbedPane.add(tr("Parent Relations"), referrerBrowser);
        tabbedPane.add(tr("Child Relations"), new ChildRelationBrowser(getLayer(), relation));
        tabbedPane.addChangeListener(
                new ChangeListener() {
                    public void stateChanged(ChangeEvent e) {
                        JTabbedPane sourceTabbedPane = (JTabbedPane) e.getSource();
                        int index = sourceTabbedPane.getSelectedIndex();
                        String title = sourceTabbedPane.getTitleAt(index);
                        if (title.equals(tr("Parent Relations"))) {
                            referrerBrowser.init();
                        }
                    }
                }
        );

        getContentPane().add(buildToolBar(), BorderLayout.NORTH);
        getContentPane().add(tabbedPane, BorderLayout.CENTER);
        getContentPane().add(buildOkCancelButtonPanel(), BorderLayout.SOUTH);

        setSize(findMaxDialogSize());

        addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowOpened(WindowEvent e) {
                        cleanSelfReferences();
                    }
                }
        );

        memberTableModel.setSelectedMembers(selectedMembers);
        HelpUtil.setHelpContext(getRootPane(),ht("/Dialog/RelationEditor"));
    }

    /**
     * Creates the toolbar
     *
     * @return the toolbar
     */
    protected JToolBar buildToolBar() {
        JToolBar tb  = new JToolBar();
        tb.setFloatable(false);
        tb.add(new ApplyAction());
        tb.add(new DuplicateRelationAction());
        DeleteCurrentRelationAction deleteAction = new DeleteCurrentRelationAction();
        addPropertyChangeListener(deleteAction);
        tb.add(deleteAction);
        return tb;
    }

    /**
     * builds the panel with the OK and the Cancel button
     *
     * @return the panel with the OK and the Cancel button
     */
    protected JPanel buildOkCancelButtonPanel() {
        JPanel pnl = new JPanel();
        pnl.setLayout(new FlowLayout(FlowLayout.CENTER));

        pnl.add(new SideButton(new OKAction()));
        pnl.add(new SideButton(new CancelAction()));
        pnl.add(new SideButton(new ContextSensitiveHelpAction(ht("/Dialog/RelationEditor"))));
        return pnl;
    }

    /**
     * builds the panel with the tag editor
     *
     * @return the panel with the tag editor
     */
    protected JPanel buildTagEditorPanel() {
        JPanel pnl = new JPanel();
        pnl.setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridheight = 1;
        gc.gridwidth = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.weightx = 1.0;
        gc.weighty = 0.0;
        pnl.add(new JLabel(tr("Tags")), gc);

        gc.gridx = 0;
        gc.gridy = 1;
        gc.fill = GridBagConstraints.BOTH;
        gc.anchor = GridBagConstraints.CENTER;
        gc.weightx = 1.0;
        gc.weighty = 1.0;
        pnl.add(tagEditorPanel, gc);
        return pnl;
    }

    /**
     * builds the panel for the relation member editor
     *
     * @return the panel for the relation member editor
     */
    protected JPanel buildMemberEditorPanel() {
        final JPanel pnl = new JPanel();
        pnl.setLayout(new GridBagLayout());
        // setting up the member table
        memberTable = new MemberTable(getLayer(),memberTableModel);
        memberTable.addMouseListener(new MemberTableDblClickAdapter());
        memberTableModel.addMemberModelListener(memberTable);

        final JScrollPane scrollPane = new JScrollPane(memberTable);

        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridheight = 1;
        gc.gridwidth = 3;
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.weightx = 1.0;
        gc.weighty = 0.0;
        pnl.add(new JLabel(tr("Members")), gc);

        gc.gridx = 0;
        gc.gridy = 1;
        gc.gridheight = 1;
        gc.gridwidth = 1;
        gc.fill = GridBagConstraints.VERTICAL;
        gc.anchor = GridBagConstraints.NORTHWEST;
        gc.weightx = 0.0;
        gc.weighty = 1.0;
        pnl.add(buildLeftButtonPanel(), gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.fill = GridBagConstraints.BOTH;
        gc.anchor = GridBagConstraints.CENTER;
        gc.weightx = 0.6;
        gc.weighty = 1.0;
        pnl.add(scrollPane, gc);

        // --- role editing
        JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p3.add(new JLabel(tr("Apply Role:")));
        tfRole = new AutoCompletingTextField(10);
        tfRole.setToolTipText(tr("Enter a role and apply it to the selected relation members"));
        tfRole.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                tfRole.selectAll();
            }
        });
        tfRole.setAutoCompletionList(new AutoCompletionList());
        tfRole.addFocusListener(
                new FocusAdapter() {
                    @Override
                    public void focusGained(FocusEvent e) {
                        AutoCompletionList list = tfRole.getAutoCompletionList();
                        getLayer().data.getAutoCompletionManager().populateWithMemberRoles(list);
                    }
                }
        );
        p3.add(tfRole);
        SetRoleAction setRoleAction = new SetRoleAction();
        memberTableModel.getSelectionModel().addListSelectionListener(setRoleAction);
        tfRole.getDocument().addDocumentListener(setRoleAction);
        tfRole.addActionListener(setRoleAction);
        memberTableModel.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent e) {
                        tfRole.setEnabled(memberTable.getSelectedRowCount() > 0);
                    }
                }
        );
        tfRole.setEnabled(memberTable.getSelectedRowCount() > 0);
        SideButton btnApply = new SideButton(setRoleAction);
        btnApply.setPreferredSize(new Dimension(20,20));
        btnApply.setText("");
        p3.add(btnApply);

        gc.gridx = 1;
        gc.gridy = 2;
        gc.fill = GridBagConstraints.BOTH;
        gc.anchor = GridBagConstraints.CENTER;
        gc.weightx = 1.0;
        gc.weighty = 0.0;
        pnl.add(p3, gc);

        JPanel pnl2 = new JPanel();
        pnl2.setLayout(new GridBagLayout());

        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridheight = 1;
        gc.gridwidth = 3;
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.weightx = 1.0;
        gc.weighty = 0.0;
        pnl2.add(new JLabel(tr("Selection")), gc);

        gc.gridx = 0;
        gc.gridy = 1;
        gc.gridheight = 1;
        gc.gridwidth = 1;
        gc.fill = GridBagConstraints.VERTICAL;
        gc.anchor = GridBagConstraints.NORTHWEST;
        gc.weightx = 0.0;
        gc.weighty = 1.0;
        pnl2.add(buildSelectionControlButtonPanel(), gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 1.0;
        gc.weighty = 1.0;
        gc.fill = GridBagConstraints.BOTH;
        pnl2.add(buildSelectionTablePanel(), gc);

        final JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setLeftComponent(pnl);
        splitPane.setRightComponent(pnl2);
        splitPane.setOneTouchExpandable(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                // has to be called when the window is visible, otherwise
                // no effect
                splitPane.setDividerLocation(0.6);
            }
        });

        JPanel pnl3 = new JPanel();
        pnl3.setLayout(new BorderLayout());
        pnl3.add(splitPane, BorderLayout.CENTER);
        return pnl3;
    }

    /**
     * builds the panel with the table displaying the currently selected primitives
     *
     * @return
     */
    protected JPanel buildSelectionTablePanel() {
        JPanel pnl = new JPanel();
        pnl.setLayout(new BorderLayout());
        SelectionTable tbl = new SelectionTable(selectionTableModel, new SelectionTableColumnModel(memberTableModel));
        tbl.setMemberTableModel(memberTableModel);
        JScrollPane pane = new JScrollPane(tbl);
        pnl.add(pane, BorderLayout.CENTER);
        return pnl;
    }

    /**
     * builds the {@see JSplitPane} which divides the editor in an upper and a lower half
     *
     * @return the split panel
     */
    protected JSplitPane buildSplitPane() {
        final JSplitPane pane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        pane.setTopComponent(buildTagEditorPanel());
        pane.setBottomComponent(buildMemberEditorPanel());
        pane.setOneTouchExpandable(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                // has to be called when the window is visible, otherwise
                // no effect
                pane.setDividerLocation(0.3);
            }
        });
        return pane;
    }

    /**
     * build the panel with the buttons on the left
     *
     * @return
     */
    protected JToolBar buildLeftButtonPanel() {
        JToolBar tb = new JToolBar();
        tb.setOrientation(JToolBar.VERTICAL);
        tb.setFloatable(false);

        // -- move up action
        MoveUpAction moveUpAction = new MoveUpAction();
        memberTableModel.getSelectionModel().addListSelectionListener(moveUpAction);
        tb.add(moveUpAction);

        // -- move down action
        MoveDownAction moveDownAction = new MoveDownAction();
        memberTableModel.getSelectionModel().addListSelectionListener(moveDownAction);
        tb.add(moveDownAction);

        tb.addSeparator();

        // -- edit action
        EditAction editAction = new EditAction();
        memberTableModel.getSelectionModel().addListSelectionListener(editAction);
        tb.add(editAction);

        // -- delete action
        RemoveAction removeSelectedAction = new RemoveAction();
        memberTable.getSelectionModel().addListSelectionListener(removeSelectedAction);
        tb.add(removeSelectedAction);

        tb.addSeparator();
        // -- sort action
        SortAction sortAction = new SortAction();
        memberTableModel.addTableModelListener(sortAction);
        tb.add(sortAction);

        // -- reverse action
        ReverseAction reverseAction = new ReverseAction();
        memberTableModel.addTableModelListener(reverseAction);
        tb.add(reverseAction);

        tb.addSeparator();

        // -- download action
        DownloadIncompleteMembersAction downloadIncompleteMembersAction = new DownloadIncompleteMembersAction();
        memberTable.getModel().addTableModelListener(downloadIncompleteMembersAction);
        tb.add(downloadIncompleteMembersAction);

        // -- download selected action
        DownloadSelectedIncompleteMembersAction downloadSelectedIncompleteMembersAction = new DownloadSelectedIncompleteMembersAction();
        memberTable.getModel().addTableModelListener(downloadSelectedIncompleteMembersAction);
        memberTable.getSelectionModel().addListSelectionListener(downloadSelectedIncompleteMembersAction);
        tb.add(downloadSelectedIncompleteMembersAction);

        return tb;
    }

    /**
     * build the panel with the buttons for adding or removing the current selection
     *
     * @return
     */
    protected JToolBar buildSelectionControlButtonPanel() {
        JToolBar tb = new JToolBar(JToolBar.VERTICAL);
        tb.setFloatable(false);

        // -- add at end action
        AddSelectedAtEndAction addSelectedAtEndAction = new AddSelectedAtEndAction();
        selectionTableModel.addTableModelListener(addSelectedAtEndAction);
        tb.add(addSelectedAtEndAction);

        // -- select members action
        SelectedMembersForSelectionAction selectMembersForSelectionAction = new SelectedMembersForSelectionAction();
        selectionTableModel.addTableModelListener(selectMembersForSelectionAction);
        memberTableModel.addTableModelListener(selectMembersForSelectionAction);
        tb.add(selectMembersForSelectionAction);

        tb.addSeparator();

        // -- remove selected action
        RemoveSelectedAction removeSelectedAction = new RemoveSelectedAction();
        selectionTableModel.addTableModelListener(removeSelectedAction);
        tb.add(removeSelectedAction);

        // -- select action
        SelectPrimitivesForSelectedMembersAction selectAction = new SelectPrimitivesForSelectedMembersAction();
        memberTable.getSelectionModel().addListSelectionListener(selectAction);
        tb.add(selectAction);

        tb.addSeparator();

        // -- add at start action
        AddSelectedAtStartAction addSelectionAction = new AddSelectedAtStartAction();
        selectionTableModel.addTableModelListener(addSelectionAction);
        tb.add(addSelectionAction);

        // -- add before selected action
        AddSelectedBeforeSelection addSelectedBeforeSelectionAction = new AddSelectedBeforeSelection();
        selectionTableModel.addTableModelListener(addSelectedBeforeSelectionAction);
        memberTableModel.getSelectionModel().addListSelectionListener(addSelectedBeforeSelectionAction);
        tb.add(addSelectedBeforeSelectionAction);

        // -- add after selected action
        AddSelectedAfterSelection addSelectedAfterSelectionAction = new AddSelectedAfterSelection();
        selectionTableModel.addTableModelListener(addSelectedAfterSelectionAction);
        memberTableModel.getSelectionModel().addListSelectionListener(addSelectedAfterSelectionAction);
        tb.add(addSelectedAfterSelectionAction);

        return tb;
    }

    @Override
    protected Dimension findMaxDialogSize() {
        return new Dimension(700, 650);
    }

    @Override
    public void setVisible(boolean visible) {
        if (visible) {
            tagEditorPanel.initAutoCompletion(getLayer());
        }
        super.setVisible(visible);
        if (visible) {
            RelationDialogManager.getRelationDialogManager().positionOnScreen(this);
        } else {
            // make sure all registered listeners are unregistered
            //
            selectionTableModel.unregister();
            memberTableModel.unregister();
            memberTable.unlinkAsListener();
            dispose();
        }
    }

    /**
     * checks whether the current relation has members referring to itself. If so,
     * warns the users and provides an option for removing these members.
     *
     */
    protected void cleanSelfReferences() {
        ArrayList<OsmPrimitive> toCheck = new ArrayList<OsmPrimitive>();
        toCheck.add(getRelation());
        if (memberTableModel.hasMembersReferringTo(toCheck)) {
            int ret = ConditionalOptionPaneUtil.showOptionDialog(
                    "clean_relation_self_references",
                    Main.parent,
                    tr("<html>There is at least one member in this relation referring<br>"
                            + "to the relation itself.<br>"
                            + "This creates circular dependencies and is discouraged.<br>"
                            + "How do you want to proceed with circular dependencies?</html>"),
                            tr("Warning"),
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.WARNING_MESSAGE,
                            new String[]{tr("Remove them, clean up relation"), tr("Ignore them, leave relation as is")},
                            tr("Remove them, clean up relation")
            );
            switch(ret) {
            case ConditionalOptionPaneUtil.DIALOG_DISABLED_OPTION: return;
            case JOptionPane.CLOSED_OPTION: return;
            case JOptionPane.NO_OPTION: return;
            case JOptionPane.YES_OPTION:
                memberTableModel.removeMembersReferringTo(toCheck);
                break;
            }
        }
    }

    static class AddAbortException extends Exception  {
    }

    abstract class  AddFromSelectionAction extends AbstractAction {
        protected boolean isPotentialDuplicate(OsmPrimitive primitive) {
            return memberTableModel.hasMembersReferringTo(Collections.singleton(primitive));
        }

        protected boolean confirmAddingPrimtive(OsmPrimitive primitive)  throws AddAbortException {
            String msg = tr("<html>This relation already has one or more members referring to<br>"
                    + "the primitive ''{0}''<br>"
                    + "<br>"
                    + "Do you really want to add another relation member?</html>",
                    primitive.getDisplayName(DefaultNameFormatter.getInstance())
            );
            int ret = ConditionalOptionPaneUtil.showOptionDialog(
                    "add_primitive_to_relation",
                    Main.parent,
                    msg,
                    tr("Multiple members referring to same primitive"),
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    null
            );
            switch(ret) {
            case ConditionalOptionPaneUtil.DIALOG_DISABLED_OPTION : return true;
            case JOptionPane.YES_OPTION: return true;
            case JOptionPane.NO_OPTION: return false;
            case JOptionPane.CLOSED_OPTION: return false;
            case JOptionPane.CANCEL_OPTION: throw new AddAbortException();
            }
            // should not happen
            return false;
        }

        protected void warnOfCircularReferences(OsmPrimitive primitive) {
            String msg = tr("<html>You are trying to add a relation to itself.<br>"
                    + "<br>"
                    + "This creates circular references and is therefore discouraged.<br>"
                    + "Skipping relation ''{0}''.</html>",
                    primitive.getDisplayName(DefaultNameFormatter.getInstance())
            );
            JOptionPane.showMessageDialog(
                    Main.parent,
                    msg,
                    tr("Warning"),
                    JOptionPane.WARNING_MESSAGE
            );
        }

        protected List<OsmPrimitive> filterConfirmedPrimitives(List<OsmPrimitive> primitives) throws AddAbortException {
            if (primitives == null || primitives.isEmpty())
                return primitives;
            ArrayList<OsmPrimitive> ret = new ArrayList<OsmPrimitive>();
            Iterator<OsmPrimitive> it = primitives.iterator();
            while(it.hasNext()) {
                OsmPrimitive primitive = it.next();
                if (primitive instanceof Relation && getRelation() != null && getRelation().equals(primitive)) {
                    warnOfCircularReferences(primitive);
                    continue;
                }
                if (isPotentialDuplicate(primitive))  {
                    if (confirmAddingPrimtive(primitive)) {
                        ret.add(primitive);
                    }
                    continue;
                } else {
                    ret.add(primitive);
                }
            }
            return ret;
        }
    }

    class AddSelectedAtStartAction extends AddFromSelectionAction implements TableModelListener {
        public AddSelectedAtStartAction() {
            putValue(SHORT_DESCRIPTION,
                    tr("Add all primitives selected in the current dataset before the first member"));
            putValue(SMALL_ICON, ImageProvider.get("dialogs/conflict", "copystartright"));
            // putValue(NAME, tr("Add Selected"));
            refreshEnabled();
        }

        protected void refreshEnabled() {
            setEnabled(selectionTableModel.getRowCount() > 0 && memberTableModel.getRowCount() > 0);
        }

        public void actionPerformed(ActionEvent e) {
            try {
                List<OsmPrimitive> toAdd = filterConfirmedPrimitives(selectionTableModel.getSelection());
                memberTableModel.addMembersAtBeginning(toAdd);
            } catch(AddAbortException ex) {
                // do nothing
            }
        }

        public void tableChanged(TableModelEvent e) {
            refreshEnabled();
        }
    }

    class AddSelectedAtEndAction extends AddFromSelectionAction implements TableModelListener {
        public AddSelectedAtEndAction() {
            putValue(SHORT_DESCRIPTION, tr("Add all primitives selected in the current dataset after the last member"));
            putValue(SMALL_ICON, ImageProvider.get("dialogs/conflict", "copyendright"));
            // putValue(NAME, tr("Add Selected"));
            refreshEnabled();
        }

        protected void refreshEnabled() {
            setEnabled(selectionTableModel.getRowCount() > 0);
        }

        public void actionPerformed(ActionEvent e) {
            try {
                List<OsmPrimitive> toAdd = filterConfirmedPrimitives(selectionTableModel.getSelection());
                memberTableModel.addMembersAtEnd(toAdd);
            } catch(AddAbortException ex) {
                // do nothing
            }
        }

        public void tableChanged(TableModelEvent e) {
            refreshEnabled();
        }
    }

    class AddSelectedBeforeSelection extends AddFromSelectionAction implements TableModelListener, ListSelectionListener {
        public AddSelectedBeforeSelection() {
            putValue(SHORT_DESCRIPTION,
                    tr("Add all primitives selected in the current dataset before the first selected member"));
            putValue(SMALL_ICON, ImageProvider.get("dialogs/conflict", "copybeforecurrentright"));
            // putValue(NAME, tr("Add Selected"));
            refreshEnabled();
        }

        protected void refreshEnabled() {
            setEnabled(selectionTableModel.getRowCount() > 0
                    && memberTableModel.getSelectionModel().getMinSelectionIndex() >= 0);
        }

        public void actionPerformed(ActionEvent e) {
            try {
                List<OsmPrimitive> toAdd = filterConfirmedPrimitives(selectionTableModel.getSelection());
                memberTableModel.addMembersBeforeIdx(toAdd, memberTableModel
                        .getSelectionModel().getMinSelectionIndex());
            } catch(AddAbortException ex) {
                // do nothing
            }

        }

        public void tableChanged(TableModelEvent e) {
            refreshEnabled();
        }

        public void valueChanged(ListSelectionEvent e) {
            refreshEnabled();
        }
    }

    class AddSelectedAfterSelection extends AddFromSelectionAction implements TableModelListener, ListSelectionListener {
        public AddSelectedAfterSelection() {
            putValue(SHORT_DESCRIPTION,
                    tr("Add all primitives selected in the current dataset after the last selected member"));
            putValue(SMALL_ICON, ImageProvider.get("dialogs/conflict", "copyaftercurrentright"));
            // putValue(NAME, tr("Add Selected"));
            refreshEnabled();
        }

        protected void refreshEnabled() {
            setEnabled(selectionTableModel.getRowCount() > 0
                    && memberTableModel.getSelectionModel().getMinSelectionIndex() >= 0);
        }

        public void actionPerformed(ActionEvent e) {
            try {
                List<OsmPrimitive> toAdd = filterConfirmedPrimitives(selectionTableModel.getSelection());
                memberTableModel.addMembersAfterIdx(toAdd, memberTableModel
                        .getSelectionModel().getMaxSelectionIndex());
            } catch(AddAbortException ex) {
                // do nothing
            }
        }

        public void tableChanged(TableModelEvent e) {
            refreshEnabled();
        }

        public void valueChanged(ListSelectionEvent e) {
            refreshEnabled();
        }
    }

    class RemoveSelectedAction extends AbstractAction implements TableModelListener {
        public RemoveSelectedAction() {
            putValue(SHORT_DESCRIPTION, tr("Remove all members referring to one of the selected primitives"));
            putValue(SMALL_ICON, ImageProvider.get("dialogs/relation", "deletemembers"));
            // putValue(NAME, tr("Remove Selected"));
            Shortcut.registerShortcut("relationeditor:removeselected", tr("Relation Editor: Remove Selected"),
                    KeyEvent.VK_S, Shortcut.GROUP_MNEMONIC);

            updateEnabledState();
        }

        protected void updateEnabledState() {
            DataSet ds = getLayer().data;
            if (ds == null || ds.getSelected().isEmpty()) {
                setEnabled(false);
                return;
            }
            // only enable the action if we have members referring to the
            // selected primitives
            //
            setEnabled(memberTableModel.hasMembersReferringTo(ds.getSelected()));
        }

        public void actionPerformed(ActionEvent e) {
            memberTableModel.removeMembersReferringTo(selectionTableModel.getSelection());
        }

        public void tableChanged(TableModelEvent e) {
            updateEnabledState();
        }
    }

    /**
     * Selects  members in the relation editor which refer to primitives in the current
     * selection of the context layer.
     *
     */
    class SelectedMembersForSelectionAction extends AbstractAction implements TableModelListener {
        public SelectedMembersForSelectionAction() {
            putValue(SHORT_DESCRIPTION, tr("Select relation members which refer to primitives in the current selection"));
            putValue(SMALL_ICON, ImageProvider.get("dialogs/relation", "selectmembers"));
            updateEnabledState();
        }

        protected void updateEnabledState() {
            boolean enabled = selectionTableModel.getRowCount() > 0
            &&  !memberTableModel.getChildPrimitives(getLayer().data.getSelected()).isEmpty();

            if (enabled) {
                putValue(SHORT_DESCRIPTION, tr("Select relation members which refer to {0} primitives in the current selection",memberTableModel.getChildPrimitives(getLayer().data.getSelected()).size()));
            } else {
                putValue(SHORT_DESCRIPTION, tr("Select relation members which refer to primitives in the current selection"));
            }
            setEnabled(enabled);
        }

        public void actionPerformed(ActionEvent e) {
            memberTableModel.selectMembersReferringTo(getLayer().data.getSelected());
        }

        public void tableChanged(TableModelEvent e) {
            updateEnabledState();

        }
    }

    /**
     * Selects primitives in the layer this editor belongs to. The selected primitives are
     * equal to the set of primitives the currently selected relation members refer to.
     *
     */
    class SelectPrimitivesForSelectedMembersAction extends AbstractAction implements ListSelectionListener {
        public SelectPrimitivesForSelectedMembersAction() {
            putValue(SHORT_DESCRIPTION, tr("Select primitives for selected relation members"));
            putValue(SMALL_ICON, ImageProvider.get("dialogs/relation", "selectprimitives"));
            updateEnabledState();
        }

        protected void updateEnabledState() {
            setEnabled(memberTable.getSelectedRowCount() > 0);
        }

        public void actionPerformed(ActionEvent e) {
            getLayer().data.setSelected(memberTableModel.getSelectedChildPrimitives());
        }

        public void valueChanged(ListSelectionEvent e) {
            updateEnabledState();
        }
    }

    class SortAction extends AbstractAction implements TableModelListener {
        public SortAction() {
            putValue(SHORT_DESCRIPTION, tr("Sort the relation members"));
            putValue(SMALL_ICON, ImageProvider.get("dialogs", "sort"));
            putValue(NAME, tr("Sort"));
            Shortcut.registerShortcut("relationeditor:sort", tr("Relation Editor: Sort"), KeyEvent.VK_T,
                    Shortcut.GROUP_MNEMONIC);
            updateEnabledState();
        }

        public void actionPerformed(ActionEvent e) {
            memberTableModel.sort();
        }

        protected void updateEnabledState() {
            setEnabled(memberTableModel.getRowCount() > 0);
        }

        public void tableChanged(TableModelEvent e) {
            updateEnabledState();
        }
    }

    class ReverseAction extends AbstractAction implements TableModelListener {
        public ReverseAction() {
            putValue(SHORT_DESCRIPTION, tr("Reverse the order of the relation members"));
            putValue(SMALL_ICON, ImageProvider.get("dialogs/relation", "reverse"));
            putValue(NAME, tr("Reverse"));
            Shortcut.registerShortcut("relationeditor:reverse", tr("Relation Editor: Reverse"), KeyEvent.VK_R,
                    Shortcut.GROUP_MNEMONIC);
            updateEnabledState();
        }

        public void actionPerformed(ActionEvent e) {
            memberTableModel.reverse();
        }

        protected void updateEnabledState() {
            setEnabled(memberTableModel.getRowCount() > 0);
        }

        public void tableChanged(TableModelEvent e) {
            updateEnabledState();
        }
    }

    class MoveUpAction extends AbstractAction implements ListSelectionListener {
        public MoveUpAction() {
            putValue(SHORT_DESCRIPTION, tr("Move the currently selected members up"));
            putValue(SMALL_ICON, ImageProvider.get("dialogs", "moveup"));
            // putValue(NAME, tr("Move Up"));
            Shortcut.registerShortcut("relationeditor:moveup", tr("Relation Editor: Move Up"), KeyEvent.VK_N,
                    Shortcut.GROUP_MNEMONIC);
            setEnabled(false);
        }

        public void actionPerformed(ActionEvent e) {
            memberTableModel.moveUp(memberTable.getSelectedRows());
        }

        public void valueChanged(ListSelectionEvent e) {
            setEnabled(memberTableModel.canMoveUp(memberTable.getSelectedRows()));
        }
    }

    class MoveDownAction extends AbstractAction implements ListSelectionListener {
        public MoveDownAction() {
            putValue(SHORT_DESCRIPTION, tr("Move the currently selected members down"));
            putValue(SMALL_ICON, ImageProvider.get("dialogs", "movedown"));
            // putValue(NAME, tr("Move Down"));
            Shortcut.registerShortcut("relationeditor:moveup", tr("Relation Editor: Move Down"), KeyEvent.VK_J,
                    Shortcut.GROUP_MNEMONIC);
            setEnabled(false);
        }

        public void actionPerformed(ActionEvent e) {
            memberTableModel.moveDown(memberTable.getSelectedRows());
        }

        public void valueChanged(ListSelectionEvent e) {
            setEnabled(memberTableModel.canMoveDown(memberTable.getSelectedRows()));
        }
    }

    class RemoveAction extends AbstractAction implements ListSelectionListener {
        public RemoveAction() {
            putValue(SHORT_DESCRIPTION, tr("Remove the currently selected members from this relation"));
            putValue(SMALL_ICON, ImageProvider.get("dialogs", "remove"));
            // putValue(NAME, tr("Remove"));
            Shortcut.registerShortcut("relationeditor:remove", tr("Relation Editor: Remove"), KeyEvent.VK_J,
                    Shortcut.GROUP_MNEMONIC);
            setEnabled(false);
        }

        public void actionPerformed(ActionEvent e) {
            memberTableModel.remove(memberTable.getSelectedRows());
        }

        public void valueChanged(ListSelectionEvent e) {
            setEnabled(memberTableModel.canRemove(memberTable.getSelectedRows()));
        }
    }

    class DeleteCurrentRelationAction extends AbstractAction implements PropertyChangeListener{
        public DeleteCurrentRelationAction() {
            putValue(SHORT_DESCRIPTION, tr("Delete the currently edited relation"));
            putValue(SMALL_ICON, ImageProvider.get("dialogs", "delete"));
            putValue(NAME, tr("Delete"));
            updateEnabledState();
        }

        public void run() {
            Relation toDelete = getRelation();
            if (toDelete == null)
                return;
            org.openstreetmap.josm.actions.mapmode.DeleteAction.deleteRelation(
                    getLayer(),
                    toDelete
            );
        }

        public void actionPerformed(ActionEvent e) {
            run();
        }

        protected void updateEnabledState() {
            setEnabled(getRelationSnapshot() != null);
        }

        public void propertyChange(PropertyChangeEvent evt) {
            if (evt.getPropertyName().equals(RELATION_SNAPSHOT_PROP)) {
                updateEnabledState();
            }
        }
    }

    abstract class SavingAction extends AbstractAction {
        /**
         * apply updates to a new relation
         */
        protected void applyNewRelation() {
            Relation newRelation = new Relation();
            tagEditorPanel.getModel().applyToPrimitive(newRelation);
            memberTableModel.applyToRelation(newRelation);
            List<RelationMember> newMembers = new ArrayList<RelationMember>();
            for (RelationMember rm: newRelation.getMembers()) {
                if (!rm.getMember().isDeleted()) {
                    newMembers.add(rm);
                }
            }
            if (newRelation.getMembersCount() != newMembers.size()) {
                newRelation.setMembers(newMembers);
                String msg = tr("One or more members of this new relation have been deleted while the relation editor\n" +
                "was open. They have been removed from the relation members list.");
                JOptionPane.showMessageDialog(Main.parent, msg, tr("Warning"), JOptionPane.WARNING_MESSAGE);
            }
            // If the user wanted to create a new relation, but hasn't added any members or
            // tags, don't add an empty relation
            if (newRelation.getMembersCount() == 0 && !newRelation.hasKeys())
                return;
            Main.main.undoRedo.add(new AddCommand(getLayer(),newRelation));

            // make sure everybody is notified about the changes
            //
            getLayer().data.fireSelectionChanged();
            GenericRelationEditor.this.setRelation(newRelation);
            RelationDialogManager.getRelationDialogManager().updateContext(
                    getLayer(),
                    getRelation(),
                    GenericRelationEditor.this
            );
        }

        /**
         * Apply the updates for an existing relation which has been changed
         * outside of the relation editor.
         *
         */
        protected void applyExistingConflictingRelation() {
            Relation editedRelation = new Relation(getRelation());
            tagEditorPanel.getModel().applyToPrimitive(editedRelation);
            memberTableModel.applyToRelation(editedRelation);
            Conflict<Relation> conflict = new Conflict<Relation>(getRelation(), editedRelation);
            Main.main.undoRedo.add(new ConflictAddCommand(getLayer(),conflict));
        }

        /**
         * Apply the updates for an existing relation which has not been changed
         * outside of the relation editor.
         *
         */
        protected void applyExistingNonConflictingRelation() {
            Relation editedRelation = new Relation(getRelation());
            tagEditorPanel.getModel().applyToPrimitive(editedRelation);
            memberTableModel.applyToRelation(editedRelation);
            Main.main.undoRedo.add(new ChangeCommand(getRelation(), editedRelation));
            getLayer().data.fireSelectionChanged();
            getLayer().fireDataChange();
            // this will refresh the snapshot and update the dialog title
            //
            setRelation(getRelation());
        }

        protected boolean confirmClosingBecauseOfDirtyState() {
            ButtonSpec [] options = new ButtonSpec[] {
                    new ButtonSpec(
                            tr("Yes, create a conflict and close"),
                            ImageProvider.get("ok"),
                            tr("Click to create a conflict and close this relation editor") ,
                            null /* no specific help topic */
                    ),
                    new ButtonSpec(
                            tr("No, continue editing"),
                            ImageProvider.get("cancel"),
                            tr("Click to return to the relation editor and to resume relation editing") ,
                            null /* no specific help topic */
                    )
            };

            int ret = HelpAwareOptionPane.showOptionDialog(
                    Main.parent,
                    tr("<html>This relation has been changed outside of the editor.<br>"
                            + "You cannot apply your changes and continue editing.<br>"
                            + "<br>"
                            + "Do you want to create a conflict and close the editor?</html>"),
                            tr("Conflict in data"),
                            JOptionPane.WARNING_MESSAGE,
                            null,
                            options,
                            options[0], // OK is default
                            "/Dialog/RelationEditor#RelationChangedOutsideOfEditor"
            );
            return ret == 0;
        }

        protected void warnDoubleConflict() {
            JOptionPane.showMessageDialog(
                    Main.parent,
                    tr("<html>Layer ''{0}'' already has a conflict for primitive<br>"
                            + "''{1}''.<br>"
                            + "Please resolve this conflict first, then try again.</html>",
                            getLayer().getName(),
                            getRelation().getDisplayName(DefaultNameFormatter.getInstance())
                    ),
                    tr("Double conflict"),
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }

    class ApplyAction extends SavingAction {
        public ApplyAction() {
            putValue(SHORT_DESCRIPTION, tr("Apply the current updates"));
            putValue(SMALL_ICON, ImageProvider.get("save"));
            putValue(NAME, tr("Apply"));
            setEnabled(true);
        }

        public void run() {
            if (getRelation() == null) {
                applyNewRelation();
            } else if (!memberTableModel.hasSameMembersAs(getRelationSnapshot())
                    || tagEditorPanel.getModel().isDirty()) {
                if (isDirtyRelation()) {
                    if (confirmClosingBecauseOfDirtyState()) {
                        if (getLayer().getConflicts().hasConflictForMy(getRelation())) {
                            warnDoubleConflict();
                            return;
                        }
                        applyExistingConflictingRelation();
                        setVisible(false);
                    }
                } else {
                    applyExistingNonConflictingRelation();
                }
            }
        }

        public void actionPerformed(ActionEvent e) {
            run();
        }
    }

    class OKAction extends SavingAction {
        public OKAction() {
            putValue(SHORT_DESCRIPTION, tr("Apply the updates and close the dialog"));
            putValue(SMALL_ICON, ImageProvider.get("ok"));
            putValue(NAME, tr("OK"));
            setEnabled(true);
        }

        public void run() {
            if (getRelation() == null) {
                applyNewRelation();
            } else if (!memberTableModel.hasSameMembersAs(getRelationSnapshot())
                    || tagEditorPanel.getModel().isDirty()) {
                if (isDirtyRelation()) {
                    if (confirmClosingBecauseOfDirtyState()) {
                        if (getLayer().getConflicts().hasConflictForMy(getRelation())) {
                            warnDoubleConflict();
                            return;
                        }
                        applyExistingConflictingRelation();
                    } else
                        return;
                } else {
                    applyExistingNonConflictingRelation();
                }
            }
            setVisible(false);
        }

        public void actionPerformed(ActionEvent e) {
            run();
        }
    }

    class CancelAction extends AbstractAction {
        public CancelAction() {
            putValue(SHORT_DESCRIPTION, tr("Cancel the updates and close the dialog"));
            putValue(SMALL_ICON, ImageProvider.get("cancel"));
            putValue(NAME, tr("Cancel"));

            getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
            .put(KeyStroke.getKeyStroke("ESCAPE"), "ESCAPE");
            getRootPane().getActionMap().put("ESCAPE", this);
            setEnabled(true);
        }

        public void actionPerformed(ActionEvent e) {
            setVisible(false);
        }
    }

    class AddTagAction extends AbstractAction {
        public AddTagAction() {
            putValue(SHORT_DESCRIPTION, tr("Add an empty tag"));
            putValue(SMALL_ICON, ImageProvider.get("dialogs", "add"));
            // putValue(NAME, tr("Cancel"));
            setEnabled(true);
        }

        public void actionPerformed(ActionEvent e) {
            tagEditorPanel.getModel().appendNewTag();
        }
    }

    class DownloadIncompleteMembersAction extends AbstractAction implements TableModelListener {
        public DownloadIncompleteMembersAction() {
            putValue(SHORT_DESCRIPTION, tr("Download all incomplete members"));
            putValue(SMALL_ICON, ImageProvider.get("dialogs/relation", "downloadincomplete"));
            putValue(NAME, tr("Download Members"));
            Shortcut.registerShortcut("relationeditor:downloadincomplete", tr("Relation Editor: Download Members"),
                    KeyEvent.VK_K, Shortcut.GROUP_MNEMONIC);
            updateEnabledState();
        }

        public void actionPerformed(ActionEvent e) {
            if (!isEnabled())
                return;
            Main.worker.submit(new DownloadRelationMemberTask(
                    getRelation(),
                    memberTableModel.getIncompleteMemberPrimitives(),
                    getLayer(),
                    GenericRelationEditor.this)
            );
        }

        protected void updateEnabledState() {
            setEnabled(
                    getRelation() != null
                    && memberTableModel.hasIncompleteMembers()
            );
        }

        public void tableChanged(TableModelEvent e) {
            updateEnabledState();
        }
    }

    class DownloadSelectedIncompleteMembersAction extends AbstractAction implements ListSelectionListener, TableModelListener{
        public DownloadSelectedIncompleteMembersAction() {
            putValue(SHORT_DESCRIPTION, tr("Download selected incomplete members"));
            putValue(SMALL_ICON, ImageProvider.get("dialogs/relation", "downloadincompleteselected"));
            putValue(NAME, tr("Download Members"));
            Shortcut.registerShortcut("relationeditor:downloadincomplete", tr("Relation Editor: Download Members"),
                    KeyEvent.VK_K, Shortcut.GROUP_MNEMONIC);
            updateEnabledState();
        }

        public void actionPerformed(ActionEvent e) {
            if (!isEnabled())
                return;
            Main.worker.submit(new DownloadRelationMemberTask(
                    getRelation(),
                    memberTableModel.getSelectedIncompleteMemberPrimitives(),
                    getLayer(),
                    GenericRelationEditor.this)
            );
        }

        protected void updateEnabledState() {
            setEnabled(
                    getRelation() != null
                    && memberTableModel.hasIncompleteSelectedMembers()
            );
        }

        public void valueChanged(ListSelectionEvent e) {
            updateEnabledState();
        }

        public void tableChanged(TableModelEvent e) {
            updateEnabledState();
        }
    }

    class SetRoleAction extends AbstractAction implements ListSelectionListener, DocumentListener {
        public SetRoleAction() {
            putValue(SHORT_DESCRIPTION, tr("Sets a role for the selected members"));
            putValue(SMALL_ICON, ImageProvider.get("apply"));
            putValue(NAME, tr("Apply Role"));
            refreshEnabled();
        }

        protected void refreshEnabled() {
            setEnabled(memberTable.getSelectedRowCount() > 0);
        }

        protected boolean isEmptyRole() {
            return tfRole.getText() == null || tfRole.getText().trim().equals("");
        }

        protected boolean confirmSettingEmptyRole(int onNumMembers) {
            String message = "<html>"
                + trn("You are setting an empty role on {0} primitive.",
                        "You are setting an empty role on {0} primitives.", onNumMembers, onNumMembers)
                        + "<br>"
                        + tr("This is equal to deleting the roles of these primitives.") +
                        "<br>"
                        + tr("Do you really want to apply the new role?") + "</html>";
            String [] options = new String[] {
                    tr("Yes, apply it"),
                    tr("No, do not apply")
            };
            int ret = ConditionalOptionPaneUtil.showOptionDialog(
                    "relation_editor.confirm_applying_empty_role",
                    Main.parent,
                    message,
                    tr("Confirm empty role"),
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    options,
                    options[0]
            );
            switch(ret) {
            case JOptionPane.YES_OPTION: return true;
            case ConditionalOptionPaneUtil.DIALOG_DISABLED_OPTION: return true;
            default:
                return false;
            }
        }

        public void actionPerformed(ActionEvent e) {
            if (isEmptyRole()) {
                if (! confirmSettingEmptyRole(memberTable.getSelectedRowCount()))
                    return;
            }
            memberTableModel.updateRole(memberTable.getSelectedRows(), tfRole.getText());
        }

        public void valueChanged(ListSelectionEvent e) {
            refreshEnabled();
        }

        public void changedUpdate(DocumentEvent e) {
            refreshEnabled();
        }

        public void insertUpdate(DocumentEvent e) {
            refreshEnabled();
        }

        public void removeUpdate(DocumentEvent e) {
            refreshEnabled();
        }
    }

    /**
     * Creates a new relation with a copy of the current editor state
     *
     */
    class DuplicateRelationAction extends AbstractAction {
        public DuplicateRelationAction() {
            putValue(SHORT_DESCRIPTION, tr("Create a copy of this relation and open it in another editor window"));
            // FIXME provide an icon
            putValue(SMALL_ICON, ImageProvider.get("duplicate"));
            putValue(NAME, tr("Duplicate"));
            setEnabled(true);
        }

        public void actionPerformed(ActionEvent e) {
            Relation copy = new Relation();
            tagEditorPanel.getModel().applyToPrimitive(copy);
            memberTableModel.applyToRelation(copy);
            RelationEditor editor = RelationEditor.getEditor(getLayer(), copy, memberTableModel.getSelectedMembers());
            editor.setVisible(true);
        }
    }

    /**
     * Action for editing the currently selected relation
     *
     *
     */
    class EditAction extends AbstractAction implements ListSelectionListener {
        public EditAction() {
            putValue(SHORT_DESCRIPTION, tr("Edit the relation the currently selected relation member refers to"));
            putValue(SMALL_ICON, ImageProvider.get("dialogs", "edit"));
            //putValue(NAME, tr("Edit"));
            refreshEnabled();
        }

        protected void refreshEnabled() {
            setEnabled(memberTable.getSelectedRowCount() == 1
                    && memberTableModel.isEditableRelation(memberTable.getSelectedRow()));
        }

        protected Collection<RelationMember> getMembersForCurrentSelection(Relation r) {
            Collection<RelationMember> members = new HashSet<RelationMember>();
            Collection<OsmPrimitive> selection = getLayer().data.getSelected();
            for (RelationMember member: r.getMembers()) {
                if (selection.contains(member.getMember())) {
                    members.add(member);
                }
            }
            return members;
        }

        public void run() {
            int idx = memberTable.getSelectedRow();
            if (idx < 0)
                return;
            OsmPrimitive primitive = memberTableModel.getReferredPrimitive(idx);
            if (!(primitive instanceof Relation))
                return;
            Relation r = (Relation) primitive;
            if (r.isIncomplete())
                return;

            RelationEditor editor = RelationEditor.getEditor(getLayer(), r, getMembersForCurrentSelection(r));
            editor.setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
            if (!isEnabled())
                return;
            run();
        }

        public void valueChanged(ListSelectionEvent e) {
            refreshEnabled();
        }
    }

    class MemberTableDblClickAdapter extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON1 && e.getClickCount() == 2) {
                new EditAction().run();
            }
        }
    }
}
