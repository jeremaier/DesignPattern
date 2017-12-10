package src;

import java.util.NoSuchElementException;

public class Variable implements Exp {
	private String name;
	
	public Variable(String name) {
		this.name = name;
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
				
				return Variable.this;
			}
		};
	}
	
	@Override
	public Object accept(Visitor v) {
		return v.visit(this);
	}
	
	public String getName() {
		return this.name;
	}
}
