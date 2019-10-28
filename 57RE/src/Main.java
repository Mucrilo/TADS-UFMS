import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		String nome = teclado.nextLine();
		
		while(!nome.equals("F")) {
			
			Aluno aluno = new Aluno(nome, teclado.nextLine());
			alunos.add(aluno);
			
			nome = teclado.nextLine();
		}
		
		Collections.sort(alunos);
		
		System.out.println(alunos);
	}
}
