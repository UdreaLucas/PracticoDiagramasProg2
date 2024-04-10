package practicodiagramas.ejercicios.ejercicio4;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        long cuitCliente = 12345678;
        long cuitEmpleado = 87654321;

        Factura factura2 = new Factura(
                new Cliente("Gonzalez", cuitCliente, 12345678, "Juan"),
                new Empleado("Perez", cuitEmpleado, 87654321, "Pedro", new Date(2025, 5, 7), 123456),
                new Date(2025, 5, 10),
                4567.89,
                123456);
        Factura factura = factura2;

        factura.getClie().setCredit_Card(new Tarjeta_de_Credito(new Date(2025, 4, 26), 600000));

        if (factura.getClie().problemaVerazCodeme()
                && factura.getClie().getCredit_Card().get(0).getLimite() >= factura.getMonto()) {
            System.out.println("-----Factura-----");
            System.out.println("Fecha: " + factura.getFecha());
            System.out.println("Nro factura: " + factura.getNro_Factura());
            System.out.println("Cliente: " + factura.getClie().getNombre() + " " + factura.getClie().getApellido());
            System.out.println("CUIT: " + factura.getClie().getCuit());
            System.out.println("Cajero: " + factura.getEmp().getNombre() + " " + factura.getEmp().getApellido());
            System.out.println("Monto total: " + factura.getMonto());
            System.out.println("Pagado con tarjeta de credito");
        } else {
            System.out.println(
                    "Lo sentimos, pero no puede retirar la mercadería debido a deudas o saldo insuficiente en su tarjeta de crédito.");
        }

    }
}
