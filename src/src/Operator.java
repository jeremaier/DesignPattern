package src;

import java.util.NoSuchElementException;

public abstract class Operator implements Exp {
	protected Exp opL;
	protected Exp opR;
	
	public Operator(Exp opL, Exp opR) {
		this.opL = opL;
		this.opR = opR;
	}
		
	@Override
	public String toString() {
		return "(" + this.opL.toString() + this.symbol() + this.opR.toString() + ")";
	}
	
	public NodeIterator getPostFixe(){
		return new NodeIterator() {
			boolean first = true;
			private NodeIterator filsgauche = Operator.this.opL.getPostFixe();
			private NodeIterator filsdroit = Operator.this.opR.getPostFixe();
			
			public boolean hasNext() {
				return first;
			}
			
			public Exp next() throws NoSuchElementException{
				if(first) {
					filsgauche.next();
					filsdroit.next();
				} else throw new NoSuchElementException("Pas de next");
				
				first = false;
				return Operator.this;
			}
		};
	}
	
	public Exp getfd() {
		return this.opL;
	}
	
	public Exp getfg() {
		return this.opR;
	}

	public abstract double evaluate(Context C);
	public abstract String symbol();
}
