
public class Veiculo implements Comparable<Veiculo> {

	private int velocidadeMaxima;
	private int qtdMaximaPassageiros;
	private String modelo;
	private Marca marca;

	public Veiculo() {

		this.velocidadeMaxima = 30;
		this.qtdMaximaPassageiros = 5;
		this.modelo = "";
		this.marca = new Marca();
	}

	public Veiculo(int velocidadeMaxima, int qtdMaximaPassageiros, String modelo) {

		this.velocidadeMaxima = velocidadeMaxima;
		this.qtdMaximaPassageiros = qtdMaximaPassageiros;
		this.modelo = modelo;
	}

	public Veiculo(int velocidadeMaxima, int qtdMaximaPassageiros, String modelo, Marca marca) {

		this.velocidadeMaxima = velocidadeMaxima;
		this.qtdMaximaPassageiros = qtdMaximaPassageiros;
		this.modelo = modelo;
		this.marca = marca;
	}

	public Veiculo(Veiculo veiculo) {

		this.velocidadeMaxima = veiculo.getVelocidadeMaxima();
		this.qtdMaximaPassageiros = veiculo.getQtdMaximaPassageiros();
		this.modelo = veiculo.getModelo();
		this.marca = veiculo.getMarca();
	}

	public double getTaxa() {

		return 0;
	}

	@Override
	public int compareTo(Veiculo veiculo) {

		return this.modelo.compareTo(veiculo.getModelo());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + qtdMaximaPassageiros;
		result = prime * result + velocidadeMaxima;
		return result;
	}

	@Override
	public String toString() {
		return "velocidadeMaxima: " + velocidadeMaxima + ", qtdMaximaPassageiros: " + qtdMaximaPassageiros
				+ ", modelo: " + modelo + ", marca: " + marca + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (qtdMaximaPassageiros != other.qtdMaximaPassageiros)
			return false;
		if (velocidadeMaxima != other.velocidadeMaxima)
			return false;
		return true;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getQtdMaximaPassageiros() {
		return qtdMaximaPassageiros;
	}

	public void setQtdMaximaPassageiros(int qtdMaximaPassageiros) {
		this.qtdMaximaPassageiros = qtdMaximaPassageiros;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}
