import java.util.PrimitiveIterator.OfDouble;

public class Turma {
	private int quantidadeDeAlunos;
	private String disciplinaDaTurma;
	
	public Turma(String disciplinaDaTurma, int quantidadeDeAlunos) {
		this.quantidadeDeAlunos = quantidadeDeAlunos;
		this.disciplinaDaTurma = disciplinaDaTurma;
	}
	
	public String toString() {
		return this.disciplinaDaTurma + " " + this.quantidadeDeAlunos;
	}
	
	public int compareTo(Turma t) {
		
		if(this.disciplinaDaTurma.equals(t.disciplinaDaTurma))
			return 0;
		if(this.disciplinaDaTurma.compareTo(t.disciplinaDaTurma) < 0)
			return -1;
		else return 1;
	}
}
