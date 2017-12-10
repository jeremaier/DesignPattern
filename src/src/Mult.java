package src;
public class Mult extends Operator {
	public Mult(Exp opL, Exp opR) {
		super(opL, opR);
	}

	@Override
	public String getSymbol() {
		return " * ";
	}
	
	@Override
	public Object accept(Visitor v) {
		return v.visit(this);
	}
}
