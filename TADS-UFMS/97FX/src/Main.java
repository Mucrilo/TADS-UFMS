import java.util.List;
class Main {
  public static void main(String[] args) {
    List<String> palavras = new Vetor<String>();
    
    palavras.add("A");
    palavras.add("B");
    palavras.add("C");
    palavras.add("D");
    palavras.add("E");
    palavras.add("F");
    palavras.add("G");
    palavras.add("H");
    palavras.add("I");
    palavras.add("J");
    palavras.add("K");
    palavras.add("L");
    palavras.add("M");
    
    
    palavras.remove(1);
    palavras.remove(2);

    System.out.println(palavras);

  }
}