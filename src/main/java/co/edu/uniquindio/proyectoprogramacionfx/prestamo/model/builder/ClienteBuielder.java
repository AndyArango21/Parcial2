package co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.builder;


import co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.Cliente;

public class ClienteBuielder {
    protected String cedula;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String telefonoFijo;
    protected String telefonoCelular;
    protected String direccion;
    protected int edad;

    public ClienteBuielder cedula(String cedula) {
        this.cedula = cedula;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuielder nombre(String nombre) {
        this.nombre = nombre;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuielder apellido(String apellido) {
        this.apellido = apellido;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuielder email(String email) {
        this.email = email;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuielder telefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuielder telefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuielder direccion(String direccion) {
        this.direccion = direccion;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public ClienteBuielder edad(int edad) {
        this.edad = edad;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public Cliente build() {
        return new Cliente(cedula, nombre, apellido, email, telefonoFijo, telefonoCelular, direccion, edad);
    }
}
