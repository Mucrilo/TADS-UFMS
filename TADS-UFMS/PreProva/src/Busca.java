
public class Busca {

		public boolean binaria (int vetor[], int inicio, int fim, int busca) {
			
			int meio = (inicio + fim) / 2;
			
			
			if(inicio > fim)
				return false;
			
			if(vetor[meio] == busca)
				return true;
			
			
			
			if (vetor[meio] < busca) {
				 return binaria(vetor, inicio, meio, busca);
			}
			else {
				return binaria(vetor, meio+1, fim, busca);
			}
			
		}
}
