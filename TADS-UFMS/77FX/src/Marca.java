
public class Marca implements Comparable<Marca> {

	private String nomeFantasia;
	private String slogan;
	private int anoFundacao;

	public Marca() {

		this.nomeFantasia = "";
		this.slogan = "";
		this.anoFundacao = 2019;
	}

	public Marca(String nomeFantasia, String slogan, int anoFundacao) {

		this.nomeFantasia = nomeFantasia;
		this.slogan = slogan;

		if (anoFundacao < 1500) {
			throw new IllegalArgumentException("Ano fora dos limites");
		} else {
			this.anoFundacao = anoFundacao;
		}
	}

	public Marca(String nomeFantasia, int anoFundacao) {

		this.nomeFantasia = nomeFantasia;
		if (anoFundacao < 1500) {
			throw new IllegalArgumentException("Ano fora dos limites");
		} else {
			this.anoFundacao = anoFundacao;
		}

		this.slogan = "";
	}

	public Marca(Marca marca) {

		this.nomeFantasia = marca.getNomeFantasia();
		this.slogan = marca.getSlogan();
		this.anoFundacao = marca.getAnoFundacao();
	}

	@Override
	public int compareTo(Marca marca) {

		return (this.anoFundacao - marca.getAnoFundacao());
	}

	@Override
	public String toString() {
		return "{nomeFantasia: " + nomeFantasia + ", slogan: " + slogan + ", anoFundacao: " + anoFundacao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anoFundacao;
		result = prime * result + ((nomeFantasia == null) ? 0 : nomeFantasia.hashCode());
		result = prime * result + ((slogan == null) ? 0 : slogan.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marca other = (Marca) obj;
		if (anoFundacao != other.anoFundacao)
			return false;
		if (nomeFantasia == null) {
			if (other.nomeFantasia != null)
				return false;
		} else if (!nomeFantasia.equals(other.nomeFantasia))
			return false;
		if (slogan == null) {
			if (other.slogan != null)
				return false;
		} else if (!slogan.equals(other.slogan))
			return false;
		return true;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public void setSlogan() {
		this.slogan = "";
	}

	public void setSlogan(Marca marca) {
		this.slogan = marca.getSlogan();
	}

	public int getAnoFundacao() {
		return anoFundacao;
	}

	public void setAnoFundacao(int anoFundacao) {
		if (anoFundacao < 1500) {
			throw new IllegalArgumentException("Ano fora dos limites");
		} else {
			this.anoFundacao = anoFundacao;
		}
	}

}
