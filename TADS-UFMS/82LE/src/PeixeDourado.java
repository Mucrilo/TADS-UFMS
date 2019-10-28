
public class PeixeDourado extends Animal implements Aquatico {

	private final String familia = "Cyprinidae";
	private static int quantidade = 0;

	public PeixeDourado() {

		super("peixeDourado" + (++quantidade));
	}

	public String getFamilia() {

		return this.familia;
	}

	public int nadar() {

		return 2;
	}
	
	@Override
	public String toString() {
		return "{familia=" + getFamilia() + 
				", id=" + getId() + 
				", caminhar():" + nadar() + 
				"}";
	}
}
