package eFinales;

/*
Indica cuál es el problema de utilizar un Vector con 
la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
*/

import java.util.Vector;

public class ejercicio4 {
    public static void main(String[] args) {
      
        System.out.println("El problema de utilizar un Vector con la capacidad por defecto al tener 1000 " +
                "elementos para ser añadidos es la necesidad de incrementar y copiar automáticamente los " +
                "elementos en múltiples realocaciones, lo cual puede llevar a un consumo de memoria innecesario" +
                " y a una degradación del rendimiento. Se recomienda proporcionar una capacidad inicial adecuada " +
                "al crear el Vector para evitar estos problemas.");

        Vector<Integer> numeros = new Vector(1000);

        for(int i=0;i<1000;i++){
            numeros.add(i+1);
        }

        System.out.println(numeros);

    }
}
