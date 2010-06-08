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
	my $xml  = $x->emitxml();
	
	print $xml;
    }
    else
    {
	print "Bad text! $text\n";
    }

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
sub emitxml
{
#    my $class=shift;
    my $self=shift;
    # now this 
#    warn Dumper($self);
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
	$self->{$k}->emitxml();
    }
}

1;

package ExprNot;
use Moose;
extends 'Expression';
1;

package Literal;
use Moose;
extends 'Expression';
1;

package ExprField;
use Moose;
extends 'Expression';
1;

package Field;
use Moose;
extends 'Expression';
1;

package Identifier;
use Moose;
extends 'Expression';
1;

package Operator;
use Moose;
extends 'Expression';
1;

package Digits;
use Moose;
extends 'Expression';
1;

package Value;
use Moose;
extends 'Expression';
1;

package Parens;
use Moose;
extends 'Expression';
1;

package ExprAnd;
use Moose;
extends 'Expression';
1;

package FilterExpr;

use Data::Dumper;

sub emitxml
{
    my $self=shift;
    # now this 
    #warn Dumper($self);
    foreach my $k (keys %{$self})
    {
	next if $k eq "__RULE__";
	#print "$k \t $self->{$k}\n";
	$self->{$k}->emitxml();

    }
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
$parser->parse_uri("osm_expanded.xml");
