package co.edu.uniquindio.proyectoprogramacionfx.prestamo.model;

import co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.builder.PrestamoObjetosBuilder;

import java.util.ArrayList;
import java.util.List;

public class PrestamoObjetos {
    private String numeroPrestamo;
    private String fechaPrestamo;
    private String fechaEntrega;
    private String descripcion;
    private Empleado empleadoAsociado;
    private Cliente clienteAsociado;
    private int rango;
    List<Objeto> listaObjetosAsociados = new ArrayList<>();

    public PrestamoObjetos() {

    }

    public PrestamoObjetos(String numeroPrestamo,
                           String fechaPrestamo,
                           String fechaEntrega,
                           String descripcion,
                           Empleado empleadoAsociado,
                           Cliente clienteAsociado,
                           int rango,
                           List<Objeto> listaObjetosAsociados) {
        this.numeroPrestamo = numeroPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.descripcion = descripcion;
        this.empleadoAsociado = empleadoAsociado;
        this.clienteAsociado = clienteAsociado;
        this.rango = rango;
        this.listaObjetosAsociados = listaObjetosAsociados;
    }

    public PrestamoObjetos(String numeroPrestamo, String fechaPrestamo, String fechaEntrega, String descripcion, Empleado empleadoAsociado, Cliente clienteAsociado, List<Objeto> listaObjetosAsociados) {
    }


    public static PrestamoObjetosBuilder builder(){
        return new PrestamoObjetosBuilder();
    }

    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public int getRango() {
        return rango;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Empleado getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public List<Objeto> getListaObjetosAsociados() {
        return listaObjetosAsociados;
    }

    @Override
    public String toString() {
        return "PrestamoObjetos{" +
                "numeroPrestamo='" + numeroPrestamo + '\'' +
                ", fechaPrestamo='" + fechaPrestamo + '\'' +
                ", fechaEntrega='" + fechaEntrega + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", empleadoAsociado=" + empleadoAsociado +
                ", clienteAsociado=" + clienteAsociado +
                ", rango=" + rango +
                ", listaObjetosAsociados=" + listaObjetosAsociados +
                '}';
    }


}
