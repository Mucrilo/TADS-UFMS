import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String palavra = teclado.nextLine();
		int indice = teclado.nextInt();
		
		teclado.nextLine();
		
		String palavra2 = teclado.nextLine();
		int indice2 = teclado.nextInt();
		
		System.out.println(palavra.substring(0, indice));
		System.out.println(palavra2.substring(0, indice2));
		
		teclado.close();
	}
}