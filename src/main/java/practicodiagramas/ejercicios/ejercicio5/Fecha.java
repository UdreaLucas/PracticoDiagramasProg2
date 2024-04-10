package practicodiagramas.ejercicios.ejercicio5;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDiferenciaAnios(Fecha fecha) {

        if (fecha.getAnio() > this.anio) {
            return fecha.getAnio() - this.anio;
        }
        return this.anio - fecha.getAnio();
    }

    public void imprimir() {
        System.out.println(String.valueOf(dia) + "-" + String.valueOf(mes) + "-" + String.valueOf(anio));
    }

    public boolean isBisiesto() {
        if (this.anio % 400 == 0) {
            return true;
        } else if (this.anio % 100 == 0) {
            return false;
        } else if (this.anio % 4 == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return String.valueOf(dia) + "-" + String.valueOf(mes) + "-" + String.valueOf(anio);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

}
