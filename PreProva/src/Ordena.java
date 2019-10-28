
public class Ordena {

	public void selectionSort(int vetor[]) {
		
		int menor;
		
		for(int i = 0; i < vetor.length; i++) { /* Quantos elementos ordenados no vetor (i) */
			
			menor = i;
				
			for(int j = i + 1; i < vetor.length; i++) {	/* j varre o sub vetor nao ordenado */
				
				if (vetor[j] < vetor[menor]) {
					
					menor = j;
				}
			}
			
			troca(vetor, i, menor);
		}
	}
	
	public void troca(int vetor[], int i, int j) {
		
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}
	
	public void troca(String vetor[], int i, int j) {
		
		String aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}
}


