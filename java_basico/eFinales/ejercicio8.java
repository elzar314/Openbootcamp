package eFinales;
import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;

/*
Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". 
La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
*/

public class ejercicio8 {

    public static void main(String[] args) {
        File original = new File("C:\\Users\\ELEAZAR\\Documents\\original.txt");
        File copia = new File("C:\\Users\\ELEAZAR\\Documents\\copia.txt");

        leerFichero(original);
        leerFichero(copia);

        copiarFichero(original,copia);

        leerFichero(original);
        leerFichero(copia);

    }

    public static void copiarFichero(File archivo1,File archivo2){

        ArrayList<Integer> contenido = new ArrayList<>();
        int byteleido;
        try {
            InputStream original = new FileInputStream(archivo1);
            OutputStream copia = new FileOutputStream(archivo2);
            while((byteleido=original.read())!=-1){
                contenido.add(byteleido);
                copia.write(byteleido);
            }
            System.out.println("Copiado exitosamente");

        }catch(Exception e){
            System.out.println("No encontramos los archivos");
        }


    }

    public static void leerFichero(File archivo){
        try {
            InputStream nuevo = new FileInputStream(archivo);
            int leyendo;
            while ((leyendo=nuevo.read())!=-1){
                System.out.print((char)leyendo);
            }
            System.out.println();
        }catch (Exception e){
            System.out.println("Hubo un problema");
        }
    }

}
