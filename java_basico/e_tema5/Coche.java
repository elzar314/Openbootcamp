package e_tema5;

public class Coche {
    String marca;
    String modelo;
    String fabricacion;

    public Coche(String marca, String modelo, String fabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricacion = fabricacion;
    }

    @Override
    public String toString() {
        return
                "[marca: " + marca  +
                ", modelo: " + modelo +
                ", fabricacion: " + fabricacion +"]";
    }
}
