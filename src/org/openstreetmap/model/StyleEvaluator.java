package org.openstreetmap.model;


public abstract class StyleEvaluator 
{
	public void Load(Layer mLayer02) {
		// TODO Auto-generated method stub
		mLayer02.LoadParameters();
	}
	public void Load(Style mturningCircle0) {
		// TODO Auto-generated method stub
		
	}
	
	public static final Religion CONST_jewish=null;
	public static final Religion CONST_muslim=null;
	public static final Religion CONST_christian=null;
	
	abstract void ProcessStyle (BaseObject obj);
	public static final Layer CONST_1=null;
	public static final Layer CONST_10=null;
	public static final Layer CONST_2=null;
	public static final Layer CONST_3=null;
	public static final Layer CONST_4=null;
	public static final Layer CONST_5=null;
	public static final Layer CONST_6=null;
	public static final Layer CONST_7=null;
	public static final Layer CONST_8=null;
	public static final Layer CONST_9=null;
	public static final RailType CONST_abandoned=null;
	public static final Aeroway CONST_aerodrome=null;
	public static final Aeroway CONST_airport=null;
	public static final LandUse CONST_allotments=null;
	public static final Tourism CONST_alpine_hut=null;
	public static final Aeroway CONST_apron=null; // An apron is the surfaced part of an airport where planes park. 
	public static final Amenity CONST_atm=null;
	public static final Tourism CONST_attraction=null;
	public static final Shop CONST_bakery=null;
	public static final Amenity CONST_bank=null;
	public static final Amenity CONST_bar=null;
	public static final Military CONST_barracks=null;
	public static final LandUse CONST_basin=null;
	public static final Natural CONST_bay=null;
	public static final Natural CONST_beach=null;
	public static final Amenity CONST_bicycle_rental=null;
	public static final Barrier CONST_bollard=null;
	public static final Manmade CONST_breakwater=null;
	public static final HighwayType CONST_bridleway=null;
	public static final LandUse CONST_brownfield=null;
	public static final Amenity CONST_bus_station=null;
	public static final Station CONST_bus_stop=null;
	public static final HighwayType CONST_byway=null;
	public static final Aerialway CONST_cable_car=null;
	public static final Amenity CONST_cafe=null;
	public static final Tourism CONST_camp_site=null;
	public static final Waterway CONST_canal=null;
	public static final Amenity CONST_car_sharing=null;
	public static final Tourism CONST_caravan_site=null;
	public static final LandUse CONST_cemetery=null;
	public static final Aerialway CONST_chair_lift=null;
	
