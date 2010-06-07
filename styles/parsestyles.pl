#!/usr/bin/perl

use strict;
use warnings;


package Rule;
use Data::Dumper;
sub start
{
    my $self=shift;
    #print Dumper($self);    
}
sub characters 
{

}

sub end
{

}

1;

package MaxScaleDenominator;

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

package MinScaleDenominator;

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

package PointSymbolizer;

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

package Map;
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

package FontSet;
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

package Font;
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

package Style;
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

package LineSymbolizer;
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

package PolygonSymbolizer;
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

package PolygonPatternSymbolizer;
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

package TextSymbolizer;
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

package ElseFilter;
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

package LinePatternSymbolizer;
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

package Layer;
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

package StyleName;
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

package Datasource;
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

package Parameter;
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


package ShieldSymbolizer;
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

package CssParameter;
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

package Filter;
use Parse::RecDescent;


# ( ) Enclose a sub-expression
# [ ] Enclose a Field/Attribute Name
# * multiply
# / divide
# + add
# - subtract
# % modulo
# = equal to or equivalent to
# &lt;&gt;
# !=
# <> not equal
# not equal
# &lt; < less than
# &lt;= <= less than or equal
# &gt; > greater than
# &gt;= >= greater than or equal
# and and
# or and

my $grammar = q {
<autotree>

startrule : expression 
expression  :  and_expr 'or' expression | and_expr
and_expr : not_expr 'and' and_expr | not_expr
not_expr : 'not' parens | '<>' parens | parens
parens : '(' expression ')' | sexpression
sexpression : field operator value   | field 
identifier: /[A-Za-z_][A-Za-z0-9_]*/
videntifier: /[A-Za-z0-9_]+/
field : '[' identifier ']'
digits : /[0-9]+/
value : "\'" videntifier "\'" | digits | "\'\'"
operator :  '*' |  '/' | '+' | '-' | '%' | '=' | '<>'

         };


#   parens and not expression
#([waterway]='drain' or [waterway]='ditch') and not [tunnel]='yes'

#parens | sexpression  # | sexpression 'and' expression  | 'not ' expression |  sexpression 'or' expression
#| 'or' | 'and' | 'and not' | 'not'  | '<>' | '!='
my $ruleparser = new Parse::RecDescent ($grammar) or die "Bad grammar!\n";


use Data::Dumper;
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
    my $x= $ruleparser->startrule($text) ;
    if ($x)
    {
#	print "good text $text \n";
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

## elements
# Map
# FontSet
# Font
# Style
# Rule
# MaxScaleDenominator
# MinScaleDenominator
# PointSymbolizer
# Filter
# LineSymbolizer
# CssParameter
# PolygonSymbolizer
# PolygonPatternSymbolizer
# TextSymbolizer
# ElseFilter
# ShieldSymbolizer
# LinePatternSymbolizer
# Layer
# StyleName
# Datasource
# Parameter


my $current="Nothing";
my $obj = undef;
sub start_element 
{
    my ($self, $el) = @_;
    my $name = $el->{LocalName};
    
    #print "$name\n" unless $seen{$name}++;    
    # if ($name eq "Rule")
    # {
    # 	Rule::start($el);
    # }

#    if ($name eq "Filter")
#    {
    $obj = ${name}->start($el);
#    }
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
