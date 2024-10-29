package co.edu.uniquindio.proyectoprogramacionfx.prestamo.model;

public class Empleado extends Persona {
    PrestamoUq ownedByPrestamoUq;

    public Empleado() {
    }

    public PrestamoUq getOwnedByPrestamoUq() {
        return ownedByPrestamoUq;
    }

    public void setOwnedByPrestamoUq(PrestamoUq ownedByPrestamoUq) {
        this.ownedByPrestamoUq = ownedByPrestamoUq;
    }

}
