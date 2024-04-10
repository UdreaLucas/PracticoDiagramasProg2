package practicodiagramas.ejercicios.ejercicio6;

public abstract class Moto extends Vehiculo {

    public static final int N_RUEDAS = 2;

    public Moto() {
    }

    public Moto(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }

    @Override
    public abstract void romperInercia();

    @Override
    public abstract void doblar();

    @Override
    public abstract void esquivarObstaculo();

    @Override
    public abstract void frenar();

    @Override
    public abstract void moverseHaciaAdelante();

    @Override
    public abstract void retroceder();

}
