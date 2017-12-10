package src;

import java.util.NoSuchElementException;

public class Const implements Exp {
	private double val;
	
	public Const(double val) {
		this.val = val;
	}
	
	@Override
	public double evaluate(Context C) {
		return this.val;
	}
	
	@Override
	public String toString() {
		return Double.toString(this.val);
	}
	
	@Override
	public NodeIterator getPostFixe() {
		return new NodeIterator() {
			boolean first = true;
			
			public boolean hasNext() {
				return first;
			}
			
			public Exp next() throws NoSuchElementException {
				if(!first)
					throw new NoSuchElementException("Pas de next");
				
				first = false;
				
				return Const.this;
			}
		};
	}
	
	@Override
	public Object accept(Visitor v) {
		return v.visit(this);
	}
}
