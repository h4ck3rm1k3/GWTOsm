#!/usr/bin/perl
# author : james michael dupont
# license : aGPL 3.0
use strict;
use warnings;
use SQL;
package Java::Package;

#create the subdirectories based on package name
#create a file
#calculate the imports

sub create
{
    
}

1;

package Stack;

my %stacks;
my %data;

sub Push
{
    my $name=shift;
    push @{$stacks{$name}},shift;
}


sub PopAll
{
    my $name=shift;
   
    if ($name)
    {	
# 	foreach my $f (sort keys %stacks)
# 	{
# 	    my @stack = @{$stacks{$f}};
# 	    if (@stack)
# 	    {
# #		print "//Before Popall $name  / $f: " . join ("\t",@stack). "\n";
# 	    }
# 	}

	if ($stacks{$name})
	{
	    my @stack = @{$stacks{$name}};
	    if (@stack)
	    {
#		print "//WARN DEBUG:".join ("\t",@stack). "\n";
		print join ("\n",@stack)."\n" ;
		
	    }
	    @{$stacks{$name}}=();
	}
    }
    else
    {
# 	foreach my $f (sort keys %stacks)
# 	{
# 	    my @stack = @{$stacks{$f}};
# 	    if (@stack)
# 	    {
# #		print "//Before Popall NONAME  / $f: " . join ("\t",@stack) . "\n";
# 	    }
# 	}
#	foreach my $f (sort keys %stacks)
#	{
#	    PopAll($f);
#	}
    }
}

sub PopAllArr
{
    my $name=shift;
    
    if ($name)
    {	
	if ($stacks{$name})
	{
	    my @stack = @{$stacks{$name}};
	    if (@stack)
	    {
		@{$stacks{$name}}=();
		return @stack;		
	    }
	}
    }
}

package Counting;
my %names_count;
#Counting::Count("Name");
sub Count
{
    my $name=shift;
    my $count = $names_count{$name}++;
    return $count;
}
1;

package Naming;

my %names;

# Naming::Name("class","variable name","arg1, arg2");
sub Name
{
    my $name=shift;
    my $type=shift;
    my @args=@_;
    my $old=$type;
    $type =~ s/-/_/g; # clean the type;
    my $count = $names{$name}++;
    my $narg = join(",","\"$old\"",@args);
    print "protected $type m${name}${count} = new $type ($narg){\n";
    
    print "// DEBUG adding $name\n";
    Stack::Push ($name,"};//$name end (m${name}${count})");
    return "m${name}${count}";
}


sub NameLayerSimple
{
    my $name=shift;
    my $type=shift;
    my @args=@_;
    my $old=$type;
    $type =~ s/-/_/g; # clean the type;
#    my $count = $names{$name}++;
    my $narg = join(",","\"$old\"",@args);
    print "protected $type m${name} = new $type ($narg){\n";
    
    print "// DEBUG :adding $name\n";
    Stack::Push ($type,"};//$name end");
    return "m${name}";
}

sub NameLayer
{
    my $name=shift;
    my $type=shift;
    my @args=@_;
    my $old=$type;
    $type =~ s/-/_/g; # clean the type;
    my $count = $names{$name}++;
    my $narg = join(",","\"$old\"",@args);
    print "protected $type m${name}${count} = new $type ($narg){\n";
    
    print "// DEBUG :adding $name\n";
    Stack::Push ($type,"};//$name end");
    return "m${name}${count}";
}


# also quotes the string
sub NameSimple
{
    my $type=shift;
    my $name=shift;
    my @args=@_;
    my $old=$type;
    $type =~ s/-/_/g; # clean the type;
    my $count = $names{$name}++;
    my $narg = join(",",@args);
    $narg =~ s/\n/\\n/g; # newlines
    $narg =~ s/\"/\\"/g;
    $narg =~ s/\'/\\'/g;

    print "protected $type m${name}${count} = new $type(\"$narg\");\n";
    return "m${name}${count}";
}

