package practicodiagramas.ejercicios.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Medico {

    private String nombreApellidos;
    private final List<Paciente> pacientes;

    public Medico() {
        this.pacientes = new ArrayList<>();
    }

    public Medico(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
        this.pacientes = new ArrayList<>();
    }

    public void addPaciente(Paciente paciente) {
        this.pacientes.add(paciente);
    }

    public int getCargaPacientes() {
        return this.pacientes.size();
    }

    public boolean quitarPaciente(Paciente paciente) {
        return this.pacientes.remove(paciente);
    }

    public boolean tieneAlPaciente(Paciente paciente) {
        return this.pacientes.contains(paciente);
    }

    public String getNombre() {
        return nombreApellidos;
    }

    public void setNombre(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

}
