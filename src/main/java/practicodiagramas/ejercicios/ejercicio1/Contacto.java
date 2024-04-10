package practicodiagramas.ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Contacto extends Persona {

    public Contacto(int idPersona, String nombre, String apellido, int idContacto, ContactoTipo contactoTipo,
            List<ContactoDomicilio> domicilios, List<ContactoTelefono> telefonos) {
        super(idPersona, nombre, apellido);
        this.idContacto = idContacto;
        this.contactoTipo = contactoTipo;
        this.domicilios = domicilios;
        this.telefonos = telefonos;
    }

    protected Contacto(int idPersona, String nombre, String apellido) {
        super(idPersona, nombre, apellido);
    }

    private int idContacto;
    private ContactoTipo contactoTipo;
    private List<ContactoDomicilio> domicilios = new ArrayList<>();
    private List<ContactoTelefono> telefonos = new ArrayList<>();

    public int getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public ContactoTipo getContactoTipo() {
        return contactoTipo;
    }

    public void setContactoTipo(ContactoTipo contactoTipo) {
        this.contactoTipo = contactoTipo;
    }

    public List<ContactoDomicilio> getDomicilios() {
        return domicilios;
    }

    public void addDomicilio(ContactoDomicilio domicilio) {
        this.domicilios.add(domicilio);
    }

    public List<ContactoTelefono> getTelefonos() {
        return telefonos;
    }

    public void addTelefono(ContactoTelefono telefono) {
        this.telefonos.add(telefono);
    }
}