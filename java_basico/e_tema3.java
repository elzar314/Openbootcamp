public class Main {
  public static void main(String[] args) {
  
    String [] autos = {"Toyota","Mercedes","Nisan","Ferrari","Lamborgini","Ford","Audi","Lexus"};
    
    System.out.print("Algunas marcas de autos famosos son: ");
    
    for(int i=0;i<autos.length;i++){
        System.out.print(autos[i]);
        if(i<(autos.length-2)){
        System.out.print(", ");
        }else if(i==autos.length-2){
            System.out.print(" y ");
        }else{
            System.out.print(".");
        }
    }

  }
