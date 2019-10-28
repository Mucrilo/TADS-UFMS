import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Turma> turmas = new ArrayList<Turma>();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		int quantidadeDeTurmas = teclado.nextInt();
		teclado.nextLine();
		
		for (int indice = 0; indice < quantidadeDeTurmas; indice++) {
			
			Turma turma = new Turma(teclado.nextLine(), teclado.nextLine(), teclado.nextLine()); 
			turmas.add(turma);
		}
		
		//teclado.next();
		
		int quantidadeDeAlunos = teclado.nextInt();
		teclado.nextLine();
		
		for (int indice = 0; indice < quantidadeDeAlunos; indice++) {
			
			int quantidadeDeTurmasDoAluno;
			Aluno aluno = new Aluno();
			
			aluno.setNome(teclado.nextLine());
			aluno.setRga(teclado.nextLine());
			
			quantidadeDeTurmasDoAluno = teclado.nextInt();
			teclado.nextLine();
			
			for (int indiceTurmas = 0; indiceTurmas < quantidadeDeTurmasDoAluno; indiceTurmas++) {
				
				String sigla = teclado.nextLine();
				
				for (Turma buscaTurma : turmas) {
					if(buscaTurma.getSigla().equals(sigla)) {
						aluno.addTurmas(buscaTurma);
					}
				}
			}
			alunos.add(aluno);
		}
		
		System.out.println(alunos);
		
		teclado.close();
	}
}
