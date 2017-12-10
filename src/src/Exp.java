package src;
public interface Exp {
	public abstract double evaluate(Context C);
	public abstract String toString();
	public abstract NodeIterator getPostFixe();
	public abstract Object accept(Visitor v);
}
