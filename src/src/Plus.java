package src;
public class Plus extends Operator {
	public Plus(Exp opL, Exp opR) {
		super(opL, opR);
	}

	@Override
	public String getSymbol() {
		return " + ";
	}

	@Override
	public Object accept(Visitor v) {
		return v.visit(this);
	}
}
