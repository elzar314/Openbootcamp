class Main {
  //Esta es la clase Main donde se llamarán los ejercicios y se mostrarán los resultados
  public static void main(String[] args) {
  
  int resultado1 = suma(1,2,3);
    System.out.println("El resultado del primer ejercicio es "+resultado1);

    Coche coche1 = new Coche();
    coche1.aumentarPuertas(4);

    System.out.print("El numero de puertas del coche es "+coche1.getpuertas());
    
  }
  //Este es la primera función
  public static int suma(int a,int b,int c){
  return a+b+c;
  }

  //Esta es la clase coche
  public static class Coche {
    int puertas = 0;
    public void aumentarPuertas(int puertas){
      this.puertas+=puertas;
    }
    public int getpuertas(){
      return this.puertas;
    }
  }
}
