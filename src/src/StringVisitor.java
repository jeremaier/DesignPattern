package src;

public class StringVisitor extends Visitor {
	public Object visit(Variable v) {
		return v.toString();
	}

	public Object visit(Const c) {
		return c.toString();
	}
	
	public Object visit(Plus p) {
		return p.getfg().accept(this) + " " + p.getfd().accept(this) + p.symbol();
	}
	
	public Object visit(Minus m) {
		return m.getfg().accept(this) + " " + m.getfd().accept(this) + m.symbol();
	}
	
	public Object visit(Mult m) {
		return m.getfg().accept(this) + " " + m.getfd().accept(this) + m.symbol();
	}

	public Object visit(Div d) {
		return d.getfg().accept(this) + " " + d.getfd().accept(this) + d.symbol();
	}
}
