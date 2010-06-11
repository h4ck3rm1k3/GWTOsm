package org.openstreetmap.model;
import org.openstreetmap.model.StyleEvaluator;
public class GeneratedStyleEvaluator extends StyleEvaluator  { 
boolean ProcessStyle0 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle1 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_path)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_footway)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_service)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle2 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_track))))))))));
}; 
boolean ProcessStyle3 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_living_street))))))))));
}; 
boolean ProcessStyle4 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_service)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle5 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_path)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_footway)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_service)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle6 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_track))))))))));
}; 
boolean ProcessStyle7 (Leisure obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getleisure().equals_(CONST_playground))))))))));
}; 
 
boolean ProcessStyle105 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_junction))))))))));
}; 
boolean ProcessStyle106 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_junction))))))))));
}; 
boolean ProcessStyle107 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_junction))))))))));
}; 
boolean ProcessStyle110 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle111 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle112 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle113 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle114 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle115 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle116 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle117 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle118 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle119 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle120 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle121 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle122 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle123 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle124 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle125 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle126 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle127 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle128 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle129 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle130 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle131 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle132 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle133 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle134 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle135 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle136 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle137 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle138 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle139 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle140 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle141 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle142 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle143 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle144 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle145 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle146 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle147 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle148 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle149 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle150 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle151 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle152 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle153 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle154 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle155 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle156 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle157 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle158 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle159 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_raceway))))))))));
}; 
boolean ProcessStyle160 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_raceway))))))))));
}; 
boolean ProcessStyle161 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_raceway))))))))));
}; 
boolean ProcessStyle162 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link))))))))));
}; 
boolean ProcessStyle163 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link))))))))));
}; 
boolean ProcessStyle164 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link))))))))));
}; 
boolean ProcessStyle165 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link))))))))));
}; 
boolean ProcessStyle166 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link))))))))));
}; 
boolean ProcessStyle167 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link))))))))));
}; 
boolean ProcessStyle168 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link))))))))));
}; 
boolean ProcessStyle169 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link))))))))));
}; 
boolean ProcessStyle170 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link))))))))));
}; 
boolean ProcessStyle171 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link))))))))));
}; 
boolean ProcessStyle172 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link))))))))));
}; 
boolean ProcessStyle173 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link))))))))));
}; 
boolean ProcessStyle174 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link))))))))));
}; 
boolean ProcessStyle175 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link))))))))));
}; 
boolean ProcessStyle176 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link))))))))));
}; 
boolean ProcessStyle177 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link))))))))));
}; 
boolean ProcessStyle178 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link))))))))));
}; 
boolean ProcessStyle179 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link))))))))));
}; 
boolean ProcessStyle180 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link))))))))));
}; 
boolean ProcessStyle181 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link))))))))));
}; 
boolean ProcessStyle182 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle183 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle184 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle185 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle186 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle187 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle188 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle189 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle190 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle191 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle192 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle193 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle194 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle195 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle196 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle197 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle198 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle199 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))))))))));
}; 
boolean ProcessStyle200 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle201 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))))))))));
}; 
boolean ProcessStyle202 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))))))))));
}; 
boolean ProcessStyle203 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))))))))));
}; 
boolean ProcessStyle204 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle205 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))))))))));
}; 
boolean ProcessStyle206 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))))),And(Concat(Not(Parens(Condition(obj.getservice().equals_(CONST_parking_aisle)))))))))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_service))))))))));
}; 
boolean ProcessStyle207 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_service))))))))));
}; 
boolean ProcessStyle208 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))))),And(Concat(Not(Parens(Condition(obj.getservice().equals_(CONST_parking_aisle)))))))))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_service))))))))));
}; 
boolean ProcessStyle209 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_service))))))))));
}; 
boolean ProcessStyle210 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getservice().equals_(CONST_parking_aisle)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_service))))))))));
}; 
boolean ProcessStyle211 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle212 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle213 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle214 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle215 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle216 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle217 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle218 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle219 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_living_street))))))))));
}; 
boolean ProcessStyle220 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_living_street))))))))));
}; 
boolean ProcessStyle221 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_living_street))))))))));
}; 
boolean ProcessStyle222 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_living_street))))))))));
}; 
boolean ProcessStyle223 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_living_street))))))))));
}; 
boolean ProcessStyle224 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link))))))))));
}; 
boolean ProcessStyle225 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link))))))))));
}; 
boolean ProcessStyle226 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link))))))))));
}; 
boolean ProcessStyle227 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link))))))))));
}; 
boolean ProcessStyle228 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link))))))))));
}; 
boolean ProcessStyle229 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link))))))))));
}; 
boolean ProcessStyle230 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link))))))))));
}; 
boolean ProcessStyle231 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link))))))))));
}; 
boolean ProcessStyle232 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link))))))))));
}; 
boolean ProcessStyle233 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link))))))))));
}; 
boolean ProcessStyle234 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link))))))))));
}; 
boolean ProcessStyle235 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link))))))))));
}; 
boolean ProcessStyle236 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link))))))))));
}; 
boolean ProcessStyle237 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link))))))))));
}; 
boolean ProcessStyle238 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link))))))))));
}; 
boolean ProcessStyle239 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link))))))))));
}; 
boolean ProcessStyle240 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link))))))))));
}; 
boolean ProcessStyle241 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link))))))))));
}; 
boolean ProcessStyle242 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link))))))))));
}; 
 
