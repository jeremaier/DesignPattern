package src;

public class VisitEvaluate extends Visitor {
	private Context co;
	
	public VisitEvaluate(Context co) {
		this.co = co;
	}
	
	public Object visit(Variable v) {
		return v.evaluate(co);
	}
	
	public Object visit(Const c) {
		return c.evaluate(co);
	}
	
	public Object visit(Plus p) {
		return p.evaluate(co);
	}
	
	public Object visit(Minus m) {
		return m.evaluate(co);
	}
	
	public Object visit(Mult m) {
		return m.evaluate(co);
	}
	
	public Object visit(Div d) {
		return d.evaluate(co);
	}
}
