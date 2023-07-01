package e_tema4;

public class SmartPhone extends SmartDevices{
    String memoriaRam;
    String pixelsCamara;
    String usuarioFacebook;

    public SmartPhone(String modelo, String marca, double precio, String añoSalida, String memoriaRam, String pixelsCamara, String usuarioFacebook) {
        super(modelo, marca, precio, añoSalida);
        this.memoriaRam = memoriaRam;
        this.pixelsCamara = pixelsCamara;
        this.usuarioFacebook = usuarioFacebook;
    }

    @Override
    public String toString() {
        return "SmartPhone\n" +
                "Modelo: "+modelo+
                "\nMarca: " + Marca +
                "\nPrecio: " + precio +
                "\nAño de salida: " + añoSalida  +
                "\nMemoriaRam: " + memoriaRam +
                "\nPixeles de Camara: " + pixelsCamara  +
                "\nUsuario de Facebook: " + usuarioFacebook;
    }
}
