import java.util.Stack;

//importar pacote java.util.Stack

class Main {
	public static void main(String[] args) {
		// Declarar e Instanciar uma Stack pilha
		Stack<String> palavras = new Stack<String>();

		// Empilhar as Strings:

		// Espanha
		palavras.push("Espanha");

		// Alemanha
		palavras.push("Alemanha");

		// Argentina
		palavras.push("Argentina");

		// Brasil
		palavras.push("Brasil");

		// China
		palavras.push("China");

		// Enquanto a pilha não estiver vazia, desempilhe e imprima um elemento dela

		while (!palavras.empty()) {
			System.out.println(palavras.pop());
		}

		// FIM
	}
}