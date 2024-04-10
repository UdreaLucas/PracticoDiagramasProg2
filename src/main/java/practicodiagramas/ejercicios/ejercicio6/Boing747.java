package practicodiagramas.ejercicios.ejercicio6;

public final class Boing747 extends Vehiculo {

    public static String MARCA = "Boing";
    public static String MODELO = "747";
    private static int viajes = 0;

    public Boing747() {
    }

    public Boing747(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }

    public static void agregarViaje() {
        viajes += 1;
    }

    public void aterrizar() {
        System.out.println("Boing 747 aterrizando..");
    }

    public void despegar() {
        System.out.println("Boing 747 despegando...");
    }

    @Override
    public void doblar() {
        System.out.println("Doblando en el Boing 747");
    }

    @Override
    public void esquivarObstaculo() {
        System.out.println("Esquivando obstaculos con el Boing 747");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando en el Boing 747");
    }

    public static int getViajes() {
        return viajes;
    }

    @Override
    public void moverseHaciaAdelante() {
        System.out.println("Avanzando con el Boing 747");
    }

    @Override
    public void retroceder() {
        System.out.println("Dando marcha atrás con el Boing 747");
    }

    @Override
    public void romperInercia() {
        System.out.println("Rompiendo inercia en el Boing 747");
    }

}
