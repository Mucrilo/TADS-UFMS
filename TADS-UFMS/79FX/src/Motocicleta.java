
public class Motocicleta extends Veiculo implements Emplacavel {

	private String placa;

	public Motocicleta() {

		super();
		this.placa = "ERR0404";
	}

	public Motocicleta(String placa) {

		super();
		this.placa = placa;
	}

	public Motocicleta(int velocidadeMaxima, int qtdMaximaPassageiros, String modelo, Marca marca, String placa) {

		super();
		setVelocidadeMaxima(velocidadeMaxima);
		setQtdMaximaPassageiros(qtdMaximaPassageiros);
		setModelo(modelo);
		setMarca(marca);
		this.placa = placa;
	}

	public Motocicleta(Motocicleta motocicleta) {

		super();
		this.setMarca(motocicleta.getMarca());
		this.setModelo(motocicleta.getModelo());
		this.setQtdMaximaPassageiros(motocicleta.getQtdMaximaPassageiros());
		this.setVelocidadeMaxima(motocicleta.getVelocidadeMaxima());
		this.placa = motocicleta.getPlaca();
	}

	@Override
	public String toString() {
		return "{velocidadeMaxima: " + getVelocidadeMaxima() + ", qtdMaximaPassageiros: " + getQtdMaximaPassageiros()
				+ ", modelo: " + getModelo() + ", placa: " + placa + ", marca: {" + "nomeFantasia: "
				+ getMarca().getNomeFantasia() + ", slogan: " + getMarca().getSlogan() + ", anoFundacao: "
				+ getMarca().getAnoFundacao() + "}}";
	}

	public int compareTo(Motocicleta motocicleta) {

		return this.placa.compareTo(motocicleta.placa);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
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
		Motocicleta other = (Motocicleta) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getTaxa() {

		return (this.getVelocidadeMaxima() + 30);
	}
}
