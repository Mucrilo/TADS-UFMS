import java.util.ListIterator;

public class VetorIterator<T> implements ListIterator<T>{
	
	private T[] vetor;
	private int index;
	private int quantidade;
	
	public VetorIterator(T[] vetor, int quantidade) {
		
		this.vetor = vetor;
		this.index = -1;
		this.quantidade = quantidade;
	}

	@Override
	public boolean hasNext() {
		if (index < (quantidade -1)) {
			return true;
		}
		return false;
	}

	@Override
	public T next() {
		index++;
		return vetor[index];

	}

	@Override
	public boolean hasPrevious() {
		throw new UnsupportedOperationException();

	}

	@Override
	public T previous() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int nextIndex() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int previousIndex() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void set(T e) {
		vetor[index] = e;		
	}

	@Override
	public void add(T e) {
		throw new UnsupportedOperationException();
		
	}
	
	
}
