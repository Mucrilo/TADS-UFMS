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
    
    
    System.out.println(palavras.isEmpty());
    System.out.println(palavras.indexOf("G"));
    System.out.println(palavras.set(6,"Z"));
    System.out.println(palavras.indexOf("G"));
    palavras.clear();
    System.out.println(palavras.isEmpty());
    

  }
}