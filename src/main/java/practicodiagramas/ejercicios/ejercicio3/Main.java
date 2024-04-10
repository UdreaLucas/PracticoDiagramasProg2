package practicodiagramas.ejercicios.ejercicio3;

public class Main {
    public static void main(String[] args) {
        // instanciar un mafioso
        Mafioso mafioso = new Mafioso();
        mafioso.setNombre("Juan");
        mafioso.agregarLugarFrecuente(new Lugar("Casa", new Direccion("Calle 1", 123)));
        // instanciar un detective
        Detective detective = new Detective();
        detective.setNombre("Sherlock");
        detective.setApellido("Holmes");
        detective.agregarPerfil(new Perfil(1, "Perfil 1"));
        detective.setPlaca("1234");
        detective.agregarMedioComunicacion(
                new MedioDeComunicacion(TipoMedio.CORREO_ELECTRONICO, "sherlockdetective@gmail.com"));

        // investigar al mafioso
        if (detective.investigarMafioso(mafioso)) {
            System.out.println("El detective " + detective.getNombre() + " " + detective.getApellido()
                    + " ha investigado al mafioso " + mafioso.getNombre() + " en el lugar que frecuenta "
                    + mafioso.getLugaresFrecuentes().get(0).getNombre() + " en la direccion "
                    + mafioso.getLugaresFrecuentes().get(0).getDireccion().getDireccion() + " "
                    + mafioso.getLugaresFrecuentes().get(0).getDireccion().getNumero());
        } else {
            System.out.println("El detective " + detective.getNombre() + " " + detective.getApellido()
                    + " no ha investigado al mafioso " + mafioso.getNombre());
        }

    }
}