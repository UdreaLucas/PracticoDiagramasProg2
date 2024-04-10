package practicodiagramas.ejercicios.ejercicio6;

public final class HondaXR25 extends Moto {

    public static String MARCA = "Honda";
    public static String MODELO = "XR25";

    public HondaXR25() {
    }

    public HondaXR25(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }

    @Override
    public void romperInercia() {
        System.out.println("Rompiendo inercia en la HondaXR25");
    }

    @Override
    public void doblar() {
        System.out.println("Doblando en la HondaXR25");
    }

    @Override
    public void esquivarObstaculo() {
        System.out.println("Esquivando obstaculos con la HondaXR25");
    }

    public void esquivarObstaculo(int metros) {
        System.out.println("Esquivando obstaculos con la HondaXR25 a " + metros + " metros");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando en la HondaXR25");
    }

    @Override
    public void moverseHaciaAdelante() {
        System.out.println("Avanzando con la HondaXR25");
    }

    @Override
    public void retroceder() {
        System.out.println("Dando marcha atrás con la HondaXR25");
    }

}
