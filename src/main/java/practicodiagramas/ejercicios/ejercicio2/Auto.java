package practicodiagramas.ejercicios.ejercicio2;

public class Auto extends Vehiculo implements Motor {
    private int puertas;

    public Auto(int ruedas, String duenio, int puertas) {
        super(ruedas, duenio);
        this.puertas = puertas;
    }

    public Auto() {
    }

    public int getPuertas() {
        return this.puertas;
    }

    @Override
    public double precio() {
        return 10000;
    }

    @Override
    public double velocidadMaxima() {
        return 200;
    }

    @Override
    public String tipo() {
        return "Nafta";
    }

    @Override
    public int getRuedas() {
        return this.ruedas;
    }

    @Override
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
}
