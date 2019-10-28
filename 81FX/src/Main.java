
public class Main {

	public static void main(String[] args) {
		Zoologico meuZoologico = new Zoologico();

		// Adicionar animais ao zoológico
		meuZoologico.addAnimal(new Zebra());
		meuZoologico.addAnimal(new Zebra());
		meuZoologico.addAnimal(new PeixeDourado());
		meuZoologico.addAnimal(new Crocodilo());
		meuZoologico.addAnimal(new Zebra());
		meuZoologico.addAnimal(new PeixeDourado());

		// Organizá-los
		meuZoologico.ordenarAnimais();

		// Visualizar o zoologico
		System.out.println(meuZoologico);

	}

}
