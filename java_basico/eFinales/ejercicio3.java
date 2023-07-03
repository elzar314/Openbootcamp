package eFinales;

/*
Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. 
Elimina el 2o y 3er elemento y muestra el resultado final.
*/

import java.util.Vector;

public class ejercicio3 {
    public static void main(String[] args) {
        Vector<String> materias = new Vector();
        materias.add("Matemáticas");
        materias.add("Geografía");
        materias.add("Comunicación");
        materias.add("Historia");
        materias.add("Música");

        System.out.println(materias);

        materias.remove(1);
        materias.remove(1);

        System.out.println(materias);
    }
}
