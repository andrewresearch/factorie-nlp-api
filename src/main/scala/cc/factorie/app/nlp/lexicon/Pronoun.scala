package cc.factorie.app.nlp.lexicon

import cc.factorie.app.nlp.lemma.LowercaseLemmatizer
import cc.factorie.app.strings.nonWhitespaceClassesSegmenter

object Pronoun extends PhraseLexicon("Pronoun", nonWhitespaceClassesSegmenter, LowercaseLemmatizer) {
  this ++=
    """all
another
any
anybody
anyone
anything
both
each
each other
either
everybody
everyone
everything
few
he
her
hers
herself
him
himself
his
I
it
its
itself
many
me
mine
myself
neither
no_one
nobody
none
nothing
one
one another
other
ours
ourselves
several
she
some
somebody
someone
something
such
that
theirs
them
themselves
these
they
this
those
us
we
what
whatever
which
whichever
who
whoever
whom
whomever
whose
you
yours
yourself
yourselves"""
}