sub NameSimpleExec
{
    my $type=shift;
    my $name=shift;
    my @args=@_;
    my $old=$type;
    $type =~ s/-/_/g; # clean the type;
    my $count = $names{$name}++;
    my $narg = join(",",@args);
    $narg =~ s/\n/\\n/g; # newlines
    print "protected $type m${name}${count} = new $type() { public void exec () {$narg;\n}\n};\n";
    return "m${name}${count}";
}

sub NameNoCount
{
    my $name=shift;
    my $type=shift;
    my @args=@_;
    my $old=$type;
    $type =~ s/-/_/g; # clean the type;
    my $count = $names{$name}++;
    my $narg = join(",","\"$old\"",@args);
    print "protected $type m${name} = new $type ($narg);\n";
    print "public void Load${name}() { m${name}.load(); };\n";

    return "m${name}";
}

=pod

base class for all sax callback rules

=cut

package BaseRule;

use Moose;
sub start
{
}
sub end
{
}

sub characters 
{
}

1;

package Rule;
use Moose;
extends 'BaseRule';

sub start
{
    my $class=shift;
    my $data=shift;   
    Field::RuleStart();
#    Counting::Count("rules");
    return $data;
}

# Rule::end
sub end
{
    my $class=shift;
    my $data=shift;  
#    Counting::End("rules");
    Field::PrintSymbols();

    CssParameter::PrintCss();

    Filter::PrintFilters();

    Field::RuleEnd();
    return $data;
}

1;

package MaxScaleDenominator;
use Moose;
extends 'BaseRule';

1;

package MinScaleDenominator;
use Moose;
extends 'BaseRule';
1;

package PointSymbolizer;
use Moose;
extends 'BaseRule';


sub ProcessFields 
{
    my $data =shift;
    my @fields =@_;

    my @vals;
    foreach my $n (@fields )
    {
	my $value = $data->{Attributes}->{'{}'.$n}->{'Value'};
	if ($value)
	{
	    push @vals,"\"$value\"";
	}
	
    }
    return @vals;
}

sub start
{
    my $class=shift;
    my $data=shift;
    
    my @vals = ProcessFields($data, qw[file type  width height]);

    Field::inLine("PointSymbolizer",@vals);
    


#    warn Dumper($data);    
    return $data;
}

sub end
{
    my $class=shift;
    my $data=shift;
    
    Field::notinLine();
#    warn Dumper($data);    
    return $data;
}

1;

package Map;
use Moose;
extends 'BaseRule';

sub end
{

}


1;

package FontSet;
use Moose;
extends 'BaseRule';

1;

package Font;
use Moose;
extends 'BaseRule';

1;

## Style::

package Style;
use Moose;
extends 'BaseRule';
use Data::Dumper;

my $style = undef;

## Style::
sub start
{
    my $class=shift;
    my $data=shift;

    if ($style )
    {
	end ($class,$data); # close this 
	print "\n//SPLIT FILE HERE----\n"
    }
    my $value = $data->{Attributes}->{'{}name'}->{'Value'};
    $value =~ s/\-/_/g; # replace the - with _ in the name

    my $style2 =Naming::NameLayerSimple("$value","Style");
    Stack::Push("Styles","$style2");# push these
    $style = $value;
    return $data;
}

#Style::PrintStyles

sub PrintStyles
{
    print "public void LoadStyles(){\n";

    foreach my $p (Stack::PopAllArr("Styles"))
    {
      if ($p)
	{
	  print "Load(${p});\n";
	}
    }
    print "}\n";
}

# Style::end
sub end
{
    my $class=shift;
    my $data=shift;

    Field::PrintRules();

#    Field::EmitClasses();
    
    Stack::PopAll("Style");# get rid of any data left

    $style = undef;

    return $data;
}

1;

package LineSymbolizer;
use Moose;
extends 'BaseRule';
use Data::Dumper;


sub start
{
    my $class=shift;
    my $data=shift;
    
    Field::inLine("LineSymbolizer");
#    warn Dumper($data);    
    return $data;
}

sub end
{
    my $class=shift;
    my $data=shift;
    
    Field::notinLine();
#    warn Dumper($data);    
    return $data;
}

1;

package PolygonSymbolizer;
use Moose;
extends 'BaseRule';


