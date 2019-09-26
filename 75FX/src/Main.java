class Main {
	public static void main(String[] args) {
		Marca marca1 = new Marca("Nissan", "Innovation that excites", 1933);
		Marca marca2 = new Marca("Caloi", "Movimentando a Vida", 1948);

		Carro carro = new Carro(200, 5, "Leaf", marca1, "DEF456");
		Bicicleta bicicleta = new Bicicleta(30, 1, "Caloi700", marca2, false);

		System.out.println(carro.getVelocidadeMaxima());
		System.out.println(carro.getPlaca());

		System.out.println(bicicleta);

	}
}