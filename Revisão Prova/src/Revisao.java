import java.util.Arrays;

public class Revisao {

	public static void main(String[] args) {
		
		int v[] = {16, 12, 4, 8, 3, 74, 5, 1, 6};
		
		//insertionSort(v);
		//bubbleSort(v);
		mergeSort(v);
		
		System.out.println(Arrays.toString(v));
		
		
		/*if(buscaBinaria(v, 10)) {
			System.out.println("TEM");
		}
		else {
			System.out.println("N TEM");
		}*/
	}
	
	
	public static boolean buscaBinaria(int v[], int busca) {
		
		if(buscaBinaria(v, 0, v.length-1, busca) == -1)
			return false;
		else {
			return true;
		}
	}
	
	public static int buscaBinaria(int v[], int menorIndice, int maiorIndice, int busca) {
		
		int meio = (menorIndice + maiorIndice) / 2;
		
		if(menorIndice > maiorIndice) {
			return -1;
		}
		if(v[meio] == busca) {
			return meio;
		}
		else {
			if (v[meio] > busca){
			return buscaBinaria(v, menorIndice, meio-1, busca);
			}
			else {
				return buscaBinaria(v, meio+1, maiorIndice, busca);
			}
		}
	}
	
	public static void selectionSort() {
		
	}
	
	public static void bubbleSort(int v[]) {
		
		for (int i = 0; i < v.length-1; i++) {
			for (int j = 0; j < v.length-1; j++) {
				if (v[j] > v[j+1]) {
					troca(v, j, j+1);
				}
			}
		}
	}
	
	public static void insertionSort(int v[]) {
		
		for (int i = 1; i < v.length; i++) {
			
			int j = i;
			
			while (j > 0 && v[j] < v[j-1]) {
				
				troca(v, j, j-1);
				
				j--;
			}
		}
	}
	
	public static void mergeSort(int v[]) {
		
		mergeSort(v, 0, v.length-1);
	}
	
	public static void mergeSort(int v[], int inicio, int fim) {
		
		if (inicio >= fim) {
			return;
		}
		
		int meio = (inicio + fim) / 2;
		
		mergeSort(v, inicio, meio);
		mergeSort(v, meio+1, fim);
		
		combina(v, inicio, meio, fim);
	}
	
	public static void combina(int v[], int inicio, int meio, int fim) {
		
		int esquerda = inicio;
		int direita = meio + 1;
		int indice= inicio;
		int aux[] = new int[v.length];
		
		for (int i = 0; i < v.length; i++) {
			aux[i] = v[i];
		}
		
		while(esquerda <= meio && direita <= fim) {
			
			if (aux[esquerda] < aux[direita]) {
				v[indice] = aux[esquerda];
				esquerda++; 
				indice++;
			}
			else {
				v[indice] = aux[direita];
				direita++;
				indice++;
			}
		}
		
		while(esquerda <= meio) {
			v[indice] = aux[esquerda];
			esquerda++;
			indice++;
		}
		
		while(direita <= fim) {
			v[indice] = aux[direita];
			direita++;
			indice++;
		}
	}
	
	public static void troca(int v[], int i, int j) {
		
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
	
	public static void troca(String v[], int i, int j) {
		
		String aux = v[i];
		v[i] = v[j];
		v[j]= aux; 
	}

}