sub start
{
    my $class=shift;
    my $data=shift;
    
    Field::inLine("PolygonSymbolizer");
#    warn Dumper($data);    
    return $data;
}

sub end
{
    my $class=shift;
    my $data=shift;
    
    Field::notinLine();
#    warn Dumper($data);    
    return $data;
}

1;

package PolygonPatternSymbolizer;
use Moose;
extends 'BaseRule';


sub start
{
    my $class=shift;
    my $data=shift;
    
    Field::inLine("PolygonPatternSymbolizer");
#    warn Dumper($data);    
    return $data;
}

sub end
{
    my $class=shift;
    my $data=shift;
    
    Field::notinLine();
#    warn Dumper($data);    
    return $data;
}

1;

package TextSymbolizer;
use Moose;
extends 'BaseRule';


sub start
{
    my $class=shift;
    my $data=shift;
    
    my $value = $data->{Attributes}->{'{}name'}->{'Value'};
    my $vfont = $data->{Attributes}->{'{}fontset_name'}->{'Value'};
    my $vsize = $data->{Attributes}->{'{}size'}->{'Value'};
    my $vfill = $data->{Attributes}->{'{}fill'}->{'Value'};
    my $vhrad = $data->{Attributes}->{'{}halo_radius'}->{'Value'} || 0;
    my $vwwid = $data->{Attributes}->{'{}wrap_width'}->{'Value'} || 0;

    
    print "//TextSymbolizer $value,$vfont, $vsize,$vfill,$vhrad,$vwwid);\n";

    Field::inLine("TextSymbolizer");
#    warn Dumper($data);    
    return $data;
}

sub end
{
    my $class=shift;
    my $data=shift;
    
    Field::notinLine();
#    warn Dumper($data);    
    return $data;
}


1;

package ElseFilter;
use Moose;
extends 'BaseRule';

1;

package LinePatternSymbolizer;
use Moose;
extends 'BaseRule';

sub start
{
    my $class=shift;
    my $data=shift;
    
    Field::inLine("LinePatternSymbolizer");
#    warn Dumper($data);    
    return $data;
}

sub end
{
    my $class=shift;
    my $data=shift;
    
    Field::notinLine();
#    warn Dumper($data);    
    return $data;
}

1;

package Layer;
use Moose;
extends 'BaseRule';
use Data::Dumper;

#Layer::start
sub start
{
    my $class=shift;
    my $data=shift;
    my $value = $data->{Attributes}->{'{}name'}->{'Value'};
    print "//Layer: $value\n";
    my $layer =Naming::NameLayer("Layer","Layer");
    Stack::Push("Layers","$layer");# push these
    return $data;
}

#Layer::PrintLayers
sub PrintLayers
{
    print "public void LoadLayers(){\n";
    foreach my $p (Stack::PopAllArr("Layers"))
    {
      if ($p)
	{
	  print "Load(${p});\n";
	}
    }
    print "}\n";
}

#Layer::end
sub end
{
    my $class=shift;
    my $data=shift;
    Parameter::PrintParameters();
    StyleName::LoadStylesUsed();

    Stack::PopAll("Layer");# get rid of any data left
    return $data;
}

1;

package StyleName;
use Moose;
extends 'BaseRule';

#StyleName::
sub start
{
    my $class=shift;
    my $data=shift;  
    return $data;
}

#StyleName::
sub characters 
{
    my $class=shift;
    my $self=shift;
    my $data =shift;
    my $string  =$data->{'Data'};
    $string =~ s/\-/_/g; # replace the - with _ in the name
 #   print "public void LoadStyle() { Load( m${string});\n };\n";
    Stack::Push("StylesUsed", "m${string}");

##
}

# StyleName::LoadStylesUsed
sub LoadStylesUsed
{
    print "public void LoadStyle() { \n";
    
    foreach my $p (Stack::PopAllArr("StylesUsed"))
    {
      if ($p)
	{
	  print "Load(${p});\n";
	}
    }

    print "};\n";
    
}

1;

package Datasource;
use Moose;
extends 'BaseRule';

1;

package Parameter;
use Moose;
extends 'BaseRule';
use SQL;
my $name = "noname";

