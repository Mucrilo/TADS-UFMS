import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    
    alunos.add(new Aluno("Leonardo", "201401"));
    alunos.add(new Aluno("Marilia", "201502"));
    alunos.add(new Aluno("Fabiano", "201501"));
    
    Scanner scanner = new Scanner(System.in);
    //Leia um Aluno
    Aluno buscado = new Aluno(scanner.next(), scanner.next());
    
    
    //Imprima se a Lista contém o Aluno
    System.out.println(alunos.contains(buscado));
    
    //Imprima o indíce do aluno
    System.out.println(alunos.indexOf(buscado));
    
    scanner.close();
  }
}


/*
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> inteiro = new ArrayList<Integer>();
		
		inteiro.add(2);
		inteiro.add(5);
		
		int busca = 3;
		
		System.out.println(inteiro.contains(busca));
		
		System.out.println(inteiro.indexOf(busca));
		
	}
}
*/