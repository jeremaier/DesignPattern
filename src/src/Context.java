package src;

public class Context {
	private String[][] C;
	
	public Context(String[][] C) {
		this.C = C;
	}
	
	public double find(String name) {
		int i = 0;

		while(!this.C[i][0].equals(name))
			i++;
		
		return Double.parseDouble(this.C[i][1]);
	}
}
