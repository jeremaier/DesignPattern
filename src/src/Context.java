package src;

public class Context {
	private String[][] C;
	
	public Context(String[][] C) {
		this.C = C;
	}
	
	public int find(String var) {
		int i = 0;

		while(!this.C[i][0].equals(var))
			i++;
		
		return Integer.parseInt(this.C[i][1]);
	}
}
