import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    
		Scanner s = new Scanner(System.in);
	    int num1 = s.nextInt();
	    int num2 = s.nextInt();
	    int acumulador = 0;
	    
	    if((num1 % 2) == 0) {
	    	
	    	for(int contador = (num1 + 1); contador < num2; contador += 2) {
	    		
	    		acumulador += contador;
	    	}
	    } else {
	    	
	    	for(int contador = num1; contador < num2; contador += 2) {
	    		
	    		acumulador += contador;
	    }
	    
	    acumulador += num2;
	    
	    System.out.println(acumulador);
	    
	    }
	}
}