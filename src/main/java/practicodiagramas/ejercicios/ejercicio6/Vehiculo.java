package practicodiagramas.ejercicios.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo implements Desplazable {

    private double velocidadPromedio;
    private int velocidadMaxima;
    private List<Rueda> ruedas;

    public Vehiculo() {
        this.ruedas = new ArrayList<>();
    }

    public Vehiculo(double velocidadPromedio, int velocidadMaxima) {
        this.velocidadPromedio = velocidadPromedio;
        this.velocidadMaxima = velocidadMaxima;
        this.ruedas = new ArrayList<>();
    }

    public abstract void romperInercia();

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public List<Rueda> getRuedas() {
        return ruedas;
    }

    public void setRuedas(List<Rueda> ruedas) {
        this.ruedas = ruedas;
    }

    public void agregarRueda(Rueda rueda) {
        this.ruedas.add(rueda);
    }

    public boolean quitarRueda(Rueda rueda) {
        return this.ruedas.remove(rueda);
    }

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
