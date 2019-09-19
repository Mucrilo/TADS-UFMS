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
    
    busca(scanner.nextLine());
    
}
    public boolean busca(String palavra) {
    	
    	for (String buscaString : palavras) {
    		
        	if(buscaString.equals(busca)) {
        		return true;
        	}
    	}
    }
   
  }