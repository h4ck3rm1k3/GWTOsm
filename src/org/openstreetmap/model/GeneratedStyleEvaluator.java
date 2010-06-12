package org.openstreetmap.model;
import  org.openstreetmap.model.StyleEvaluator;
public class GeneratedStyleEvaluator extends StyleEvaluator  { 
//DEBUG start Map
//DEBUG characters in Map
//DEBUG characters in Map
//DEBUG characters in Map
protected Style mturning_circle = new Style ("Style"){
// DEBUG :adding turning_circle
//DEBUG start Style
//DEBUG characters in Style
protected Rule mRules0 = new Rule ("Rule"){
// DEBUG adding Rules
//DEBUG start Rule
//DEBUG characters in Rule
//DEBUG start MaxScaleDenominator
//DEBUG characters in MaxScaleDenominator
//DEBUG end MaxScaleDenominator / MaxScaleDenominator
//DEBUG characters in Rule
//DEBUG start MinScaleDenominator
//DEBUG characters in MinScaleDenominator
//DEBUG end MinScaleDenominator / MinScaleDenominator
//DEBUG characters in Rule
protected PointSymbolizer mSymbol1 = new PointSymbolizer( "symbols/turning_circle.15.png","png","15","15");
//DEBUG start PointSymbolizer
//DEBUG end PointSymbolizer / PointSymbolizer
//LEAVING PointSymbolizer
//DEBUG characters in Rule
//DEBUG end Rule / Rule
public void LoadSymbols(){
Load(mSymbol1);
}
//Before Popall Rules  / RuleVars: mRules0
//Before Popall Rules  / Rules: };//Rules end (mRules0)
//Before Popall Rules  / Style: };//turning_circle end
//Before Popall Rules  / Styles: mturning_circle
//WARN DEBUG:};//Rules end (mRules0)

};//Rules end (mRules0)
//DEBUG characters in Style
protected Rule mRules1 = new Rule ("Rule"){
// DEBUG adding Rules
//DEBUG start Rule
//DEBUG characters in Rule
//DEBUG start MaxScaleDenominator
//DEBUG characters in MaxScaleDenominator
//DEBUG end MaxScaleDenominator / MaxScaleDenominator
//DEBUG characters in Rule
protected PointSymbolizer mSymbol2 = new PointSymbolizer( "symbols/turning_circle.19.png","png","19","19");
//DEBUG start PointSymbolizer
//DEBUG end PointSymbolizer / PointSymbolizer
//LEAVING PointSymbolizer
//DEBUG characters in Rule
//DEBUG end Rule / Rule
public void LoadSymbols(){
Load(mSymbol2);
}
//Before Popall Rules  / RuleVars: mRules0	mRules1
//Before Popall Rules  / Rules: };//Rules end (mRules1)
//Before Popall Rules  / Style: };//turning_circle end
//Before Popall Rules  / Styles: mturning_circle
//WARN DEBUG:};//Rules end (mRules1)
};//Rules end (mRules1)
//DEBUG characters in Style
//DEBUG end Style / Style
public void LoadRules(){
Load(mRules0);
Load(mRules1);
}
//Before Popall Style  / Style: };//turning_circle end
//Before Popall Style  / Styles: mturning_circle
//WARN DEBUG:};//turning_circle end
};//turning_circle end
//DEBUG characters in Map
protected Style mhighway_area_casing = new Style ("Style"){
// DEBUG :adding highway_area_casing
//DEBUG start Style
//DEBUG characters in Style
protected Rule mRules2 = new Rule ("Rule"){
// DEBUG adding Rules
//DEBUG start Rule
//DEBUG characters in Rule
//FilterStart
//DEBUG start Filter
//DEBUG characters in Filter
//DEBUG end Filter / Filter
//FilterEnd
protected Filter mFilter1 = new Filter(){
public void exec () {Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_residential))))))))));
};// end of exec
}; // end of Filter
//DEBUG characters in Rule
//DEBUG start MaxScaleDenominator
//DEBUG characters in MaxScaleDenominator
//DEBUG end MaxScaleDenominator / MaxScaleDenominator
//DEBUG characters in Rule
protected LineSymbolizer mSymbol3 = new LineSymbolizer( );
//DEBUG start LineSymbolizer
//DEBUG characters in LineSymbolizer
//CSS: stroke
protected stroke mCSS0 = new stroke ("stroke"){
// DEBUG adding CSS
//DEBUG start CssParameter
//DEBUG characters in CssParameter
protected stroke mCSSConst = new stroke ("stroke","#999");
//DEBUG end CssParameter / CssParameter
//Before Popall CSSConst  / CSS: };//CSS end (mCSS0)
//Before Popall CSSConst  / RuleVars: mRules2
//Before Popall CSSConst  / Rules: };//Rules end (mRules2)
//Before Popall CSSConst  / Style: };//highway_area_casing end
//Before Popall CSSConst  / Styles: mturning_circle	mhighway_area_casing
//Before Popall CSSConst  / Symbols: mSymbol3
//Before Popall CSS  / CSS: };//CSS end (mCSS0)
//Before Popall CSS  / RuleVars: mRules2
//Before Popall CSS  / Rules: };//Rules end (mRules2)
//Before Popall CSS  / Style: };//highway_area_casing end
//Before Popall CSS  / Styles: mturning_circle	mhighway_area_casing
//Before Popall CSS  / Symbols: mSymbol3
//WARN DEBUG:};//CSS end (mCSS0)
};//CSS end (mCSS0)
//DEBUG characters in LineSymbolizer
//CSS: stroke-width
protected stroke_width mCSS1 = new stroke_width ("stroke-width"){
// DEBUG adding CSS
//DEBUG start CssParameter
//DEBUG characters in CssParameter
protected stroke_width mCSSConst = new stroke_width ("stroke-width","1");
//DEBUG end CssParameter / CssParameter
//Before Popall CSSConst  / CSS: };//CSS end (mCSS1)
//Before Popall CSSConst  / RuleVars: mRules2
//Before Popall CSSConst  / Rules: };//Rules end (mRules2)
//Before Popall CSSConst  / Style: };//highway_area_casing end
//Before Popall CSSConst  / Styles: mturning_circle	mhighway_area_casing
//Before Popall CSSConst  / Symbols: mSymbol3
//Before Popall CSS  / CSS: };//CSS end (mCSS1)
//Before Popall CSS  / RuleVars: mRules2
//Before Popall CSS  / Rules: };//Rules end (mRules2)
//Before Popall CSS  / Style: };//highway_area_casing end
//Before Popall CSS  / Styles: mturning_circle	mhighway_area_casing
//Before Popall CSS  / Symbols: mSymbol3
//WARN DEBUG:};//CSS end (mCSS1)
};//CSS end (mCSS1)
//DEBUG characters in LineSymbolizer
//DEBUG end LineSymbolizer / LineSymbolizer
//LEAVING LineSymbolizer
//DEBUG characters in Rule
//DEBUG end Rule / Rule
public void LoadSymbols(){
Load(mSymbol3);
}
//Before Popall Rules  / RuleVars: mRules2
//Before Popall Rules  / Rules: };//Rules end (mRules2)
//Before Popall Rules  / Style: };//highway_area_casing end
//Before Popall Rules  / Styles: mturning_circle	mhighway_area_casing
//WARN DEBUG:};//Rules end (mRules2)

};//Rules end (mRules2)
//DEBUG characters in Style
protected Rule mRules3 = new Rule ("Rule"){
// DEBUG adding Rules
//DEBUG start Rule
//DEBUG characters in Rule
//FilterStart
//DEBUG start Filter
//DEBUG characters in Filter
//DEBUG end Filter / Filter
//FilterEnd
protected Filter mFilter2 = new Filter(){
public void exec () {Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_path)))))))),And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_footway)))))))),And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_service)))))))),And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_pedestrian))))))))));
};// end of exec
}; // end of Filter
//DEBUG characters in Rule
//DEBUG start MaxScaleDenominator
//DEBUG characters in MaxScaleDenominator
//DEBUG end MaxScaleDenominator / MaxScaleDenominator
//DEBUG characters in Rule
protected LineSymbolizer mSymbol4 = new LineSymbolizer( );
//DEBUG start LineSymbolizer
//DEBUG characters in LineSymbolizer
//CSS: stroke
protected stroke mCSS2 = new stroke ("stroke"){
// DEBUG adding CSS
//DEBUG start CssParameter
//DEBUG characters in CssParameter
protected stroke mCSSConst = new stroke ("stroke","grey");
//DEBUG end CssParameter / CssParameter
//Before Popall CSSConst  / CSS: };//CSS end (mCSS2)
//Before Popall CSSConst  / RuleVars: mRules2	mRules3
//Before Popall CSSConst  / Rules: };//Rules end (mRules3)
//Before Popall CSSConst  / Style: };//highway_area_casing end
//Before Popall CSSConst  / Styles: mturning_circle	mhighway_area_casing
//Before Popall CSSConst  / Symbols: mSymbol4
//Before Popall CSS  / CSS: };//CSS end (mCSS2)
//Before Popall CSS  / RuleVars: mRules2	mRules3
//Before Popall CSS  / Rules: };//Rules end (mRules3)
//Before Popall CSS  / Style: };//highway_area_casing end
//Before Popall CSS  / Styles: mturning_circle	mhighway_area_casing
//Before Popall CSS  / Symbols: mSymbol4
//WARN DEBUG:};//CSS end (mCSS2)
};//CSS end (mCSS2)
//DEBUG characters in LineSymbolizer
//CSS: stroke-width
protected stroke_width mCSS3 = new stroke_width ("stroke-width"){
// DEBUG adding CSS
//DEBUG start CssParameter
//DEBUG characters in CssParameter
protected stroke_width mCSSConst = new stroke_width ("stroke-width","1");
//DEBUG end CssParameter / CssParameter
//Before Popall CSSConst  / CSS: };//CSS end (mCSS3)
//Before Popall CSSConst  / RuleVars: mRules2	mRules3
//Before Popall CSSConst  / Rules: };//Rules end (mRules3)
//Before Popall CSSConst  / Style: };//highway_area_casing end
//Before Popall CSSConst  / Styles: mturning_circle	mhighway_area_casing
//Before Popall CSSConst  / Symbols: mSymbol4
//Before Popall CSS  / CSS: };//CSS end (mCSS3)
//Before Popall CSS  / RuleVars: mRules2	mRules3
//Before Popall CSS  / Rules: };//Rules end (mRules3)
//Before Popall CSS  / Style: };//highway_area_casing end
//Before Popall CSS  / Styles: mturning_circle	mhighway_area_casing
//Before Popall CSS  / Symbols: mSymbol4
//WARN DEBUG:};//CSS end (mCSS3)
};//CSS end (mCSS3)
//DEBUG characters in LineSymbolizer
//DEBUG end LineSymbolizer / LineSymbolizer
//LEAVING LineSymbolizer
//DEBUG characters in Rule
//DEBUG end Rule / Rule
public void LoadSymbols(){
Load(mSymbol4);
}
//Before Popall Rules  / RuleVars: mRules2	mRules3
//Before Popall Rules  / Rules: };//Rules end (mRules3)
//Before Popall Rules  / Style: };//highway_area_casing end
//Before Popall Rules  / Styles: mturning_circle	mhighway_area_casing
//WARN DEBUG:};//Rules end (mRules3)
};//Rules end (mRules3)
//DEBUG characters in Style
protected Rule mRules4 = new Rule ("Rule"){
// DEBUG adding Rules
//DEBUG start Rule
//DEBUG characters in Rule
//FilterStart
//DEBUG start Filter
//DEBUG characters in Filter
//DEBUG end Filter / Filter
//FilterEnd
protected Filter mFilter3 = new Filter(){
public void exec () {Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_track))))))))));
};// end of exec
}; // end of Filter
//DEBUG characters in Rule
//DEBUG start MaxScaleDenominator
//DEBUG characters in MaxScaleDenominator
//DEBUG end MaxScaleDenominator / MaxScaleDenominator
//DEBUG characters in Rule
protected LineSymbolizer mSymbol5 = new LineSymbolizer( );
//DEBUG start LineSymbolizer
//DEBUG characters in LineSymbolizer
//CSS: stroke
protected stroke mCSS4 = new stroke ("stroke"){
// DEBUG adding CSS
//DEBUG start CssParameter
//DEBUG characters in CssParameter
protected stroke mCSSConst = new stroke ("stroke","#996600");
//DEBUG end CssParameter / CssParameter
//Before Popall CSSConst  / CSS: };//CSS end (mCSS4)
//Before Popall CSSConst  / RuleVars: mRules2	mRules3	mRules4
//Before Popall CSSConst  / Rules: };//Rules end (mRules4)
//Before Popall CSSConst  / Style: };//highway_area_casing end
//Before Popall CSSConst  / Styles: mturning_circle	mhighway_area_casing
//Before Popall CSSConst  / Symbols: mSymbol5
//Before Popall CSS  / CSS: };//CSS end (mCSS4)
//Before Popall CSS  / RuleVars: mRules2	mRules3	mRules4
//Before Popall CSS  / Rules: };//Rules end (mRules4)
//Before Popall CSS  / Style: };//highway_area_casing end
//Before Popall CSS  / Styles: mturning_circle	mhighway_area_casing
//Before Popall CSS  / Symbols: mSymbol5
//WARN DEBUG:};//CSS end (mCSS4)
};//CSS end (mCSS4)
//DEBUG characters in LineSymbolizer
//CSS: stroke-width
protected stroke_width mCSS5 = new stroke_width ("stroke-width"){
// DEBUG adding CSS
//DEBUG start CssParameter
//DEBUG characters in CssParameter
protected stroke_width mCSSConst = new stroke_width ("stroke-width","2");
//DEBUG end CssParameter / CssParameter
//Before Popall CSSConst  / CSS: };//CSS end (mCSS5)
//Before Popall CSSConst  / RuleVars: mRules2	mRules3	mRules4
//Before Popall CSSConst  / Rules: };//Rules end (mRules4)
//Before Popall CSSConst  / Style: };//highway_area_casing end
//Before Popall CSSConst  / Styles: mturning_circle	mhighway_area_casing
//Before Popall CSSConst  / Symbols: mSymbol5
//Before Popall CSS  / CSS: };//CSS end (mCSS5)
//Before Popall CSS  / RuleVars: mRules2	mRules3	mRules4
//Before Popall CSS  / Rules: };//Rules end (mRules4)
//Before Popall CSS  / Style: };//highway_area_casing end
//Before Popall CSS  / Styles: mturning_circle	mhighway_area_casing
//Before Popall CSS  / Symbols: mSymbol5
//WARN DEBUG:};//CSS end (mCSS5)
};//CSS end (mCSS5)
//DEBUG characters in LineSymbolizer
//DEBUG end LineSymbolizer / LineSymbolizer
//LEAVING LineSymbolizer
//DEBUG characters in Rule
//DEBUG end Rule / Rule
public void LoadSymbols(){
Load(mSymbol5);
}
//Before Popall Rules  / RuleVars: mRules2	mRules3	mRules4
//Before Popall Rules  / Rules: };//Rules end (mRules4)
//Before Popall Rules  / Style: };//highway_area_casing end
//Before Popall Rules  / Styles: mturning_circle	mhighway_area_casing
//WARN DEBUG:};//Rules end (mRules4)
};//Rules end (mRules4)
//DEBUG characters in Style
//DEBUG end Style / Style
public void LoadRules(){
Load(mRules2);
Load(mRules3);
Load(mRules4);
}
class Check_highway extends typebase{
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
//Before Popall Style  / Style: };//highway_area_casing end
//Before Popall Style  / Styles: mturning_circle	mhighway_area_casing
//WARN DEBUG:};//highway_area_casing end
};//highway_area_casing end
//DEBUG characters in Map
//DEBUG characters in Map
//DEBUG characters in Map
//DEBUG characters in Map
//Layer: turning_circle
protected Layer mLayer0 = new Layer ("Layer"){
// DEBUG :adding Layer
//DEBUG start Layer
//DEBUG characters in Layer
//DEBUG start StyleName
//DEBUG characters in StyleName
public void LoadStyle() { Load( mturning_circle);
 };
//DEBUG end StyleName / StyleName
//DEBUG characters in Layer
//DEBUG start Datasource
//DEBUG characters in Datasource
//Parameter: table
//DEBUG start Parameter
//DEBUG characters in Parameter
protected Parameter mtable0 = new Parameter("(select way from ");
//DEBUG characters in Parameter
protected Parameter mtable1 = new Parameter("prefix");
//DEBUG characters in Parameter
protected Parameter mtable2 = new Parameter("_point where highway='turning_circle') as turning_circle");
//DEBUG end Parameter / Parameter
//DEBUG characters in Datasource
//DEBUG characters in Datasource
//DEBUG characters in Datasource
//DEBUG end Datasource / Datasource
//DEBUG characters in Layer
//DEBUG end Layer / Layer
//End of Layer
public void LoadParameters(){
Load(mtable0);
Load(mtable1);
Load(mtable2);
}
//Before Popall Layer  / Layer: };//Layer end
//Before Popall Layer  / Layers: mLayer0
//Before Popall Layer  / Styles: mturning_circle	mhighway_area_casing
//WARN DEBUG:};//Layer end
};//Layer end
//DEBUG characters in Map
//Layer: highway-area-casing
protected Layer mLayer1 = new Layer ("Layer"){
// DEBUG :adding Layer
//DEBUG start Layer
//DEBUG characters in Layer
//DEBUG start StyleName
//DEBUG characters in StyleName
public void LoadStyle() { Load( mhighway_area_casing);
 };
//DEBUG end StyleName / StyleName
//DEBUG characters in Layer
//DEBUG start Datasource
//DEBUG characters in Datasource
//Parameter: table
//DEBUG start Parameter
//DEBUG characters in Parameter
protected Parameter mtable3 = new Parameter("\n      (select way,highway from ");
//DEBUG characters in Parameter
protected Parameter mtable4 = new Parameter("prefix");
//DEBUG characters in Parameter
protected Parameter mtable5 = new Parameter("_polygon\n       where highway in ('residential','unclassified','pedestrian','service','footway','track','path')\n       order by z_order,way_area desc) as roads\n      ");
//DEBUG end Parameter / Parameter
//DEBUG characters in Datasource
//DEBUG characters in Datasource
//DEBUG characters in Datasource
//DEBUG end Datasource / Datasource
//DEBUG characters in Layer
//DEBUG end Layer / Layer
//End of Layer
public void LoadParameters(){
Load(mtable3);
Load(mtable4);
Load(mtable5);
}
//Before Popall Layer  / Layer: };//Layer end
//Before Popall Layer  / Layers: mLayer0	mLayer1
//Before Popall Layer  / Styles: mturning_circle	mhighway_area_casing
//WARN DEBUG:};//Layer end
};//Layer end
//DEBUG characters in Map
//DEBUG characters in Map
//DEBUG characters in Map
//DEBUG end Map / Map
class Check_highway extends typebase{
public highway obj;
protected Filter mcode3 = new Filter() { public void exec () {Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_residential))))))))));
}
};
protected Filter mcode4 = new Filter() { public void exec () {Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_path)))))))),And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_footway)))))))),And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_service)))))))),And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_pedestrian))))))))));
}
};
protected Filter mcode5 = new Filter() { public void exec () {Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(getObj().gethighway().equals_(CONST_track))))))))));
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
public static final highway footway=null;
public static final highway path=null;
public static final highway pedestrian=null;
public static final highway residential=null;
public static final highway service=null;
public static final highway track=null;
public static final highway unclassified=null;};//end StyleEvaluator 
