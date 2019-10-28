import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Zoologico {

	List<Animal> animais;

	public Zoologico() {
		this.animais = new LinkedList<Animal>();
	}

	public boolean addAnimal(Animal a) {
		return this.animais.add(a);
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
		return "Zoologico{animais=" + animais + "}";
	}

}
