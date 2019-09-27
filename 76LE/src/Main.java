class Main {
  public static void main(String[] args) {
    Marca marca1  = new Marca("Nissan", "Innovation that excites",
    		1933);

    Veiculo bicicleta1 = new Bicicleta(31, 1,
    		"Caloi700", marca1, false);
    Veiculo bicicleta2 = new Bicicleta(31, 1,
    		"Moov100", marca1, true);
    
    System.out.println(bicicleta1.getVelocidadeMaxima());
    System.out.println(bicicleta2.getVelocidadeMaxima());
    
    
  }
}