
public class Crocodilo extends Animal implements Terrestre, Aquatico {

	private final String familia = "Crocodylidae";
	private static int quantidade = 0;

	public Crocodilo() {

		super("crocodilo" + (++quantidade));
	}

	public String getFamilia() {

		return this.familia;
	}

	public int caminhar() {

		return 1;
	}

	public int nadar() {

		return 3;
	}
	
	@Override
	public String toString() {
		return "{familia=" + getFamilia() + 
				", id=" + getId() + 
				", caminhar():" + caminhar() + 
				", nadar():" + nadar() +
				"}";
	}

}
