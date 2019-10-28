import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Turma> turmas = new ArrayList<Turma>();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		int quantidadeDeTurmas = teclado.nextInt();
		
		for (int indice = 0; indice < quantidadeDeTurmas; indice++) {
			
			Turma turma = new Turma(teclado.nextLine(),
					teclado.nextLine(),
					teclado.nextLine());
			
			turmas.add(turma);
		}
		
		int quantidadeDeAlunos = teclado.nextInt();
		
		for (int indice = 0; indice < quantidadeDeAlunos; indice++) {
			
			Aluno aluno = new Aluno();
			aluno.setNome(teclado.nextLine());
			aluno.setRga(teclado.nextLine());
			
			int quantidadeDeSiglas = teclado.nextInt();
			
			for (int indiceSigla = 0; indiceSigla < quantidadeDeSiglas; indiceSigla++) {
				
				teclado.nextLine();
			}
		}
	}
}

public class Aluno{
	
	private String nome;
	private String rga;
	
	private ArrayList<Turma> turmas = new ArrayList<Turma>();
	
	public Aluno() {
		
		this.nome = "NULL";
		this.rga = "NULL";
	}
	
	public boolean addTurma(Turma turma) {
		
		return turmas.add(turma);
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public void setRga(String rga) {
		
		this.rga = rga;
	}
}

public class Turma{
	
	private String disciplina;
	private String sigla;
	private String professor;
	
	public Turma(String disciplina, String sigla, String professor) {
		
		this.disciplina = disciplina;
		this.sigla = sigla;
		this.professor = professor;
	}
}



public boolean addTurmas(String disciplina, String sigla, String professor) {
	
	Turma turma = new Turma(disciplina, sigla, professor);
	return this.turmas.add(turma);
}
