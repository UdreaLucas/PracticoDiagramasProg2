package practicodiagramas.ejercicios.ejercicio1;

public class ContactoTipo {

    public static final ContactoTipo FAMILIAR = null;
    private int idContactoTipo;
    private String descripcion;

    public ContactoTipo() {
    }

    public ContactoTipo(int idContactoTipo, String descripcion) {
        this.idContactoTipo = idContactoTipo;
        this.descripcion = descripcion;
    }

    public int getIdContactoTipo() {
        return idContactoTipo;
    }

    public void setIdContactoTipo(int idContactoTipo) {
        this.idContactoTipo = idContactoTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
