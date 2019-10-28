import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Aluno aluno = new Aluno(teclado.nextLine(), teclado.nextLine());
		
		System.out.println(aluno);

	}

}
