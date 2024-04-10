package practicodiagramas.ejercicios.ejercicio4;

import java.util.Date;

public class Factura {

    private Cliente clie = new Cliente();
    private Empleado emp = new Empleado();
    private Date fecha;
    private double monto;
    private int nro_Factura;

    public Factura(Cliente clie, Empleado emp, Date fecha, double monto, int nro_Factura) {
        this.clie = clie;
        this.emp = emp;
        this.fecha = fecha;
        this.monto = monto;
        this.nro_Factura = nro_Factura;
    }

    public Cliente getClie() {
        return clie;
    }

    public void setClie(Cliente clie) {
        this.clie = clie;
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmpleado(Empleado empleado) {
        emp = empleado;
    }

    public String getFecha() {
        return fecha.getDay() + "-" + fecha.getMonth() + "-" + fecha.getYear();
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getNro_Factura() {
        return nro_Factura;
    }

    public void setNro_Factura(int nro_Factura) {
        this.nro_Factura = nro_Factura;
    }
}
