package practicodiagramas.ejercicios.ejercicio2;

public class Bicicleta extends Vehiculo {
    private int velocidad;

    public Bicicleta(int ruedas, String duenio, int velocidad) {
        super(ruedas, duenio);
        this.velocidad = velocidad;
    }

    public Bicicleta() {
    }

    @Override
    public double precio() {
        return 100;
    }

    @Override
    public double velocidadMaxima() {
        return this.velocidad;
    }

    @Override
    public int getRuedas() {
        return this.ruedas;
    }

    @Override
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}