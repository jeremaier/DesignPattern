package src;

public class Test {
	public static void main(String args[]) {
		String[][] Cont = {{"x", "5"},{"y", "2"}};
		Context c = new Context(Cont);
		StringVisitor stringVisitor = new StringVisitor();
		EvaluateVisitor evaluateVisitor = new EvaluateVisitor(c);
		
		Const c1 = new Const(9);
		Variable v1 = new Variable("x");
		Plus plus = new Plus(c1, v1);
		Const c2 = new Const(5);
		Const c3 = new Const(3);
		Minus moins = new Minus(c2, c3);
		Div div = new Div(plus, moins);
		
		System.out.println((new Variable("y")).accept(evaluateVisitor));
		
		if((Double)div.accept(evaluateVisitor) == 7)
			System.out.println("Expr ok");
		else System.out.println("Expr failed");

		System.out.println((String)div.accept(stringVisitor));
	}
}
