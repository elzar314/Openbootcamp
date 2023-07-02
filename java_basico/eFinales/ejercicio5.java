package eFinales;

import java.util.ArrayList;
import java.util.LinkedList;

public class ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> continentes = new ArrayList<>();
        continentes.add("Europa");
        continentes.add("America");
        continentes.add("Africa");
        continentes.add("Asia");

        LinkedList<String> copia = new LinkedList<>();

        for(String g:continentes){
            copia.add(g);
        }

        for(String g : continentes){
            System.out.print(g+" ");
        }

        System.out.println();

        for(String g : copia){
            System.out.print(g+" ");
        }
    }
}
