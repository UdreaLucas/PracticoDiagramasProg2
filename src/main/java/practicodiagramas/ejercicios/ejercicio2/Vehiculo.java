package practicodiagramas.ejercicios.ejercicio2;

public abstract class Vehiculo {
    protected int ruedas;
    protected String duenio;

    // Constructor with two attributes
    protected Vehiculo(int ruedas, String duenio) {
        this.ruedas = ruedas;
        this.duenio = duenio;
    }

    // Empty constructor
    protected Vehiculo() {
    }

    // Abstract methods
    public abstract double precio();

    public abstract double velocidadMaxima();

    public abstract int getRuedas();

    public abstract void setRuedas(int ruedas);

    // Non-abstract methods
    public String getDuenio() {
        return this.duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
}