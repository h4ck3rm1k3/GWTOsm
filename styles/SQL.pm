package SQL;
use SQL::Statement;
use SQL::Parser;
use warnings;
use strict;
use Data::Dumper;

my $current="";
sub Add
{
    my $s=shift;
    $current .= $s;# //append 
}

sub VisitArg
{
    my $self=shift;
    if (!$self)
    {
	warn "DEBUG:UNDEF!!";	
	return;
    }
    my $value=$self->{'value'};
    my $type =$self->{'type'};

    if (!$type )
    {

    }
    elsif ($type eq 'null')
    {
	warn "DEBUG:UNDEF of T:$type";	
    }
    elsif ($value)
    {
	warn "DEBUG:$value of T:$type";	
    }
    elsif ($self->{'op'})
    {
	VisitOp($self);
    }
    else
    {
	die Dumper($self);

    }
}

sub VisitOp
{
    my $self=shift;
    my $op=$self->{'op'};
    my $neg=$self->{'neg'};
    my $arg1=$self->{'arg1'};
    my $arg2=$self->{'arg2'};

    VisitArg($arg1);
    VisitArg($arg2);
    if ($neg )
    {
	warn "DEBUG:negated";
    }

    if ($op eq "=")
    {
	warn "DEBUG:Equals";
    }
    elsif ($op eq "OR")
    {
	warn "DEBUG:OR";
    }
    else 
    {
	warn "DEBUG:unknown op: $op";
    }

}

sub VisitJava
{
    my $hash=shift;
    VisitOp($hash);
}


sub Eval
{
    warn "SQL:\"$current\"";
    my $parser = SQL::Parser->new();
#    $parser->{RaiseError}=1;   # turn on die-on-error behaviour
    $parser->{PrintError}=1;  # turn on warnings-on-error behaviour
    
    
    if($current =~ s/^\s*\(//)
    {
    warn "SQL:\"$current\"";
	if($current =~ s/\) as (\w+)\s*$//)
	{
	    my $sql=$current;
	    my $name=$1;
	    warn "going to part $sql";
	    #   warn Dumper($parser->parse($sql));
	    my $stmt = SQL::Statement->new($sql, $parser);
#    my $numColumns = $stmt->column_defs();  # Scalar context
#    my @columnList = $stmt->column_defs();  # Array context
#    my($col1, $col2) = ($stmt->column_defs(0), $stmt->column_defs(1));
	    #warn Dumper($stmt->{'where_clause'});
	    VisitJava($stmt->{'where_clause'});
	}
	
    }

    $current=""; # reset
}

1;
