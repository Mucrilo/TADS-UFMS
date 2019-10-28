
public class Aluno implements Comparable<Aluno>{
	
	private String nome;
	private String rga;
		
	public Aluno() {
		this.nome = new String();
		this.rga = new String();
	}
	
	public Aluno(String nome, String rga) {
		this.nome = nome;
		this.rga = rga;
	}
	
	public Aluno(Aluno aluno) {
		this.nome = aluno.nome;
		this.rga = aluno.rga;
	}
	
	public boolean equals (Object aluno) {
	  if (aluno == null || aluno.getClass() != this.getClass()) return false;
		else {
		  Aluno a = (Aluno) aluno;
		  return this.rga.equals(a.rga);
		  
		  
		}
	}
	
	public String toString() {
		return "{nome: " + this.nome + 
				", rga: " + this.rga + "}";
	}
	
	public int compareTo (Aluno aluno) {
		return this.rga.compareTo(aluno.rga);
	}
		
	public String getNome() {
		return nome;
	}

	public String getRga() {
		return rga;
	}

}
