package src;

import java.util.NoSuchElementException;

public abstract class Operator implements Exp {
	protected Exp opL;
	protected Exp opR;
	
	public Operator(Exp opL, Exp opR) {
		this.opL = opL;
		this.opR = opR;
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
	
	public Exp getOpL() {
		return this.opL;
	}
	
	public Exp getOpR() {
		return this.opR;
	}

	public abstract String getSymbol();
}