#Parameter::start
sub start
{
    my $class=shift;
    my $data=shift;  
    $name = $data->{Attributes}->{'{}name'}->{'Value'};
    print "//Parameter: $name\n";
    return $data;
}

#Parameter::characters
sub characters 
{
    my $class=shift;
    my $self=shift;
    my $data =shift;
    my $string  =$data->{'Data'};
#    print "Parameter $name Parameter(\"$string\")\n";
    my $parameter = Naming::NameSimple("Parameter","$name","$string");

    if ($name eq "table")
    {
	SQL::Add($string);
    }
    # now add this to the list of fields
    Stack::Push("Parameters","$parameter");# push these
}

#Parameter::PrintParameters
sub PrintParameters
{
    print "public void LoadParameters(){\n";

    foreach my $p (Stack::PopAllArr("Parameters"))
    {
      if ($p)
	{
	    
	  print "Load(${p});\n";
	}
    }
    print "}\n";

    SQL::Eval();
}
1;

package ShieldSymbolizer;
use Moose;
extends 'BaseRule';
1;


package CssParameter;
use Moose;
extends 'BaseRule';
use Data::Dumper;
my $curname="noname";

# CssParameter::
sub start
{
    my $class=shift;
    my $self=shift;
    my $value = $self->{Attributes}->{'{}name'}->{'Value'};
    print "//CSS: $value\n";
    $curname=$value;
    Stack::Push("CSSItems", Naming::Name("CSS","$value"));
}

# CssParameter::
sub characters 
{
    my $class=shift;
    my $self=shift;
    my $data =shift;
    my $string  =$data->{'Data'};
    Naming::NameNoCount("CSSConst",$curname,"\"$string\"");
}

#CssParameter::PrintCss
sub PrintCss
{
    print "public void LoadCSS(){\n";

    foreach my $p (Stack::PopAllArr("CSSItems"))
    {
      if ($p)
	{
	  print "Load(${p});\n";
	}
    }
    print "}\n";
}

#CssParameter::end
sub end
{
    Stack::PopAll("CSSConst");
    Stack::PopAll("CSS");
}


1;

=pod
base class for all parser objects
=cut

package Expression;
use Moose;
use Data::Dumper;
sub emitJava
{
    my $self=shift;
    my $s="";
    my @a;
    foreach my $k (keys %{$self})
    {
	my $v =$self->{$k};
       
	next if $k eq "__RULE__";
	next if $k eq "__STRING__";
	next if $k eq "__STRING1__";
	next if $k eq "__STRING2__";


#	print "$k has $v\n" if $k eq "__VALUE__";
	next if $k eq "__VALUE__";
#	print "$k \t $v\n";
	$v = $self->{$k}->emitJava();
	
	if ($v)
	{
	    push @a,$v;
	}
	else
	{
	    warn Dumper($self->{$k});	    
	}
    }

    $s = "Concat(". join (",",@a) . ")";
    return "Or($s)";
}

1;

# the Field class 
# use Field:: for searching
package Field;
use Moose;
use Data::Dumper;
extends 'Expression';

# the methods seen so far
my %methods;

my %object_types;
my %object_types_2;

my %code;

my $line=0;
my $symbolcount=0;

# ::inLine

sub inLine
{
    my $line2=shift;
    my @parts =@_;
    my $s="";
    if (@parts)
    {
	$s = join (",",@parts);
    }
    $symbolcount++;
    print "protected $line2 mSymbol${symbolcount} = new $line2( $s);\n";

    my $name = "mSymbol${symbolcount}";
    Stack::Push("Symbols","$name");# push these
    $line=$line2;
}


sub PrintSymbols
{
    print "public void LoadSymbols(){\n";

    foreach my $p (Stack::PopAllArr("Symbols"))
    {
      if ($p)
	{
	  print "Load(${p});\n";
	}
    }
    print "}\n";
}


sub notinLine
{
    print "//LEAVING $line\n";
    $line=0;
}

my $rule="";
#my $rulecount=0;
sub RuleStart
{
    if ($rule)
    {
	RuleEnd();
    }

    my $rule = Naming::Name("Rules","Rule");
    Stack::Push("RuleVars","$rule");# push these
#    $rulecount++;
#    print "protected RuleBase  mRule${rulecount} = new Rule${rulecount}() {\n";
    $rule=1;

}

