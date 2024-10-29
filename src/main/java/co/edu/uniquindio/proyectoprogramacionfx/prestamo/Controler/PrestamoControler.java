package co.edu.uniquindio.proyectoprogramacionfx.prestamo.Controler;

import co.edu.uniquindio.proyectoprogramacionfx.prestamo.factory.ModelFactory;

public class PrestamoControler {
    ModelFactory modelFactory;
    public PrestamoControler(){
        modelFactory = ModelFactory.getInstancia();
    }


}
