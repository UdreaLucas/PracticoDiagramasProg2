package practicodiagramas.ejercicios.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Mafioso extends Persona implements Investigable {
    public Mafioso() {
        lugaresFrecuentes = new ArrayList<>();
    }

    public Mafioso(List<Lugar> lugaresFrecuentes) {
        this.lugaresFrecuentes = lugaresFrecuentes;
    }

    private List<Lugar> lugaresFrecuentes;

    @Override
    public boolean investigar() {
        return true;
    }

    public List<Lugar> getLugaresFrecuentes() {
        return lugaresFrecuentes;
    }

    public void setLugaresFrecuentes(List<Lugar> lugaresFrecuentes) {
        this.lugaresFrecuentes = lugaresFrecuentes;
    }

    public void agregarLugarFrecuente(Lugar lugar) {
        lugaresFrecuentes.add(lugar);
    }

    public void eliminarLugarFrecuente(Lugar lugar) {
        lugaresFrecuentes.remove(lugar);
    }

}