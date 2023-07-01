package e_tema5;

public class Main {
    public static void main(String[] args) {


        CocheCRUD lista = new CocheCRUDImpl();

        Coche coche1 = new Coche("Toyota","XA1239","2010");
        Coche coche2 = new Coche("Mercedes","Gabit","2005");
        Coche coche3 = new Coche("Ford","Xperia","2023");

        lista.save(coche1);
        lista.save(coche2);
        lista.save(coche3);

        System.out.println(lista.findAll());

        lista.delete(coche2);

        System.out.println(lista.findAll());
    }
}
