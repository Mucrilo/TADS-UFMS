

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
	
	/**
	 * @author Murilo Santos
	 * @param horas 0
	 * @param minutos 0-59
	 * @param segundos 0-59
	 * @throws IlleIllegalArgumentException
	 */
	public Tempo(int horas, int minutos, int segundos) {
		
		if(horas < 0) {
			
			throw new IllegalArgumentException("Hora fora dos limites");
		}
		else {
			this.horas = horas;
		}
		
		if(minutos < 0 || minutos > 59) {
			
			throw new IllegalArgumentException("Minutos fora dos limites");
		}
		else {
			this.minutos = minutos;
		}
		
		if(segundos < 0 || segundos > 59) {
			
			throw new IllegalArgumentException("Segundos fora dos limites");
		}
		else {
			this.segundos = segundos;
		}
	}
	
	@Override
	/**
	 * @author Murilo Santos
	 * @Override toString
	 */
	public String toString() {
		
		return "{" + this.horas + " hora(s), "
				+ this.minutos + " minuto(s) e "
				+ this.segundos + " segundo(s)"
				+ "}";
	}
	
	/**
	 * @author Murilo Santos
	 */
	public boolean equals(Tempo t) {
	
		if (this.horas == t.horas &&
			this.minutos == t.minutos &&
			this.segundos == t.segundos) {
			
			return true;
		}
		
		return false;
	}
	
	/**
	 * @author Murilo Santos
	 * @return Total de Segundos
	 */
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
	
	/**
	 * @author Murilo Santos
	 * @param horas 
	 * @throw IllegalArgumentException
	 */
	public void setHoras(int horas) {
		
		if (horas < 0) {
			throw new IllegalArgumentException("Hora fora dos limites");
		}
		else {
			this.horas = horas;
		}
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		
		if(minutos < 0 || minutos > 59) {
			
			throw new IllegalArgumentException("Minutos fora dos limites");
		}
		else {
			
			this.minutos = minutos;
		}
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		
		if (segundos < 0 || segundos > 59) {
			
			throw new IllegalArgumentException("Segundos fora dos limites");
		}
		else {
			
			this.segundos = segundos;
		}
	}
	
}

