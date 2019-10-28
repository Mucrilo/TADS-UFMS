import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Tempo time = new Tempo(teclado.nextInt(),
				teclado.nextInt(),
				teclado.nextInt());
		
		Tempo tempo = new Tempo(teclado.nextInt(),
				teclado.nextInt(),
				teclado.nextInt());
		
		//50FX
		//System.out.println(t);
		
		//51FX
		if (time.compareTo(tempo) == -1) {
			
			System.out.println("SIM");
		}
		else {
			System.out.println("NÂO");
		}
	}

}
