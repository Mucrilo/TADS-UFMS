
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

	public Bicicleta(Bicicleta bicicleta) {

		super();
		this.setMarca(bicicleta.getMarca());
		this.setModelo(bicicleta.getModelo());
		this.setQtdMaximaPassageiros(bicicleta.getQtdMaximaPassageiros());
		this.setVelocidadeMaxima(bicicleta.getVelocidadeMaxima());
		this.eletrica = bicicleta.getEletrica();

	}

	public boolean getEletrica() {
		return eletrica;
	}

	public void setEletrica(boolean eletrica) {
		this.eletrica = eletrica;
	}

}
