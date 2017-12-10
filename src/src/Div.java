package src;
public class Div extends Operator {
	public Div(Exp opL, Exp opR) {
		super(opL, opR);
	}

	@Override
	public String getSymbol() {
		return " / ";
	}
	
	@Override
	public Object accept(Visitor v) {
		return v.visit(this);
	}
}
