package eFinales;

public class ejercicio2 {
    public static void main(String[] args) {

        int [][] enteros = {{1,2,3,4,5,6,7,8,9},{10,20,30,40,50,60,70,80,90}};

            for(int[] fila : enteros){
                int i=0;
                for(int elemento : fila) {
                    System.out.print("Posición: "+i+" Valor: "+elemento+" | ");
                    i++;
                }
                System.out.println("\n");
            }
    }
}
