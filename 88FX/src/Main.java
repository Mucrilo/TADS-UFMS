import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Main {
	public static void main(String[] args) {

		List<String> listaLigada = new LinkedList<String>();

		List<String> listaSequencial = new ArrayList<String>();

		// Empilhar as Strings:

		// Espanha
		listaLigada.add("Espanha");
		listaSequencial.add("Espanha");

		// Alemanha
		listaLigada.add("Alemanha");
		listaSequencial.add("Alemanha");

		// Argentina
		listaLigada.add("Argentina");
		listaSequencial.add("Argentina");

		// Brasil
		listaLigada.add("Brasil");
		listaSequencial.add("Brasil");

		// China
		listaLigada.add("China");
		listaSequencial.add("China");

		// Enquanto a pilha não estiver vazia, desempilhe e imprima um elemento dela

		while (!listaLigada.isEmpty()) {
			System.out.println(listaLigada.remove(0));
		}

		while (!listaSequencial.isEmpty()) {
			System.out.println(listaSequencial.remove(0));
		}

		// FIM
	}
}