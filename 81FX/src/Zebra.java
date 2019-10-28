
public class Zebra extends Animal {

	private final String familia = "Equidae";
	private static int quantidade = 0;

	public Zebra() {

		super("zebra" + (++quantidade));
	}

	public String getFamilia() {

		return this.familia;
	}

}
