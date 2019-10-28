import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Vetor<T> implements List<T> {

	private int quantidade;
	private T[] vetor;

	@SuppressWarnings("unchecked")
	public Vetor() {
		quantidade = 0;
		vetor = (T[]) new Object[10];
	}

	public String toString() {

		String s = "Vetor[";
		for (int i = 0; i < quantidade; i++) {
			if (i == 0) {
				s += vetor[i];
			} else {
				s += ", " + vetor[i];
			}

		}
		return s + "]";
	}

	public void dobraCapacidade() {

		@SuppressWarnings("unchecked")
		T[] aux = (T[]) new Object[2 * quantidade];

		for (int i = 0; i < quantidade; i++) {
			aux[i] = vetor[i];
		}
		vetor = aux;
	}

	@Override
	public int size() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isEmpty() {
		if (quantidade == 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean contains(Object o) {

		for (int i = 0; i < vetor.length; i++) {
			if (o.equals(vetor[i])) {

				return true;
			}
		}
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		return new VetorIterator<T>(vetor, quantidade);
	}

	@Override
	public Object[] toArray() {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException();

	}

	@Override
	public boolean add(T arg0) {
		if (quantidade >= vetor.length) {
			dobraCapacidade();
		}
		vetor[quantidade] = arg0;
		quantidade++;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void clear() {

		quantidade = 0;
		vetor = (T[]) new Object[10];
	}

	@Override
	public T get(int index) {

		return vetor[index];
	}

	@Override
	public T set(int index, T element) {
		T retorna = vetor[index];
		vetor[index] = element;
		return retorna;
	}

	@Override
	public void add(int index, T element) {
		throw new UnsupportedOperationException();

	}

	@Override
	public T remove(int index) {

		T retorna = vetor[index];

		if (index < (quantidade - 1)) {
			for (int i = index; i < quantidade; i++) {
				vetor[i] = vetor[i + 1];
			}
		}
		quantidade--;

		return retorna;
	}

	@Override
	public int indexOf(Object o) {
		for (int i = 0; i < vetor.length; i++) {
			if (o.equals(vetor[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<T> listIterator() {
		return new VetorIterator<T>(vetor, quantidade);
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException();
	}

}
