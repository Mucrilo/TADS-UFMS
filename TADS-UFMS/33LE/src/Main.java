import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado;
		int qntdNumeros, vetorInteiros[];
		
		teclado = new Scanner(System.in);
		
		qntdNumeros = teclado.nextInt();
		
		// le quantos itens no vetor e seus itens
		vetorInteiros = new int[qntdNumeros];
		
		for (int contadorDeEntradas = 0; contadorDeEntradas < qntdNumeros; contadorDeEntradas++)
		{
			vetorInteiros[contadorDeEntradas] = teclado.nextInt();
		}
		
		//Ordena vetor
		
		for(int x = 0; x < qntdNumeros; x++)
		{
			for(int y = 0; y < qntdNumeros-1; y++)
			{
				if(vetorInteiros[y] > vetorInteiros[y+1])
					troca(vetorInteiros, y);
			}
		}
		
		public void troca(int vetor[Inteiros])
		
		
		//printa vetor
		for(int contador = 0; contador < (qntdNumeros - 1); contador++)
		{
			System.out.print(vetorInteiros[(contador)] + ", ");
		}
		
		System.out.println(vetorInteiros[qntdNumeros - 1]);
}
}
