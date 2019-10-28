import java.util.List;

class Main {
  public static void main(String[] args) {
    List<Pessoa> pessoas = new Vetor<Pessoa>();
    
    pessoas.add(new Pessoa("Marco", 27));
    pessoas.add(new Pessoa("Nadia", 52));
    pessoas.add(new Pessoa("Marcelino", 34));

    System.out.println(pessoas);

  }
}