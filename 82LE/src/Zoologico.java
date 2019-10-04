import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Zoologico {

	List<Animal> animais;

	List<Aquatico> ambienteAquatico;
	List<Terrestre> ambienteTerrestre;
	List<Animal> ambienteGeral;

	public Zoologico() {
		this.animais = new LinkedList<Animal>();
		this.ambienteAquatico = new LinkedList<Aquatico>();
		this.ambienteTerrestre = new LinkedList<Terrestre>();
		this.ambienteGeral = new LinkedList<Animal>();
	}

	public boolean addAnimal(Animal animal) {

		if ((animal instanceof Terrestre) && (animal instanceof Aquatico)) {

			return ambienteGeral.add(animal);

		} else if (animal instanceof Terrestre) {

			return ambienteTerrestre.add((Terrestre) animal);

		} else if (animal instanceof Aquatico) {

			return ambienteAquatico.add((Aquatico) animal);
		}

		return ambienteGeral.add(animal);
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	public void ordenarAnimais() {

		Collections.sort(animais);
	}

	@Override
	public String toString() {
		return "Zoologico{ambienteTerrestre=[Animal" + ambienteTerrestre + "ambienteAquatico=[Animal" + ambienteAquatico
				+ "ambienteGeral=[Animal" + ambienteGeral + "}";
	}

}
