
public class ColecaoDe<T> {
	
	NodeDE<T> inicio;
	NodeDE<T> fim;
	int quantidade;
	
	public ColecaoDe(){
		
		inicio = null;
		fim = null;
		quantidade = 0;
	}
	
	public boolean inserirInicio(T e) {
		
		NodeDE<T> no = new NodeDE<T>(e);
		
		if(quantidade == 0) {
			return inserirVazio(e);
		}
		else {
			no.setProx(inicio);
			inicio.setAnt(no);
			inicio = no;
			quantidade++;
		}
		
		return true;
	}
	
	public boolean inserirVazio(T e) {
		
		NodeDE<T> no = new NodeDE<T>(e);
		
		this.inicio = no;
		this.fim = no;
		this.quantidade = 1;
		
		return true;
	}

	@Override
	public String toString() {
		return "ColecaoDe [inicio=" + inicio + ", quantidade=" + quantidade + "]";
	}

	public boolean inserirFim(T e) {
		
		if (quantidade == 0) {
			return inserirVazio(e);
		}
		else {
			NodeDE<T> no = new NodeDE<T>(e);
			fim.setProx(no);
			no.setAnt(fim);
			fim = no;
			quantidade++;
		}
		return true;
	}
}
