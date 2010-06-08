<!--
Settings for your postgres setup.

Note: feel free to leave password, host, port, or use blank
-->

<Parameter name="type">postgis</Parameter>
<Parameter name="password">password</Parameter>
<Parameter name="host">host</Parameter>
<Parameter name="port">port</Parameter>
<Parameter name="user">user</Parameter>
<Parameter name="dbname">dbname</Parameter>
<!-- this should be 'false' if you are manually providing the 'extent' -->
<Parameter name="estimate_extent">%(estimate_extent)s</Parameter>
<!-- manually provided extent in epsg 900913 for whole globe -->
<!-- providing this speeds up Mapnik database queries -->
<Parameter name="extent">extent</Parameter>
