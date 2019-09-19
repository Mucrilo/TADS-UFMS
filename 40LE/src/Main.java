import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);;
		
		int quantidadeDeTurmas = teclado.nextInt(); teclado.nextLine();
		
		Colecao colecaoTurmas = new Colecao(quantidadeDeTurmas);
		
		for(int i = 0; i < quantidadeDeTurmas; i++) {
			
			String nomeDaDisciplina = teclado.nextLine();
			
			int quantidadeDeAlunos = teclado.nextInt(); teclado.nextLine();
			
			Turma turma = new Turma(nomeDaDisciplina, quantidadeDeAlunos);
			
			colecaoTurmas.adicionarTurma(turma);
		}
		
		colecaoTurmas.selectionSort();
		
		System.out.println(colecaoTurmas);
		System.out.println("FIM");
	}

}
