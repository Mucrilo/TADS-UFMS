import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Backup<T> implements List<T>{
  int quantidade;
  T[] vetor;

  public Backup() {
    quantidade = 0;
    this.vetor = (T[]) new Object[10];
  }

	@Override
	public boolean add(T arg0) {
    if (quantidade >= vetor.length)
      aumentaVetor();
    vetor[quantidade] = arg0;
    quantidade ++;
    return true;
	}

  public void aumentaVetor() {
    T[] v2 = (T[]) new  Object[quantidade*2];
    for (int i = 0; i < quantidade; i ++)
      v2[i] = vetor[i];

    vetor = v2;
  }

	@Override
	public void add(int arg0, T arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection<? extends T> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends T> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		this.vetor = (T[]) new Object[10];
    this.quantidade = 0;
		
	}

	@Override
	public boolean contains(Object arg0) {
		for (int i = 0; i < quantidade; i ++) {
      if (vetor[i].equals(arg0)) return true;
    }
    return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int arg0) {
		// TODO Auto-generated method stub
		return vetor[arg0];
	}

	@Override
	public int indexOf(Object arg0) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
				throw new UnsupportedOperationException();

	}

	@Override
	public ListIterator<T> listIterator() {
		throw new UnsupportedOperationException();
		//return new VetorIterator<T>(this.vetor, 0, this.quantidade);
	}

	@Override
	public ListIterator<T> listIterator(int arg0) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
				throw new UnsupportedOperationException();

	}

	@Override
	public T remove(int arg0) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public T set(int arg0, T arg1) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int size() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public List<T> subList(int arg0, int arg1) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Object[] toArray() {
    Object[] o = new Object[quantidade];
    for (int i = 0; i < quantidade; i ++)
      o[i] = vetor[i];
		return o;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

  public String toString() {
    String string = "Vetor[";
    for (int i = 0; i < quantidade; i ++) {
      if (i == 0)string += vetor[i];
      else string += "," + vetor[i];
    }
    return string+"]";
  }

}
