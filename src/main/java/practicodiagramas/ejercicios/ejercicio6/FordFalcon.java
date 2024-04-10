package practicodiagramas.ejercicios.ejercicio6;

public final class FordFalcon extends Auto {

    public static String MARCA = "Ford";
    public static String MODELO = "Falcon";
    public static byte CANT_PUERTAS = 4;

    public FordFalcon() {
    }

    public FordFalcon(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }

    @Override
    public void romperInercia() {
        System.out.println("Rompiendo inercia en el Ford Falcon");
    }

    @Override
    public void doblar() {
        System.out.println("Doblando en el Ford Falcon");
    }

    @Override
    public void esquivarObstaculo() {
        System.out.println("Esquivando obstaculos con el Ford Falcon");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando en el Ford Falcon");
    }

    @Override
    public void moverseHaciaAdelante() {
        System.out.println("Avanzando con el Ford Falcon");
    }

    @Override
    public void retroceder() {
        System.out.println("Dando marcha atrás con el Ford Falcon");
    }

}
