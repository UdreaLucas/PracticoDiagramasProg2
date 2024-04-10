package practicodiagramas.ejercicios.ejercicio6;

public class Main {

    public static void main(String[] args) {

        FordFalcon falcon = new FordFalcon(60.00, 200);
        Boing747 avion = new Boing747(900.00, 1100);
        BarcoAVela barcoVelero = new BarcoAVela(60, 180, "Beneteau", 3);
        HondaXR600 motoXR600 = new HondaXR600(70, 180);

        falcon.agregarRueda(new Rueda("Michelin", "185 75-65"));
        falcon.agregarRueda(new Rueda("Michelin", "185 75-65"));
        falcon.agregarRueda(new Rueda("Bridgestone", "185 75-65"));
        falcon.agregarRueda(new Rueda("Bridgestone", "185 75-65"));

        System.out.println("---Ford Falcon---");
        falcon.moverseHaciaAdelante();
        System.out.println("Velocidad promedio: " + falcon.getVelocidadPromedio() + "km/h");
        falcon.esquivarObstaculo();
        System.out.println("Velocidad maxima: " + falcon.getVelocidadMaxima() + "km/h");
        falcon.frenar();
        falcon.retroceder();

        System.out.println("---Avion Boing 747---");
        avion.agregarViaje();
        System.out.println("Velocidad promedio: " + avion.getVelocidadPromedio() + "km/h");
        avion.doblar();
        System.out.println("Velocidad maxima: " + avion.getVelocidadMaxima() + "km/h");
        System.out.println("Cantidad de viajes del Boing 747: " + Boing747.getViajes());
        avion.frenar();
        avion.despegar();
        avion.aterrizar();
        avion.frenar();

        motoXR600.agregarRueda(new Rueda("Honda", "19"));
        motoXR600.agregarRueda(new Rueda("Honda", "17"));

        System.out.println("---Moto XR 600---");
        motoXR600.moverseHaciaAdelante();
        System.out.println("Velocidad promedio: " + motoXR600.getVelocidadPromedio() + "km/h");
        motoXR600.romperInercia();
        System.out.println("Velocidad maxima: " + motoXR600.getVelocidadMaxima() + "km/h");
        motoXR600.frenar();

        System.out.println("---Barco Velero---");
        System.out.println("Marca: " + barcoVelero.getMarca());
        System.out.println("Velocidad promedio: " + barcoVelero.getVelocidadPromedio() + "km/h");
        System.out.println("Cantidad de velas: " + barcoVelero.getCantVelas());
        System.out.println("Velocidad maxima: " + barcoVelero.getVelocidadMaxima() + "km/h");
    }
}