	public static final Amenity CONST_cinema=null;
	public static final Place CONST_city=null;
	public static final Natural CONST_cliff=null;
	public static final Shop CONST_clothes=null;
	public static final Amenity CONST_college=null;
	public static final LandUse CONST_commercial=null;
	public static final Leisure CONST_common=null;
	public static final LandUse CONST_conservation=null;
	public static final HighwayType CONST_construction=null;
	public static final Shop CONST_convenience=null;
	public static final Place CONST_country=null;
	public static final HighwayType CONST_cycleway=null;
	public static final Military CONST_danger_area=null;
	public static final Shop CONST_department_store=null;
	public static final Waterway CONST_derelict_canal=null;
	public static final Access CONST_designated=null;//Tag:access=designated
	public static final Access CONST_destination=null; // The destination-key describes the direction of the highway by using the name of the city the highway is heading to.
	public static final RailType CONST_disused=null;
	public static final Waterway CONST_ditch=null;
	public static final Waterway CONST_dock=null;
	public static final Shop CONST_doityourself=null;
	public static final Aerialway CONST_drag_lift=null;
	public static final Waterway CONST_drain=null;
	public static final Amenity CONST_drinking_water=null;
	public static final Manmade CONST_embankment=null;
	public static final Amenity CONST_embassy=null;
	public static final Amenity CONST_emergency_phone=null;
	public static final LandUse CONST_farm=null;
	public static final LandUse CONST_farmland=null;
	public static final LandUse CONST_farmyard=null;
	public static final Shop CONST_fashion=null;
	public static final Amenity CONST_fast_food=null;
	public static final LandUse CONST_field=null;
	public static final Amenity CONST_fire_station=null;
	public static final HighwayType CONST_footway=null;
	public static final HighwayType CONST_ford=null;
	public static final Natural CONST_forest=null;
	public static final Amenity CONST_fuel=null;
	public static final RailType CONST_funicular=null;
	public static final Leisure CONST_garden=null;
	public static final Barrier CONST_gate=null;
	public static final Station CONST_generator=null;
	public static final Natural CONST_glacier=null;
	public static final Leisure CONST_golf_course=null;
	public static final Aerialway CONST_gondola=null;
	public static final HighwayType CONST_grade1=null;
	public static final HighwayType CONST_grade2=null;
	public static final HighwayType CONST_grade3=null;
	public static final HighwayType CONST_grade4=null;
	public static final HighwayType CONST_grade5=null;
	public static final Natural CONST_grass=null;
	public static final LandUse CONST_grave_yard=null;
	public static final LandUse CONST_greenfield=null;
	public static final Tourism CONST_guest_house=null;
	public static final Shop CONST_hairdresser=null;
	public static final RailType CONST_halt=null;
	public static final Place CONST_hamlet=null;
	public static final Natural CONST_heath=null;
	public static final Barrier CONST_hedge=null;
	public static final Building CONST_hospital=null;
	public static final Tourism CONST_hostel=null;
	public static final Hotel CONST_hotel=null;
	public static final LandUse CONST_industrial=null;
	public static final Place CONST_island=null;
	
	
	
	public static final Amenity CONST_kindergarten=null;
	public static final Natural CONST_lake=null;
	public static final Natural CONST_land=null;
	public static final LandUse CONST_landfill=null;
	public static final Place CONST_large_town=null;
	public static final Place CONST_large_village=null;
	public static final RailType CONST_level_crossing=null;
	public static final Amenity CONST_library=null;
	public static final Barrier CONST_lift_gate=null;
	public static final RailType CONST_light_rail=null;
	public static final Manmade CONST_lighthouse=null;
	public static final HighwayType CONST_living_street=null;
	public static final Place CONST_locality=null;
	public static final Waterway CONST_lock=null;
	public static final Waterway CONST_lock_gate=null;
	public static final Leisure CONST_marina=null;
	public static final Natural CONST_marsh=null;
	public static final Manmade CONST_mast=null;
	public static final LandUse CONST_meadow=null;
	public static final Place CONST_metropolis=null;
	public static final LandUse CONST_military=null;
	public static final Waterway CONST_mill_pond=null;
	public static final HighwayType CONST_mini_roundabout=null;
	public static final HighwayType CONST_minor=null;
	public static final RailType CONST_monorail=null;
	public static final HighwayType CONST_motorway=null;
	public static final HighwayType CONST_motorway_junction=null;
	public static final HighwayType CONST_motorway_link=null;
	public static final Natural CONST_mud=null;
	public static final Tourism CONST_museum=null;
	
	
	
	
	
