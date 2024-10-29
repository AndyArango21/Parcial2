package co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.builder;

import co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.Cliente;
import co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.Objeto;

public class ObjetoBuielder {
    protected String nombre;
    public ObjetoBuielder nombre(String nombre) {
        this.nombre= nombre;
        return this; // Devuelve la instancia actual de ClienteBuilder
    }

    public Objeto build() {
        return new Objeto(nombre);
    }
}
