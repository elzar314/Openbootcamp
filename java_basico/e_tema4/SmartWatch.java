package e_tema4;

public class SmartWatch extends SmartDevices{
    String pantalla;
    String bluetooth;

    public SmartWatch(String modelo, String marca, double precio, String añoSalida, String pantalla, String bluetooth) {
        super(modelo, marca, precio, añoSalida);
        this.pantalla = pantalla;
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return "SmartWatch\n" +
                "Marca: " + Marca +
                "\nModelo: "+modelo+
                "\nPrecio: " + precio +
                "\nAño de salida: " + añoSalida +
                "\nPantalla: " + pantalla +
                "\nBluetooth: " + bluetooth;
    }
}
