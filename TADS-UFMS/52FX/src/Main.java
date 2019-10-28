import java.util.ArrayList;
import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		ArrayList<Tempo> listaTempos = new ArrayList<Tempo>();
		
		Scanner sc = new Scanner(System.in);
		
		Tempo t1 = new Tempo(sc.nextInt(), sc.nextInt(), sc.nextInt());
		Tempo t2 = new Tempo(sc.nextInt(), sc.nextInt(), sc.nextInt());
		Tempo t3 = new Tempo(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		listaTempos.add(t1);
		listaTempos.add(t2);
		listaTempos.add(t3);
		
		System.out.println(listaTempos);
		

	}

}
