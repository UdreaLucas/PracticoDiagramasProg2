package practicodiagramas.ejercicios.ejercicio3;

public class Detective extends Persona {

    private String placa;

    public boolean investigarMafioso(Mafioso mafioso) {
        return mafioso.investigar();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
