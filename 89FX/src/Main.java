import java.util.LinkedList;
import java.util.Queue;

class Main {
	public static void main(String[] args) {

		Queue<String> palavras = new LinkedList<String>();

		// Empilhar as Strings:

		// Espanha
		palavras.add("Espanha");

		// Alemanha
		palavras.add("Alemanha");

		// Argentina
		palavras.add("Argentina");

		// Brasil
		palavras.add("Brasil");

		// China
		palavras.add("China");

		// Enquanto a pilha não estiver vazia, desempilhe e imprima um elemento dela

		while (!palavras.isEmpty()) {
			System.out.println(palavras.remove());
		}

		// FIM
	}
}