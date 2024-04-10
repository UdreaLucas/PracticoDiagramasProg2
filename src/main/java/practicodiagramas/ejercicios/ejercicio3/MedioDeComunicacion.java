package practicodiagramas.ejercicios.ejercicio3;

public class MedioDeComunicacion {

    private TipoMedio tipoMedio;
    private String descripcion;

    public MedioDeComunicacion(TipoMedio tipoMedio, String descripcion) {
        this.tipoMedio = tipoMedio;
        this.descripcion = descripcion;
    }

    public TipoMedio getTipoMedio() {
        return tipoMedio;
    }

    public void setTipoMedio(TipoMedio tipoMedio) {
        this.tipoMedio = tipoMedio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}