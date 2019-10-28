class Main {
	public static void main(String[] args) {
		Marca marca1 = new Marca("Toyota", 1937);
		Marca marca2 = new Marca("Volkswagen", "Let's Go Places Moving Forward", 1937);
		Marca marca3 = new Marca("Nissan", "Innovation that excites", 1933);

		marca1.setSlogan(marca2);
		marca2.setAnoFundacao(2000);

		System.out.println(marca1);
		System.out.println(marca2);
		System.out.println(marca3);

	}
}