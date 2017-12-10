package src;
public class Mult extends Operator {
	public Mult(Exp opL, Exp opR) {
		super(opL, opR);
	}

	@Override
	public double evaluate(Context C) {
		return opL.evaluate(C) * opR.evaluate(C);
	}

	@Override
	public String symbol() {
		return " * ";
	}
	
	@Override
	public Object accept(Visitor v) {
		return v.visit(this);
	}
}
