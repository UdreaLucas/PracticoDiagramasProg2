package practicodiagramas.ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto(2, "Juan");
        Bicicleta bicicleta = new Bicicleta(2, "Pedro", 30);
        Auto auto = new Auto(4, "Carlos", 4);

        imprimirDetallesVehiculo(moto, "Moto");
        imprimirDetallesVehiculo(bicicleta, "Bicicleta");
        imprimirDetallesVehiculo(auto, "Auto");

    }

    public static void imprimirDetallesVehiculo(Vehiculo vehiculo, String tipoVehiculo) {
        System.out.println(tipoVehiculo + ":");
        System.out.println("Ruedas: " + vehiculo.getRuedas());
        System.out.println("Dueño: " + vehiculo.getDuenio());
        System.out.println("Precio: " + vehiculo.precio());
        System.out.println("Velocidad máxima: " + vehiculo.velocidadMaxima());

        if (vehiculo instanceof Auto) {
            Auto auto = (Auto) vehiculo;
            System.out.println("Tipo de motor: " + auto.tipo());
            System.out.println("Puertas: " + auto.getPuertas());
        } else if (vehiculo instanceof Moto) {
            Moto moto = (Moto) vehiculo;
            System.out.println("Tipo de motor: " + moto.tipo());
        } else if (vehiculo instanceof Bicicleta) {
            Bicicleta bicicleta = (Bicicleta) vehiculo;
            System.out.println("Velocidad: " + bicicleta.getVelocidad());
        }
    }
}
