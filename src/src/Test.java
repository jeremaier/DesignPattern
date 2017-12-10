package src;

public class Test {
	public static void main(String args[]) {
		String[][] Cont = {{"x", "5"},{"y", "2"}};
		Context C = new Context(Cont);
		
		Const v9 = new Const(9);
		Variable v5 = new Variable("x");
		Plus plus = new Plus(v5, v9);
		Const v5b = new Const(5);
		Const v3 = new Const(3);
		Minus moins = new Minus(v5b, v3);
		Div div = new Div(plus, moins);
		
		NodeIterator n = div.getPostFixe();
		
		while(n.hasNext())
			System.out.println(n.next().toString());
		
		if(div.evaluate(C) == 7)
			System.out.println("Expr ok");
		else System.out.println("Expr failed");

		System.out.println((String)div.accept(new StringVisitor()).toString());
	}
}
