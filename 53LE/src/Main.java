import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Tempo> lista = new ArrayList<Tempo>();
		
		int qntd = teclado.nextInt();
		
		for (int i = 0; i < qntd; i++) {
			
			lista.add(new Tempo(teclado.nextInt(),
					teclado.nextInt(),
					teclado.nextInt()));
		}
		
		Collections.sort(lista);
		
		System.out.println(lista);
	}
}
