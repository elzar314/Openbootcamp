package eFinales;

/*Escribe el código que devuelva una cadena al revés. 
Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
*/

public class ejercicio0 {

    public static void main(String[] args) {

        String mensaje = "Hola mundo!";

        System.out.println(mensaje);

        System.out.println(reverse(mensaje));
    }

    public static String reverse(String mensaje){
        String nuevo="";
        for(int i=0;i<mensaje.length();i++){
            nuevo=mensaje.charAt(i)+nuevo;
        }
        return nuevo;
    }
}
