import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String palavra = teclado.nextLine();
		
		int indice = teclado.nextInt();
		
		System.out.print(palavra.charAt(5));
		System.out.print(palavra.charAt(8));
		System.out.print(palavra.charAt(1));
		System.out.println(palavra.charAt(indice));
		
		teclado.close();
	}

}