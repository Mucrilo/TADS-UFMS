
public class Panda extends Animal implements Terrestre {
	private final String familia = "Ursidae";
	private static int quantidade = 0;
	private int caminhar;

	public Panda(int caminhar) {
		super("Panda" + ++quantidade);
		this.caminhar = caminhar;
	}

	public String getFamilia() {

		return this.familia;
	}

	public int caminhar() {

		return 0;
	}

}
