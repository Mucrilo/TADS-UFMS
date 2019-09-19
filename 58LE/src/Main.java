import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList<Turma> turmas = new ArrayList<Turma>();
		
		int quantidadeDeAlunos = teclado.nextInt();
		teclado.nextLine();
		
		for (int indice = 0; indice < quantidadeDeAlunos; indice++) {
			
			alunos.add(new Aluno(teclado.nextLine(),
									teclado.nextLine()));
		}
		
		int quantidadeDeTurmas = teclado.nextInt();
		teclado.nextLine();
		
		for (int indice = 0; indice < quantidadeDeTurmas; indice++) {
			
			int quantidadeDeAlunosDaTurma;
			Turma turma = new Turma();
			
			turma.setDisciplina(teclado.nextLine());
			turma.setSigla(teclado.nextLine());
			turma.setProfessor(teclado.nextLine());
			
			quantidadeDeAlunosDaTurma = teclado.nextInt();
			teclado.nextLine();
			
			for (int indiceTurmas = 0; indiceTurmas < quantidadeDeAlunosDaTurma; indiceTurmas++) {
				
				String rga = teclado.nextLine();
				
				for (Aluno buscaAluno : alunos) {
					if(buscaAluno.getRga().equals(rga)) {
						turma.addAlunos(buscaAluno);
					}
				}
			}
			turmas.add(turma);
		}
		
		System.out.println(turmas);
		
		teclado.close();
	}
}
