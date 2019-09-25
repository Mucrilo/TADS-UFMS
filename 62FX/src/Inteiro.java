
public class Inteiro implements Comparable<Inteiro> {
	
	private int inteiro;
	
	public Inteiro() {
		
		this.inteiro = 0;
	}
	
	public Inteiro(int inteiro) {
		
		this.inteiro = inteiro;
	}
	
	public Inteiro(Inteiro inteiro) {
		
		this.inteiro = inteiro.getInteiro();
	}
	
	@Override
	public int compareTo(Inteiro inteiro) {
	
		return (this.inteiro - inteiro.getInteiro());
	}
	
	@Override
	public boolean equals(Object inteiroObject) {
		
		if (inteiroObject == null) {
			return false;
		}
		else if (inteiroObject.getClass() != this.getClass()) {
			return false;
		}
		else {
			Inteiro inteiroInt = (Inteiro)inteiroObject;
			if (this.inteiro == inteiroInt.getInteiro()) {
				return true;
				}
			}
		return false;
		}

	@Override
	public String toString() {
		return String.valueOf(inteiro);
	}

	public int getInteiro() {
		return inteiro;
	}

	public void setInteiro(int inteiro) {
		this.inteiro = inteiro;
	}
}
