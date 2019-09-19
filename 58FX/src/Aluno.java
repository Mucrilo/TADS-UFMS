import java.util.ArrayList;

public class Aluno implements Comparable<Aluno>{
	
	private String nome;
	private String rga;
	private ArrayList<Turma> turmas = new ArrayList<Turma>();
	
	public Aluno() {
		
		this.nome = "NULL";
		this.rga = "NULL";
	}
	
	public Aluno(String nome, String rga) {
		
		this.nome = nome;
		this.rga = rga;
	}
	
	public Aluno(Aluno aluno) {
		
		this.nome = aluno.nome;
		this.rga = aluno.rga;
	}
	
	public boolean equals (Aluno aluno) {
		
		return this.rga.equals(aluno.rga);
	}
	
	public String toString() {
		
		return "{nome: " + this.nome + 
				", rga: " + this.rga + 
				", turmas:" + this.turmas + "}";
	}
	
	public int compareTo (Aluno aluno) {
		
		return this.rga.compareTo(aluno.rga);
	}
	
	public void addTurmas(Turma turma) {
		
		this.turmas.add(turma);
	}
	
	public boolean addTurmas(String disciplina, String sigla, String professor) {
		
		return this.turmas.add(new Turma(disciplina, sigla, professor));
		
		//Turma turma = new Turma(disciplina, sigla, professor);
		//return this.turmas.add(turma);
	}
		
	public Turma getTurmas(int indice) {
		
		return this.turmas.get(indice);
	}
	
	public int indexOfTurmas (Turma turma) {
		
		return this.turmas.indexOf(turma);
	}
	
	public int sizeTurmas() {
		
		return this.turmas.size();
	}
	
	public boolean containsTurmas(Turma turma) {
		
		return this.turmas.contains(turma);
	}
	
	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public String getRga() {
		
		return rga;
	}

	public void setRga(String rga) {
		
		this.rga = rga;
	}
	
}
