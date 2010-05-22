// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.gui.dialogs.changeset;

import static org.openstreetmap.josm.tools.I18n.tr;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Collections;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.JTextComponent;

import org.openstreetmap.josm.gui.SideButton;
import org.openstreetmap.josm.gui.widgets.AbstractTextComponentValidator;
import org.openstreetmap.josm.gui.widgets.SelectAllOnFocusGainedDecorator;
import org.openstreetmap.josm.tools.ImageProvider;

/**
 * This panel allows to enter the ID of single changeset and to download
 * the respective changeset.
 *
 */
public class SingleChangesetDownloadPanel extends JPanel {

    private JTextField tfChangesetId;
    private DownloadAction actDownload;
    private ChangesetIdValidator valChangesetId;

    protected void build() {
        setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(Color.GRAY),
                        BorderFactory.createEmptyBorder(0,3,0,3)
                )
        );

        add(new JLabel(tr("Changeset ID: ")));
        add(tfChangesetId = new JTextField(10));
        tfChangesetId.setToolTipText(tr("Enter a changeset id"));
        valChangesetId  =ChangesetIdValidator.decorate(tfChangesetId);
        SelectAllOnFocusGainedDecorator.decorate(tfChangesetId);

        actDownload = new DownloadAction();
        SideButton btn = new SideButton(actDownload);
        tfChangesetId.addActionListener(actDownload);
        tfChangesetId.getDocument().addDocumentListener(actDownload);
        add(btn);
    }

    public SingleChangesetDownloadPanel() {
        build();
    }

    /**
     * Replies the changeset id entered in this panel. 0 if no changeset id
     * or an invalid changeset id is currently entered.
     *
     * @return the changeset id entered in this panel
     */
    public int getChangesetId() {
        return valChangesetId.getChangesetId();
    }

    /**
     * Downloads the single changeset from the OSM API
     */
    class DownloadAction extends AbstractAction implements DocumentListener{

        public DownloadAction() {
            putValue(SMALL_ICON, ImageProvider.get("dialogs/changeset", "downloadchangesetcontent"));
            putValue(SHORT_DESCRIPTION, tr("Download the changeset with the specified id, including the changeset content"));
            updateEnabledState();
        }

        public void actionPerformed(ActionEvent arg0) {
            if (!isEnabled())
                return;
            int id = getChangesetId();
            if (id == 0) return;
            ChangesetContentDownloadTask task =  new ChangesetContentDownloadTask(
                    SingleChangesetDownloadPanel.this,
                    Collections.singleton(id)
            );
            ChangesetCacheManager.getInstance().runDownloadTask(task);
        }

        protected void updateEnabledState() {
            String v = tfChangesetId.getText();
            if (v == null || v.trim().length() == 0) {
                setEnabled(false);
                return;
            }
            setEnabled(valChangesetId.isValid());
        }

        public void changedUpdate(DocumentEvent arg0) {
            updateEnabledState();
        }

        public void insertUpdate(DocumentEvent arg0) {
            updateEnabledState();
        }

        public void removeUpdate(DocumentEvent arg0) {
            updateEnabledState();
        }
    }

    /**
     * Validator for a changeset ID entered in a {@see JTextComponent}.
     *
     */
    static private class ChangesetIdValidator extends AbstractTextComponentValidator {
        static public ChangesetIdValidator decorate(JTextComponent tc) {
            return new ChangesetIdValidator(tc);
        }

        public ChangesetIdValidator(JTextComponent tc) {
            super(tc);
        }

        @Override
        public boolean isValid() {
            String value  = getComponent().getText();
            if (value == null || value.trim().length() == 0)
                return true;
            return getChangesetId() > 0;
        }

        @Override
        public void validate() {
            if (!isValid()) {
                feedbackInvalid(tr("The current value is not a valid changeset ID. Please enter an integer value > 0"));
            } else {
                feedbackValid(tr("Please enter an integer value > 0"));
            }
        }

        public int getChangesetId() {
            String value  = getComponent().getText();
            if (value == null || value.trim().length() == 0) return 0;
            try {
                int changesetId = Integer.parseInt(value.trim());
                if (changesetId > 0) return changesetId;
                return 0;
            } catch(NumberFormatException e) {
                return 0;
            }
        }
    }
}
