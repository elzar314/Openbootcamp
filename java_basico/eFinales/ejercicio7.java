package eFinales;
/*
Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante 
    del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). 
    Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". 
    Finalmente, mostraremos en cualquier caso: "Demo de código".
*/

public class ejercicio7 {
    public static void main(String[] args) {

        System.out.println(dividePorCero(5));

    }

    public static int dividePorCero(int numero) throws ArithmeticException{
        try{
         throw new ArithmeticException();
        }catch (ArithmeticException e){
           System.out.println("Esto no puede hacerse");
           return 0;
        }finally {
            System.out.println("Deme su codigo");
        }
    }
}
