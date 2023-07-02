package eFinales;

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
