class Main {
	public static void main(String[] args) {
		Marca marca1 = new Marca("Toyota", 1937);
		Marca marca2 = new Marca("Volkswagen", "Let's Go Places Moving Forward", 1937);
		Marca marca3 = new Marca("Nissan", "Innovation that excites", 1933);

		marca1.setSlogan(marca2);
		marca2.setAnoFundacao(2000);

		Veiculo veiculo1 = new Veiculo(199, 5, "Corolla", marca1);
		Veiculo veiculo2 = new Veiculo(200, 5, "Leaf", marca3);

		System.out.println(veiculo1);
		System.out.println(veiculo2);

	}
}