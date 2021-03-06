package src;

import java.util.NoSuchElementException;

public class Const implements Exp {
	private double val;
	
	public Const(double val) {
		this.val = val;
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
	
	public double getVal() {
		return this.val;
	}
}
