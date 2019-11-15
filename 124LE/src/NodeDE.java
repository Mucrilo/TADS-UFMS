
public class NodeDE<T> {

	NodeDE<T> anterior;
	NodeDE<T> proximo;
	
	T data;
	
	public NodeDE(T e) {
		data = e;
		anterior = null;
		proximo = null;
	}
	
	
	
	@Override
	public String toString() {
		return "NodeDE [data=" + data + ", proximo=" + proximo + "]";
	}



	public NodeDE<T> getProx (){
		
		return proximo;
	}
	
	public void setProx(NodeDE<T> n) {
		
		this.proximo = n;
	}
	
	public NodeDE<T> getAnt(){
		
		return anterior;
	}
	
	public void setAnt(NodeDE<T> n) {
		
		this.anterior = n;
	}
}
