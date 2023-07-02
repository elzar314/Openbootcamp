package eFinales;

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
