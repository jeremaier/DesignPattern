package src;
public interface Exp {
	public abstract NodeIterator getPostFixe();
	public abstract Object accept(Visitor v);
}
