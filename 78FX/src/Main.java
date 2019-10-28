import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		Marca marca1 = new Marca("Nissan", "Innovation that excites", 1933);
		Marca marca2 = new Marca("Caloi", "Movimentando a Vida", 1948);
		Marca marca3 = new Marca("Honda", "The Power of Dreams", 1946);

		Veiculo carro = new Carro(199, 5, "Leaf", marca1, "DEF456");
		Veiculo bicicleta1 = new Bicicleta(30, 1, "Caloi700", marca2, false);
		Veiculo bicicleta2 = new Bicicleta(30, 1, "ProMax", marca2, true);
		Veiculo moto = new Motocicleta(120, 2, "Pop100", marca3, "ABC321");
		Veiculo veiculo = new Veiculo(10, 10, "", null);

		System.out.println(carro.getTaxa());
		System.out.println(bicicleta1.getTaxa());
		System.out.println(bicicleta2.getTaxa());
		System.out.println(moto.getTaxa());
		System.out.println(carro.getTaxa());
		System.out.println(veiculo.getTaxa());

	}
}