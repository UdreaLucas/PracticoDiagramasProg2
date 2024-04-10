package practicodiagramas.ejercicios.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {

    private List<Cama> camas;
    private int numero;
    private int siguienteNumero = 1;

    public Habitacion() {
        this.camas = new ArrayList<>();
    }

    public void addCama(int n) {
        for (int i = 0; i < n; i++) {
            camas.add(new Cama());
        }
    }

    public boolean ingresaPaciente(Paciente paciente) {

        for (int i = 0; i < this.camas.size(); i++) {
            if (!this.camas.get(i).isPaciente()) {
                this.camas.get(i).setPaciente(paciente);
                return true;
            }
        }
        return false;
    }

    public void quitarPaciente(Paciente paciente) {
        for (int i = 0; i < this.camas.size(); i++) {
            if (this.camas.get(i).getPaciente().getNombresApellidos()
                    .equalsIgnoreCase(paciente.getNombresApellidos())) {
                this.camas.get(i).setPaciente(null);
            }
        }
    }

    public boolean estaElPaciente(Paciente paciente) {
        for (Cama cama : this.camas) {
            if (cama.getPaciente().equals(paciente)) {
                return true;
            }
        }
        return false;
    }

    public Cama getCama(int numCama) {
        if (numCama <= this.camas.size() && numCama > 0) {
            return this.camas.get(numCama - 1);
        }
        return null;
    }

    public List<Cama> getCamas() {
        return this.camas;
    }

    public int getNumeroCamas() {
        return this.camas.size();
    }

    public int getNumeroCamaPaciente(Paciente paciente) {
        for (int i = 0; i < this.camas.size(); i++) {
            if (paciente.getNombresApellidos()
                    .equalsIgnoreCase(this.camas.get(i).getPaciente().getNombresApellidos())) {
                return i + 1;
            }
        }
        // Si retorna 0 es porque no el paciente no está en ninguna cama
        return 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
