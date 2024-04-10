package practicodiagramas.ejercicios.ejercicio4;

public class Proveedor extends Persona implements Estado_Cuenta {

    private String nombre_Comercial;

    public Proveedor(String apellido, long cuit, int dni, String nombre, String nombre_Comercial) {
        super(apellido, cuit, dni, nombre);
        this.nombre_Comercial = nombre_Comercial;
    }

    @Override
    public long getCuit() {
        return cuit;
    }

    @Override
    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getNombre_Comercial() {
        return nombre_Comercial;
    }

    public void setNombre_Comercial(String nombre_Comercial) {
        this.nombre_Comercial = nombre_Comercial;
    }

    @Override
    public boolean problemaVerazCodeme() {

        return true;

    }
}
