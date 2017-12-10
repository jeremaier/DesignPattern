package src;

public class Minus extends Operator {
	public Minus(Exp opL, Exp opR) {
		super(opL, opR);
	}

	@Override
	public String getSymbol() {
		return " - ";
	}
	
	@Override
	public Object accept(Visitor v) {
		return v.visit(this);
	}
}