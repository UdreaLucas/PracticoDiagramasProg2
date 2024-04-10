package practicodiagramas.ejercicios.ejercicio5;

public class Main {
    public static void main(String[] args) {

        Paciente paciente = new Paciente("123", "John Doe", 'M', 1, 1, 2000);
        Medico medico = new Medico("Dr. Clark Kent");
        Habitacion habitacion = new Habitacion();
        Especialidad especialidad = new Especialidad("Cardiologo", medico);
        Clinica clinica = new Clinica();
        Diagnostico diagnostico = new Diagnostico("Saludable", TipoDiagnostico.tdAlta);
        Tratamiento tratamiento = new Tratamiento("Descanso");
        Fecha fecha = new Fecha(1, 1, 2000);
        Cama cama = new Cama(paciente);

        medico.addPaciente(paciente);
        habitacion.addCama(1);
        especialidad.addHabitacion(habitacion);
        clinica.addEspecialidad(especialidad);
        paciente.diagnosticar(diagnostico);
        diagnostico.tratar(tratamiento);

        System.out.println("Paciente: " + paciente.getNombresApellidos());
        System.out.println("Medico: " + medico.getNombre());
        System.out.println("Especialidad: " + especialidad.getNombre());
        System.out.println("Diagnostico: " + diagnostico.getText());
        System.out.println("Tratamiento : " + tratamiento.getTexto());
        System.out.println("Fecha: " + fecha.toString());
        System.out.println("Cama tiene paciente: " + cama.isPaciente());
    }
}