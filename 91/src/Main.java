import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Main {
	public static void main(String[] args) {

		Map<String, String> mapaStringString = new HashMap<String, String>();

		// Empilhar as Strings:

		// Espanha
		mapaStringString.put("Espanha", "Madri");

		// Alemanha
		mapaStringString.put("Alemanha", "Berlim");

		// Argentina
		mapaStringString.put("Argentina", "Buenos Aires");

		// Brasil
		mapaStringString.put("Brasil", "Brasilia");

		// China
		mapaStringString.put("China", "Pequim");

		System.out.println(mapaStringString.get("Alemanha"));
		System.out.println(mapaStringString.get("Brasil"));

		// FIM
	}
}