sub PrintRules
{
    print "public void LoadRules(){\n";
    foreach my $p (Stack::PopAllArr("RuleVars"))
    {
      if ($p)
	{
	  print "Load(${p});\n";
	}
    }
    print "}\n";
}

sub RuleEnd
{
    Stack::PopAll("Rules");
    $rule=0;
}

sub EmitClasses
{
    foreach my $type (sort keys %code)
    {
	print "class ${type} extends typebase{\n";

	print "public $type obj;\n";

	#print join ("\n", 
	map {
	    Naming::NameSimpleExec ("Filter","code",$_)
	}@{$code{$type}};

	print "}; // end of class $type \n";
    }
#    %code=();
}


sub addCode
{
    my $type =shift;
    my $code =shift;
#    warn "adding $type $code";
    if ($line)
    {
	push @{$code{$type}}, $code;
    }
    else
    {
	push @{$code{$type}}, $code;
    }
}



sub makeobjtype 
{
    my $h=shift;
    my @keys = sort keys %{$object_types{$h}};
    
    if (!@keys)
    {
	warn "nothing found for $h " unless @keys;
#	my @keys2 = sort keys %{$object_types_2{$h}};
#	warn "found for $h " . join ("|",@keys2);
    }
       
    return join ("_",@keys);
}
sub findtype 
{
    my $h=shift;
    return join ("_",(sort keys %methods));
}

sub addtypedLiteral
{
    my $value =shift;
    my $type = findtype();

    foreach my $t (keys %methods)
    {
	$object_types{$value}{$t}++;
    }
    
    # now we know the typr
    my $old = makeobjtype($value);
    if ($old)
    {
	if ($old ne "$type")
	{
	    #duplicate type
#	    warn "$value has $type and does not match  $old\n";
	}
    }

    $object_types_2{$value}=$old;

#    warn "$value now of type $old\n";

#    warn makeobjtype($field);
#    }

}

sub gettype
{
    my $field=shift;
    my $ret= $object_types_2{$field};

    die "$field has no value" unless $ret;

    return $ret;
}


sub emitJava
{
#    my $class=shift;
    my $self=shift;
    my $id = $self->{Identifier}->emitJava();

#    warn "found $id";

    $methods{$id}++;

    return "getObj().get${id}()";
}



sub findtypes
{
    my $h=shift;
    return (sort keys %methods);
}

my $filtercount=0;

#Field::Process($java)

sub Process 
{
    my $java =shift;
    my $type = findtype ;
    %methods = (); # clear the methods
    addCode ($type,$java);
    $filtercount++;    
    print "protected Filter mFilter${filtercount} = new Filter(){\n";
#    print "protected $type obj = new $type();\n";
 #   print "protected Filter mFilterBody = new Field() { $java;\n";
    print "public void exec () {$java;\n};// end of exec\n";
    Stack::Push("Filters","mFilter${filtercount}");
    print "}; // end of Filter\n";
    
}


1;

package Filter;
use Parse::RecDescent;
use Data::Dumper;
#use Field;

my $grammar = q {
<autotree>

FilterExpr : Expression 
Expression  :  ExprAnd 'or' Expression | ExprAnd
ExprAnd : ExprNot 'and' ExprAnd | ExprNot
ExprNot : 'not' Parens | '<>' Parens | Parens
Parens : '(' Expression ')' | ExprField
ExprField : Field Operator Value   | Field 
Identifier: /[A-Za-z_][A-Za-z0-9_]*/
Literal: /[A-Za-z0-9_]+/
Field : '[' Identifier ']'
Digits : /[0-9]+/
Value : "\'" Literal "\'" | Digits | "\'\'"
Operator :  '*' |  '/' | '+' | '-' | '%' | '=' | '<>'
         };
my $ruleparser = new Parse::RecDescent ($grammar) or die "Bad grammar!\n";

sub start
{
    my $class=shift;
    my $data=shift;

    print "//FilterStart\n";    
    #print Dumper($data);    
    return $data;
}
my $count =0;


