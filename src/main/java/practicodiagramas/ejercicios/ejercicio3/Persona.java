package practicodiagramas.ejercicios.ejercicio3;

import java.util.List;
import java.util.ArrayList;

public class Persona {

    private String nombre;
    private String apellido;
    private Foto foto;
    private List<MedioDeComunicacion> comunicaciones;
    private List<Perfil> perfiles;

    public Persona() {
        this.perfiles = new ArrayList<>();
        this.comunicaciones = new ArrayList<>();
    }

    public void agregarPerfil(Perfil perfil) {
        perfiles.add(perfil);
    }

    public void setMedioComunicacion(List<MedioDeComunicacion> comunicaciones) {
        this.comunicaciones = comunicaciones;
    }

    public void agregarMedioComunicacion(MedioDeComunicacion comunicacion) {
        comunicaciones.add(comunicacion);
    }

    public List<MedioDeComunicacion> getMedioDeComunicacion() {
        return comunicaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public List<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(List<Perfil> perfiles) {
        this.perfiles = perfiles;
    }
}