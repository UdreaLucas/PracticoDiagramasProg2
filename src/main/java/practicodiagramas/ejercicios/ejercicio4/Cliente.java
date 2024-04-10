
package practicodiagramas.ejercicios.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona implements Estado_Cuenta {

    private List<Tarjeta_de_Credito> credit_Card;

    public Cliente() {
    }

    public Cliente(String apellido, long cuit, int dni, String nombre) {
        super(apellido, cuit, dni, nombre);
        this.credit_Card = new ArrayList<>();
    }

    @Override
    public long getCuit() {
        return this.cuit;
    }

    @Override
    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public List<Tarjeta_de_Credito> getCredit_Card() {
        if (!credit_Card.isEmpty()) {
            return credit_Card;
        }
        return null;
    }

    public void setCredit_Card(Tarjeta_de_Credito credit_Card) {
        this.credit_Card.add(credit_Card);
    }

    @Override
    public boolean problemaVerazCodeme() {
        return true;
    }

}
