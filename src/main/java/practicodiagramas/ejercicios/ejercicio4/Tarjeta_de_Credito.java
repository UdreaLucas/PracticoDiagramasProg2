package practicodiagramas.ejercicios.ejercicio4;

import java.util.Date;

public class Tarjeta_de_Credito {

    private Date fecha_Ingreso;
    private double limite;

    public Tarjeta_de_Credito(Date fecha_Ingreso, double limte) {

        this.fecha_Ingreso = fecha_Ingreso;
        this.limite = limte;
    }

    public Date getFecha_Ingreso() {
        return fecha_Ingreso;
    }

    public void setFecha_Ingreso(Date fecha_Ingreso) {
        this.fecha_Ingreso = fecha_Ingreso;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
