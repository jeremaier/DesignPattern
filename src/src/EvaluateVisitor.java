package src;

public class EvaluateVisitor extends Visitor {
	private Context co;
	
	public EvaluateVisitor(Context co) {
		this.co = co;
	}
	
	public Object visit(Variable v) {
		return co.find(v.getName());
	}
	
	public Object visit(Const c) {
		return c.getVal();
	}
	
	public Object visit(Plus p) {
		return (double)p.getOpL().accept(this) + (double)p.getOpR().accept(this);
	}
	
	public Object visit(Minus m) {
		return (double)m.getOpL().accept(this) - (double)m.getOpR().accept(this);
	}
	
	public Object visit(Mult m) {
		return (double)m.getOpL().accept(this) * (double)m.getOpR().accept(this);
	}
	
	public Object visit(Div d) {
		return (double)d.getOpL().accept(this) / (double)d.getOpR().accept(this);
	}
}
