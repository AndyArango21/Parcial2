package co.edu.uniquindio.proyectoprogramacionfx.prestamo.model;

import co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.builder.ClienteBuielder;
import co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.builder.ObjetoBuielder;

public class Objeto {
    private String nombre;
    PrestamoUq ownedByPrestamoUq;
    public Objeto() {
    }


    public Objeto(String nombre) {
        this.nombre = nombre;
    }

    public static ObjetoBuielder builder(){
        return new ObjetoBuielder();
    }

    public String getNombre() {
        return nombre;
    }

    public PrestamoUq getOwnedByPrestamoUq() {
        return ownedByPrestamoUq;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
