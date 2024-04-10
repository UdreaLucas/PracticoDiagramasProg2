package practicodiagramas.ejercicios.ejercicio1;

public class main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, "Juan", "Perez");
        usuario.setIdUsuario(1);
        usuario.setUsuario("juanperez");
        usuario.setPassword("123456");

        Contacto contacto = new Contacto(2, "Maria", "Lopez");
        contacto.setIdContacto(1);
        contacto.setContactoTipo(ContactoTipo.FAMILIAR);

        ContactoDomicilio domicilio = new ContactoDomicilio(1, "Calle 123");
        contacto.addDomicilio(domicilio);

        ContactoTelefono telefono = new ContactoTelefono(1, "54", "12345678");
        contacto.addTelefono(telefono);

        usuario.addContacto(contacto);

        System.out.println("Usuario: " + usuario.getNombre() + " " + usuario.getApellido());
        System.out.println("Contacto: " + contacto.getNombre() + " " + contacto.getApellido());
        System.out.println("Domicilio: " + domicilio.getDescripcion());
        System.out.println("Telefono: " + telefono.getCodigo() + " " + telefono.getNumero());

    }
}
