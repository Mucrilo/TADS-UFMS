import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<String> palavras = new ArrayList<String>();

	    palavras.add("AR");
	    palavras.add("BR");
	    palavras.add("JP");
	    palavras.add("US");
	  
	    Scanner scanner = new Scanner(System.in);
	    
	    String busca = scanner.nextLine();
	    
	    int indexOfBusca = -1;
	    
	    for (String buscaString : palavras) {
    		
        	if(buscaString.equals(busca)) {
        		System.out.println(true);
        		indexOfBusca = palavras.indexOf(buscaString);
        	}
        }
	    
	    if (indexOfBusca == -1) {
			System.out.println(false);
		}
	    
	    System.out.println(indexOfBusca);
	    
	scanner.close(); 
	}
}