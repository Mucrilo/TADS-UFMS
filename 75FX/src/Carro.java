
public class Carro extends Veiculo {

	private String placa;

	public Carro() {

		super();
		this.placa = "ERR0404";
	}

	public Carro(String placa) {

		super();
		this.placa = placa;
	}

	public Carro(Carro carro) {

		super();
		this.
		this.placa = carro.getPlaca();
	}

	@Override
	public String toString() {
		return "Carro [placa=" + placa + "]";
	}

	@Override
	public int compareTo() {
		// TODO Auto-generated method stub
		return 0;
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
		Carro other = (Carro) obj;
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

}
