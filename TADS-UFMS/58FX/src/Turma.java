
public class Turma {
	
	private String disciplina;
	private String sigla;
	private String professor;
	
	public Turma() {
		
		this.disciplina = "NULL";
		this.sigla = "NULL";
		this.professor = "NULL";
	}
	public Turma(Turma turma) {
		
		this.disciplina = turma.disciplina;
		this.sigla = turma.sigla;
		this.professor = turma.professor;
	}
	
	public Turma(String disciplina, String sigla, String professor) {
		
		this.disciplina = disciplina;
		this.sigla = sigla;
		this.professor = professor;
	}
	
	public boolean equals(Turma turma) {
		
		if (this.disciplina.equals(turma.disciplina)) {
			if (this.sigla.equals(turma.sigla)) {
				if (this.professor.equals(turma.professor)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public int compareTo(Turma turma) {
		
		return this.sigla.compareTo(turma.sigla);
	}
	
	public String toString() {
		
		return "{disciplina: " + this.disciplina +
				", sigla: " + this.sigla +
				", professor(a): " + this.professor + "}";
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
}
