import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String word;
		
		for (int i = 0; i < 1; i++) {
			
			word = teclado.nextLine();
			
			if (word.endsWith("ey")) {
				System.out.println("-eys");
			}
			else if (word.endsWith("y")) {
				System.out.println("-ies");
			}
			else if (word.endsWith("ife")) {
				System.out.println("-ives");
			}
			else {
				System.out.println("-s");
			}
		}
		
		teclado.close();
	}

}
