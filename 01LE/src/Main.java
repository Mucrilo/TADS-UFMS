import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num1 = s.nextInt();
    int num2 = s.nextInt();
    
    int soma = 0;
    
    if (num1 % 2 == 0) {
		num1++;
	}
    
    for (int i = num1; i <= num2; i += 2) {
		
		soma += i;
	}
    
    System.out.println(soma);
    
  }
}