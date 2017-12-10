package src;

import java.util.NoSuchElementException;

public interface NodeIterator {
	public boolean hasNext();
	public Exp next() throws NoSuchElementException;
}
