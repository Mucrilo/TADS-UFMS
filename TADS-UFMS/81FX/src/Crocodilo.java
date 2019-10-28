
public class Crocodilo extends Animal {

	private final String familia = "Crocodylidae";
	private static int quantidade = 0;

	public Crocodilo() {

		super("crocodilo" + (++quantidade));
	}

	public String getFamilia() {

		return this.familia;
	}

}
