
public class Zebra extends Animal implements Terrestre {

	private final String familia = "Equidae";
	private static int quantidade = 0;

	public Zebra() {

		super("zebra" + (++quantidade));
	}

	public String getFamilia() {

		return this.familia;
	}

	public int caminhar() {

		return 4;
	}

	@Override
	public String toString() {
		return "{familia=" + getFamilia() + ", id=" + getId() + ", caminhar():" + caminhar() + "}";
	}
}
