package practicodiagramas.ejercicios.ejercicio2;

public class Moto extends Vehiculo implements Motor {
    public Moto(int ruedas, String duenio) {
        super(ruedas, duenio);
    }

    public Moto() {
    }

    @Override
    public double precio() {
        return 5000;
    }

    @Override
    public double velocidadMaxima() {
        return 150;
    }

    @Override
    public int getRuedas() {
        return this.ruedas;
    }

    @Override
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String tipo() {
        return "Nafta";
    }

    @Override
    public String getDuenio() {
        return this.duenio;
    }

    @Override
    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

}