sub end
{
    my $class=shift;
    my $self=shift;
    print "//FilterEnd\n";    
#    warn Dumper($self);
    my $text =$self->{chars};
    my $x= $ruleparser->FilterExpr($text) ;
    if ($x)
    {
	#print "good text $text \n";
	my $java  = $x->emitJava();
	Field::Process($java);
	$count++;
    }
    else
    {
	print "Bad text! $text\n";
    }

}

sub PrintFilters()
{
    print "public void LoadFilters(){\n";

    foreach my $p (Stack::PopAllArr("Filters"))
    {
      if ($p)
	{
	  print "Load(${p});\n";
	}
    }
    print "}\n";
}

   

sub EmitClasses
{
    Field::EmitClasses;
}

sub EmitCalls
{
print "void ProcessStyle (BaseObject obj){";
print "}\n";

}

my %types_rules; # what rules

sub EmitCallsType
{
    my $type=shift;

    print "void ProcessStyle ($type obj){";
    foreach (@{$types_rules{$type}})
    {
	print "if( ProcessStyle$_ (obj)) {return; }\n";
    }
    print "}";

}

sub characters 
{
    my $class=shift;
    my $self=shift;
    my $data =shift;
    my $string  =$data->{'Data'};
    
    if ($self->{chars})
    {
	$self->{chars} .= $string;
#	warn "Append $string"; 
    }
    else
    {
	$self->{chars} = $string;
    }
}


1;


package ExprNot;
use Moose;
extends 'Expression';

sub emitJava
{
#    my $class=shift;
    my $self=shift;
    my $s="";
    # now this 

    foreach my $k (keys %{$self})
    {
	my $v =$self->{$k};
       
	next if $k eq "__RULE__";
	next if $k eq "__STRING__";
	next if $k eq "__STRING1__";
	next if $k eq "__STRING2__";

	$v = $self->{$k}->emitJava();
	
	if ($v)
	{
	    $s .= $v;
	}
	else
	{
	    warn Dumper($self->{$k});	    
	}
    }
    return "Not($s)";
}

1;

package Literal;
use Moose;
extends 'Expression';

my %fields;

sub emitJava
{
#    my $class=shift;
    my $self=shift;
    my $id = $self->{__VALUE__};

    $fields{"${id}"}++;
    
    Field::addtypedLiteral($id);
    return "CONST_${id}";
}

END 
{


}
1;

=pod
the basic field expression,
field op value 
=cut
package ExprField;
use Moose;
extends 'Expression';

sub emitJava
{
    my $self=shift;
    if ( $self->{Value})
    {
	my $field = $self->{Field}->emitJava();
	my $op = $self->{Operator}->emitJava();
	my $val = $self->{Value}->emitJava();
	return "Condition(${field}.${op}(${val}))";
    }
    else
    {
	return $self->{Field}->emitJava();
    }
}


1;

package Identifier;
use Moose;
extends 'Expression';

sub emitJava
{
    my $self=shift;
    return $self->{__VALUE__};
}

1;




package Operator;
use Moose;
extends 'Expression';
sub emitJava
{
    my $self=shift;
    my $id = $self->{__VALUE__} || "TODO";

    if ($id eq "=")
    {
	return "equals_"
    }
    elsif ($id eq "<>")
    {
	return "notequals_"
    }

    return " OPERATOR $id ";
}

1;

package Digits;
use Moose;
extends 'Expression';
sub emitJava
{
    my $self=shift;
    # foreach my $k (keys %{$self})
    # {
    # 	print "DIGITS $k \t $self->{$k}\n";
    # }
    my $id = $self->{__VALUE__} || "TODO";
    return "\"$id\"";
}

1;

package Value;
use Moose;
extends 'Expression';
use Data::Dumper;
sub emitJava
{
    my $self=shift;
    if ($self->{"Literal"})
    {
	my $id = $self->{"Literal"}->emitJava();
	return "$id";
    }    
    elsif ($self->{"Digits"})
    {
	my $id = $self->{"Digits"}->emitJava();
	return "$id";
    }
    else
    {
	my $v = $self->{"__VALUE__"};

	if ($v)
	{
	    if ($v eq "''")
	    {
		return "\"\"";
	    }
	    return "$v";
	}
	else
	{
	    warn "What is this value" . Dumper($self);
	    die "no data";
	}

# 	foreach my $k (keys %{$self})
# 	{
# 	    next if $k eq "__RULE__";
# 	    print "VALUE:$k \t $self->{$k}\n";
# #	    warn Dumper($self->{$k});
# 	}
    }
}

