
public class Tempo implements Comparable<Tempo>{
	
	private int horas;
	private int minutos;
	private int segundos;
	
	public Tempo () {
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	
	public Tempo(Tempo tempo) {
		
		this.horas = tempo.horas;
		this.minutos = tempo.minutos;
		this.segundos = tempo.segundos;
	}
	
	public Tempo(int horas, int minutos, int segundos) {
		
		if(horas < 0) {
			
			throw new IllegalArgumentException("Hora fora dos limites");
		}
		else {
			this.horas = horas;
		}
		
		if(minutos < 0 || minutos > 60) {
			
			throw new IllegalArgumentException("Minutos fora dos limites");
		}
		else {
			this.minutos = minutos;
		}
		
		if(segundos < 0 || segundos > 60) {
			
			throw new IllegalArgumentException("Segundos fora dos limites");
		}
		else {
			this.segundos = segundos;
		}
	}
	
	@Override
	public String toString() {
		
		return "{" + this.horas + " hora(s), "
				+ this.minutos + " minuto(s) e "
				+ this.segundos + " segundo(s)"
				+ "}";
	}
	
	public boolean equals(Tempo t) {
	
		if (this.horas == t.horas &&
			this.minutos == t.minutos &&
			this.segundos == t.segundos) {
			
			return true;
		}
		
		return false;
	}
	
	public int totalSegundos() {
		
		return segundos;
	}

	@Override
	public int compareTo(Tempo t) {
		if (this.horas < t.horas) {
			
			return -1;
		}
		else if (this.horas > t.horas) {
			
			return 1;
		}
		else if (this.minutos < t.minutos) {
			return -1;
		}
		else if (this.minutos > t.minutos) {
			return 1;
		}
		else if (this.segundos < t.segundos) {
			return -1;
		}
		else if (this.segundos > t.segundos) {
			return 1;
		}
		
		return 0;
		
	}
	
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
}

