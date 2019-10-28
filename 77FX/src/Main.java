import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

		veiculos.add(new Carro(199, 5, "Leaf", new Marca("Nissan", "Innovation that excites", 1933), "DEF456"));

		veiculos.add(new Bicicleta(30, 1, "Caloi700", new Marca("Caloi", "Movimentando a Vida", 1948), false));

		System.out.println(veiculos);

	}

}