	public static final RailType CONST_narrow_gauge=null;
	public static final Leisure CONST_nature_reserve=null;
	public static final Access CONST_no=null;
	public static final LandUse CONST_orchard=null;
	public static final Leisure CONST_park=null;
	public static final Amenity CONST_parking=null;
	public static final Service CONST_parking_aisle=null;
	public static final HighwayType CONST_path=null;
	public static final Natural CONST_peak=null;
	public static final HighwayType CONST_pedestrian=null;
	public static final Access CONST_permissive=null;
	public static final Amenity CONST_pharmacy=null;
	public static final Tourism CONST_picnic_site=null;
	public static final Manmade CONST_pier=null;
	public static final Leisure CONST_pitch=null;
	public static final LocationClass CONST_place_of_worship=null;
	public static final HighwayType CONST_platform=null;
	public static final Leisure CONST_playground=null;
	public static final Amenity CONST_police=null;
	public static final Amenity CONST_post_box=null;
	public static final Amenity CONST_post_office=null;
	public static final Manmade CONST_power_wind=null;
	public static final RailType CONST_preserved=null;
	public static final HighwayType CONST_primary=null;
	public static final HighwayType CONST_primary_link=null;
	public static final Amenity CONST_prison=null;
	public static final Access CONST_private=null;
	public static final HighwayType CONST_proposed=null;
	public static final Amenity CONST_pub=null;
	public static final Access CONST_public=null;
	public static final LandUse CONST_quarry=null;
	public static final HighwayType CONST_raceway=null;
	public static final RailType CONST_rail=null;
	public static final RailType CONST_railway=null;
	public static final Leisure CONST_recreation_ground=null;
	public static final Amenity CONST_recycling=null;
	public static final LandUse CONST_reservoir=null;
	public static final Residential CONST_residential=null;
	public static final Amenity CONST_restaurant=null;
	public static final LandUse CONST_retail=null;
	public static final Waterway CONST_river=null;
	public static final Waterway CONST_riverbank=null;
	public static final HighwayType CONST_road=null;
	public static final Aeroway CONST_runway=null;
	public static final Amenity CONST_school=null;
	public static final Natural CONST_scrub=null;
	public static final HighwayType CONST_secondary=null;
	public static final HighwayType CONST_secondary_link=null;
	public static final HighwayType CONST_service=null;
	public static final Amenity CONST_shelter=null;
	public static final Religion CONST_sikh=null;
	public static final Place CONST_small_town=null;
	public static final Natural CONST_spring=null;
	public static final Place CONST_state=null;
	public static final Station CONST_station=null;
	public static final HighwayType CONST_steps=null;
	public static final Waterway CONST_stream=null;
	public static final Station CONST_sub_station=null;
	public static final Place CONST_suburb=null;
	public static final RailType CONST_subway=null;
	public static final Shop CONST_supermarket=null;
	public static final Aeroway CONST_taxiway=null;
	public static final Amenity CONST_telephone=null;
	public static final Aeroway CONST_terminal=null;
	public static final HighwayType CONST_tertiary=null;
	public static final HighwayType CONST_tertiary_link=null;
	public static final Amenity CONST_theatre=null;
	public static final Tourism CONST_theme_park=null;
	public static final Amenity CONST_toilets=null;
	public static final Place CONST_town=null;
	public static final Track CONST_track=null;
	public static final HighwayType CONST_traffic_signals=null;
	public static final RailType CONST_tram=null;
	public static final RailType CONST_tram_stop=null;
	public static final Natural CONST_tree=null;
	public static final HighwayType CONST_trunk=null;
	public static final HighwayType CONST_trunk_link=null;
	public static final HighwayType CONST_unclassified=null;
	public static final Amenity CONST_university=null;
	public static final HighwayType CONST_unsurfaced=null;
	public static final Tourism CONST_viewpoint=null;
	public static final Place CONST_village=null;
	public static final LandUse CONST_village_green=null;
	public static final LandUse CONST_vineyard=null;
	public static final Natural CONST_water=null;
	public static final Manmade CONST_water_tower=null;
	public static final Waterway CONST_weir=null;
	public static final Natural CONST_wetland=null;
	public static final PowerSource CONST_wind=null;
	public static final Manmade CONST_windmill=null;
	public static final Natural CONST_wood=null;
	public static final Yes CONST_yes=null;
	public static final Tourism CONST_zoo=null; 
	

	protected boolean Filter(Object concat) {
		// TODO Auto-generated method stub
		return false;
	}

	protected Object Concat(Object or, Object and) {
		// TODO Auto-generated method stub
		return null;
	}

	protected Object Or(Object concat) {
		// TODO Auto-generated method stub
		return null;
	}

	protected Object Concat(Object and) {
		// TODO Auto-generated method stub
		return null;
	}

	protected Object And(Object not) {
		// TODO Auto-generated method stub
		return null;
	}

	protected Object Not(Object parens) {
		// TODO Auto-generated method stub
		return null;
	}

	protected Object Parens(Object condition) {
		// TODO Auto-generated method stub
		return null;
	}

	protected Object Condition(boolean equals) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
