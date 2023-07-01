package e_tema5;

public interface CocheCRUD {

    abstract void save(Coche coche);
    abstract String findAll();
    abstract void delete(Coche coche);

}
