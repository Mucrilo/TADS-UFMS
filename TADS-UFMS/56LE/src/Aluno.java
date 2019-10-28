
public class Aluno implements Comparable<Aluno>{
	
	private String nome;
	private String rga;
	
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
		
		return "{nome: " + this.nome + ", rga: " + this.rga + "}";
	}
	
	public int compareTo (Aluno aluno) {
		
		return this.rga.compareTo(aluno.rga);
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
