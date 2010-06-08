#!/usr/bin/perl
# author : james michael dupont
# license : aGPL 3.0
use strict;
use warnings;

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


1;

package Map;
use Moose;
extends 'BaseRule';

1;

package FontSet;
use Moose;
extends 'BaseRule';

1;

package Font;
use Moose;
extends 'BaseRule';

1;

package Style;
use Moose;
extends 'BaseRule';

1;

package LineSymbolizer;
use Moose;
extends 'BaseRule';

1;

package PolygonSymbolizer;
use Moose;
extends 'BaseRule';

1;

package PolygonPatternSymbolizer;
use Moose;
extends 'BaseRule';


1;

package TextSymbolizer;
use Moose;
extends 'BaseRule';


1;

package ElseFilter;
use Moose;
extends 'BaseRule';

1;

package LinePatternSymbolizer;
use Moose;
extends 'BaseRule';
1;

package Layer;
use Moose;
extends 'BaseRule';
1;

package StyleName;
use Moose;
extends 'BaseRule';

1;

package Datasource;
use Moose;
extends 'BaseRule';

1;

package Parameter;
use Moose;
extends 'BaseRule';

1;


package ShieldSymbolizer;
use Moose;
extends 'BaseRule';


1;

package CssParameter;
use Moose;
extends 'BaseRule';


1;

package Filter;
use Parse::RecDescent;
use Data::Dumper;


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
    
    #print Dumper($data);    
    return $data;
}
my $count =0;
sub end
{
    my $class=shift;
    my $self=shift;
#    warn Dumper($self);
    my $text =$self->{chars};
    my $x= $ruleparser->FilterExpr($text) ;
    if ($x)
    {
	#print "good text $text \n";
	my $java  = $x->emitJava();

print "boolean ProcessStyle$count (OsmPrimitiveWrapper obj)
	{\n";
	print "return $java;\n";
print "}; \n";
	$count++;

    }
    else
    {
	print "Bad text! $text\n";
    }

}

sub EmitCalls
{
print "void ProcessStyle (OsmPrimitiveWrapper obj){";
foreach (0..$count -1)
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

sub emitJava
{
#    my $class=shift;
    my $self=shift;
    my $id = $self->{__VALUE__};
    return "\"$id\"";
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


package Field;
use Moose;
use Data::Dumper;
extends 'Expression';

sub emitJava
{
#    my $class=shift;
    my $self=shift;
    my $id = $self->{Identifier}->emitJava();
    return "obj.get(\"$id\")";
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
	return "equals"
    }
    elsif ($id eq "<>")
    {
	return "notequals"
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


my $current="Nothing";
my $obj = undef;
sub start_element 
{
    my ($self, $el) = @_;
    my $name = $el->{LocalName};
    $obj = ${name}->start($el);
    $current = $name;
}

sub end_element 
{
    my ($self, $el) = @_;
    my $name = $el->{LocalName};

    $current->end($el);
    $obj=undef;
    $current = "Nothing";
}

sub characters
{
    my ($self, $el) = @_;
    ${current}->characters($obj,$el);
}

1;

package main;
use strict;
use warnings;

use Data::Dumper;
use XML::SAX;
my $parser = XML::SAX::ParserFactory->parser(    Handler => MySAXHandler->new    );

print "package org.openstreetmap.gwt.client;\n";
print "import  org.openstreetmap.gwt.client.StyleEvaluator;\n";
print "import org.openstreetmap.josm.data.osm.OsmPrimitiveWrapper;\n";
print "public class GeneratedStyleEvaluator extends StyleEvaluator  { \n";

$parser->parse_uri("osm_expanded.xml");

Filter::EmitCalls();

print "}; \n";
