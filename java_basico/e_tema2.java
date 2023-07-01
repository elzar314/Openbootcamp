import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);

    System.out.print("Ingresa el precio y te devuelvo con IVA: ");
	  double precio = s.nextDouble();
    System.out.println("El precio con IVA es "+precioConIVA(precio));

  }
  
    static double precioConIVA(double precio){
      //En mi pais el IVA es el 18%
      return precio=precio*1.18;
    }
}
