This is a project to get JOSM https://josm.openstreetmap.de/ running on GWT.

I have started first by compiling just the core org.openstreetmap.josm.data classes.
first I have reworked them (hacked) that they would compile without the huge dependancies. I broke the dependancies on the awt and swing components.

Then I reworked the code to compile with GWT, and that is still in progress. I broke alot of the code in the process.

Now at least it will compile and run, but is alot more to do.

mike
~~~~