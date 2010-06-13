package org.openstreetmap.model;
import  org.openstreetmap.model.StyleEvaluator;
public class GeneratedStyleEvaluator extends StyleEvaluator  { 
protected Style mturning_circle = new Style ("Style"){
// DEBUG :adding turning_circle
protected Rule mRules0 = new Rule ("Rule"){
// DEBUG adding Rules
protected PointSymbolizer mSymbol1 = new PointSymbolizer( "symbols/turning_circle.15.png","png","15","15");
//LEAVING PointSymbolizer
public void LoadSymbols(){
Load(mSymbol1);
}
public void LoadCSS(){
}
public void LoadFilters(){
}
};//Rules end (mRules0)
protected Rule mRules1 = new Rule ("Rule"){
// DEBUG adding Rules
protected PointSymbolizer mSymbol2 = new PointSymbolizer( "symbols/turning_circle.19.png","png","19","19");
//LEAVING PointSymbolizer
public void LoadSymbols(){
Load(mSymbol2);
}
public void LoadCSS(){
}
public void LoadFilters(){
}
};//Rules end (mRules1)
public void LoadRules(){
Load(mRules0);
Load(mRules1);
}
};//turning_circle end
protected Style mhighway_area_casing = new Style ("Style"){
// DEBUG :adding highway_area_casing
protected Rule mRules2 = new Rule ("Rule"){
// DEBUG adding Rules
//FilterStart
//FilterEnd
protected Filter mFilter1 = new Filter(){
public void exec () {Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_residential))))))))));
};// end of exec
}; // end of Filter
protected LineSymbolizer mSymbol3 = new LineSymbolizer( );
//CSS: stroke
protected stroke mCSS0 = new stroke ("stroke"){
// DEBUG adding CSS
protected stroke mCSSConst = new stroke ("stroke","#999");
public void LoadCSSConst() { mCSSConst.load(); };
};//CSS end (mCSS0)
//CSS: stroke-width
protected stroke_width mCSS1 = new stroke_width ("stroke-width"){
// DEBUG adding CSS
protected stroke_width mCSSConst = new stroke_width ("stroke-width","1");
public void LoadCSSConst() { mCSSConst.load(); };
};//CSS end (mCSS1)
//LEAVING LineSymbolizer
public void LoadSymbols(){
Load(mSymbol3);
}
public void LoadCSS(){
Load(mCSS0);
Load(mCSS1);
}
public void LoadFilters(){
Load(mFilter1);
}
};//Rules end (mRules2)
protected Rule mRules3 = new Rule ("Rule"){
// DEBUG adding Rules
//FilterStart
//FilterEnd
protected Filter mFilter2 = new Filter(){
public void exec () {Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_path)))))))),And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_footway)))))))),And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_service)))))))),And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_pedestrian))))))))));
};// end of exec
}; // end of Filter
protected LineSymbolizer mSymbol4 = new LineSymbolizer( );
//CSS: stroke
protected stroke mCSS2 = new stroke ("stroke"){
// DEBUG adding CSS
protected stroke mCSSConst = new stroke ("stroke","grey");
public void LoadCSSConst() { mCSSConst.load(); };
};//CSS end (mCSS2)
//CSS: stroke-width
protected stroke_width mCSS3 = new stroke_width ("stroke-width"){
// DEBUG adding CSS
protected stroke_width mCSSConst = new stroke_width ("stroke-width","1");
public void LoadCSSConst() { mCSSConst.load(); };
};//CSS end (mCSS3)
//LEAVING LineSymbolizer
public void LoadSymbols(){
Load(mSymbol4);
}
public void LoadCSS(){
Load(mCSS2);
Load(mCSS3);
}
public void LoadFilters(){
Load(mFilter2);
}
};//Rules end (mRules3)
protected Rule mRules4 = new Rule ("Rule"){
// DEBUG adding Rules
//FilterStart
//FilterEnd
protected Filter mFilter3 = new Filter(){
public void exec () {Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_track))))))))));
};// end of exec
}; // end of Filter
protected LineSymbolizer mSymbol5 = new LineSymbolizer( );
//CSS: stroke
protected stroke mCSS4 = new stroke ("stroke"){
// DEBUG adding CSS
protected stroke mCSSConst = new stroke ("stroke","#996600");
public void LoadCSSConst() { mCSSConst.load(); };
};//CSS end (mCSS4)
//CSS: stroke-width
protected stroke_width mCSS5 = new stroke_width ("stroke-width"){
// DEBUG adding CSS
protected stroke_width mCSSConst = new stroke_width ("stroke-width","2");
public void LoadCSSConst() { mCSSConst.load(); };
};//CSS end (mCSS5)
//LEAVING LineSymbolizer
public void LoadSymbols(){
Load(mSymbol5);
}
public void LoadCSS(){
Load(mCSS4);
Load(mCSS5);
}
public void LoadFilters(){
Load(mFilter3);
}
};//Rules end (mRules4)
public void LoadRules(){
Load(mRules2);
Load(mRules3);
Load(mRules4);
}
};//highway_area_casing end
//Layer: turning_circle
protected Layer mLayer0 = new Layer ("Layer"){
// DEBUG :adding Layer
//Parameter: table
protected Parameter mtable0 = new Parameter("(select way from ");
protected Parameter mtable1 = new Parameter("prefix");
protected Parameter mtable2 = new Parameter("_point where highway=\'turning_circle\') as turning_circle");
public void LoadParameters(){
Load(mtable0);
Load(mtable1);
Load(mtable2);
}
public void LoadStyle() { 
Load(mturning_circle);
};
};//Layer end
//Layer: highway-area-casing
protected Layer mLayer1 = new Layer ("Layer"){
// DEBUG :adding Layer
//Parameter: table
protected Parameter mtable3 = new Parameter("\n      (select way,highway from ");
protected Parameter mtable4 = new Parameter("prefix");
protected Parameter mtable5 = new Parameter("_polygon\n       where highway in (\'residential\',\'unclassified\',\'pedestrian\',\'service\',\'footway\',\'track\',\'path\')\n       order by z_order,way_area desc) as roads\n      ");
public void LoadParameters(){
Load(mtable3);
Load(mtable4);
Load(mtable5);
}
public void LoadStyle() { 
Load(mhighway_area_casing);
};
};//Layer end
class highway extends typebase{
public highway obj;
protected Filter mcode0 = new Filter() { public void exec () {Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_residential))))))))));
}
};
protected Filter mcode1 = new Filter() { public void exec () {Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_path)))))))),And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_footway)))))))),And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_service)))))))),And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_pedestrian))))))))));
}
};
protected Filter mcode2 = new Filter() { public void exec () {Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_track))))))))));
}
};
}; // end of class highway 
public void LoadParameters(){
}
void ProcessStyle (BaseObject obj){}
public void LoadStyles(){
Load(mturning_circle);
Load(mhighway_area_casing);
}
public void LoadLayers(){
Load(mLayer0);
Load(mLayer1);
}
public static final highway VALUE_footway=null;
public static final highway VALUE_path=null;
public static final highway VALUE_pedestrian=null;
public static final highway VALUE_residential=null;
public static final highway VALUE_service=null;
public static final highway VALUE_track=null;
public static final highway VALUE_unclassified=null;};//end StyleEvaluator 
