package practicodiagramas.ejercicios.ejercicio4;

import java.util.Date;

public class Empleado extends Persona implements Estado_Cuenta {

    private Date fecha_Ingreso;
    private int nro_Legajo;

    public Empleado() {
    }

    public Empleado(String apellido, long cuit, int dni, String nombre, Date fecha_Ingreso, int nro_Legajo) {
        super(apellido, cuit, dni, nombre);
        this.fecha_Ingreso = fecha_Ingreso;
        this.nro_Legajo = nro_Legajo;
    }

    public Date getFecha_Ingreso() {
        return fecha_Ingreso;
    }

    public void setFecha_Ingreso(Date fecha_Ingreso) {
        this.fecha_Ingreso = fecha_Ingreso;
    }

    public int getNro_Legajo() {
        return nro_Legajo;
    }

    public void setNro_Legajo(int nro_Legajo) {
        this.nro_Legajo = nro_Legajo;
    }

    @Override
    public long getCuit() {
        return cuit;
    }

    @Override
    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    @Override
    public boolean problemaVerazCodeme() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
