package practicodiagramas.ejercicios.ejercicio5;

class Diagnostico {

    private String text;
    private TipoDiagnostico tipo;
    private Tratamiento tratamiento;

    public Diagnostico() {
        tratamiento = new Tratamiento("");
    }

    public Diagnostico(String text, TipoDiagnostico tipo) {
        this.tratamiento = new Tratamiento("");
        this.text = text;
        this.tipo = tipo;
    }

    public void tratar(Tratamiento tratamiento) {
        this.tratamiento = new Tratamiento(tratamiento.getTexto());
    }

    public boolean esAlta() {
        return this.tipo.name().equalsIgnoreCase("tdAlta");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TipoDiagnostico getTipo() {
        return tipo;
    }

    public void setTipo(TipoDiagnostico tipo) {
        this.tipo = tipo;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String texto) {
        this.tratamiento.setTexto(texto);
    }
}
