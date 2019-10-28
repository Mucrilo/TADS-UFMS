
public class Bicicleta extends Veiculo {

	private boolean eletrica;

	public Bicicleta() {

		super();
		this.eletrica = false;
	}

	public Bicicleta(boolean eletrica) {

		super();
		this.eletrica = eletrica;
	}

	public Bicicleta(int velocidadeMaxima, int qtdMaximaPassageiros, String modelo, Marca marca, boolean eletrica) {

		super();

		setVelocidadeMaxima(velocidadeMaxima);
		setQtdMaximaPassageiros(qtdMaximaPassageiros);
		setModelo(modelo);
		setMarca(marca);
		this.eletrica = eletrica;
	}

	public Bicicleta(Bicicleta bicicleta) {

		super();
		this.setMarca(bicicleta.getMarca());
		this.setModelo(bicicleta.getModelo());
		this.setQtdMaximaPassageiros(bicicleta.getQtdMaximaPassageiros());
		this.setVelocidadeMaxima(bicicleta.getVelocidadeMaxima());
		this.eletrica = bicicleta.getEletrica();

	}

	public double getTaxa() {

		if (getEletrica()) {
			return 125;
		} else {
			return 15;
		}
	}

	@Override
	public int getVelocidadeMaxima() {

		if (eletrica) {

			if (super.getVelocidadeMaxima() > 30) {
				return 30;
			} else {
				return super.getVelocidadeMaxima();
			}
		} else {
			return super.getVelocidadeMaxima();
		}

	}

	public boolean getEletrica() {
		return eletrica;
	}

	public void setEletrica(boolean eletrica) {
		this.eletrica = eletrica;
	}

	@Override
	public String toString() {
		return "{velocidadeMaxima: " + getVelocidadeMaxima() + ", qtdMaximaPassageiros: " + getQtdMaximaPassageiros()
				+ ", modelo: " + getModelo() + ", eletrica: " + eletrica + ", marca:{" + "nomeFantasia: "
				+ getMarca().getNomeFantasia() + ", slogan: " + getMarca().getSlogan() + ", anoFundacao: "
				+ getMarca().getAnoFundacao() + "}}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (eletrica ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bicicleta other = (Bicicleta) obj;
		if (eletrica != other.eletrica)
			return false;
		return true;
	}

	public int compareTo(Bicicleta bicicleta) {

		if (this.eletrica && bicicleta.getEletrica()) {
			return 0;
		} else if (this.eletrica) {
			return 1;
		} else {
			return -1;
		}
	}
}