boolean ProcessStyle266 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle267 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle268 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle269 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle270 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle271 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle272 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle273 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle274 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle275 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle276 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle277 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle278 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle279 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_rail))))))))));
}; 
boolean ProcessStyle285 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(obj.getrailway()))))))));
}; 
boolean ProcessStyle286 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(obj.getrailway()))))))));
}; 
boolean ProcessStyle287 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_rail))))))))));
}; 
boolean ProcessStyle288 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_funicular)))))))),And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_narrow_gauge))))))))))))))));
}; 
boolean ProcessStyle289 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_funicular)))))))),And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_narrow_gauge))))))))))))))));
}; 
boolean ProcessStyle290 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_tram))))))))));
}; 
boolean ProcessStyle291 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_tram))))))))));
}; 
boolean ProcessStyle292 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_light_rail))))))))));
}; 
boolean ProcessStyle293 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_light_rail))))))))));
}; 
boolean ProcessStyle294 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_subway))))))))));
}; 
boolean ProcessStyle295 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_subway))))))))));
}; 
boolean ProcessStyle296 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle297 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road))))))))));
}; 
boolean ProcessStyle298 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road))))))))));
}; 
boolean ProcessStyle299 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road))))))))));
}; 
boolean ProcessStyle300 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road))))))))));
}; 
boolean ProcessStyle301 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road))))))))));
}; 
boolean ProcessStyle302 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))))))))));
}; 
boolean ProcessStyle303 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))))))))));
}; 
boolean ProcessStyle304 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))))))))));
}; 
boolean ProcessStyle305 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))))))))));
}; 
boolean ProcessStyle306 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))))))))));
}; 
boolean ProcessStyle307 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_living_street))))))))));
}; 
boolean ProcessStyle308 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_living_street))))))))));
}; 
boolean ProcessStyle309 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_living_street))))))))));
}; 
boolean ProcessStyle310 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_living_street))))))))));
}; 
boolean ProcessStyle311 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_living_street))))))))));
}; 
boolean ProcessStyle312 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle313 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle314 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle315 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle316 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getservice().equals_(CONST_parking_aisle)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_service))))))))));
}; 
boolean ProcessStyle317 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getservice().equals_(CONST_parking_aisle)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_service))))))))));
}; 
boolean ProcessStyle318 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getservice().equals_(CONST_parking_aisle)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_service))))))))));
}; 
boolean ProcessStyle319 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getservice().equals_(CONST_parking_aisle)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_service))))))))));
}; 
boolean ProcessStyle320 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle321 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle322 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle323 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle324 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_platform)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_platform))))))))));
}; 
boolean ProcessStyle325 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_steps))))))))));
}; 
boolean ProcessStyle326 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gethorse().equals_(CONST_designated)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_path)))))))))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_bridleway))))))))))))))));
}; 
boolean ProcessStyle327 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getfoot().equals_(CONST_designated)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_path)))))))))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_footway))))))))))))))));
}; 
boolean ProcessStyle328 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethorse().equals_(CONST_designated)))))))),And(Concat(Not(Parens(Condition(obj.getfoot().equals_(CONST_designated)))))))),And(Concat(Not(Parens(Condition(obj.getbicycle().equals_(CONST_designated)))))))))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_path))))))))));
}; 
boolean ProcessStyle329 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_platform)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_platform))))))))));
}; 
boolean ProcessStyle330 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_steps))))))))));
}; 
boolean ProcessStyle331 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbicycle().equals_(CONST_designated)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_path)))))))))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_cycleway))))))))))))))));
}; 
boolean ProcessStyle332 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_byway))))))))));
}; 
boolean ProcessStyle333 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_track))))))))));
}; 
boolean ProcessStyle334 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unsurfaced))))))))));
}; 
boolean ProcessStyle335 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unsurfaced))))))))));
}; 
boolean ProcessStyle336 (Aeroway obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaeroway().equals_(CONST_runway))))))))));
}; 
boolean ProcessStyle337 (Aeroway obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaeroway().equals_(CONST_runway))))))))));
}; 
boolean ProcessStyle338 (Aeroway obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getaeroway().equals_(CONST_runway))))))))));
}; 
boolean ProcessStyle339 (Aeroway obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaeroway().equals_(CONST_taxiway))))))))));
}; 
boolean ProcessStyle340 (Aeroway obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getaeroway().equals_(CONST_taxiway))))))))));
}; 
boolean ProcessStyle341 (Aeroway obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getaeroway().equals_(CONST_taxiway))))))))));
}; 
boolean ProcessStyle342 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_service)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))))))),Not(Parens(Condition(obj.getaccess().equals_(CONST_permissive))))))))));
}; 
boolean ProcessStyle343 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_footway)))))),Not(Parens(Condition(obj.getaccess().equals_(CONST_permissive))))))))));
}; 
boolean ProcessStyle344 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_service)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))))))),Not(Parens(Condition(obj.getaccess().equals_(CONST_destination))))))))));
}; 
boolean ProcessStyle345 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaccess().equals_(CONST_no)))))))),And(Concat(Not(Parens(Condition(obj.getaccess().equals_(CONST_private))))))))));
}; 
boolean ProcessStyle346 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gethorse().equals_(CONST_designated)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_path)))))))))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_bridleway))))))))));
}; 
boolean ProcessStyle347 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getfoot().equals_(CONST_designated)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_path)))))))))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_footway))))))))));
}; 
boolean ProcessStyle348 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethorse().equals_(CONST_designated)))))))),And(Concat(Not(Parens(Condition(obj.getfoot().equals_(CONST_designated)))))))),And(Concat(Not(Parens(Condition(obj.getbicycle().equals_(CONST_designated)))))))))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_path))))))))));
}; 
boolean ProcessStyle349 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbicycle().equals_(CONST_designated)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_path)))))))))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_cycleway))))))))));
}; 
boolean ProcessStyle350 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettracktype().equals_(CONST_grade1))))))))));
}; 
boolean ProcessStyle351 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettracktype().equals_(CONST_grade2))))))))));
}; 
boolean ProcessStyle352 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettracktype().equals_(CONST_grade3))))))))));
}; 
boolean ProcessStyle353 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettracktype().equals_(CONST_grade4))))))))));
}; 
boolean ProcessStyle354 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettracktype().equals_(CONST_grade5))))))))));
}; 
boolean ProcessStyle355 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettracktype().equals_(CONST_grade1))))))))));
}; 
boolean ProcessStyle356 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettracktype().equals_(CONST_grade2))))))))));
}; 
boolean ProcessStyle357 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettracktype().equals_(CONST_grade3))))))))));
}; 
boolean ProcessStyle358 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettracktype().equals_(CONST_grade4))))))))));
}; 
boolean ProcessStyle359 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettracktype().equals_(CONST_grade5))))))))));
}; 
boolean ProcessStyle360 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettracktype().equals_(CONST_grade1))))))))));
}; 
boolean ProcessStyle361 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettracktype().equals_(CONST_grade2))))))))));
}; 
boolean ProcessStyle362 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettracktype().equals_(CONST_grade3))))))))));
}; 
boolean ProcessStyle363 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettracktype().equals_(CONST_grade4))))))))));
}; 
boolean ProcessStyle364 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettracktype().equals_(CONST_grade5))))))))));
}; 
boolean ProcessStyle365 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle366 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle367 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle368 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle369 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle370 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle371 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle372 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle373 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle374 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle375 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle376 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle377 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle378 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle379 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle380 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle381 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_service))))))))));
}; 
boolean ProcessStyle382 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_service))))))))));
}; 
boolean ProcessStyle383 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle384 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle385 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle386 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle387 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle388 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle389 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle390 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle391 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle392 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle393 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle394 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle395 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle396 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle397 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle398 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle399 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road))))))))));
}; 
boolean ProcessStyle400 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road))))))))));
}; 
boolean ProcessStyle401 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_road))))))))));
}; 
boolean ProcessStyle402 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle403 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle404 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle405 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_minor)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential))))))))));
}; 
boolean ProcessStyle406 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_service))))))))));
}; 
boolean ProcessStyle407 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_service))))))))));
}; 
boolean ProcessStyle408 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle409 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle410 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle411 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_pedestrian))))))))));
}; 
boolean ProcessStyle412 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaeroway().equals_(CONST_runway))))))))));
}; 
boolean ProcessStyle413 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaeroway().equals_(CONST_taxiway))))))))));
}; 
boolean ProcessStyle414 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaeroway().equals_(CONST_taxiway))))))))));
}; 
boolean ProcessStyle415 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_subway))))))))));
}; 
boolean ProcessStyle416 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_light_rail))))))))));
}; 
boolean ProcessStyle417 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unsurfaced))))))))));
}; 
boolean ProcessStyle418 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unsurfaced))))))))));
}; 
boolean ProcessStyle419 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gethorse().equals_(CONST_designated)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_path)))))))))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_bridleway))))))))));
}; 
boolean ProcessStyle420 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getfoot().equals_(CONST_designated)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_path)))))))))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_footway))))))))));
}; 
boolean ProcessStyle421 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethorse().equals_(CONST_designated)))))))),And(Concat(Not(Parens(Condition(obj.getfoot().equals_(CONST_designated)))))))),And(Concat(Not(Parens(Condition(obj.getbicycle().equals_(CONST_designated)))))))))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_path))))))))));
}; 
boolean ProcessStyle422 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbicycle().equals_(CONST_designated)))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_path)))))))))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_cycleway))))))))));
}; 
boolean ProcessStyle423 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_byway))))))))));
}; 
boolean ProcessStyle424 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle425 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle426 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle427 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle428 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle429 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle430 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_1)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle431 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_1)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle432 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_1)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle433 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_1)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle434 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_1)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle435 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_1)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle436 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_2)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle437 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_2)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle438 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_2)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle439 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_2)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle440 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_2)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle441 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_2)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle442 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_3)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle443 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_3)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle444 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_3)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle445 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_3)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle446 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_3)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle447 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_3)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle448 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_4)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle449 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_4)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle450 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_4)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle451 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_4)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle452 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_4)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle453 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_4)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle454 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_5)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle455 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_5)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle456 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_5)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle457 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_5)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle458 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_5)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle459 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_5)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))))))))));
}; 
boolean ProcessStyle460 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle461 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle462 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle463 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle464 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle465 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle466 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_1)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))))))))));
}; 
boolean ProcessStyle467 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_1)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))))))))));
}; 
boolean ProcessStyle468 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_1)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))))))))));
}; 
boolean ProcessStyle469 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_1)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))))))))));
}; 
boolean ProcessStyle470 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_1)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))))))))));
}; 
boolean ProcessStyle471 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_1)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))))))))));
}; 
boolean ProcessStyle472 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_2)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))))))))));
}; 
boolean ProcessStyle473 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_2)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))))))))));
}; 
boolean ProcessStyle474 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_2)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))))))))));
}; 
boolean ProcessStyle475 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_2)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))))))))));
}; 
boolean ProcessStyle476 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_2)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))))))))));
}; 
boolean ProcessStyle477 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlayer().equals_(CONST_2)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))))))))));
}; 
boolean ProcessStyle478 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle479 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle480 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle481 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle482 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle483 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle484 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle485 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle486 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle487 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle488 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle489 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle490 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle491 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle492 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary_link)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle493 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_rail))))))))));
}; 
boolean ProcessStyle494 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_rail))))))))));
}; 
boolean ProcessStyle495 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_rail))))))))));
}; 
boolean ProcessStyle496 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_funicular)))))))),And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_narrow_gauge)))))))),And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_light_rail)))))))),And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_tram))))))))));
}; 
boolean ProcessStyle497 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_rail))))))))));
}; 
boolean ProcessStyle498 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_rail))))))))));
}; 
boolean ProcessStyle499 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_funicular)))))))),And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_narrow_gauge)))))))),And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_light_rail)))))))),And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_tram))))))))));
}; 
boolean ProcessStyle500 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_preserved))))))))));
}; 
boolean ProcessStyle501 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_preserved))))))))));
}; 
boolean ProcessStyle502 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_monorail))))))))));
}; 
boolean ProcessStyle503 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("1")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle504 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("2")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle505 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("3")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle506 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("4")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle507 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("5")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle508 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("6")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle509 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("7")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle510 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("8")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle511 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("1")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle512 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("2")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle513 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("3")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle514 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("4")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle515 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("5")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle516 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("6")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle517 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("7")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle518 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("8")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle519 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("1")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle520 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("2")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle521 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("3")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle522 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("4")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle523 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("5")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle524 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("6")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle525 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("7")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle526 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("8")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle527 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("1")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle528 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("2")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle529 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("3")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle530 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("4")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle531 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("5")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle532 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("6")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle533 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("7")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle534 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("8")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_motorway))))))))));
}; 
boolean ProcessStyle535 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("1")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle536 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("2")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle537 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("3")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle538 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("4")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle539 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("5")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle540 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("6")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle541 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("7")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle542 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("8")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle543 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("1")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle544 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("2")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle545 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("3")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle546 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("4")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle547 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("5")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle548 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("6")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle549 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("7")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle550 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("8")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_primary))))))))));
}; 
boolean ProcessStyle551 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("1")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))))))))));
}; 
boolean ProcessStyle552 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("2")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))))))))));
}; 
boolean ProcessStyle553 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("3")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))))))))));
}; 
boolean ProcessStyle554 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("4")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))))))))));
}; 
boolean ProcessStyle555 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("5")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))))))))));
}; 
boolean ProcessStyle556 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("6")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))))))))));
}; 
boolean ProcessStyle557 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("7")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))))))))));
}; 
boolean ProcessStyle558 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("8")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))))))))));
}; 
boolean ProcessStyle559 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("1")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))))))))));
}; 
boolean ProcessStyle560 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("2")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))))))))));
}; 
boolean ProcessStyle561 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("3")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))))))))));
}; 
boolean ProcessStyle562 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("4")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))))))))));
}; 
boolean ProcessStyle563 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("5")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))))))))));
}; 
boolean ProcessStyle564 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("6")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))))))))));
}; 
boolean ProcessStyle565 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("7")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))))))))));
}; 
boolean ProcessStyle566 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlength().equals_("8")))))),Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))))))))));
}; 
boolean ProcessStyle567 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified))))))))))))))));
}; 
boolean ProcessStyle568 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbridge().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaeroway().equals_(CONST_taxiway)))))))),And(Concat(Not(Parens(Condition(obj.getaeroway().equals_(CONST_runway))))))))))))))));
}; 
boolean ProcessStyle569 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle570 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle571 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle572 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_primary)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_trunk))))))))));
}; 
boolean ProcessStyle573 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle574 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_secondary))))))))));
}; 
boolean ProcessStyle575 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle576 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_tertiary))))))))));
}; 
boolean ProcessStyle577 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_construction)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_proposed))))))))));
}; 
boolean ProcessStyle578 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_construction)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_proposed))))))))));
}; 
boolean ProcessStyle579 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified))))))))));
}; 
boolean ProcessStyle580 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified))))))))));
}; 
boolean ProcessStyle581 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_residential)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_unclassified))))))))));
}; 
boolean ProcessStyle582 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getnatural().equals_(CONST_cliff))))))))));
}; 
boolean ProcessStyle583 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getnatural().equals_(CONST_cliff))))))))));
}; 
boolean ProcessStyle584 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getman_made().equals_(CONST_embankment))))))))));
}; 
boolean ProcessStyle585 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getbarrier().equals_(CONST_hedge)))))))),And(Concat(Not(Parens(Condition(obj.getnatural().equals_(CONST_hedge))))))))));
}; 
boolean ProcessStyle586 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getbarrier().equals_(CONST_hedge)))))),Not(Parens(Condition(obj.getbarrier().notnull())))))))));
}; 
boolean ProcessStyle587 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getoneway().equals_(CONST_yes))))))))));
}; 
boolean ProcessStyle588 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(obj.getoneway()))))))));
}; 
boolean ProcessStyle589 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettourism().equals_(CONST_theme_park))))))))));
}; 
boolean ProcessStyle590 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettourism().equals_(CONST_theme_park))))))))));
}; 
boolean ProcessStyle591 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getnatural().equals_(CONST_glacier))))))))));
}; 
boolean ProcessStyle592 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getnatural().equals_(CONST_glacier))))))))));
}; 
boolean ProcessStyle593 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_canal)))))))),And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_mill_pond)))))))),And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_dock))))))))));
}; 
boolean ProcessStyle594 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getlanduse().equals_(CONST_basin))))))))));
}; 
boolean ProcessStyle595 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getlanduse().equals_(CONST_water)))))))),And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_riverbank)))))))),And(Concat(Not(Parens(Condition(obj.getlanduse().equals_(CONST_reservoir)))))))),And(Concat(Not(Parens(Condition(obj.getnatural().equals_(CONST_water)))))))),And(Concat(Not(Parens(Condition(obj.getnatural().equals_(CONST_lake))))))))));
}; 
boolean ProcessStyle596 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getnatural().equals_(CONST_wetland)))))))),And(Concat(Not(Parens(Condition(obj.getnatural().equals_(CONST_marsh))))))))));
}; 
boolean ProcessStyle597 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getnatural().equals_(CONST_scrub))))))))));
}; 
boolean ProcessStyle598 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getnatural().equals_(CONST_land))))))))));
}; 
boolean ProcessStyle599 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(obj.getway_area()))))))));
}; 
boolean ProcessStyle600 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(obj.getway_area()))))))));
}; 
boolean ProcessStyle601 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(obj.getway_area()))))))));
}; 
boolean ProcessStyle602 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_weir))))))))));
}; 
boolean ProcessStyle603 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_river))))))))));
}; 
boolean ProcessStyle604 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_river))))))))));
}; 
boolean ProcessStyle605 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_river))))))))));
}; 
boolean ProcessStyle606 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_river))))))))));
}; 
boolean ProcessStyle607 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_river))))))))));
}; 
boolean ProcessStyle608 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_river))))))))));
}; 
boolean ProcessStyle609 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getdisused().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getwaterway().equals_(CONST_canal))))))))));
}; 
boolean ProcessStyle610 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getdisused().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getwaterway().equals_(CONST_canal))))))))));
}; 
boolean ProcessStyle611 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getwaterway().equals_(CONST_river))))))))));
}; 
boolean ProcessStyle612 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getwaterway().equals_(CONST_river))))))))));
}; 
boolean ProcessStyle613 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getwaterway().equals_(CONST_river))))))))));
}; 
boolean ProcessStyle614 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getwaterway().equals_(CONST_river))))))))));
}; 
boolean ProcessStyle615 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getwaterway().equals_(CONST_canal))))))))));
}; 
boolean ProcessStyle616 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getdisused().equals_(CONST_yes)))))))),And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))))))))),Not(Parens(Condition(obj.getwaterway().equals_(CONST_canal))))))))));
}; 
boolean ProcessStyle617 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getwaterway().equals_(CONST_canal))))))))));
}; 
boolean ProcessStyle618 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getlock().equals_(CONST_yes)))))))),And(Concat(Not(Parens(Condition(obj.getdisused().equals_(CONST_yes)))))))),And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))))))))),Not(Parens(Condition(obj.getwaterway().equals_(CONST_canal))))))))));
}; 
boolean ProcessStyle619 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getlock().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getdisused().equals_(CONST_yes)))))))),And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))))))))),Not(Parens(Condition(obj.getwaterway().equals_(CONST_canal))))))))));
}; 
boolean ProcessStyle620 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getdisused().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getwaterway().equals_(CONST_canal)))))))))))))),And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_derelict_canal))))))))));
}; 
boolean ProcessStyle621 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getdisused().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getwaterway().equals_(CONST_canal)))))))))))))),And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_derelict_canal))))))))));
}; 
boolean ProcessStyle622 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getdisused().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getwaterway().equals_(CONST_canal)))))))))))))),And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_derelict_canal))))))))));
}; 
boolean ProcessStyle623 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getwaterway().equals_(CONST_stream))))))))));
}; 
boolean ProcessStyle624 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getwaterway().equals_(CONST_stream))))))))));
}; 
boolean ProcessStyle625 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_ditch)))))))),And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_drain))))))))))))))));
}; 
boolean ProcessStyle626 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.gettunnel().equals_(CONST_yes)))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_ditch)))))))),And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_drain))))))))))))))));
}; 
boolean ProcessStyle627 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getman_made().equals_(CONST_breakwater))))))))));
}; 
boolean ProcessStyle628 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getman_made().equals_(CONST_pier))))))))));
}; 
boolean ProcessStyle629 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getman_made().equals_(CONST_breakwater))))))))));
}; 
boolean ProcessStyle630 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getman_made().equals_(CONST_pier))))))))));
}; 
boolean ProcessStyle631 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getman_made().equals_(CONST_breakwater))))))))));
}; 
boolean ProcessStyle632 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getman_made().equals_(CONST_pier))))))))));
}; 
boolean ProcessStyle633 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_lock_gate))))))))));
}; 
boolean ProcessStyle634 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getbuilding().equals_(CONST_station)))))))),And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_station))))))))));
}; 
boolean ProcessStyle635 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getbuilding().equals_(CONST_supermarket))))))))));
}; 
boolean ProcessStyle636 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_place_of_worship))))))))));
}; 
boolean ProcessStyle637 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_place_of_worship))))))))));
}; 
boolean ProcessStyle638 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getleisure().equals_(CONST_track))))))))));
}; 
boolean ProcessStyle639 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().notequals_(CONST_place_of_worship)))))))),And(Concat(Not(Parens(Condition(obj.getamenity().notnull()))))))))))),Not(Parens(Condition(obj.getbuilding().notnull()))))),Not(Parens(Condition(obj.getbuilding().notequals_(CONST_supermarket)))))),Not(Parens(Condition(obj.getbuilding().notequals_(CONST_station))))))))));
}; 
boolean ProcessStyle640 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaeroway().equals_(CONST_terminal))))))))));
}; 
boolean ProcessStyle641 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaeroway().equals_(CONST_terminal))))))))));
}; 
boolean ProcessStyle642 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaerialway().equals_(CONST_gondola)))))))),And(Concat(Not(Parens(Condition(obj.getaerialway().equals_(CONST_cable_car))))))))));
}; 
boolean ProcessStyle643 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaerialway().equals_(CONST_drag_lift)))))))),And(Concat(Not(Parens(Condition(obj.getaerialway().equals_(CONST_chair_lift))))))))));
}; 
boolean ProcessStyle644 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_country))))))))));
}; 
boolean ProcessStyle645 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_country))))))))));
}; 
boolean ProcessStyle646 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_state))))))))));
}; 
boolean ProcessStyle647 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_state))))))))));
}; 
boolean ProcessStyle648 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_state))))))))));
}; 
boolean ProcessStyle649 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_metropolis)))))))),And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_city))))))))));
}; 
boolean ProcessStyle650 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_metropolis)))))))),And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_city))))))))));
}; 
boolean ProcessStyle651 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_metropolis)))))))),And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_city))))))))));
}; 
boolean ProcessStyle652 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_metropolis)))))))),And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_city))))))))));
}; 
boolean ProcessStyle653 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_metropolis)))))))),And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_city))))))))));
}; 
boolean ProcessStyle654 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_metropolis)))))))),And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_city))))))))));
}; 
boolean ProcessStyle655 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_metropolis)))))))),And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_city))))))))));
}; 
boolean ProcessStyle656 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_small_town)))))))),And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_large_town)))))))),And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_town))))))))));
}; 
boolean ProcessStyle657 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_small_town)))))))),And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_large_town)))))))),And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_town))))))))));
}; 
boolean ProcessStyle658 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_small_town)))))))),And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_large_town)))))))),And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_town))))))))));
}; 
boolean ProcessStyle659 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_suburb))))))))));
}; 
boolean ProcessStyle660 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_suburb))))))))));
}; 
boolean ProcessStyle661 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_large_village)))))))),And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_village))))))))));
}; 
boolean ProcessStyle662 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_large_village)))))))),And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_village))))))))));
}; 
boolean ProcessStyle663 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_locality)))))))),And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_hamlet))))))))));
}; 
boolean ProcessStyle664 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_locality)))))))),And(Concat(Not(Parens(Condition(obj.getplace().equals_(CONST_hamlet))))))))));
}; 
boolean ProcessStyle665 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getdisused().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_station))))))))));
}; 
boolean ProcessStyle666 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getdisused().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_station))))))))));
}; 
boolean ProcessStyle667 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getdisused().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_station))))))))));
}; 
boolean ProcessStyle668 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getdisused().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_station))))))))));
}; 
boolean ProcessStyle669 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaerialway().equals_(CONST_station)))))))),And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_tram_stop)))))))),And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_halt))))))))));
}; 
boolean ProcessStyle670 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaerialway().equals_(CONST_station)))))))),And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_tram_stop)))))))),And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_halt))))))))));
}; 
boolean ProcessStyle671 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaerialway().equals_(CONST_station)))))))),And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_tram_stop)))))))),And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_halt))))))))));
}; 
boolean ProcessStyle672 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaerialway().equals_(CONST_station)))))))),And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_tram_stop)))))))),And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_halt))))))))));
}; 
boolean ProcessStyle673 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getdisused().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_station))))))))));
}; 
boolean ProcessStyle674 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getdisused().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_station))))))))));
}; 
boolean ProcessStyle675 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getdisused().equals_(CONST_yes)))))),Not(Parens(Condition(obj.getrailway().equals_(CONST_station))))))))));
}; 
boolean ProcessStyle676 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaeroway().equals_(CONST_airport))))))))));
}; 
boolean ProcessStyle677 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaeroway().equals_(CONST_airport))))))))));
}; 
boolean ProcessStyle678 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaeroway().equals_(CONST_aerodrome))))))))));
}; 
boolean ProcessStyle679 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaeroway().equals_(CONST_aerodrome))))))))));
}; 
boolean ProcessStyle680 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_level_crossing))))))))));
}; 
boolean ProcessStyle681 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getrailway().equals_(CONST_level_crossing))))))))));
}; 
boolean ProcessStyle682 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getman_made().equals_(CONST_lighthouse))))))))));
}; 
boolean ProcessStyle683 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getnatural().equals_(CONST_peak))))))))));
}; 
boolean ProcessStyle684 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getnatural().equals_(CONST_spring))))))))));
}; 
boolean ProcessStyle685 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getnatural().equals_(CONST_tree))))))))));
}; 
boolean ProcessStyle686 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getnatural().equals_(CONST_tree))))))))));
}; 
boolean ProcessStyle687 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getpower_source().equals_(CONST_wind)))))),Not(Parens(Condition(obj.getpower().equals_(CONST_generator)))))))))))))),And(Concat(Not(Parens(Condition(obj.getman_made().equals_(CONST_power_wind))))))))));
}; 
boolean ProcessStyle688 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getman_made().equals_(CONST_windmill))))))))));
}; 
boolean ProcessStyle689 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getman_made().equals_(CONST_mast))))))))));
}; 
boolean ProcessStyle690 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_mini_roundabout))))))))));
}; 
boolean ProcessStyle691 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getbarrier().equals_(CONST_gate)))))))),And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_gate))))))))));
}; 
boolean ProcessStyle692 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getbarrier().equals_(CONST_lift_gate))))))))));
}; 
boolean ProcessStyle693 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getbarrier().equals_(CONST_bollard))))))))));
}; 
boolean ProcessStyle694 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettourism().equals_(CONST_alpine_hut))))))))));
}; 
boolean ProcessStyle695 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_shelter))))))))));
}; 
boolean ProcessStyle696 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_atm))))))))));
}; 
boolean ProcessStyle697 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_bank))))))))));
}; 
boolean ProcessStyle698 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_bar))))))))));
}; 
boolean ProcessStyle699 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_bicycle_rental))))))))));
}; 
boolean ProcessStyle700 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_bus_stop)))))))),And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_bus_stop))))))))));
}; 
boolean ProcessStyle701 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_bus_stop)))))))),And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_bus_stop))))))))));
}; 
boolean ProcessStyle702 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_bus_station))))))))));
}; 
boolean ProcessStyle703 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_traffic_signals))))))))));
}; 
boolean ProcessStyle704 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_cafe))))))))));
}; 
boolean ProcessStyle705 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettourism().equals_(CONST_camp_site))))))))));
}; 
boolean ProcessStyle706 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gethighway().equals_(CONST_ford))))))))));
}; 
boolean ProcessStyle707 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettourism().equals_(CONST_caravan_site))))))))));
}; 
boolean ProcessStyle708 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_car_sharing))))))))));
}; 
boolean ProcessStyle709 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_cinema))))))))));
}; 
boolean ProcessStyle710 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_fire_station))))))))));
}; 
boolean ProcessStyle711 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_fuel))))))))));
}; 
boolean ProcessStyle712 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettourism().equals_(CONST_guest_house))))))))));
}; 
boolean ProcessStyle713 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_hospital))))))))));
}; 
boolean ProcessStyle714 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettourism().equals_(CONST_hostel))))))))));
}; 
boolean ProcessStyle715 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettourism().equals_(CONST_hotel))))))))));
}; 
boolean ProcessStyle716 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_embassy))))))))));
}; 
boolean ProcessStyle717 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_library))))))))));
}; 
boolean ProcessStyle718 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getlock().equals_(CONST_yes)))))))),And(Concat(Not(Parens(Condition(obj.getwaterway().equals_(CONST_lock))))))))));
}; 
boolean ProcessStyle719 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getman_made().equals_(CONST_mast))))))))));
}; 
boolean ProcessStyle720 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettourism().equals_(CONST_museum))))))))));
}; 
boolean ProcessStyle721 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getaccess().notNULL()))))))),And(Concat(Not(Parens(Condition(obj.getaccess().equals_(CONST_public)))))))))))),Not(Parens(Condition(obj.getamenity().equals_(CONST_parking))))))))));
}; 
boolean ProcessStyle722 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getaccess().equals_(CONST_public)))))),Not(Parens(Condition(obj.getaccess().notNULL()))))))))))),Not(Parens(Condition(obj.getamenity().equals_(CONST_parking))))))))));
}; 
boolean ProcessStyle723 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_pharmacy))))))))));
}; 
boolean ProcessStyle724 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getreligion().equals_(CONST_christian)))))),Not(Parens(Condition(obj.getamenity().equals_(CONST_place_of_worship))))))))));
}; 
boolean ProcessStyle725 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getreligion().equals_(CONST_muslim)))))),Not(Parens(Condition(obj.getamenity().equals_(CONST_place_of_worship))))))))));
}; 
boolean ProcessStyle726 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getreligion().equals_(CONST_sikh)))))),Not(Parens(Condition(obj.getamenity().equals_(CONST_place_of_worship))))))))));
}; 
boolean ProcessStyle727 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.getreligion().equals_(CONST_jewish)))))),Not(Parens(Condition(obj.getamenity().equals_(CONST_place_of_worship))))))))));
}; 
boolean ProcessStyle728 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_place_of_worship))))))))));
}; 
boolean ProcessStyle729 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_police))))))))));
}; 
boolean ProcessStyle730 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_post_box))))))))));
}; 
boolean ProcessStyle731 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_post_office))))))))));
}; 
boolean ProcessStyle732 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_pub))))))))));
}; 
boolean ProcessStyle733 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_recycling))))))))));
}; 
boolean ProcessStyle734 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_restaurant))))))))));
}; 
boolean ProcessStyle735 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_fast_food))))))))));
}; 
boolean ProcessStyle736 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_telephone))))))))));
}; 
boolean ProcessStyle737 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_emergency_phone))))))))));
}; 
boolean ProcessStyle738 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_theatre))))))))));
}; 
boolean ProcessStyle739 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_toilets))))))))));
}; 
boolean ProcessStyle740 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_drinking_water))))))))));
}; 
boolean ProcessStyle741 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getamenity().equals_(CONST_prison))))))))));
}; 
boolean ProcessStyle742 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.gettourism().equals_(CONST_viewpoint))))))))));
}; 
boolean ProcessStyle743 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getman_made().equals_(CONST_water_tower))))))))));
}; 
boolean ProcessStyle744 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getshop().equals_(CONST_supermarket))))))))));
}; 
boolean ProcessStyle745 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getshop().equals_(CONST_bakery))))))))));
}; 
boolean ProcessStyle746 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getshop().equals_(CONST_fashion)))))))),And(Concat(Not(Parens(Condition(obj.getshop().equals_(CONST_clothes))))))))));
}; 
boolean ProcessStyle747 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getshop().equals_(CONST_convenience))))))))));
}; 
boolean ProcessStyle748 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getshop().equals_(CONST_department_store))))))))));
}; 
boolean ProcessStyle749 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getshop().equals_(CONST_doityourself))))))))));
}; 
boolean ProcessStyle750 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getshop().equals_(CONST_hairdresser))))))))));
}; 
boolean ProcessStyle751 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getadmin_level().equals_(CONST_3)))))))),And(Concat(Not(Parens(Condition(obj.getadmin_level().equals_(CONST_2))))))))));
}; 
boolean ProcessStyle752 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getadmin_level().equals_(CONST_3)))))))),And(Concat(Not(Parens(Condition(obj.getadmin_level().equals_(CONST_2))))))))));
}; 
boolean ProcessStyle753 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getadmin_level().equals_(CONST_2))))))))));
}; 
boolean ProcessStyle754 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getadmin_level().equals_(CONST_3))))))))));
}; 
boolean ProcessStyle755 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getadmin_level().equals_(CONST_4))))))))));
}; 
boolean ProcessStyle756 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getadmin_level().equals_(CONST_4))))))))));
}; 
boolean ProcessStyle757 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getadmin_level().equals_(CONST_4))))))))));
}; 
boolean ProcessStyle758 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getadmin_level().equals_(CONST_5))))))))));
}; 
boolean ProcessStyle759 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getadmin_level().equals_(CONST_6))))))))));
}; 
boolean ProcessStyle760 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getadmin_level().equals_(CONST_7)))))))),And(Concat(Not(Parens(Condition(obj.getadmin_level().equals_(CONST_8))))))))));
}; 
boolean ProcessStyle761 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getadmin_level().equals_(CONST_9)))))))),And(Concat(Not(Parens(Condition(obj.getadmin_level().equals_(CONST_10))))))))));
}; 
boolean ProcessStyle762 (HighwayType obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.getadmin_level().notnull())))))))));
}; 
void ProcessStyle (HighwayType obj){if( ProcessStyle0 (obj)) {return; }
if( ProcessStyle1 (obj)) {return; }
if( ProcessStyle2 (obj)) {return; }
if( ProcessStyle3 (obj)) {return; }
if( ProcessStyle4 (obj)) {return; }
if( ProcessStyle5 (obj)) {return; }
if( ProcessStyle6 (obj)) {return; }
if( ProcessStyle7 (obj)) {return; }
if( ProcessStyle8 (obj)) {return; }
if( ProcessStyle9 (obj)) {return; }
if( ProcessStyle10 (obj)) {return; }
if( ProcessStyle11 (obj)) {return; }
if( ProcessStyle12 (obj)) {return; }
if( ProcessStyle13 (obj)) {return; }
if( ProcessStyle14 (obj)) {return; }
if( ProcessStyle15 (obj)) {return; }
if( ProcessStyle16 (obj)) {return; }
if( ProcessStyle17 (obj)) {return; }
if( ProcessStyle18 (obj)) {return; }
if( ProcessStyle19 (obj)) {return; }
if( ProcessStyle20 (obj)) {return; }
if( ProcessStyle21 (obj)) {return; }
if( ProcessStyle22 (obj)) {return; }
if( ProcessStyle23 (obj)) {return; }
if( ProcessStyle24 (obj)) {return; }
if( ProcessStyle25 (obj)) {return; }
if( ProcessStyle26 (obj)) {return; }
if( ProcessStyle27 (obj)) {return; }
if( ProcessStyle28 (obj)) {return; }
if( ProcessStyle29 (obj)) {return; }
if( ProcessStyle30 (obj)) {return; }
if( ProcessStyle31 (obj)) {return; }
if( ProcessStyle32 (obj)) {return; }
if( ProcessStyle33 (obj)) {return; }
if( ProcessStyle34 (obj)) {return; }
if( ProcessStyle35 (obj)) {return; }
if( ProcessStyle36 (obj)) {return; }
if( ProcessStyle37 (obj)) {return; }
if( ProcessStyle38 (obj)) {return; }
if( ProcessStyle39 (obj)) {return; }
if( ProcessStyle40 (obj)) {return; }
if( ProcessStyle41 (obj)) {return; }
if( ProcessStyle42 (obj)) {return; }
if( ProcessStyle43 (obj)) {return; }
if( ProcessStyle44 (obj)) {return; }
if( ProcessStyle45 (obj)) {return; }
if( ProcessStyle46 (obj)) {return; }
if( ProcessStyle47 (obj)) {return; }
if( ProcessStyle48 (obj)) {return; }
if( ProcessStyle49 (obj)) {return; }
if( ProcessStyle50 (obj)) {return; }
if( ProcessStyle51 (obj)) {return; }
if( ProcessStyle52 (obj)) {return; }
if( ProcessStyle53 (obj)) {return; }
if( ProcessStyle54 (obj)) {return; }
if( ProcessStyle55 (obj)) {return; }
if( ProcessStyle56 (obj)) {return; }
if( ProcessStyle57 (obj)) {return; }
if( ProcessStyle58 (obj)) {return; }
if( ProcessStyle59 (obj)) {return; }
if( ProcessStyle60 (obj)) {return; }
if( ProcessStyle61 (obj)) {return; }
if( ProcessStyle62 (obj)) {return; }
if( ProcessStyle63 (obj)) {return; }
if( ProcessStyle64 (obj)) {return; }
if( ProcessStyle65 (obj)) {return; }
if( ProcessStyle66 (obj)) {return; }
if( ProcessStyle67 (obj)) {return; }
if( ProcessStyle68 (obj)) {return; }
if( ProcessStyle69 (obj)) {return; }
if( ProcessStyle70 (obj)) {return; }
if( ProcessStyle71 (obj)) {return; }
if( ProcessStyle72 (obj)) {return; }
if( ProcessStyle73 (obj)) {return; }
if( ProcessStyle74 (obj)) {return; }
if( ProcessStyle75 (obj)) {return; }
if( ProcessStyle76 (obj)) {return; }
if( ProcessStyle77 (obj)) {return; }
if( ProcessStyle78 (obj)) {return; }
if( ProcessStyle79 (obj)) {return; }
if( ProcessStyle80 (obj)) {return; }
if( ProcessStyle81 (obj)) {return; }
if( ProcessStyle82 (obj)) {return; }
if( ProcessStyle83 (obj)) {return; }
if( ProcessStyle84 (obj)) {return; }
if( ProcessStyle85 (obj)) {return; }
if( ProcessStyle86 (obj)) {return; }
if( ProcessStyle87 (obj)) {return; }
if( ProcessStyle88 (obj)) {return; }
if( ProcessStyle89 (obj)) {return; }
if( ProcessStyle90 (obj)) {return; }
if( ProcessStyle91 (obj)) {return; }
if( ProcessStyle92 (obj)) {return; }
if( ProcessStyle93 (obj)) {return; }
if( ProcessStyle94 (obj)) {return; }
if( ProcessStyle95 (obj)) {return; }
if( ProcessStyle96 (obj)) {return; }
if( ProcessStyle97 (obj)) {return; }
if( ProcessStyle98 (obj)) {return; }
if( ProcessStyle99 (obj)) {return; }
if( ProcessStyle100 (obj)) {return; }
if( ProcessStyle101 (obj)) {return; }
if( ProcessStyle102 (obj)) {return; }
if( ProcessStyle103 (obj)) {return; }
if( ProcessStyle104 (obj)) {return; }
if( ProcessStyle105 (obj)) {return; }
if( ProcessStyle106 (obj)) {return; }
if( ProcessStyle107 (obj)) {return; }
if( ProcessStyle108 (obj)) {return; }
if( ProcessStyle109 (obj)) {return; }
if( ProcessStyle110 (obj)) {return; }
if( ProcessStyle111 (obj)) {return; }
if( ProcessStyle112 (obj)) {return; }
if( ProcessStyle113 (obj)) {return; }
if( ProcessStyle114 (obj)) {return; }
if( ProcessStyle115 (obj)) {return; }
if( ProcessStyle116 (obj)) {return; }
if( ProcessStyle117 (obj)) {return; }
if( ProcessStyle118 (obj)) {return; }
if( ProcessStyle119 (obj)) {return; }
if( ProcessStyle120 (obj)) {return; }
if( ProcessStyle121 (obj)) {return; }
if( ProcessStyle122 (obj)) {return; }
if( ProcessStyle123 (obj)) {return; }
if( ProcessStyle124 (obj)) {return; }
if( ProcessStyle125 (obj)) {return; }
if( ProcessStyle126 (obj)) {return; }
if( ProcessStyle127 (obj)) {return; }
if( ProcessStyle128 (obj)) {return; }
if( ProcessStyle129 (obj)) {return; }
if( ProcessStyle130 (obj)) {return; }
if( ProcessStyle131 (obj)) {return; }
if( ProcessStyle132 (obj)) {return; }
if( ProcessStyle133 (obj)) {return; }
if( ProcessStyle134 (obj)) {return; }
if( ProcessStyle135 (obj)) {return; }
if( ProcessStyle136 (obj)) {return; }
if( ProcessStyle137 (obj)) {return; }
if( ProcessStyle138 (obj)) {return; }
if( ProcessStyle139 (obj)) {return; }
if( ProcessStyle140 (obj)) {return; }
if( ProcessStyle141 (obj)) {return; }
if( ProcessStyle142 (obj)) {return; }
if( ProcessStyle143 (obj)) {return; }
if( ProcessStyle144 (obj)) {return; }
if( ProcessStyle145 (obj)) {return; }
if( ProcessStyle146 (obj)) {return; }
if( ProcessStyle147 (obj)) {return; }
if( ProcessStyle148 (obj)) {return; }
if( ProcessStyle149 (obj)) {return; }
if( ProcessStyle150 (obj)) {return; }
if( ProcessStyle151 (obj)) {return; }
if( ProcessStyle152 (obj)) {return; }
if( ProcessStyle153 (obj)) {return; }
if( ProcessStyle154 (obj)) {return; }
if( ProcessStyle155 (obj)) {return; }
if( ProcessStyle156 (obj)) {return; }
if( ProcessStyle157 (obj)) {return; }
if( ProcessStyle158 (obj)) {return; }
if( ProcessStyle159 (obj)) {return; }
if( ProcessStyle160 (obj)) {return; }
if( ProcessStyle161 (obj)) {return; }
if( ProcessStyle162 (obj)) {return; }
if( ProcessStyle163 (obj)) {return; }
if( ProcessStyle164 (obj)) {return; }
if( ProcessStyle165 (obj)) {return; }
if( ProcessStyle166 (obj)) {return; }
if( ProcessStyle167 (obj)) {return; }
if( ProcessStyle168 (obj)) {return; }
if( ProcessStyle169 (obj)) {return; }
if( ProcessStyle170 (obj)) {return; }
if( ProcessStyle171 (obj)) {return; }
if( ProcessStyle172 (obj)) {return; }
if( ProcessStyle173 (obj)) {return; }
if( ProcessStyle174 (obj)) {return; }
if( ProcessStyle175 (obj)) {return; }
if( ProcessStyle176 (obj)) {return; }
if( ProcessStyle177 (obj)) {return; }
if( ProcessStyle178 (obj)) {return; }
if( ProcessStyle179 (obj)) {return; }
if( ProcessStyle180 (obj)) {return; }
if( ProcessStyle181 (obj)) {return; }
if( ProcessStyle182 (obj)) {return; }
if( ProcessStyle183 (obj)) {return; }
if( ProcessStyle184 (obj)) {return; }
if( ProcessStyle185 (obj)) {return; }
if( ProcessStyle186 (obj)) {return; }
if( ProcessStyle187 (obj)) {return; }
if( ProcessStyle188 (obj)) {return; }
if( ProcessStyle189 (obj)) {return; }
if( ProcessStyle190 (obj)) {return; }
if( ProcessStyle191 (obj)) {return; }
if( ProcessStyle192 (obj)) {return; }
if( ProcessStyle193 (obj)) {return; }
if( ProcessStyle194 (obj)) {return; }
if( ProcessStyle195 (obj)) {return; }
if( ProcessStyle196 (obj)) {return; }
if( ProcessStyle197 (obj)) {return; }
if( ProcessStyle198 (obj)) {return; }
if( ProcessStyle199 (obj)) {return; }
if( ProcessStyle200 (obj)) {return; }
if( ProcessStyle201 (obj)) {return; }
if( ProcessStyle202 (obj)) {return; }
if( ProcessStyle203 (obj)) {return; }
if( ProcessStyle204 (obj)) {return; }
if( ProcessStyle205 (obj)) {return; }
if( ProcessStyle206 (obj)) {return; }
if( ProcessStyle207 (obj)) {return; }
if( ProcessStyle208 (obj)) {return; }
if( ProcessStyle209 (obj)) {return; }
if( ProcessStyle210 (obj)) {return; }
if( ProcessStyle211 (obj)) {return; }
if( ProcessStyle212 (obj)) {return; }
if( ProcessStyle213 (obj)) {return; }
if( ProcessStyle214 (obj)) {return; }
if( ProcessStyle215 (obj)) {return; }
if( ProcessStyle216 (obj)) {return; }
if( ProcessStyle217 (obj)) {return; }
if( ProcessStyle218 (obj)) {return; }
if( ProcessStyle219 (obj)) {return; }
if( ProcessStyle220 (obj)) {return; }
if( ProcessStyle221 (obj)) {return; }
if( ProcessStyle222 (obj)) {return; }
if( ProcessStyle223 (obj)) {return; }
if( ProcessStyle224 (obj)) {return; }
if( ProcessStyle225 (obj)) {return; }
if( ProcessStyle226 (obj)) {return; }
if( ProcessStyle227 (obj)) {return; }
if( ProcessStyle228 (obj)) {return; }
if( ProcessStyle229 (obj)) {return; }
if( ProcessStyle230 (obj)) {return; }
if( ProcessStyle231 (obj)) {return; }
if( ProcessStyle232 (obj)) {return; }
if( ProcessStyle233 (obj)) {return; }
if( ProcessStyle234 (obj)) {return; }
if( ProcessStyle235 (obj)) {return; }
if( ProcessStyle236 (obj)) {return; }
if( ProcessStyle237 (obj)) {return; }
if( ProcessStyle238 (obj)) {return; }
if( ProcessStyle239 (obj)) {return; }
if( ProcessStyle240 (obj)) {return; }
if( ProcessStyle241 (obj)) {return; }
if( ProcessStyle242 (obj)) {return; }
if( ProcessStyle243 (obj)) {return; }
if( ProcessStyle244 (obj)) {return; }
if( ProcessStyle245 (obj)) {return; }
if( ProcessStyle246 (obj)) {return; }
if( ProcessStyle247 (obj)) {return; }
if( ProcessStyle248 (obj)) {return; }
if( ProcessStyle249 (obj)) {return; }
if( ProcessStyle250 (obj)) {return; }
if( ProcessStyle251 (obj)) {return; }
if( ProcessStyle252 (obj)) {return; }
if( ProcessStyle253 (obj)) {return; }
if( ProcessStyle254 (obj)) {return; }
if( ProcessStyle255 (obj)) {return; }
if( ProcessStyle256 (obj)) {return; }
if( ProcessStyle257 (obj)) {return; }
if( ProcessStyle258 (obj)) {return; }
if( ProcessStyle259 (obj)) {return; }
if( ProcessStyle260 (obj)) {return; }
if( ProcessStyle261 (obj)) {return; }
if( ProcessStyle262 (obj)) {return; }
if( ProcessStyle263 (obj)) {return; }
if( ProcessStyle264 (obj)) {return; }
if( ProcessStyle265 (obj)) {return; }
if( ProcessStyle266 (obj)) {return; }
if( ProcessStyle267 (obj)) {return; }
if( ProcessStyle268 (obj)) {return; }
if( ProcessStyle269 (obj)) {return; }
if( ProcessStyle270 (obj)) {return; }
if( ProcessStyle271 (obj)) {return; }
if( ProcessStyle272 (obj)) {return; }
if( ProcessStyle273 (obj)) {return; }
if( ProcessStyle274 (obj)) {return; }
if( ProcessStyle275 (obj)) {return; }
if( ProcessStyle276 (obj)) {return; }
if( ProcessStyle277 (obj)) {return; }
if( ProcessStyle278 (obj)) {return; }
if( ProcessStyle279 (obj)) {return; }
if( ProcessStyle280 (obj)) {return; }
if( ProcessStyle281 (obj)) {return; }
if( ProcessStyle282 (obj)) {return; }
if( ProcessStyle283 (obj)) {return; }
if( ProcessStyle284 (obj)) {return; }
if( ProcessStyle285 (obj)) {return; }
if( ProcessStyle286 (obj)) {return; }
if( ProcessStyle287 (obj)) {return; }
if( ProcessStyle288 (obj)) {return; }
if( ProcessStyle289 (obj)) {return; }
if( ProcessStyle290 (obj)) {return; }
if( ProcessStyle291 (obj)) {return; }
if( ProcessStyle292 (obj)) {return; }
if( ProcessStyle293 (obj)) {return; }
if( ProcessStyle294 (obj)) {return; }
if( ProcessStyle295 (obj)) {return; }
if( ProcessStyle296 (obj)) {return; }
if( ProcessStyle297 (obj)) {return; }
if( ProcessStyle298 (obj)) {return; }
if( ProcessStyle299 (obj)) {return; }
if( ProcessStyle300 (obj)) {return; }
if( ProcessStyle301 (obj)) {return; }
if( ProcessStyle302 (obj)) {return; }
if( ProcessStyle303 (obj)) {return; }
if( ProcessStyle304 (obj)) {return; }
if( ProcessStyle305 (obj)) {return; }
if( ProcessStyle306 (obj)) {return; }
if( ProcessStyle307 (obj)) {return; }
if( ProcessStyle308 (obj)) {return; }
if( ProcessStyle309 (obj)) {return; }
if( ProcessStyle310 (obj)) {return; }
if( ProcessStyle311 (obj)) {return; }
if( ProcessStyle312 (obj)) {return; }
if( ProcessStyle313 (obj)) {return; }
if( ProcessStyle314 (obj)) {return; }
if( ProcessStyle315 (obj)) {return; }
if( ProcessStyle316 (obj)) {return; }
if( ProcessStyle317 (obj)) {return; }
if( ProcessStyle318 (obj)) {return; }
if( ProcessStyle319 (obj)) {return; }
if( ProcessStyle320 (obj)) {return; }
if( ProcessStyle321 (obj)) {return; }
if( ProcessStyle322 (obj)) {return; }
if( ProcessStyle323 (obj)) {return; }
if( ProcessStyle324 (obj)) {return; }
if( ProcessStyle325 (obj)) {return; }
if( ProcessStyle326 (obj)) {return; }
if( ProcessStyle327 (obj)) {return; }
if( ProcessStyle328 (obj)) {return; }
if( ProcessStyle329 (obj)) {return; }
if( ProcessStyle330 (obj)) {return; }
if( ProcessStyle331 (obj)) {return; }
if( ProcessStyle332 (obj)) {return; }
if( ProcessStyle333 (obj)) {return; }
if( ProcessStyle334 (obj)) {return; }
if( ProcessStyle335 (obj)) {return; }
if( ProcessStyle336 (obj)) {return; }
if( ProcessStyle337 (obj)) {return; }
if( ProcessStyle338 (obj)) {return; }
if( ProcessStyle339 (obj)) {return; }
if( ProcessStyle340 (obj)) {return; }
if( ProcessStyle341 (obj)) {return; }
if( ProcessStyle342 (obj)) {return; }
if( ProcessStyle343 (obj)) {return; }
if( ProcessStyle344 (obj)) {return; }
if( ProcessStyle345 (obj)) {return; }
if( ProcessStyle346 (obj)) {return; }
if( ProcessStyle347 (obj)) {return; }
if( ProcessStyle348 (obj)) {return; }
if( ProcessStyle349 (obj)) {return; }
if( ProcessStyle350 (obj)) {return; }
if( ProcessStyle351 (obj)) {return; }
if( ProcessStyle352 (obj)) {return; }
if( ProcessStyle353 (obj)) {return; }
if( ProcessStyle354 (obj)) {return; }
if( ProcessStyle355 (obj)) {return; }
if( ProcessStyle356 (obj)) {return; }
if( ProcessStyle357 (obj)) {return; }
if( ProcessStyle358 (obj)) {return; }
if( ProcessStyle359 (obj)) {return; }
if( ProcessStyle360 (obj)) {return; }
if( ProcessStyle361 (obj)) {return; }
if( ProcessStyle362 (obj)) {return; }
if( ProcessStyle363 (obj)) {return; }
if( ProcessStyle364 (obj)) {return; }
if( ProcessStyle365 (obj)) {return; }
if( ProcessStyle366 (obj)) {return; }
if( ProcessStyle367 (obj)) {return; }
if( ProcessStyle368 (obj)) {return; }
if( ProcessStyle369 (obj)) {return; }
if( ProcessStyle370 (obj)) {return; }
if( ProcessStyle371 (obj)) {return; }
if( ProcessStyle372 (obj)) {return; }
if( ProcessStyle373 (obj)) {return; }
if( ProcessStyle374 (obj)) {return; }
if( ProcessStyle375 (obj)) {return; }
if( ProcessStyle376 (obj)) {return; }
if( ProcessStyle377 (obj)) {return; }
if( ProcessStyle378 (obj)) {return; }
if( ProcessStyle379 (obj)) {return; }
if( ProcessStyle380 (obj)) {return; }
if( ProcessStyle381 (obj)) {return; }
if( ProcessStyle382 (obj)) {return; }
if( ProcessStyle383 (obj)) {return; }
if( ProcessStyle384 (obj)) {return; }
if( ProcessStyle385 (obj)) {return; }
if( ProcessStyle386 (obj)) {return; }
if( ProcessStyle387 (obj)) {return; }
if( ProcessStyle388 (obj)) {return; }
if( ProcessStyle389 (obj)) {return; }
if( ProcessStyle390 (obj)) {return; }
if( ProcessStyle391 (obj)) {return; }
if( ProcessStyle392 (obj)) {return; }
if( ProcessStyle393 (obj)) {return; }
if( ProcessStyle394 (obj)) {return; }
if( ProcessStyle395 (obj)) {return; }
if( ProcessStyle396 (obj)) {return; }
if( ProcessStyle397 (obj)) {return; }
if( ProcessStyle398 (obj)) {return; }
if( ProcessStyle399 (obj)) {return; }
if( ProcessStyle400 (obj)) {return; }
if( ProcessStyle401 (obj)) {return; }
if( ProcessStyle402 (obj)) {return; }
if( ProcessStyle403 (obj)) {return; }
if( ProcessStyle404 (obj)) {return; }
if( ProcessStyle405 (obj)) {return; }
if( ProcessStyle406 (obj)) {return; }
if( ProcessStyle407 (obj)) {return; }
if( ProcessStyle408 (obj)) {return; }
if( ProcessStyle409 (obj)) {return; }
if( ProcessStyle410 (obj)) {return; }
if( ProcessStyle411 (obj)) {return; }
if( ProcessStyle412 (obj)) {return; }
if( ProcessStyle413 (obj)) {return; }
if( ProcessStyle414 (obj)) {return; }
if( ProcessStyle415 (obj)) {return; }
if( ProcessStyle416 (obj)) {return; }
if( ProcessStyle417 (obj)) {return; }
if( ProcessStyle418 (obj)) {return; }
if( ProcessStyle419 (obj)) {return; }
if( ProcessStyle420 (obj)) {return; }
if( ProcessStyle421 (obj)) {return; }
if( ProcessStyle422 (obj)) {return; }
if( ProcessStyle423 (obj)) {return; }
if( ProcessStyle424 (obj)) {return; }
if( ProcessStyle425 (obj)) {return; }
if( ProcessStyle426 (obj)) {return; }
if( ProcessStyle427 (obj)) {return; }
if( ProcessStyle428 (obj)) {return; }
if( ProcessStyle429 (obj)) {return; }
if( ProcessStyle430 (obj)) {return; }
if( ProcessStyle431 (obj)) {return; }
if( ProcessStyle432 (obj)) {return; }
if( ProcessStyle433 (obj)) {return; }
if( ProcessStyle434 (obj)) {return; }
if( ProcessStyle435 (obj)) {return; }
if( ProcessStyle436 (obj)) {return; }
if( ProcessStyle437 (obj)) {return; }
if( ProcessStyle438 (obj)) {return; }
if( ProcessStyle439 (obj)) {return; }
if( ProcessStyle440 (obj)) {return; }
if( ProcessStyle441 (obj)) {return; }
if( ProcessStyle442 (obj)) {return; }
if( ProcessStyle443 (obj)) {return; }
if( ProcessStyle444 (obj)) {return; }
if( ProcessStyle445 (obj)) {return; }
if( ProcessStyle446 (obj)) {return; }
if( ProcessStyle447 (obj)) {return; }
if( ProcessStyle448 (obj)) {return; }
if( ProcessStyle449 (obj)) {return; }
if( ProcessStyle450 (obj)) {return; }
if( ProcessStyle451 (obj)) {return; }
if( ProcessStyle452 (obj)) {return; }
if( ProcessStyle453 (obj)) {return; }
if( ProcessStyle454 (obj)) {return; }
if( ProcessStyle455 (obj)) {return; }
if( ProcessStyle456 (obj)) {return; }
if( ProcessStyle457 (obj)) {return; }
if( ProcessStyle458 (obj)) {return; }
if( ProcessStyle459 (obj)) {return; }
if( ProcessStyle460 (obj)) {return; }
if( ProcessStyle461 (obj)) {return; }
if( ProcessStyle462 (obj)) {return; }
if( ProcessStyle463 (obj)) {return; }
if( ProcessStyle464 (obj)) {return; }
if( ProcessStyle465 (obj)) {return; }
if( ProcessStyle466 (obj)) {return; }
if( ProcessStyle467 (obj)) {return; }
if( ProcessStyle468 (obj)) {return; }
if( ProcessStyle469 (obj)) {return; }
if( ProcessStyle470 (obj)) {return; }
if( ProcessStyle471 (obj)) {return; }
if( ProcessStyle472 (obj)) {return; }
if( ProcessStyle473 (obj)) {return; }
if( ProcessStyle474 (obj)) {return; }
if( ProcessStyle475 (obj)) {return; }
if( ProcessStyle476 (obj)) {return; }
if( ProcessStyle477 (obj)) {return; }
if( ProcessStyle478 (obj)) {return; }
if( ProcessStyle479 (obj)) {return; }
if( ProcessStyle480 (obj)) {return; }
if( ProcessStyle481 (obj)) {return; }
if( ProcessStyle482 (obj)) {return; }
if( ProcessStyle483 (obj)) {return; }
if( ProcessStyle484 (obj)) {return; }
if( ProcessStyle485 (obj)) {return; }
if( ProcessStyle486 (obj)) {return; }
if( ProcessStyle487 (obj)) {return; }
if( ProcessStyle488 (obj)) {return; }
if( ProcessStyle489 (obj)) {return; }
if( ProcessStyle490 (obj)) {return; }
if( ProcessStyle491 (obj)) {return; }
if( ProcessStyle492 (obj)) {return; }
if( ProcessStyle493 (obj)) {return; }
if( ProcessStyle494 (obj)) {return; }
if( ProcessStyle495 (obj)) {return; }
if( ProcessStyle496 (obj)) {return; }
if( ProcessStyle497 (obj)) {return; }
if( ProcessStyle498 (obj)) {return; }
if( ProcessStyle499 (obj)) {return; }
if( ProcessStyle500 (obj)) {return; }
if( ProcessStyle501 (obj)) {return; }
if( ProcessStyle502 (obj)) {return; }
if( ProcessStyle503 (obj)) {return; }
if( ProcessStyle504 (obj)) {return; }
if( ProcessStyle505 (obj)) {return; }
if( ProcessStyle506 (obj)) {return; }
if( ProcessStyle507 (obj)) {return; }
if( ProcessStyle508 (obj)) {return; }
if( ProcessStyle509 (obj)) {return; }
if( ProcessStyle510 (obj)) {return; }
if( ProcessStyle511 (obj)) {return; }
if( ProcessStyle512 (obj)) {return; }
if( ProcessStyle513 (obj)) {return; }
if( ProcessStyle514 (obj)) {return; }
if( ProcessStyle515 (obj)) {return; }
if( ProcessStyle516 (obj)) {return; }
if( ProcessStyle517 (obj)) {return; }
if( ProcessStyle518 (obj)) {return; }
if( ProcessStyle519 (obj)) {return; }
if( ProcessStyle520 (obj)) {return; }
if( ProcessStyle521 (obj)) {return; }
if( ProcessStyle522 (obj)) {return; }
if( ProcessStyle523 (obj)) {return; }
if( ProcessStyle524 (obj)) {return; }
if( ProcessStyle525 (obj)) {return; }
if( ProcessStyle526 (obj)) {return; }
if( ProcessStyle527 (obj)) {return; }
if( ProcessStyle528 (obj)) {return; }
if( ProcessStyle529 (obj)) {return; }
if( ProcessStyle530 (obj)) {return; }
if( ProcessStyle531 (obj)) {return; }
if( ProcessStyle532 (obj)) {return; }
if( ProcessStyle533 (obj)) {return; }
if( ProcessStyle534 (obj)) {return; }
if( ProcessStyle535 (obj)) {return; }
if( ProcessStyle536 (obj)) {return; }
if( ProcessStyle537 (obj)) {return; }
if( ProcessStyle538 (obj)) {return; }
if( ProcessStyle539 (obj)) {return; }
if( ProcessStyle540 (obj)) {return; }
if( ProcessStyle541 (obj)) {return; }
if( ProcessStyle542 (obj)) {return; }
if( ProcessStyle543 (obj)) {return; }
if( ProcessStyle544 (obj)) {return; }
if( ProcessStyle545 (obj)) {return; }
if( ProcessStyle546 (obj)) {return; }
if( ProcessStyle547 (obj)) {return; }
if( ProcessStyle548 (obj)) {return; }
if( ProcessStyle549 (obj)) {return; }
if( ProcessStyle550 (obj)) {return; }
if( ProcessStyle551 (obj)) {return; }
if( ProcessStyle552 (obj)) {return; }
if( ProcessStyle553 (obj)) {return; }
if( ProcessStyle554 (obj)) {return; }
if( ProcessStyle555 (obj)) {return; }
if( ProcessStyle556 (obj)) {return; }
if( ProcessStyle557 (obj)) {return; }
if( ProcessStyle558 (obj)) {return; }
if( ProcessStyle559 (obj)) {return; }
if( ProcessStyle560 (obj)) {return; }
if( ProcessStyle561 (obj)) {return; }
if( ProcessStyle562 (obj)) {return; }
if( ProcessStyle563 (obj)) {return; }
if( ProcessStyle564 (obj)) {return; }
if( ProcessStyle565 (obj)) {return; }
if( ProcessStyle566 (obj)) {return; }
if( ProcessStyle567 (obj)) {return; }
if( ProcessStyle568 (obj)) {return; }
if( ProcessStyle569 (obj)) {return; }
if( ProcessStyle570 (obj)) {return; }
if( ProcessStyle571 (obj)) {return; }
if( ProcessStyle572 (obj)) {return; }
if( ProcessStyle573 (obj)) {return; }
if( ProcessStyle574 (obj)) {return; }
if( ProcessStyle575 (obj)) {return; }
if( ProcessStyle576 (obj)) {return; }
if( ProcessStyle577 (obj)) {return; }
if( ProcessStyle578 (obj)) {return; }
if( ProcessStyle579 (obj)) {return; }
if( ProcessStyle580 (obj)) {return; }
if( ProcessStyle581 (obj)) {return; }
if( ProcessStyle582 (obj)) {return; }
if( ProcessStyle583 (obj)) {return; }
if( ProcessStyle584 (obj)) {return; }
if( ProcessStyle585 (obj)) {return; }
if( ProcessStyle586 (obj)) {return; }
if( ProcessStyle587 (obj)) {return; }
if( ProcessStyle588 (obj)) {return; }
if( ProcessStyle589 (obj)) {return; }
if( ProcessStyle590 (obj)) {return; }
if( ProcessStyle591 (obj)) {return; }
if( ProcessStyle592 (obj)) {return; }
if( ProcessStyle593 (obj)) {return; }
if( ProcessStyle594 (obj)) {return; }
if( ProcessStyle595 (obj)) {return; }
if( ProcessStyle596 (obj)) {return; }
if( ProcessStyle597 (obj)) {return; }
if( ProcessStyle598 (obj)) {return; }
if( ProcessStyle599 (obj)) {return; }
if( ProcessStyle600 (obj)) {return; }
if( ProcessStyle601 (obj)) {return; }
if( ProcessStyle602 (obj)) {return; }
if( ProcessStyle603 (obj)) {return; }
if( ProcessStyle604 (obj)) {return; }
if( ProcessStyle605 (obj)) {return; }
if( ProcessStyle606 (obj)) {return; }
if( ProcessStyle607 (obj)) {return; }
if( ProcessStyle608 (obj)) {return; }
if( ProcessStyle609 (obj)) {return; }
if( ProcessStyle610 (obj)) {return; }
if( ProcessStyle611 (obj)) {return; }
if( ProcessStyle612 (obj)) {return; }
if( ProcessStyle613 (obj)) {return; }
if( ProcessStyle614 (obj)) {return; }
if( ProcessStyle615 (obj)) {return; }
if( ProcessStyle616 (obj)) {return; }
if( ProcessStyle617 (obj)) {return; }
if( ProcessStyle618 (obj)) {return; }
if( ProcessStyle619 (obj)) {return; }
if( ProcessStyle620 (obj)) {return; }
if( ProcessStyle621 (obj)) {return; }
if( ProcessStyle622 (obj)) {return; }
if( ProcessStyle623 (obj)) {return; }
if( ProcessStyle624 (obj)) {return; }
if( ProcessStyle625 (obj)) {return; }
if( ProcessStyle626 (obj)) {return; }
if( ProcessStyle627 (obj)) {return; }
if( ProcessStyle628 (obj)) {return; }
if( ProcessStyle629 (obj)) {return; }
if( ProcessStyle630 (obj)) {return; }
if( ProcessStyle631 (obj)) {return; }
if( ProcessStyle632 (obj)) {return; }
if( ProcessStyle633 (obj)) {return; }
if( ProcessStyle634 (obj)) {return; }
if( ProcessStyle635 (obj)) {return; }
if( ProcessStyle636 (obj)) {return; }
if( ProcessStyle637 (obj)) {return; }
if( ProcessStyle638 (obj)) {return; }
if( ProcessStyle639 (obj)) {return; }
if( ProcessStyle640 (obj)) {return; }
if( ProcessStyle641 (obj)) {return; }
if( ProcessStyle642 (obj)) {return; }
if( ProcessStyle643 (obj)) {return; }
if( ProcessStyle644 (obj)) {return; }
if( ProcessStyle645 (obj)) {return; }
if( ProcessStyle646 (obj)) {return; }
if( ProcessStyle647 (obj)) {return; }
if( ProcessStyle648 (obj)) {return; }
if( ProcessStyle649 (obj)) {return; }
if( ProcessStyle650 (obj)) {return; }
if( ProcessStyle651 (obj)) {return; }
if( ProcessStyle652 (obj)) {return; }
if( ProcessStyle653 (obj)) {return; }
if( ProcessStyle654 (obj)) {return; }
if( ProcessStyle655 (obj)) {return; }
if( ProcessStyle656 (obj)) {return; }
if( ProcessStyle657 (obj)) {return; }
if( ProcessStyle658 (obj)) {return; }
if( ProcessStyle659 (obj)) {return; }
if( ProcessStyle660 (obj)) {return; }
if( ProcessStyle661 (obj)) {return; }
if( ProcessStyle662 (obj)) {return; }
if( ProcessStyle663 (obj)) {return; }
if( ProcessStyle664 (obj)) {return; }
if( ProcessStyle665 (obj)) {return; }
if( ProcessStyle666 (obj)) {return; }
if( ProcessStyle667 (obj)) {return; }
if( ProcessStyle668 (obj)) {return; }
if( ProcessStyle669 (obj)) {return; }
if( ProcessStyle670 (obj)) {return; }
if( ProcessStyle671 (obj)) {return; }
if( ProcessStyle672 (obj)) {return; }
if( ProcessStyle673 (obj)) {return; }
if( ProcessStyle674 (obj)) {return; }
if( ProcessStyle675 (obj)) {return; }
if( ProcessStyle676 (obj)) {return; }
if( ProcessStyle677 (obj)) {return; }
if( ProcessStyle678 (obj)) {return; }
if( ProcessStyle679 (obj)) {return; }
if( ProcessStyle680 (obj)) {return; }
if( ProcessStyle681 (obj)) {return; }
if( ProcessStyle682 (obj)) {return; }
if( ProcessStyle683 (obj)) {return; }
if( ProcessStyle684 (obj)) {return; }
if( ProcessStyle685 (obj)) {return; }
if( ProcessStyle686 (obj)) {return; }
if( ProcessStyle687 (obj)) {return; }
if( ProcessStyle688 (obj)) {return; }
if( ProcessStyle689 (obj)) {return; }
if( ProcessStyle690 (obj)) {return; }
if( ProcessStyle691 (obj)) {return; }
if( ProcessStyle692 (obj)) {return; }
if( ProcessStyle693 (obj)) {return; }
if( ProcessStyle694 (obj)) {return; }
if( ProcessStyle695 (obj)) {return; }
if( ProcessStyle696 (obj)) {return; }
if( ProcessStyle697 (obj)) {return; }
if( ProcessStyle698 (obj)) {return; }
if( ProcessStyle699 (obj)) {return; }
if( ProcessStyle700 (obj)) {return; }
if( ProcessStyle701 (obj)) {return; }
if( ProcessStyle702 (obj)) {return; }
if( ProcessStyle703 (obj)) {return; }
if( ProcessStyle704 (obj)) {return; }
if( ProcessStyle705 (obj)) {return; }
if( ProcessStyle706 (obj)) {return; }
if( ProcessStyle707 (obj)) {return; }
if( ProcessStyle708 (obj)) {return; }
if( ProcessStyle709 (obj)) {return; }
if( ProcessStyle710 (obj)) {return; }
if( ProcessStyle711 (obj)) {return; }
if( ProcessStyle712 (obj)) {return; }
if( ProcessStyle713 (obj)) {return; }
if( ProcessStyle714 (obj)) {return; }
if( ProcessStyle715 (obj)) {return; }
if( ProcessStyle716 (obj)) {return; }
if( ProcessStyle717 (obj)) {return; }
if( ProcessStyle718 (obj)) {return; }
if( ProcessStyle719 (obj)) {return; }
if( ProcessStyle720 (obj)) {return; }
if( ProcessStyle721 (obj)) {return; }
if( ProcessStyle722 (obj)) {return; }
if( ProcessStyle723 (obj)) {return; }
if( ProcessStyle724 (obj)) {return; }
if( ProcessStyle725 (obj)) {return; }
if( ProcessStyle726 (obj)) {return; }
if( ProcessStyle727 (obj)) {return; }
if( ProcessStyle728 (obj)) {return; }
if( ProcessStyle729 (obj)) {return; }
if( ProcessStyle730 (obj)) {return; }
if( ProcessStyle731 (obj)) {return; }
if( ProcessStyle732 (obj)) {return; }
if( ProcessStyle733 (obj)) {return; }
if( ProcessStyle734 (obj)) {return; }
if( ProcessStyle735 (obj)) {return; }
if( ProcessStyle736 (obj)) {return; }
if( ProcessStyle737 (obj)) {return; }
if( ProcessStyle738 (obj)) {return; }
if( ProcessStyle739 (obj)) {return; }
if( ProcessStyle740 (obj)) {return; }
if( ProcessStyle741 (obj)) {return; }
if( ProcessStyle742 (obj)) {return; }
if( ProcessStyle743 (obj)) {return; }
if( ProcessStyle744 (obj)) {return; }
if( ProcessStyle745 (obj)) {return; }
if( ProcessStyle746 (obj)) {return; }
if( ProcessStyle747 (obj)) {return; }
if( ProcessStyle748 (obj)) {return; }
if( ProcessStyle749 (obj)) {return; }
if( ProcessStyle750 (obj)) {return; }
if( ProcessStyle751 (obj)) {return; }
if( ProcessStyle752 (obj)) {return; }
if( ProcessStyle753 (obj)) {return; }
if( ProcessStyle754 (obj)) {return; }
if( ProcessStyle755 (obj)) {return; }
if( ProcessStyle756 (obj)) {return; }
if( ProcessStyle757 (obj)) {return; }
if( ProcessStyle758 (obj)) {return; }
if( ProcessStyle759 (obj)) {return; }
if( ProcessStyle760 (obj)) {return; }
if( ProcessStyle761 (obj)) {return; }
if( ProcessStyle762 (obj)) {return; }
}
@Override
void ProcessStyle(BaseObject obj) {
	// TODO Auto-generated method stub
	
}}; 
