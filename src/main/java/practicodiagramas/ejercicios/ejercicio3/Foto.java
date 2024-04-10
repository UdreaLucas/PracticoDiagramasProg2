package practicodiagramas.ejercicios.ejercicio3;

public class Foto {
    public Foto(String pathToFile, String nombre, float tamanio) {
        this.pathToFile = pathToFile;
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    private String pathToFile;
    private String nombre;
    private float tamanio;

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

}
