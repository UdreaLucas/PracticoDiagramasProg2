package practicodiagramas.ejercicios.ejercicio6;

public final class HondaXR600 extends Moto {

    public static String MARCA = "Honda";
    public static String MODELO = "XR600";

    public HondaXR600() {
    }

    public HondaXR600(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }

    @Override
    public void romperInercia() {
        System.out.println("Rompiendo inercia en la HondaXR600");
    }

    @Override
    public void doblar() {
        System.out.println("Doblando en la HondaXR600");
    }

    @Override
    public void esquivarObstaculo() {
        System.out.println("Esquivando obstaculos con la HondaXR600");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando en la HondaXR600");
    }

    @Override
    public void moverseHaciaAdelante() {
        System.out.println("Avanzando con la HondaXR600");
    }

    @Override
    public void retroceder() {
        System.out.println("Dando marcha atrás con la HondaXR600");
    }

}
