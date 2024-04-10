package practicodiagramas.ejercicios.ejercicio5;

import java.util.ArrayList;
import java.util.List;

class Especialidad {

    private String nombre;
    private Medico jefeEspecialidad;
    private List<Habitacion> habitaciones;
    private List<Medico> medicos;

    public Especialidad(String nombre, Medico jefe) {
        this.nombre = nombre;
        this.jefeEspecialidad = jefe;
        this.habitaciones = new ArrayList<>();
        this.medicos = new ArrayList<>();
    }

    public void addHabitacion(Habitacion habitacion) {
        this.habitaciones.add(habitacion);
    }

    public String getNombre() {
        return nombre;
    }

    public Medico getJefeEspecialidad() {
        return jefeEspecialidad;
    }

    public void setJefeEspecialidad(Medico jefeEspecialidad) {
        this.jefeEspecialidad = jefeEspecialidad;
    }

    public boolean ingresarPaciente(Paciente paciente) {

        boolean pacienteIngresado = false;
        for (int i = 0; i < this.habitaciones.size(); i++) {
            if (this.habitaciones.get(i).ingresaPaciente(paciente)) {
                pacienteIngresado = true;
                break;
            }
        }
        return pacienteIngresado;
    }

    public void agregarMedico(Medico medico) {
        this.medicos.add(medico);
    }

    public List<Paciente> getPacientesListosParaElAlta() {
        List<Paciente> pacientes = new ArrayList<>();

        for (Habitacion habitacion : this.habitaciones) {
            for (Cama cama : habitacion.getCamas()) {
                if (cama.getPaciente().estaCurado()) {
                    pacientes.add(cama.getPaciente());
                }
            }
        }
        return pacientes;
    }

    public boolean darAlta() {

        for (Habitacion habitacion : this.habitaciones) {
            for (Paciente paciente : this.getPacientesListosParaElAlta()) {
                habitacion.quitarPaciente(paciente);
            }
        }
        return true;
    }

    public Habitacion buscarHabitacion(Paciente paciente) {

        for (Habitacion habitacion : this.habitaciones) {
            if (habitacion.ingresaPaciente(paciente)) {
                return habitacion;
            }
        }
        return null;
    }

    public Medico buscarMedico(Paciente paciente) {
        for (Medico medico : this.medicos) {
            if (medico.tieneAlPaciente(paciente)) {
                return medico;
            }
        }
        return null;
    }

    public boolean estaIngresado(Paciente paciente) {
        for (Habitacion habitacion : this.habitaciones) {
            if (habitacion.estaElPaciente(paciente)) {
                return true;
            }
        }
        return false;
    }
}
