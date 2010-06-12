package org.openstreetmap.model;
import  org.openstreetmap.model.StyleEvaluator;
public class GeneratedStyleEvaluator extends StyleEvaluator  { 
public class Style_turning_circle extends Style_base
{
protected Rule mRules0 = new Rule ("Rule"){
protected PointSymbolizer mSymbol1 = new PointSymbolizer( "symbols/turning_circle.15.png","png","15","15");
//LEAVING PointSymbolizer
};//Rules end
protected Rule mRules1 = new Rule ("Rule"){
protected PointSymbolizer mSymbol2 = new PointSymbolizer( "symbols/turning_circle.19.png","png","19","19");
//LEAVING PointSymbolizer
};//Rules end
}; // end of class turning_circle

//SPLIT FILE HERE----
public class Style_highway_area_casing extends Style_base
{
protected Rule mRules2 = new Rule ("Rule"){
private HighwayType obj;
//FilterStart
//FilterEnd
protected Filter mFilter1 = new Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
protected LineSymbolizer mSymbol3 = new LineSymbolizer( );
//CSS: stroke
protected stroke mCSS0 = new stroke ("stroke"){
protected stroke mCSSConst = new stroke ("stroke","#999");
}; // end of CSS
//CSS: stroke-width
protected stroke_width mCSS1 = new stroke_width ("stroke-width"){
protected stroke_width mCSSConst = new stroke_width ("stroke-width","1");
}; // end of CSS
};//Rules end
protected Rule mRules3 = new Rule ("Rule"){
private HighwayType obj;
//FilterStart
//FilterEnd
protected Filter mFilter2 = new Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_path)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_footway)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_service)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
protected LineSymbolizer mSymbol4 = new LineSymbolizer( );
//CSS: stroke
protected stroke mCSS2 = new stroke ("stroke"){
protected stroke mCSSConst = new stroke ("stroke","grey");
}; // end of CSS
//CSS: stroke-width
protected stroke_width mCSS3 = new stroke_width ("stroke-width"){
protected stroke_width mCSSConst = new stroke_width ("stroke-width","1");
}; // end of CSS
};//Rules end
protected Rule mRules4 = new Rule ("Rule"){
private HighwayType obj;
//FilterStart
//FilterEnd
protected Filter mFilter3 = new Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_track))))))))));
protected LineSymbolizer mSymbol5 = new LineSymbolizer( );
//CSS: stroke
protected stroke mCSS4 = new stroke ("stroke"){
protected stroke mCSSConst = new stroke ("stroke","#996600");
}; // end of CSS
//CSS: stroke-width
protected stroke_width mCSS5 = new stroke_width ("stroke-width"){
protected stroke_width mCSSConst = new stroke_width ("stroke-width","2");
}; // end of CSS
}; // end of class highway_area_casing
//Layer: turning_circle
protected Layer mLayer0 = new Layer ("Layer"){
Stylename stylename = new Stylename("turning_circle");
//Parameter: table
protected Parameter mtable0 = new Parameter("(select way from ");
protected Parameter mtable1 = new Parameter("prefix");
protected Parameter mtable2 = new Parameter("_point where highway='turning_circle') as turning_circle");
};//Layer end
//Layer: highway-area-casing
protected Layer mLayer1 = new Layer ("Layer"){
Stylename stylename = new Stylename("highway-area-casing");
//Parameter: table
protected Parameter mtable3 = new Parameter("\n      (select way,highway from ");
protected Parameter mtable4 = new Parameter("prefix");
protected Parameter mtable5 = new Parameter("_polygon\n       where highway in ('residential','unclassified','pedestrian','service','footway','track','path')\n       order by z_order,way_area desc) as roads\n      ");
class highway extends typebase{
private HighwayType obj;
protected Filter mcode0 = new Filter(Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential)))))))))));
protected Filter mcode1 = new Filter(Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_path)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_footway)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_service)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian)))))))))));
protected Filter mcode2 = new Filter(Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_track)))))))))));
}; // end of class highway 
}; 
public final highway footway=null;
public  final highway path=null;
public final highway pedestrian=null;
public final highway residential=null;
public final highway service=null;
public final highway track=null;
public final highway unclassified=null;
}

@Override
void ProcessStyle(BaseObject obj) {
	// TODO Auto-generated method stub
	
};
}