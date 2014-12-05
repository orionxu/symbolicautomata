/**
 * 
 */
package automata.fsa;

import theory.BooleanAlgebra;

public class InputMove<U,S> extends SFAMove<U, S>{

	public U guard;
	
	/**
	 * Constructs an FSA Transition that starts from state <code>from</code> and ends at state
	 * <code>to</code> with input <code>input</code>
	 */
	public InputMove(Integer from, Integer to, U guard) {
		super(from, to);
		this.guard=guard;
	}
	
	public boolean isSatisfiable(BooleanAlgebra<U,S> boolal){
		return boolal.IsSatisfiable(guard);
	}
	
	public boolean isDisjointFrom(SFAMove<U,S> t, BooleanAlgebra<U,S> ba){
		if(t.isEpsilonTransition())
			return true;
		if (from.equals(t.from)){			
			InputMove<U, S> ct = (InputMove<U, S>) t;			
			if(ba.IsSatisfiable(ba.MkAnd(guard,ct.guard)))
				return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("S: %s -%s-> %s",from,guard, to);
	}

	@Override
	public String toDotString() {
		return String.format("%s -> %s [label=\"%s\"]\n", from,to,guard);
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof InputMove<?, ?>) {
			InputMove<?, ?> otherCasted = (InputMove<?, ?>) other;
			return otherCasted.from==from && otherCasted.to==to && otherCasted.guard==guard;
		}

		return false;
	}

	@Override
	public Object clone(){
		  return new InputMove<U, S>(from,to, guard);
	}

	@Override
	public boolean isEpsilonTransition() {
		return false;
	}
	
}
