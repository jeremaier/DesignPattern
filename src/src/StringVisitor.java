package src;

public class StringVisitor extends Visitor {
	public Object visit(Variable v) {
		return v.getName();
	}

	public Object visit(Const c) {
		return c.getVal();
	}
	
	public Object visit(Plus p) {
		return p.getOpL().accept(this) + " " + p.getOpR().accept(this) + p.getSymbol();
	}
	
	public Object visit(Minus m) {
		return m.getOpL().accept(this) + " " + m.getOpR().accept(this) + m.getSymbol();
	}
	
	public Object visit(Mult m) {
		return m.getOpL().accept(this) + " " + m.getOpR().accept(this) + m.getSymbol();
	}

	public Object visit(Div d) {
		return d.getOpL().accept(this) + " " + d.getOpR().accept(this) + d.getSymbol();
	}
}
