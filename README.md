A symbolic automata library
================
This efficient automata library allows you to represent large (or infinite) alphabets succinctly.

Symbolic automata
----------------
In a *symbolic automaton* transitions carry predicates instead of concrete symbols.
This allows you to represent large characters sets like UTF.
For example a transition 0-[a-z]->1 represents a transition for going from state 0 to state 1 with every symbol in the interval [a-z].

You can read more about symbolic automata here:
*http://www.cis.upenn.edu/~lorisdan/symbolicautomata.html*

The library
----------------
The library supports:
- *Symbolic automata* and all their algorithms (intersection, equivalence, minimization, etc.)
- *Symbolic visibly pushdown automata* and all their algorithms
- *Symbolic streaming string transducers*
- The character theory of intervals

Instructions
----------------
The main library resides in the project SVPALib. 
The character theory of interval resides in the project BooleanAlgebras.
To see usage examples of the library check the project TestSVPA.