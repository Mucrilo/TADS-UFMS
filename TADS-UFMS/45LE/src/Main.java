import javax.swing.text.Position;

public class Main {

	public static void main(String[] args) {
		
	quick(v, 0, v.length-1);	
	
		
	}
	
	
	int particiona(int v[], int i, int p) {
		
			pos = i, pivo = p;
			
			while(i < p && v[i] <= v[pivo]) {
				
				i++; pivo++;
				
			}
			
			while(i < p) {
				
				if(v[i] > v[pivo])
					i++;
				else {
					troca(i, pos);
					pos++;
					i++;
				}
			}	
			
			return pos;
		}

	}
	
	quick(int v[], int i, int f) {
		
		if (i >= f)
			return;
		
		int pivo = particiona(v, i, f)
		
		quick(v, i, pivo-1);
		
		quick(v, pivo+1, f);
	}


