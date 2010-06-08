package org.openstreetmap.gwt.client;
import  org.openstreetmap.gwt.client.StyleEvaluator;
import org.openstreetmap.josm.data.osm.OsmPrimitiveWrapper;
public class GeneratedStyleEvaluator extends StyleEvaluator  { 
boolean ProcessStyle0 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle1 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("path")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("footway")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("service")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle2 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("track"))))))))));
}; 
boolean ProcessStyle3 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("living_street"))))))))));
}; 
boolean ProcessStyle4 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("service")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle5 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("path")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("footway")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("service")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle6 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("track"))))))))));
}; 
boolean ProcessStyle7 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("leisure").equals("playground"))))))))));
}; 
boolean ProcessStyle8 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("picnic_site")))))))),And(Concat(Not(Parens(Condition(obj.get("tourism").equals("caravan_site")))))))),And(Concat(Not(Parens(Condition(obj.get("tourism").equals("camp_site"))))))))));
}; 
boolean ProcessStyle9 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("attraction"))))))))));
}; 
boolean ProcessStyle10 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("quarry"))))))))));
}; 
boolean ProcessStyle11 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("vineyard")))))))),And(Concat(Not(Parens(Condition(obj.get("leisure").equals("nature_reserve"))))))))));
}; 
boolean ProcessStyle12 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("orchard"))))))))));
}; 
boolean ProcessStyle13 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("vineyard"))))))))));
}; 
boolean ProcessStyle14 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("vineyard"))))))))));
}; 
boolean ProcessStyle15 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("leisure").equals("nature_reserve"))))))))));
}; 
boolean ProcessStyle16 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("leisure").equals("nature_reserve"))))))))));
}; 
boolean ProcessStyle17 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("grave_yard")))))))),And(Concat(Not(Parens(Condition(obj.get("landuse").equals("grave_yard")))))))),And(Concat(Not(Parens(Condition(obj.get("landuse").equals("cemetery"))))))))));
}; 
boolean ProcessStyle18 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("residential"))))))))));
}; 
boolean ProcessStyle19 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("military").equals("barracks"))))))))));
}; 
boolean ProcessStyle20 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("military"))))))))));
}; 
boolean ProcessStyle21 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("field")))))))),And(Concat(Not(Parens(Condition(obj.get("landuse").equals("field"))))))))));
}; 
boolean ProcessStyle22 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("field")))))))),And(Concat(Not(Parens(Condition(obj.get("landuse").equals("field"))))))))));
}; 
boolean ProcessStyle23 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("military").equals("danger_area"))))))))));
}; 
boolean ProcessStyle24 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("military").equals("danger_area"))))))))));
}; 
boolean ProcessStyle25 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("religion").equals("jewish")))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("grave_yard")))))))),And(Concat(Not(Parens(Condition(obj.get("landuse").equals("grave_yard")))))))),And(Concat(Not(Parens(Condition(obj.get("landuse").equals("cemetery"))))))))))))))));
}; 
boolean ProcessStyle26 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("religion").notequals("jewish")))))))),And(Concat(Not(Parens(Condition(obj.get("religion").notequals("")))))))))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("grave_yard")))))))),And(Concat(Not(Parens(Condition(obj.get("landuse").equals("grave_yard")))))))),And(Concat(Not(Parens(Condition(obj.get("landuse").equals("cemetery"))))))))))))))));
}; 
boolean ProcessStyle27 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("grass")))))))),And(Concat(Not(Parens(Condition(obj.get("landuse").equals("meadow"))))))))));
}; 
boolean ProcessStyle28 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("leisure").equals("recreation_ground")))))))),And(Concat(Not(Parens(Condition(obj.get("leisure").equals("park"))))))))));
}; 
boolean ProcessStyle29 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("zoo"))))))))));
}; 
boolean ProcessStyle30 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("leisure").equals("common"))))))))));
}; 
boolean ProcessStyle31 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("leisure").equals("garden"))))))))));
}; 
boolean ProcessStyle32 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("leisure").equals("golf_course"))))))))));
}; 
boolean ProcessStyle33 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("allotments"))))))))));
}; 
boolean ProcessStyle34 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("forest"))))))))));
}; 
boolean ProcessStyle35 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("forest"))))))))));
}; 
boolean ProcessStyle36 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("farmyard"))))))))));
}; 
boolean ProcessStyle37 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("farmland")))))))),And(Concat(Not(Parens(Condition(obj.get("landuse").equals("farm"))))))))));
}; 
boolean ProcessStyle38 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("conservation")))))))),And(Concat(Not(Parens(Condition(obj.get("landuse").equals("recreation_ground"))))))))));
}; 
boolean ProcessStyle39 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("village_green"))))))))));
}; 
boolean ProcessStyle40 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("retail"))))))))));
}; 
boolean ProcessStyle41 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("retail"))))))))));
}; 
boolean ProcessStyle42 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("railway")))))))),And(Concat(Not(Parens(Condition(obj.get("landuse").equals("industrial"))))))))));
}; 
boolean ProcessStyle43 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("power").equals("station"))))))))));
}; 
boolean ProcessStyle44 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("power").equals("station"))))))))));
}; 
boolean ProcessStyle45 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("power").equals("sub_station"))))))))));
}; 
boolean ProcessStyle46 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("commercial"))))))))));
}; 
boolean ProcessStyle47 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("landuse").equals("greenfield")))))))),And(Concat(Not(Parens(Condition(obj.get("landuse").equals("landfill")))))))),And(Concat(Not(Parens(Condition(obj.get("landuse").equals("brownfield"))))))))));
}; 
boolean ProcessStyle48 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("wood")))))))),And(Concat(Not(Parens(Condition(obj.get("natural").equals("wood"))))))))));
}; 
boolean ProcessStyle49 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("heath"))))))))));
}; 
boolean ProcessStyle50 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("kindergarten")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").equals("hospital")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").equals("school")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").equals("college")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").equals("university"))))))))));
}; 
boolean ProcessStyle51 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("kindergarten")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").equals("hospital")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").equals("school")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").equals("college")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").equals("university"))))))))));
}; 
boolean ProcessStyle52 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("parking"))))))))));
}; 
boolean ProcessStyle53 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("parking"))))))))));
}; 
boolean ProcessStyle54 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aeroway").equals("apron"))))))))));
}; 
boolean ProcessStyle55 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aeroway").equals("aerodrome"))))))))));
}; 
boolean ProcessStyle56 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("beach"))))))))));
}; 
boolean ProcessStyle57 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("mud"))))))))));
}; 
boolean ProcessStyle58 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("leisure").equals("pitch"))))))))));
}; 
boolean ProcessStyle59 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(obj.get("way_area")))))))));
}; 
boolean ProcessStyle60 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(obj.get("way_area")))))))));
}; 
boolean ProcessStyle61 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(obj.get("way_area")))))))));
}; 
boolean ProcessStyle62 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(obj.get("way_area")))))))));
}; 
boolean ProcessStyle63 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("island"))))))))));
}; 
boolean ProcessStyle64 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("fast_food")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").equals("cafe")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").equals("restaurant")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").equals("pub"))))))))));
}; 
boolean ProcessStyle65 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("bar"))))))))));
}; 
boolean ProcessStyle66 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("theatre")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").equals("library")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").equals("cinema"))))))))));
}; 
boolean ProcessStyle67 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("access").notequals("")))))))),And(Concat(Not(Parens(Condition(obj.get("access").equals("public")))))))))))),Not(Parens(Condition(obj.get("amenity").equals("parking"))))))))));
}; 
boolean ProcessStyle68 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("access").equals("public")))))),Not(Parens(Condition(obj.get("access").notequals("")))))))))))),Not(Parens(Condition(obj.get("amenity").equals("parking"))))))))));
}; 
boolean ProcessStyle69 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("police"))))))))));
}; 
boolean ProcessStyle70 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("fire_station"))))))))));
}; 
boolean ProcessStyle71 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("place_of_worship"))))))))));
}; 
boolean ProcessStyle72 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("wood"))))))))));
}; 
boolean ProcessStyle73 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("peak"))))))))));
}; 
boolean ProcessStyle74 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("peak"))))))))));
}; 
boolean ProcessStyle75 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("basin")))))))),And(Concat(Not(Parens(Condition(obj.get("landuse").equals("reservoir")))))))),And(Concat(Not(Parens(Condition(obj.get("natural").equals("lake")))))))),And(Concat(Not(Parens(Condition(obj.get("natural").equals("water"))))))))));
}; 
boolean ProcessStyle76 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("point").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").notequals("")))))))),And(Concat(Not(Parens(Condition(obj.get("leisure").notequals(""))))))))))))))));
}; 
boolean ProcessStyle77 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("bay"))))))))));
}; 
boolean ProcessStyle78 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("spring"))))))))));
}; 
boolean ProcessStyle79 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("shelter")))))))),And(Concat(Not(Parens(Condition(obj.get("tourism").equals("alpine_hut"))))))))));
}; 
boolean ProcessStyle80 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("shelter")))))))),And(Concat(Not(Parens(Condition(obj.get("tourism").equals("alpine_hut"))))))))));
}; 
boolean ProcessStyle81 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("bank"))))))))));
}; 
boolean ProcessStyle82 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("hostel")))))))),And(Concat(Not(Parens(Condition(obj.get("tourism").equals("hotel"))))))))));
}; 
boolean ProcessStyle83 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("embassy"))))))))));
}; 
boolean ProcessStyle84 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("guest_house"))))))))));
}; 
boolean ProcessStyle85 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("bus_station")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").equals("fuel"))))))))));
}; 
boolean ProcessStyle86 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("camp_site"))))))))));
}; 
boolean ProcessStyle87 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("caravan_site"))))))))));
}; 
boolean ProcessStyle88 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("waterway").equals("lock"))))))))));
}; 
boolean ProcessStyle89 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("leisure").equals("marina"))))))))));
}; 
boolean ProcessStyle90 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("leisure").equals("marina"))))))))));
}; 
boolean ProcessStyle91 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("theme_park"))))))))));
}; 
boolean ProcessStyle92 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("theme_park"))))))))));
}; 
boolean ProcessStyle93 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("museum"))))))))));
}; 
boolean ProcessStyle94 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("prison"))))))))));
}; 
boolean ProcessStyle95 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("attraction"))))))))));
}; 
boolean ProcessStyle96 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("university"))))))))));
}; 
boolean ProcessStyle97 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("college")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").equals("school"))))))))));
}; 
boolean ProcessStyle98 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("kindergarten"))))))))));
}; 
boolean ProcessStyle99 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("man_made").equals("lighthouse"))))))))));
}; 
boolean ProcessStyle100 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("man_made").equals("windmill"))))))))));
}; 
boolean ProcessStyle101 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("hospital"))))))))));
}; 
boolean ProcessStyle102 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("pharmacy"))))))))));
}; 
boolean ProcessStyle103 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("shop").equals("hairdresser")))))))),And(Concat(Not(Parens(Condition(obj.get("shop").equals("doityourself")))))))),And(Concat(Not(Parens(Condition(obj.get("shop").equals("convenience")))))))),And(Concat(Not(Parens(Condition(obj.get("shop").equals("fashion")))))))),And(Concat(Not(Parens(Condition(obj.get("shop").equals("clothes")))))))),And(Concat(Not(Parens(Condition(obj.get("shop").equals("bakery"))))))))));
}; 
boolean ProcessStyle104 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("shop").equals("department_store")))))))),And(Concat(Not(Parens(Condition(obj.get("shop").equals("supermarket"))))))))));
}; 
boolean ProcessStyle105 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_junction"))))))))));
}; 
boolean ProcessStyle106 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_junction"))))))))));
}; 
boolean ProcessStyle107 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_junction"))))))))));
}; 
boolean ProcessStyle108 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("military").equals("danger_area"))))))))));
}; 
boolean ProcessStyle109 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aeroway").equals("gate"))))))))));
}; 
boolean ProcessStyle110 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle111 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle112 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle113 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle114 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle115 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle116 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle117 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle118 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle119 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle120 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle121 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle122 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle123 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle124 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle125 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle126 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle127 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle128 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle129 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle130 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle131 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle132 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle133 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle134 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle135 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle136 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle137 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle138 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle139 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle140 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle141 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle142 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle143 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle144 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle145 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle146 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle147 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle148 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle149 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle150 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle151 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle152 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle153 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle154 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle155 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle156 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle157 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle158 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle159 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("raceway"))))))))));
}; 
boolean ProcessStyle160 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("raceway"))))))))));
}; 
boolean ProcessStyle161 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("raceway"))))))))));
}; 
boolean ProcessStyle162 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("motorway_link"))))))))));
}; 
boolean ProcessStyle163 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("motorway_link"))))))))));
}; 
boolean ProcessStyle164 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("motorway_link"))))))))));
}; 
boolean ProcessStyle165 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("motorway_link"))))))))));
}; 
boolean ProcessStyle166 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("trunk_link"))))))))));
}; 
boolean ProcessStyle167 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("trunk_link"))))))))));
}; 
boolean ProcessStyle168 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("trunk_link"))))))))));
}; 
boolean ProcessStyle169 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("trunk_link"))))))))));
}; 
boolean ProcessStyle170 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("primary_link"))))))))));
}; 
boolean ProcessStyle171 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("primary_link"))))))))));
}; 
boolean ProcessStyle172 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("primary_link"))))))))));
}; 
boolean ProcessStyle173 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("primary_link"))))))))));
}; 
boolean ProcessStyle174 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("secondary_link"))))))))));
}; 
boolean ProcessStyle175 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("secondary_link"))))))))));
}; 
boolean ProcessStyle176 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("secondary_link"))))))))));
}; 
boolean ProcessStyle177 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("secondary_link"))))))))));
}; 
boolean ProcessStyle178 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary_link"))))))))));
}; 
boolean ProcessStyle179 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary_link"))))))))));
}; 
boolean ProcessStyle180 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary_link"))))))))));
}; 
boolean ProcessStyle181 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary_link"))))))))));
}; 
boolean ProcessStyle182 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle183 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle184 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle185 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle186 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle187 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle188 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle189 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle190 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle191 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle192 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle193 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle194 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle195 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle196 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle197 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle198 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle199 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))))))))));
}; 
boolean ProcessStyle200 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle201 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))))))))));
}; 
boolean ProcessStyle202 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))))))))));
}; 
boolean ProcessStyle203 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))))))))));
}; 
boolean ProcessStyle204 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle205 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))))))))));
}; 
boolean ProcessStyle206 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))))),And(Concat(Not(Parens(Condition(obj.get("service").equals("parking_aisle")))))))))))),Not(Parens(Condition(obj.get("highway").equals("service"))))))))));
}; 
boolean ProcessStyle207 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("service"))))))))));
}; 
boolean ProcessStyle208 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))))),And(Concat(Not(Parens(Condition(obj.get("service").equals("parking_aisle")))))))))))),Not(Parens(Condition(obj.get("highway").equals("service"))))))))));
}; 
boolean ProcessStyle209 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("service"))))))))));
}; 
boolean ProcessStyle210 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("service").equals("parking_aisle")))))),Not(Parens(Condition(obj.get("highway").equals("service"))))))))));
}; 
boolean ProcessStyle211 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle212 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle213 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle214 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle215 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle216 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle217 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle218 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle219 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("living_street"))))))))));
}; 
boolean ProcessStyle220 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("living_street"))))))))));
}; 
boolean ProcessStyle221 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("living_street"))))))))));
}; 
boolean ProcessStyle222 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("living_street"))))))))));
}; 
boolean ProcessStyle223 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("living_street"))))))))));
}; 
boolean ProcessStyle224 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("motorway_link"))))))))));
}; 
boolean ProcessStyle225 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("motorway_link"))))))))));
}; 
boolean ProcessStyle226 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("motorway_link"))))))))));
}; 
boolean ProcessStyle227 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("motorway_link"))))))))));
}; 
boolean ProcessStyle228 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("trunk_link"))))))))));
}; 
boolean ProcessStyle229 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("trunk_link"))))))))));
}; 
boolean ProcessStyle230 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("trunk_link"))))))))));
}; 
boolean ProcessStyle231 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("trunk_link"))))))))));
}; 
boolean ProcessStyle232 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("primary_link"))))))))));
}; 
boolean ProcessStyle233 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("primary_link"))))))))));
}; 
boolean ProcessStyle234 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("primary_link"))))))))));
}; 
boolean ProcessStyle235 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("primary_link"))))))))));
}; 
boolean ProcessStyle236 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("secondary_link"))))))))));
}; 
boolean ProcessStyle237 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("secondary_link"))))))))));
}; 
boolean ProcessStyle238 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("secondary_link"))))))))));
}; 
boolean ProcessStyle239 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("secondary_link"))))))))));
}; 
boolean ProcessStyle240 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary_link"))))))))));
}; 
boolean ProcessStyle241 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary_link"))))))))));
}; 
boolean ProcessStyle242 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary_link"))))))))));
}; 
boolean ProcessStyle243 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary_link"))))))))));
}; 
boolean ProcessStyle244 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").notequals("")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle245 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("motorway")))))))))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle246 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("trunk")))))))))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle247 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("primary")))))))))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle248 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("secondary")))))))))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle249 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").notequals("")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle250 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("motorway")))))))))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle251 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("trunk")))))))))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle252 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("primary")))))))))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle253 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("secondary")))))))))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle254 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").equals("tertiary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("tertiary")))))))))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle255 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").equals("service")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("living_street")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("residential")))))))))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle256 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").notequals("")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle257 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("motorway")))))))))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle258 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("trunk")))))))))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle259 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("primary")))))))))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle260 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("secondary")))))))))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle261 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").equals("tertiary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("tertiary")))))))))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle262 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("construction").equals("service")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("living_street")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("construction").equals("residential")))))))))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))))))))));
}; 
boolean ProcessStyle263 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle264 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle265 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle266 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle267 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle268 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle269 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle270 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle271 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle272 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle273 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle274 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle275 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle276 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle277 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle278 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle279 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("rail"))))))))));
}; 
boolean ProcessStyle280 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").notequals("")))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("railway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("abandoned")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("disused"))))))))))))))));
}; 
boolean ProcessStyle281 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Condition(obj.get("highway").notequals("")))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("railway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("abandoned")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("disused"))))))))))))))));
}; 
boolean ProcessStyle282 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("rail"))))))))));
}; 
boolean ProcessStyle283 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("rail"))))))))));
}; 
boolean ProcessStyle284 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("rail"))))))))));
}; 
boolean ProcessStyle285 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(obj.get("railway")))))))));
}; 
boolean ProcessStyle286 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(obj.get("railway")))))))));
}; 
boolean ProcessStyle287 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("rail"))))))))));
}; 
boolean ProcessStyle288 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("railway").equals("funicular")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("narrow_gauge"))))))))))))))));
}; 
boolean ProcessStyle289 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("railway").equals("funicular")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("narrow_gauge"))))))))))))))));
}; 
boolean ProcessStyle290 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("tram"))))))))));
}; 
boolean ProcessStyle291 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("tram"))))))))));
}; 
boolean ProcessStyle292 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("light_rail"))))))))));
}; 
boolean ProcessStyle293 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("light_rail"))))))))));
}; 
boolean ProcessStyle294 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("subway"))))))))));
}; 
boolean ProcessStyle295 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("subway"))))))))));
}; 
boolean ProcessStyle296 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle297 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road"))))))))));
}; 
boolean ProcessStyle298 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road"))))))))));
}; 
boolean ProcessStyle299 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road"))))))))));
}; 
boolean ProcessStyle300 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road"))))))))));
}; 
boolean ProcessStyle301 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road"))))))))));
}; 
boolean ProcessStyle302 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))))))))));
}; 
boolean ProcessStyle303 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))))))))));
}; 
boolean ProcessStyle304 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))))))))));
}; 
boolean ProcessStyle305 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))))))))));
}; 
boolean ProcessStyle306 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))))))))));
}; 
boolean ProcessStyle307 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("living_street"))))))))));
}; 
boolean ProcessStyle308 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("living_street"))))))))));
}; 
boolean ProcessStyle309 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("living_street"))))))))));
}; 
boolean ProcessStyle310 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("living_street"))))))))));
}; 
boolean ProcessStyle311 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("living_street"))))))))));
}; 
boolean ProcessStyle312 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle313 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle314 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle315 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle316 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("service").equals("parking_aisle")))))),Not(Parens(Condition(obj.get("highway").equals("service"))))))))));
}; 
boolean ProcessStyle317 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("service").equals("parking_aisle")))))),Not(Parens(Condition(obj.get("highway").equals("service"))))))))));
}; 
boolean ProcessStyle318 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("service").equals("parking_aisle")))))),Not(Parens(Condition(obj.get("highway").equals("service"))))))))));
}; 
boolean ProcessStyle319 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("service").equals("parking_aisle")))))),Not(Parens(Condition(obj.get("highway").equals("service"))))))))));
}; 
boolean ProcessStyle320 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle321 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle322 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle323 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle324 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("railway").equals("platform")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("platform"))))))))));
}; 
boolean ProcessStyle325 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("steps"))))))))));
}; 
boolean ProcessStyle326 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("horse").equals("designated")))))),Not(Parens(Condition(obj.get("highway").equals("path")))))))))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("bridleway"))))))))))))))));
}; 
boolean ProcessStyle327 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("foot").equals("designated")))))),Not(Parens(Condition(obj.get("highway").equals("path")))))))))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("footway"))))))))))))))));
}; 
boolean ProcessStyle328 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("horse").equals("designated")))))))),And(Concat(Not(Parens(Condition(obj.get("foot").equals("designated")))))))),And(Concat(Not(Parens(Condition(obj.get("bicycle").equals("designated")))))))))))),Not(Parens(Condition(obj.get("highway").equals("path"))))))))));
}; 
boolean ProcessStyle329 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("railway").equals("platform")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("platform"))))))))));
}; 
boolean ProcessStyle330 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("steps"))))))))));
}; 
boolean ProcessStyle331 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bicycle").equals("designated")))))),Not(Parens(Condition(obj.get("highway").equals("path")))))))))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("cycleway"))))))))))))))));
}; 
boolean ProcessStyle332 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("byway"))))))))));
}; 
boolean ProcessStyle333 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("track"))))))))));
}; 
boolean ProcessStyle334 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("unsurfaced"))))))))));
}; 
boolean ProcessStyle335 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("unsurfaced"))))))))));
}; 
boolean ProcessStyle336 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aeroway").equals("runway"))))))))));
}; 
boolean ProcessStyle337 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aeroway").equals("runway"))))))))));
}; 
boolean ProcessStyle338 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Condition(obj.get("aeroway").equals("runway"))))))))));
}; 
boolean ProcessStyle339 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aeroway").equals("taxiway"))))))))));
}; 
boolean ProcessStyle340 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Condition(obj.get("aeroway").equals("taxiway"))))))))));
}; 
boolean ProcessStyle341 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Condition(obj.get("aeroway").equals("taxiway"))))))))));
}; 
boolean ProcessStyle342 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("service")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))))))),Not(Parens(Condition(obj.get("access").equals("permissive"))))))))));
}; 
boolean ProcessStyle343 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("footway")))))),Not(Parens(Condition(obj.get("access").equals("permissive"))))))))));
}; 
boolean ProcessStyle344 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("service")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))))))),Not(Parens(Condition(obj.get("access").equals("destination"))))))))));
}; 
boolean ProcessStyle345 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("access").equals("no")))))))),And(Concat(Not(Parens(Condition(obj.get("access").equals("private"))))))))));
}; 
boolean ProcessStyle346 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("horse").equals("designated")))))),Not(Parens(Condition(obj.get("highway").equals("path")))))))))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("bridleway"))))))))));
}; 
boolean ProcessStyle347 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("foot").equals("designated")))))),Not(Parens(Condition(obj.get("highway").equals("path")))))))))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("footway"))))))))));
}; 
boolean ProcessStyle348 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("horse").equals("designated")))))))),And(Concat(Not(Parens(Condition(obj.get("foot").equals("designated")))))))),And(Concat(Not(Parens(Condition(obj.get("bicycle").equals("designated")))))))))))),Not(Parens(Condition(obj.get("highway").equals("path"))))))))));
}; 
boolean ProcessStyle349 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bicycle").equals("designated")))))),Not(Parens(Condition(obj.get("highway").equals("path")))))))))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("cycleway"))))))))));
}; 
boolean ProcessStyle350 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tracktype").equals("grade1"))))))))));
}; 
boolean ProcessStyle351 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tracktype").equals("grade2"))))))))));
}; 
boolean ProcessStyle352 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tracktype").equals("grade3"))))))))));
}; 
boolean ProcessStyle353 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tracktype").equals("grade4"))))))))));
}; 
boolean ProcessStyle354 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tracktype").equals("grade5"))))))))));
}; 
boolean ProcessStyle355 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tracktype").equals("grade1"))))))))));
}; 
boolean ProcessStyle356 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tracktype").equals("grade2"))))))))));
}; 
boolean ProcessStyle357 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tracktype").equals("grade3"))))))))));
}; 
boolean ProcessStyle358 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tracktype").equals("grade4"))))))))));
}; 
boolean ProcessStyle359 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tracktype").equals("grade5"))))))))));
}; 
boolean ProcessStyle360 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tracktype").equals("grade1"))))))))));
}; 
boolean ProcessStyle361 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tracktype").equals("grade2"))))))))));
}; 
boolean ProcessStyle362 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tracktype").equals("grade3"))))))))));
}; 
boolean ProcessStyle363 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tracktype").equals("grade4"))))))))));
}; 
boolean ProcessStyle364 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tracktype").equals("grade5"))))))))));
}; 
boolean ProcessStyle365 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle366 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle367 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle368 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle369 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle370 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle371 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle372 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle373 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle374 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle375 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle376 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle377 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle378 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle379 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle380 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle381 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("service"))))))))));
}; 
boolean ProcessStyle382 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("service"))))))))));
}; 
boolean ProcessStyle383 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle384 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle385 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle386 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle387 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle388 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle389 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle390 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle391 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle392 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle393 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle394 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle395 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle396 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle397 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle398 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle399 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road"))))))))));
}; 
boolean ProcessStyle400 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road"))))))))));
}; 
boolean ProcessStyle401 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("road"))))))))));
}; 
boolean ProcessStyle402 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle403 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle404 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle405 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("minor")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential"))))))))));
}; 
boolean ProcessStyle406 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("service"))))))))));
}; 
boolean ProcessStyle407 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("service"))))))))));
}; 
boolean ProcessStyle408 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle409 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle410 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle411 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("pedestrian"))))))))));
}; 
boolean ProcessStyle412 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aeroway").equals("runway"))))))))));
}; 
boolean ProcessStyle413 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aeroway").equals("taxiway"))))))))));
}; 
boolean ProcessStyle414 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aeroway").equals("taxiway"))))))))));
}; 
boolean ProcessStyle415 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("railway").equals("subway"))))))))));
}; 
boolean ProcessStyle416 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("railway").equals("light_rail"))))))))));
}; 
boolean ProcessStyle417 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("unsurfaced"))))))))));
}; 
boolean ProcessStyle418 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("unsurfaced"))))))))));
}; 
boolean ProcessStyle419 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("horse").equals("designated")))))),Not(Parens(Condition(obj.get("highway").equals("path")))))))))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("bridleway"))))))))));
}; 
boolean ProcessStyle420 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("foot").equals("designated")))))),Not(Parens(Condition(obj.get("highway").equals("path")))))))))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("footway"))))))))));
}; 
boolean ProcessStyle421 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("horse").equals("designated")))))))),And(Concat(Not(Parens(Condition(obj.get("foot").equals("designated")))))))),And(Concat(Not(Parens(Condition(obj.get("bicycle").equals("designated")))))))))))),Not(Parens(Condition(obj.get("highway").equals("path"))))))))));
}; 
boolean ProcessStyle422 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bicycle").equals("designated")))))),Not(Parens(Condition(obj.get("highway").equals("path")))))))))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("cycleway"))))))))));
}; 
boolean ProcessStyle423 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("byway"))))))))));
}; 
boolean ProcessStyle424 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle425 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle426 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle427 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle428 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle429 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle430 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("1")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle431 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("1")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle432 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("1")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle433 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("1")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle434 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("1")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle435 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("1")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle436 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("2")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle437 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("2")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle438 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("2")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle439 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("2")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle440 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("2")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle441 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("2")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle442 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("3")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle443 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("3")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle444 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("3")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle445 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("3")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle446 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("3")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle447 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("3")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle448 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("4")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle449 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("4")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle450 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("4")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle451 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("4")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle452 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("4")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle453 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("4")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle454 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("5")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle455 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("5")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle456 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("5")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle457 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("5")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle458 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("5")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle459 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("5")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))))))))));
}; 
boolean ProcessStyle460 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle461 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle462 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle463 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle464 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle465 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle466 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("1")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))))))))));
}; 
boolean ProcessStyle467 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("1")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))))))))));
}; 
boolean ProcessStyle468 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("1")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))))))))));
}; 
boolean ProcessStyle469 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("1")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))))))))));
}; 
boolean ProcessStyle470 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("1")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))))))))));
}; 
boolean ProcessStyle471 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("1")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))))))))));
}; 
boolean ProcessStyle472 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("2")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))))))))));
}; 
boolean ProcessStyle473 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("2")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))))))))));
}; 
boolean ProcessStyle474 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("2")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))))))))));
}; 
boolean ProcessStyle475 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("2")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))))))))));
}; 
boolean ProcessStyle476 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("2")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))))))))));
}; 
boolean ProcessStyle477 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("layer").equals("2")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))))))))));
}; 
boolean ProcessStyle478 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle479 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle480 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle481 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle482 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle483 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle484 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle485 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle486 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle487 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle488 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle489 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle490 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle491 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle492 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary_link")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle493 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("railway").equals("rail"))))))))));
}; 
boolean ProcessStyle494 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("rail"))))))))));
}; 
boolean ProcessStyle495 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("rail"))))))))));
}; 
boolean ProcessStyle496 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("railway").equals("funicular")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("narrow_gauge")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("light_rail")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("tram"))))))))));
}; 
boolean ProcessStyle497 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("rail"))))))))));
}; 
boolean ProcessStyle498 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("rail"))))))))));
}; 
boolean ProcessStyle499 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("railway").equals("funicular")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("narrow_gauge")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("light_rail")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("tram"))))))))));
}; 
boolean ProcessStyle500 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("railway").equals("preserved"))))))))));
}; 
boolean ProcessStyle501 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("railway").equals("preserved"))))))))));
}; 
boolean ProcessStyle502 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("railway").equals("monorail"))))))))));
}; 
boolean ProcessStyle503 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("1")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle504 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("2")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle505 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("3")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle506 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("4")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle507 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("5")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle508 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("6")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle509 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("7")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle510 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("8")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle511 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("1")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle512 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("2")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle513 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("3")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle514 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("4")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle515 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("5")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle516 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("6")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle517 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("7")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle518 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("8")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle519 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("1")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle520 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("2")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle521 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("3")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle522 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("4")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle523 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("5")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle524 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("6")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle525 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("7")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle526 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("8")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle527 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("1")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle528 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("2")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle529 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("3")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle530 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("4")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle531 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("5")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle532 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("6")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle533 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("7")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle534 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("8")))))),Not(Parens(Condition(obj.get("highway").equals("motorway"))))))))));
}; 
boolean ProcessStyle535 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("1")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle536 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("2")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle537 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("3")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle538 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("4")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle539 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("5")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle540 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("6")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle541 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("7")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle542 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("8")))))),Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle543 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("1")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle544 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("2")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle545 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("3")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle546 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("4")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle547 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("5")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle548 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("6")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle549 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("7")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle550 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("8")))))),Not(Parens(Condition(obj.get("highway").equals("primary"))))))))));
}; 
boolean ProcessStyle551 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("1")))))),Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))))))))));
}; 
boolean ProcessStyle552 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("2")))))),Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))))))))));
}; 
boolean ProcessStyle553 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("3")))))),Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))))))))));
}; 
boolean ProcessStyle554 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("4")))))),Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))))))))));
}; 
boolean ProcessStyle555 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("5")))))),Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))))))))));
}; 
boolean ProcessStyle556 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("6")))))),Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))))))))));
}; 
boolean ProcessStyle557 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("7")))))),Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))))))))));
}; 
boolean ProcessStyle558 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("8")))))),Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))))))))));
}; 
boolean ProcessStyle559 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("1")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))))))))));
}; 
boolean ProcessStyle560 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("2")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))))))))));
}; 
boolean ProcessStyle561 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("3")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))))))))));
}; 
boolean ProcessStyle562 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("4")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))))))))));
}; 
boolean ProcessStyle563 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("5")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))))))))));
}; 
boolean ProcessStyle564 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("6")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))))))))));
}; 
boolean ProcessStyle565 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("7")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))))))))));
}; 
boolean ProcessStyle566 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("length").equals("8")))))),Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))))))))));
}; 
boolean ProcessStyle567 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified"))))))))))))))));
}; 
boolean ProcessStyle568 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("bridge").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aeroway").equals("taxiway")))))))),And(Concat(Not(Parens(Condition(obj.get("aeroway").equals("runway"))))))))))))))));
}; 
boolean ProcessStyle569 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle570 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle571 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle572 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("primary")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("trunk"))))))))));
}; 
boolean ProcessStyle573 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle574 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("secondary"))))))))));
}; 
boolean ProcessStyle575 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle576 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("tertiary"))))))))));
}; 
boolean ProcessStyle577 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))));
}; 
boolean ProcessStyle578 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("construction")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("proposed"))))))))));
}; 
boolean ProcessStyle579 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified"))))))))));
}; 
boolean ProcessStyle580 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified"))))))))));
}; 
boolean ProcessStyle581 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("residential")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("unclassified"))))))))));
}; 
boolean ProcessStyle582 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("cliff"))))))))));
}; 
boolean ProcessStyle583 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("cliff"))))))))));
}; 
boolean ProcessStyle584 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("man_made").equals("embankment"))))))))));
}; 
boolean ProcessStyle585 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("barrier").equals("hedge")))))))),And(Concat(Not(Parens(Condition(obj.get("natural").equals("hedge"))))))))));
}; 
boolean ProcessStyle586 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("barrier").equals("hedge")))))),Not(Parens(Condition(obj.get("barrier").notequals(""))))))))));
}; 
boolean ProcessStyle587 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("oneway").equals("yes"))))))))));
}; 
boolean ProcessStyle588 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(obj.get("oneway")))))))));
}; 
boolean ProcessStyle589 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("theme_park"))))))))));
}; 
boolean ProcessStyle590 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("theme_park"))))))))));
}; 
boolean ProcessStyle591 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("glacier"))))))))));
}; 
boolean ProcessStyle592 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("glacier"))))))))));
}; 
boolean ProcessStyle593 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("waterway").equals("canal")))))))),And(Concat(Not(Parens(Condition(obj.get("waterway").equals("mill_pond")))))))),And(Concat(Not(Parens(Condition(obj.get("waterway").equals("dock"))))))))));
}; 
boolean ProcessStyle594 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("basin"))))))))));
}; 
boolean ProcessStyle595 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("landuse").equals("water")))))))),And(Concat(Not(Parens(Condition(obj.get("waterway").equals("riverbank")))))))),And(Concat(Not(Parens(Condition(obj.get("landuse").equals("reservoir")))))))),And(Concat(Not(Parens(Condition(obj.get("natural").equals("water")))))))),And(Concat(Not(Parens(Condition(obj.get("natural").equals("lake"))))))))));
}; 
boolean ProcessStyle596 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("wetland")))))))),And(Concat(Not(Parens(Condition(obj.get("natural").equals("marsh"))))))))));
}; 
boolean ProcessStyle597 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("scrub"))))))))));
}; 
boolean ProcessStyle598 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("land"))))))))));
}; 
boolean ProcessStyle599 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(obj.get("way_area")))))))));
}; 
boolean ProcessStyle600 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(obj.get("way_area")))))))));
}; 
boolean ProcessStyle601 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(obj.get("way_area")))))))));
}; 
boolean ProcessStyle602 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("waterway").equals("weir"))))))))));
}; 
boolean ProcessStyle603 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("waterway").equals("river"))))))))));
}; 
boolean ProcessStyle604 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("waterway").equals("river"))))))))));
}; 
boolean ProcessStyle605 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("waterway").equals("river"))))))))));
}; 
boolean ProcessStyle606 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("waterway").equals("river"))))))))));
}; 
boolean ProcessStyle607 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("waterway").equals("river"))))))))));
}; 
boolean ProcessStyle608 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("waterway").equals("river"))))))))));
}; 
boolean ProcessStyle609 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("disused").equals("yes")))))),Not(Parens(Condition(obj.get("waterway").equals("canal"))))))))));
}; 
boolean ProcessStyle610 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("disused").equals("yes")))))),Not(Parens(Condition(obj.get("waterway").equals("canal"))))))))));
}; 
boolean ProcessStyle611 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("waterway").equals("river"))))))))));
}; 
boolean ProcessStyle612 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("waterway").equals("river"))))))))));
}; 
boolean ProcessStyle613 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("waterway").equals("river"))))))))));
}; 
boolean ProcessStyle614 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("waterway").equals("river"))))))))));
}; 
boolean ProcessStyle615 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("waterway").equals("canal"))))))))));
}; 
boolean ProcessStyle616 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("disused").equals("yes")))))))),And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))))))))),Not(Parens(Condition(obj.get("waterway").equals("canal"))))))))));
}; 
boolean ProcessStyle617 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("waterway").equals("canal"))))))))));
}; 
boolean ProcessStyle618 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("lock").equals("yes")))))))),And(Concat(Not(Parens(Condition(obj.get("disused").equals("yes")))))))),And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))))))))),Not(Parens(Condition(obj.get("waterway").equals("canal"))))))))));
}; 
boolean ProcessStyle619 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("lock").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("disused").equals("yes")))))))),And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))))))))),Not(Parens(Condition(obj.get("waterway").equals("canal"))))))))));
}; 
boolean ProcessStyle620 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("disused").equals("yes")))))),Not(Parens(Condition(obj.get("waterway").equals("canal")))))))))))))),And(Concat(Not(Parens(Condition(obj.get("waterway").equals("derelict_canal"))))))))));
}; 
boolean ProcessStyle621 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("disused").equals("yes")))))),Not(Parens(Condition(obj.get("waterway").equals("canal")))))))))))))),And(Concat(Not(Parens(Condition(obj.get("waterway").equals("derelict_canal"))))))))));
}; 
boolean ProcessStyle622 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("disused").equals("yes")))))),Not(Parens(Condition(obj.get("waterway").equals("canal")))))))))))))),And(Concat(Not(Parens(Condition(obj.get("waterway").equals("derelict_canal"))))))))));
}; 
boolean ProcessStyle623 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("waterway").equals("stream"))))))))));
}; 
boolean ProcessStyle624 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Condition(obj.get("waterway").equals("stream"))))))))));
}; 
boolean ProcessStyle625 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("waterway").equals("ditch")))))))),And(Concat(Not(Parens(Condition(obj.get("waterway").equals("drain"))))))))))))))));
}; 
boolean ProcessStyle626 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("tunnel").equals("yes")))))),Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("waterway").equals("ditch")))))))),And(Concat(Not(Parens(Condition(obj.get("waterway").equals("drain"))))))))))))))));
}; 
boolean ProcessStyle627 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("man_made").equals("breakwater"))))))))));
}; 
boolean ProcessStyle628 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("man_made").equals("pier"))))))))));
}; 
boolean ProcessStyle629 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("man_made").equals("breakwater"))))))))));
}; 
boolean ProcessStyle630 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("man_made").equals("pier"))))))))));
}; 
boolean ProcessStyle631 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("man_made").equals("breakwater"))))))))));
}; 
boolean ProcessStyle632 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("man_made").equals("pier"))))))))));
}; 
boolean ProcessStyle633 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("waterway").equals("lock_gate"))))))))));
}; 
boolean ProcessStyle634 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("building").equals("station")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("station"))))))))));
}; 
boolean ProcessStyle635 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("building").equals("supermarket"))))))))));
}; 
boolean ProcessStyle636 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("place_of_worship"))))))))));
}; 
boolean ProcessStyle637 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("place_of_worship"))))))))));
}; 
boolean ProcessStyle638 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("leisure").equals("track"))))))))));
}; 
boolean ProcessStyle639 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").notequals("place_of_worship")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").notequals("")))))))))))),Not(Parens(Condition(obj.get("building").notequals("")))))),Not(Parens(Condition(obj.get("building").notequals("supermarket")))))),Not(Parens(Condition(obj.get("building").notequals("station"))))))))));
}; 
boolean ProcessStyle640 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aeroway").equals("terminal"))))))))));
}; 
boolean ProcessStyle641 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aeroway").equals("terminal"))))))))));
}; 
boolean ProcessStyle642 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aerialway").equals("gondola")))))))),And(Concat(Not(Parens(Condition(obj.get("aerialway").equals("cable_car"))))))))));
}; 
boolean ProcessStyle643 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aerialway").equals("drag_lift")))))))),And(Concat(Not(Parens(Condition(obj.get("aerialway").equals("chair_lift"))))))))));
}; 
boolean ProcessStyle644 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("country"))))))))));
}; 
boolean ProcessStyle645 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("country"))))))))));
}; 
boolean ProcessStyle646 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("state"))))))))));
}; 
boolean ProcessStyle647 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("state"))))))))));
}; 
boolean ProcessStyle648 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("state"))))))))));
}; 
boolean ProcessStyle649 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("metropolis")))))))),And(Concat(Not(Parens(Condition(obj.get("place").equals("city"))))))))));
}; 
boolean ProcessStyle650 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("metropolis")))))))),And(Concat(Not(Parens(Condition(obj.get("place").equals("city"))))))))));
}; 
boolean ProcessStyle651 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("metropolis")))))))),And(Concat(Not(Parens(Condition(obj.get("place").equals("city"))))))))));
}; 
boolean ProcessStyle652 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("metropolis")))))))),And(Concat(Not(Parens(Condition(obj.get("place").equals("city"))))))))));
}; 
boolean ProcessStyle653 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("metropolis")))))))),And(Concat(Not(Parens(Condition(obj.get("place").equals("city"))))))))));
}; 
boolean ProcessStyle654 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("metropolis")))))))),And(Concat(Not(Parens(Condition(obj.get("place").equals("city"))))))))));
}; 
boolean ProcessStyle655 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("metropolis")))))))),And(Concat(Not(Parens(Condition(obj.get("place").equals("city"))))))))));
}; 
boolean ProcessStyle656 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("small_town")))))))),And(Concat(Not(Parens(Condition(obj.get("place").equals("large_town")))))))),And(Concat(Not(Parens(Condition(obj.get("place").equals("town"))))))))));
}; 
boolean ProcessStyle657 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("small_town")))))))),And(Concat(Not(Parens(Condition(obj.get("place").equals("large_town")))))))),And(Concat(Not(Parens(Condition(obj.get("place").equals("town"))))))))));
}; 
boolean ProcessStyle658 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("small_town")))))))),And(Concat(Not(Parens(Condition(obj.get("place").equals("large_town")))))))),And(Concat(Not(Parens(Condition(obj.get("place").equals("town"))))))))));
}; 
boolean ProcessStyle659 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("suburb"))))))))));
}; 
boolean ProcessStyle660 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("suburb"))))))))));
}; 
boolean ProcessStyle661 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("large_village")))))))),And(Concat(Not(Parens(Condition(obj.get("place").equals("village"))))))))));
}; 
boolean ProcessStyle662 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("large_village")))))))),And(Concat(Not(Parens(Condition(obj.get("place").equals("village"))))))))));
}; 
boolean ProcessStyle663 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("locality")))))))),And(Concat(Not(Parens(Condition(obj.get("place").equals("hamlet"))))))))));
}; 
boolean ProcessStyle664 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("place").equals("locality")))))))),And(Concat(Not(Parens(Condition(obj.get("place").equals("hamlet"))))))))));
}; 
boolean ProcessStyle665 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("disused").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("station"))))))))));
}; 
boolean ProcessStyle666 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("disused").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("station"))))))))));
}; 
boolean ProcessStyle667 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("disused").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("station"))))))))));
}; 
boolean ProcessStyle668 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("disused").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("station"))))))))));
}; 
boolean ProcessStyle669 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aerialway").equals("station")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("tram_stop")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("halt"))))))))));
}; 
boolean ProcessStyle670 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aerialway").equals("station")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("tram_stop")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("halt"))))))))));
}; 
boolean ProcessStyle671 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aerialway").equals("station")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("tram_stop")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("halt"))))))))));
}; 
boolean ProcessStyle672 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aerialway").equals("station")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("tram_stop")))))))),And(Concat(Not(Parens(Condition(obj.get("railway").equals("halt"))))))))));
}; 
boolean ProcessStyle673 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("disused").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("station"))))))))));
}; 
boolean ProcessStyle674 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("disused").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("station"))))))))));
}; 
boolean ProcessStyle675 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("disused").equals("yes")))))),Not(Parens(Condition(obj.get("railway").equals("station"))))))))));
}; 
boolean ProcessStyle676 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aeroway").equals("airport"))))))))));
}; 
boolean ProcessStyle677 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aeroway").equals("airport"))))))))));
}; 
boolean ProcessStyle678 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aeroway").equals("aerodrome"))))))))));
}; 
boolean ProcessStyle679 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("aeroway").equals("aerodrome"))))))))));
}; 
boolean ProcessStyle680 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("railway").equals("level_crossing"))))))))));
}; 
boolean ProcessStyle681 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("railway").equals("level_crossing"))))))))));
}; 
boolean ProcessStyle682 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("man_made").equals("lighthouse"))))))))));
}; 
boolean ProcessStyle683 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("peak"))))))))));
}; 
boolean ProcessStyle684 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("spring"))))))))));
}; 
boolean ProcessStyle685 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("tree"))))))))));
}; 
boolean ProcessStyle686 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("natural").equals("tree"))))))))));
}; 
boolean ProcessStyle687 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("power_source").equals("wind")))))),Not(Parens(Condition(obj.get("power").equals("generator")))))))))))))),And(Concat(Not(Parens(Condition(obj.get("man_made").equals("power_wind"))))))))));
}; 
boolean ProcessStyle688 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("man_made").equals("windmill"))))))))));
}; 
boolean ProcessStyle689 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("man_made").equals("mast"))))))))));
}; 
boolean ProcessStyle690 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("mini_roundabout"))))))))));
}; 
boolean ProcessStyle691 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("barrier").equals("gate")))))))),And(Concat(Not(Parens(Condition(obj.get("highway").equals("gate"))))))))));
}; 
boolean ProcessStyle692 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("barrier").equals("lift_gate"))))))))));
}; 
boolean ProcessStyle693 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("barrier").equals("bollard"))))))))));
}; 
boolean ProcessStyle694 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("alpine_hut"))))))))));
}; 
boolean ProcessStyle695 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("shelter"))))))))));
}; 
boolean ProcessStyle696 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("atm"))))))))));
}; 
boolean ProcessStyle697 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("bank"))))))))));
}; 
boolean ProcessStyle698 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("bar"))))))))));
}; 
boolean ProcessStyle699 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("bicycle_rental"))))))))));
}; 
boolean ProcessStyle700 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("bus_stop")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").equals("bus_stop"))))))))));
}; 
boolean ProcessStyle701 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("bus_stop")))))))),And(Concat(Not(Parens(Condition(obj.get("amenity").equals("bus_stop"))))))))));
}; 
boolean ProcessStyle702 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("bus_station"))))))))));
}; 
boolean ProcessStyle703 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("traffic_signals"))))))))));
}; 
boolean ProcessStyle704 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("cafe"))))))))));
}; 
boolean ProcessStyle705 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("camp_site"))))))))));
}; 
boolean ProcessStyle706 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("highway").equals("ford"))))))))));
}; 
boolean ProcessStyle707 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("caravan_site"))))))))));
}; 
boolean ProcessStyle708 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("car_sharing"))))))))));
}; 
boolean ProcessStyle709 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("cinema"))))))))));
}; 
boolean ProcessStyle710 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("fire_station"))))))))));
}; 
boolean ProcessStyle711 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("fuel"))))))))));
}; 
boolean ProcessStyle712 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("guest_house"))))))))));
}; 
boolean ProcessStyle713 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("hospital"))))))))));
}; 
boolean ProcessStyle714 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("hostel"))))))))));
}; 
boolean ProcessStyle715 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("hotel"))))))))));
}; 
boolean ProcessStyle716 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("embassy"))))))))));
}; 
boolean ProcessStyle717 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("library"))))))))));
}; 
boolean ProcessStyle718 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("lock").equals("yes")))))))),And(Concat(Not(Parens(Condition(obj.get("waterway").equals("lock"))))))))));
}; 
boolean ProcessStyle719 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("man_made").equals("mast"))))))))));
}; 
boolean ProcessStyle720 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("museum"))))))))));
}; 
boolean ProcessStyle721 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("access").notequals("")))))))),And(Concat(Not(Parens(Condition(obj.get("access").equals("public")))))))))))),Not(Parens(Condition(obj.get("amenity").equals("parking"))))))))));
}; 
boolean ProcessStyle722 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("access").equals("public")))))),Not(Parens(Condition(obj.get("access").notequals("")))))))))))),Not(Parens(Condition(obj.get("amenity").equals("parking"))))))))));
}; 
boolean ProcessStyle723 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("pharmacy"))))))))));
}; 
boolean ProcessStyle724 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("religion").equals("christian")))))),Not(Parens(Condition(obj.get("amenity").equals("place_of_worship"))))))))));
}; 
boolean ProcessStyle725 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("religion").equals("muslim")))))),Not(Parens(Condition(obj.get("amenity").equals("place_of_worship"))))))))));
}; 
boolean ProcessStyle726 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("religion").equals("sikh")))))),Not(Parens(Condition(obj.get("amenity").equals("place_of_worship"))))))))));
}; 
boolean ProcessStyle727 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(And(Concat(Not(Parens(Condition(obj.get("religion").equals("jewish")))))),Not(Parens(Condition(obj.get("amenity").equals("place_of_worship"))))))))));
}; 
boolean ProcessStyle728 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("place_of_worship"))))))))));
}; 
boolean ProcessStyle729 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("police"))))))))));
}; 
boolean ProcessStyle730 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("post_box"))))))))));
}; 
boolean ProcessStyle731 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("post_office"))))))))));
}; 
boolean ProcessStyle732 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("pub"))))))))));
}; 
boolean ProcessStyle733 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("recycling"))))))))));
}; 
boolean ProcessStyle734 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("restaurant"))))))))));
}; 
boolean ProcessStyle735 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("fast_food"))))))))));
}; 
boolean ProcessStyle736 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("telephone"))))))))));
}; 
boolean ProcessStyle737 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("emergency_phone"))))))))));
}; 
boolean ProcessStyle738 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("theatre"))))))))));
}; 
boolean ProcessStyle739 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("toilets"))))))))));
}; 
boolean ProcessStyle740 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("drinking_water"))))))))));
}; 
boolean ProcessStyle741 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("amenity").equals("prison"))))))))));
}; 
boolean ProcessStyle742 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("tourism").equals("viewpoint"))))))))));
}; 
boolean ProcessStyle743 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("man_made").equals("water_tower"))))))))));
}; 
boolean ProcessStyle744 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("shop").equals("supermarket"))))))))));
}; 
boolean ProcessStyle745 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("shop").equals("bakery"))))))))));
}; 
boolean ProcessStyle746 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("shop").equals("fashion")))))))),And(Concat(Not(Parens(Condition(obj.get("shop").equals("clothes"))))))))));
}; 
boolean ProcessStyle747 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("shop").equals("convenience"))))))))));
}; 
boolean ProcessStyle748 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("shop").equals("department_store"))))))))));
}; 
boolean ProcessStyle749 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("shop").equals("doityourself"))))))))));
}; 
boolean ProcessStyle750 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("shop").equals("hairdresser"))))))))));
}; 
boolean ProcessStyle751 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("admin_level").equals("3")))))))),And(Concat(Not(Parens(Condition(obj.get("admin_level").equals("2"))))))))));
}; 
boolean ProcessStyle752 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("admin_level").equals("3")))))))),And(Concat(Not(Parens(Condition(obj.get("admin_level").equals("2"))))))))));
}; 
boolean ProcessStyle753 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("admin_level").equals("2"))))))))));
}; 
boolean ProcessStyle754 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("admin_level").equals("3"))))))))));
}; 
boolean ProcessStyle755 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("admin_level").equals("4"))))))))));
}; 
boolean ProcessStyle756 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("admin_level").equals("4"))))))))));
}; 
boolean ProcessStyle757 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("admin_level").equals("4"))))))))));
}; 
boolean ProcessStyle758 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("admin_level").equals("5"))))))))));
}; 
boolean ProcessStyle759 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("admin_level").equals("6"))))))))));
}; 
boolean ProcessStyle760 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("admin_level").equals("7")))))))),And(Concat(Not(Parens(Condition(obj.get("admin_level").equals("8"))))))))));
}; 
boolean ProcessStyle761 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("admin_level").equals("9")))))))),And(Concat(Not(Parens(Condition(obj.get("admin_level").equals("10"))))))))));
}; 
boolean ProcessStyle762 (OsmPrimitiveWrapper obj)
	{
return Filter(Concat(Or(Concat(And(Concat(Not(Parens(Condition(obj.get("admin_level").notequals(""))))))))));
}; 
void ProcessStyle (OsmPrimitiveWrapper obj){if( ProcessStyle0 (obj)) {return; }
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
}}; 