1;

package Parens;
use Moose;
extends 'Expression';


sub emitJava
{
#    my $class=shift;
    my $self=shift;
    my $s="";
    # now this 

    foreach my $k (keys %{$self})
    {
	my $v =$self->{$k};
       
	next if $k eq "__RULE__";
	next if $k eq "__STRING__";
	next if $k eq "__STRING1__";
	next if $k eq "__STRING2__";

	$v = $self->{$k}->emitJava();
	
	if ($v)
	{
	    $s .= $v;
	}
	else
	{
	    warn Dumper($self->{$k});	    
	}
    }
    return "Parens($s)";
}
1;

package ExprAnd;
use Moose;
extends 'Expression';

sub emitJava
{

    my $self=shift;
    my $s="";
    my @a;

    foreach my $k (keys %{$self})
    {
	my $v =$self->{$k};
       
	next if $k eq "__RULE__";
	next if $k eq "__STRING__";
	next if $k eq "__STRING1__";
	next if $k eq "__STRING2__";

	$v = $self->{$k}->emitJava();

	push @a, $v;	

    }
    $s = "Concat(". join (",",@a) . ")";
    return "And($s)";
}

1;

package FilterExpr;

use Data::Dumper;

sub emitJava
{
    my $self=shift;
    my $s="";
    my @a;

    foreach my $k (keys %{$self})
    {
	next if $k eq "__RULE__";
	#print "$k \t $self->{$k}\n";
	
	push @a, $self->{$k}->emitJava();

    }
    $s = "Concat(". join (",",@a) . ")";


    return "Filter($s)";
}


1;

package Nothing;
use Data::Dumper;
sub start
{

}
sub end
{

}

sub characters 
{

}

1;

package MySAXHandler;
use base qw(XML::SAX::Base);
use Data::Dumper;
my %seen;

my @stack;
my $current="Nothing";
my $obj = undef;
sub start_element 
{
    my ($self, $el) = @_;
    my $name = $el->{LocalName};
    $obj = ${name}->start($el);
#    print "//DEBUG start $name\n";
    $current = $name;
    push @stack,$name;
}

sub end_element 
{
    my ($self, $el) = @_;
    my $name = $el->{LocalName};
    $current = pop @stack;

#    print "//DEBUG end $name / $current\n";
    $obj=undef;
    $current->end($el);

    $current = $stack[-1];


}

sub characters
{
    my ($self, $el) = @_;
#    print "//DEBUG characters in $current\n";
    ${current}->characters($obj,$el);
}

1;

package main;
use strict;
use warnings;

use Data::Dumper;
use XML::SAX;

use XML::SAX::PurePerl;
#my $handler = XML::Handler::Foo->new();
my $parser = XML::SAX::PurePerl->new(Handler => MySAXHandler->new );
#my $parser = XML::SAX::ParserFactory->parser(    Handler => MySAXHandler->new    );
print "package org.openstreetmap.model;\n";
print "import  org.openstreetmap.model.StyleEvaluator;\n";
#//print "import org.openstreetmap.josm.data.osm.OsmPrimitiveWrapper;\n";
print "public class GeneratedStyleEvaluator extends StyleEvaluator  { \n";

$parser->parse_uri(shift @ARGV);

Filter::EmitClasses();


#Stack::PopAll("Rules");# get rid of any data left
#Stack::PopAll("Style");# get rid of any data left

Parameter::PrintParameters();

#Stack::PopAll("Layer");# get rid of any data left
#Stack::PopAll;

Filter::EmitCalls();
Style::PrintStyles();
Layer::PrintLayers();

print join "\n", map {
    my $type = Field::gettype($_);
    "public static final $type VALUE_${_}=null;" }(sort keys %fields);

print "};//end StyleEvaluator \n";

