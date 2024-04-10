package practicodiagramas.ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona {

    public Usuario(int idPersona, String nombre, String apellido) {
        super(idPersona, nombre, apellido);
    }

    public Usuario(int idPersona, String nombre, String apellido, int idUsuario, String usuario, String password,
            List<Contacto> contactos) {
        super(idPersona, nombre, apellido);
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
        this.contactos = contactos;
    }

    private int idUsuario;
    private String usuario;
    private String password;
    private List<Contacto> contactos = new ArrayList<>();

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void addContacto(Contacto contacto) {
        this.contactos.add(contacto);
    }
}
