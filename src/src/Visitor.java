package src;

public abstract class Visitor {
	protected abstract Object visit(Variable v);
	protected abstract Object visit(Const c);
	protected abstract Object visit(Plus p);
	protected abstract Object visit(Minus m);
	protected abstract Object visit(Mult f);
	protected abstract Object visit(Div d);
}
