package practicodiagramas.ejercicios.ejercicio4;

public abstract class Persona {

    protected String apellido;
    protected long cuit;
    protected int dni;
    protected String nombre;

    public Persona() {
    }

    public Persona(String apellido, long cuit, int dni, String nombre) {
        this.apellido = apellido;
        this.cuit = cuit;
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public abstract long getCuit();

    public abstract void setCuit(long cuit);

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
