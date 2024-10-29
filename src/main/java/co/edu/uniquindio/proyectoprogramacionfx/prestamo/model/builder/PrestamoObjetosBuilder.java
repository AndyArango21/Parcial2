package co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.builder;

import co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.Cliente;
import co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.Empleado;
import co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.Objeto;
import co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.PrestamoObjetos;

import java.util.ArrayList;
import java.util.List;

public class PrestamoObjetosBuilder {
   protected String numeroPrestamo;
   protected String fechaPrestamo;
   protected String fechaEntrega;
   protected String descripcion;
   protected Empleado empleadoAsociado;
   protected Cliente clienteAsociado;
   protected List<Objeto> listaObjetosAsociados = new ArrayList<>();

   public PrestamoObjetosBuilder numeroPrestamo(String numeroPrestamo) {
      this.numeroPrestamo = numeroPrestamo;
      return this;
   }
   public PrestamoObjetosBuilder fechaPrestamo(String fechaPrestamo) {
      this.fechaPrestamo = fechaPrestamo;
      return this;
   }

   public PrestamoObjetosBuilder fechaEntrega(String fechaEntrega) {
      this.fechaEntrega = fechaEntrega;
      return this;
   }
   public PrestamoObjetosBuilder descripcion(String descripcion) {
      this.descripcion = descripcion;
      return this;
   }
   public PrestamoObjetosBuilder empleadoAsociado(Empleado empleadoAsociado) {
      this.empleadoAsociado = empleadoAsociado;
      return this;
   }
   public PrestamoObjetosBuilder clienteAsociado(Cliente clienteAsociado) {
      this.clienteAsociado = clienteAsociado;
      return this;
   }
   public PrestamoObjetosBuilder listaObjetosAsociados(List<Objeto> listaObjetosAsociados) {
      this.listaObjetosAsociados = listaObjetosAsociados;
      return this;
   }
   public PrestamoObjetos build() {
      return new PrestamoObjetos(numeroPrestamo, fechaPrestamo, fechaEntrega, descripcion, empleadoAsociado, clienteAsociado, listaObjetosAsociados);
   }

}
