package practicodiagramas.ejercicios.ejercicio6;

public final class BarcoAVela extends Barco {

    private String marca;
    private int cantVelas;

    public BarcoAVela() {
    }

    public BarcoAVela(double velocidadPromedio, int velocidadMaxima, String marca, int cantVelas) {
        super(velocidadPromedio, velocidadMaxima);
        this.marca = marca;
        this.cantVelas = cantVelas;
    }

    public int getCantVelas() {
        return cantVelas;
    }

    public String getMarca() {
        return marca;
    }

    public void setCantVelas(int cantVelas) {
        this.cantVelas = cantVelas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void romperInercia() {
        System.out.println("Rompiendo inercia con el Barco a vela");
    }

    @Override
    public void doblar() {
        System.out.println("Doblando en el Barco a vela");
    }

    @Override
    public void esquivarObstaculo() {
        System.out.println("Esquivando obstaculos con el Barco a vela");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando en el Barco a vela");
    }

    @Override
    public void moverseHaciaAdelante() {
        System.out.println("Avanzando con el Barco a vela");
    }

    @Override
    public void retroceder() {
        System.out.println("Retrocediendo con el Barco a vela");
    }

}
