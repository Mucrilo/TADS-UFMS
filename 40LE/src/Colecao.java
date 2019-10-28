import org.ietf.jgss.Oid;

public class Colecao {
	
	private Turma turmas[];
	private int quantidadeDeTurmas;
	
	public Colecao() {
		this.quantidadeDeTurmas = 0;
		turmas = new Turma[100];
	}
	
	public Colecao(int n) {
		this.quantidadeDeTurmas = 0;
		turmas = new Turma[n];
	}

	public void adicionarTurma(Turma turma) {
		
		this.turmas[this.quantidadeDeTurmas] = turma;
		this.quantidadeDeTurmas++;
	}
	
	public String toString() {
		String str = "";
		
		for(Turma t: turmas) {
			str += t + "\n";
		}
		
		return str;
	}
	
	public void selectionSort() {
		
		for(int i = 0; i < quantidadeDeTurmas; i++) {
			
			int menor = i;
			
			for(int j = i+1; j < quantidadeDeTurmas; j++) {
				if(turmas[j].compareTo(turmas[menor]) < 0)
					menor = j;
			}
			
			troca(menor, i);
		}
	}
	
	public void troca(int i, int j) {
		
		Turma aux;
		aux = turmas[i];
		turmas[i] = turmas[j];
		turmas[j] = aux;
		
	}
}
