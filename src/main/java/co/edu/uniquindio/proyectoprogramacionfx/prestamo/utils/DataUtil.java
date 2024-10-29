package co.edu.uniquindio.proyectoprogramacionfx.prestamo.utils;

import co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.*;
import co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.builder.PrestamoObjetosBuilder;

import java.util.ArrayList;
import java.util.List;


public class DataUtil {
    public static PrestamoUq inicializarDatos() {
        PrestamoUq prestamoObjeto = new PrestamoUq();

        Cliente cliente1 = Cliente.builder().
                nombre("juan").
                apellido("gomez").
                cedula("12345").
                email("amarangoje@hahas")
                .direccion("calle siempre viva ")
                .build();
        Cliente cliente2 = Cliente.builder().
                nombre("julian").
                apellido("posada").
                cedula("3555").
                email("julian@")
                .direccion("calle 53 ")
                .build();
        Cliente cliente3 = Cliente.builder().
                nombre("valentina ").
                apellido("rojas").
                cedula("4545").
                email("valentin@a")
                .direccion("san andres")
                .build();
        Cliente cliente4 = Cliente.builder().
                nombre("juan jose").
                apellido("tavares").
                cedula("1745").
                email("juanjose@")
                .direccion("fachada ")
                .build();


        Objeto objeto1 = Objeto.builder()
                .nombre("Objeto1")
                .build();
        Objeto objeto2 = Objeto.builder()
                .nombre("Objeto2")
                .build();
        Objeto objeto3 = Objeto.builder()
                .nombre("Objeto3")
                .build();
        Objeto objeto4 = Objeto.builder()
                .nombre("Objeto4")
                .build();
        Objeto objeto5 = Objeto.builder()
                .nombre("Objeto5")
                .build();

        List<Objeto> listaObjetos1 = new ArrayList<>();
        listaObjetos1.add(objeto1);
        listaObjetos1.add(objeto2);

        List<Objeto> listaObjetos2 = new ArrayList<>();
        listaObjetos2.add(objeto1);
        listaObjetos2.add(objeto4);
        listaObjetos2.add(objeto5);




        PrestamoObjetos prestamoObjeto1 = PrestamoObjetos.builder()
                .numeroPrestamo("1")
                .fechaPrestamo("12,10,2024")
                .fechaEntrega("22, 10, 2024")
                .descripcion("prestamo1")
                .clienteAsociado(cliente1)
                .listaObjetosAsociados(listaObjetos1)
                .build();
        PrestamoObjetos prestamoObjeto2 = PrestamoObjetos.builder()
                .numeroPrestamo("2")
                .fechaPrestamo("12,10,2024")
                .fechaEntrega("22, 10, 2024")
                .descripcion("prestamo1")
                .clienteAsociado(cliente2)
                .listaObjetosAsociados(listaObjetos2)
                .build();


        prestamoObjeto.getListaClientes().add(cliente1);
        prestamoObjeto.getListaClientes().add(cliente2);
        prestamoObjeto.getListaClientes().add(cliente3);
        prestamoObjeto.getListaClientes().add(cliente4);
        prestamoObjeto.getlistaPrestamos().add(prestamoObjeto1);
        prestamoObjeto.getlistaPrestamos().add(prestamoObjeto2);

        return prestamoObjeto;
    }


    /*numeroPrestamo;
     fechaPrestamo;
     fechaEntrega;
     descripcion;
     empleadoAsociado;
   clienteAsociado;
   listaObjetosAsociados*/


}
