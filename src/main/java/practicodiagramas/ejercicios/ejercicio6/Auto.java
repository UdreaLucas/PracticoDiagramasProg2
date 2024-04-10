package practicodiagramas.ejercicios.ejercicio6;

public abstract class Auto extends Vehiculo {

    public static final int N_RUEDAS = 4;

    public Auto() {
    }

    public Auto(double velocidadPromedio, int velocidadMaxima) {
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
