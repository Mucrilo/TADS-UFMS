
public class PeixeDourado extends Animal {

	private final String familia = "Cyprinidae";
	private static int quantidade = 0;

	public PeixeDourado() {

		super("peixeDourado" + (++quantidade));
	}

	public String getFamilia() {

		return this.familia;
	}

}
