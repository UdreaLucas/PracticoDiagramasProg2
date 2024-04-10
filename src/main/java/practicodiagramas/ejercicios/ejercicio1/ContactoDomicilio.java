package practicodiagramas.ejercicios.ejercicio1;

public class ContactoDomicilio {
    private int idContactoDomicilio;
    private String descripcion;

    public ContactoDomicilio() {
    }

    public ContactoDomicilio(int idContactoDomicilio, String descripcion) {
        this.idContactoDomicilio = idContactoDomicilio;
        this.descripcion = descripcion;
    }

    public int getIdContactoDomicilio() {
        return idContactoDomicilio;
    }

    public void setIdContactoDomicilio(int idContactoDomicilio) {
        this.idContactoDomicilio = idContactoDomicilio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}