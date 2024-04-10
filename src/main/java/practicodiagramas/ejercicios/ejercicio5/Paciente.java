package practicodiagramas.ejercicios.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private final String NSIP;
    private final String nombresApellidos;
    private final char sexo;
    private final Fecha fechaNacimiento;
    private final List<Diagnostico> diagnosticos;

    public Paciente(String NSIP, String nombresApellidos, char sexo, int diaNacimiento, int mesNacimiento,
            int anioNacimiento) {
        this.NSIP = NSIP;
        this.nombresApellidos = nombresApellidos;
        this.sexo = sexo;
        fechaNacimiento = new Fecha(diaNacimiento, mesNacimiento, anioNacimiento);
        diagnosticos = new ArrayList<>();
    }

    public boolean estaCurado() {
        int altas = 0;
        for (Diagnostico diagnostico : this.diagnosticos) {
            if (diagnostico.esAlta()) {
                altas += 1;
            }
        }
        return altas == this.diagnosticos.size();
    }

    public Diagnostico getUltimoDiagnostico() {
        return this.diagnosticos.get(this.diagnosticos.size() - 1);
    }

    public void diagnosticar(Diagnostico diagnostico) {
        Diagnostico diag = new Diagnostico(diagnostico.getText(), diagnostico.getTipo());
        this.diagnosticos.add(diag);
    }

    public String getNSIP() {
        return NSIP;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public char getSexo() {
        return sexo;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

}
