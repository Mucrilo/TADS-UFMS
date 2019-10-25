import java.util.*;

class Main {
  public static void main(String[] args) {
    List<String> palavras = new Vetor<String>();
    
    palavras.add("M");    
    palavras.add("J");
    palavras.add("D");
    palavras.add("E");
    palavras.add("F");
    palavras.add("G");
    palavras.add("H");
    palavras.add("I");
    palavras.add("B");
    palavras.add("C");
    palavras.add("K");
    palavras.add("L");
    palavras.add("A");
    
    for (String palavra : palavras) {
      System.out.println(palavra);
    }
    
    ListIterator<String> iterador = palavras.listIterator();

    while(iterador.hasNext()) {
      String palavra = iterador.next();
      System.out.print(palavra + " ");
    }

  }
}