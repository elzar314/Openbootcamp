package e_tema5;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    List<Coche> coches = new ArrayList<>();

    @Override
    public void save(Coche coche) {
        coches.add(coche);
    }

    @Override
    public String findAll() {
        return coches.toString()+",";
    }

    @Override
    public void delete(Coche coche) {
        coches.remove(coches.indexOf(coche));

    }
}
