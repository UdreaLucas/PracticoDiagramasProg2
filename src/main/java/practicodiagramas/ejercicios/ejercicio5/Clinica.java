package practicodiagramas.ejercicios.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Clinica {

    // private List<Especialidad> especialidades = new ArrayList<>();
    private List<Especialidad> especialidades;

    public Clinica() {
        this.especialidades = new ArrayList<>();
    }

    public void addEspecialidad(Especialidad especialidad) {
        this.especialidades.add(especialidad);
    }

    public Especialidad buscarEspecialidadPaciente(Paciente paciente) {

        for (Especialidad especialidad : this.especialidades) {
            if (especialidad.estaIngresado(paciente)) {
                return especialidad;
            }
        }
        return null;
    }

    public Especialidad obtenerEspecialidad(String nombre) {

        for (Especialidad especialidad : this.especialidades) {
            if (especialidad.getNombre().equalsIgnoreCase(nombre)) {
                return especialidad;
            }
        }
        return null;
    }
}
