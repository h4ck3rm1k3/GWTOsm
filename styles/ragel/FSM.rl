// ragel 
#include <iostream>
#include <string>
using namespace std;
%%{
machine FSM;

highway_primary = "primary";
highway_primary_link = "primary_link";
highway_secondary = "secondary";

action Highway {
       cout << "Highway" << endl;
}

action Primary {
       cout << "Primary" << endl;
}

action Secondary {
       cout << "Secondary" << endl;
}

my_access = ("access" ("public"| alnum+))?; #  ([access] = 'public' or not [access] 

# parking and public access
action aeroway_aeroway {
       cout << "aeroway_aeroway" << endl;
}
action aeroway_apron{
       cout << "aeroway_apron" << endl;
}
aeroway = "aeroway" 
	("apron" $ aeroway_apron 
	| "aerodrome" $ aeroway_aeroway 
	| alnum+);

amenity = "amenity" (
	"parking" | 
	'pharmacy' |
	(
	'university' |
	'college' | 
	'school' | 
	'hospital' | 
	'kindergarten'
	)
	 |
(
('pub'|'restaurant'|'cafe'|'fast_food')	 
|
('bar')
|
('cinema' | 'library'|'theatre')
'police'|
'fire_station'|
'place_of_worship'|

'shelter'|

'bank'|
'embassy'|
('fuel'|'bus_station')|
'prison'

)
	'grave_yard' |
	alnum+);
barrier = "barrier";
bicycle = "bicycle";
boundary = "boundary";
bridge = "bridge";
construction = "construction";
foot = "foot";
highway = "highway";
horse = "horse";
landuse = "landuse";
layer = "layer";
leisure = "leisure";
length = "length";
man_made = "man_made";
military = "military";
name = "name";

natural = "natural";
oneway = "oneway";
place = "place";
point = "point";
power = "power";
railway = "railway";
ref = "ref";
religion = "religion";
service = "service";
shop = "shop";
tourism = "tourism";
tracktype = "tracktype";
tunnel = "tunnel";
waterway = "waterway";
way_area = "way_area";

interesting_highways = (highway_primary | highway_primary_link) @Primary  |   (highway_secondary) @ Secondary;

highway_val = highway interesting_highways?;

fields = (my_access | aeroway |amenity |barrier |bicycle |boundary |bridge |construction |foot |highway_val |horse |landuse |layer |leisure |length |man_made |military |name |natural |oneway |place |point |power |railway |ref |religion |service |shop |tourism |tracktype |tunnel |waterway |way_area );



main := fields*;


}%%

%% write data nofinal;

#define BUFSIZE 128

void scanner()
{
  static char buf[BUFSIZE];
  int cs, act, have = 0, curline = 1;
  char *ts, *te = 0;
  int done = 0;

%% write init;

  while ( !done ) {
    char *p = buf + have, *pe, *eof = 0;
    int len, space = BUFSIZE - have;
   
    if ( space == 0 ) {
      /* We've used up the entire buffer storing an already-parsed token
       * prefix that must be preserved. */
      cerr << "OUT OF BUFFER SPACE\n";
            return ;
    }

    cin.getline(p, space);
    len = cin.gcount();
//     = fread( p, 1, space, stdin );
    pe = p + len;

    /* Check if this is the end of file. */
    if ( len < space ) {
      eof = pe;
      done = 1;
    }
     
%% write exec;


    if ( ts == 0 )
      have = 0;
    else {
      /* There is a prefix to preserve, shift it over. */
      have = pe - ts;
//      memmove( buf, ts, have );
      te = buf + (te-ts);
      ts = buf;
    }
  }
}

int main()
{
  scanner();
  return 0;
}