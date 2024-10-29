package co.edu.uniquindio.proyectoprogramacionfx.prestamo.viewcontroler;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.proyectoprogramacionfx.prestamo.Controler.PrestamoControler;
import co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.Cliente;
import co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.Objeto;
import co.edu.uniquindio.proyectoprogramacionfx.prestamo.model.PrestamoObjetos;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PrestamoAppControler {

        PrestamoControler prestamoControler;
        ObservableList<PrestamoObjetos>listaPrestamoObjetos = FXCollections.observableArrayList();
        PrestamoObjetos PrestamoSeleccionado;

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button btnBuscarId;

        @FXML
        private Button btnBuscarMasPrestado;


        @FXML
        private Button btnClienteMasPrestamo;

        @FXML
        private TableColumn<PrestamoObjetos, String> colBuscarDescripcion;

        @FXML
        private TableColumn<PrestamoObjetos,String> colBuscarFechaFin;

        @FXML
        private TableColumn<PrestamoObjetos,String> colBuscarFechaInicio;

        @FXML
        private TableColumn<PrestamoObjetos,String> colBuscarId;

        @FXML
        private TableColumn<PrestamoObjetos,String> colCantidadPrestamos;

        @FXML
        private TableColumn<PrestamoObjetos, String> colClienteMasPrestamo;

        @FXML
        private TableColumn<PrestamoObjetos,String> colDescripcionClienteMasPrestamo;

        @FXML
        private TableColumn<PrestamoObjetos,String> colDescripcionMas;

        @FXML
        private TableColumn<PrestamoObjetos,String> colFechaFinMasPrestado;

        @FXML
        private TableColumn<PrestamoObjetos,String> colFechaFinMasPrestamo;

        @FXML
        private TableColumn<PrestamoObjetos,String> colFechaInicioMasPrestado;

        @FXML
        private TableColumn<PrestamoObjetos,String> colIdMasPrestado;

        @FXML
        private TableColumn<PrestamoObjetos,String> colDisponible;

        @FXML
        private TableColumn<PrestamoObjetos,String> colNoDisponioble;

        @FXML
        private TableView<PrestamoObjetos> taVMasPrestado;

        @FXML
        private TableView<PrestamoObjetos> tvBuscarId;

        @FXML
        private TableView<PrestamoObjetos> tvClienteMasPrestamo;

        @FXML
        private TableView<PrestamoObjetos> tvObjetosDisponible;

        @FXML
        private TextField txtBuscarId;

        @FXML
        private TextField txtClienteMasPrestamo;

        @FXML
        private TextField txtMasPrestado;



        @FXML
        void initialize() {
                prestamoControler = new PrestamoControler();
                initviwe();


        }

        private void initviwe() {
               initDataBinding();
                obtenerObjetos();
                taVMasPrestado.getItems().clear();
                taVMasPrestado.setItems(listaPrestamoObjetos);
                listenerSelection();


        }

        private void obtenerObjetos() {

        }
        // seleciona un elemento de la tabla
        private void listenerSelection() {
                taVMasPrestado.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
                        PrestamoSeleccionado = newSelection;
                        mostrarInformacionObjeto (PrestamoSeleccionado);
                });

        }
        // permite mostrar elemento de la tabla
        private void mostrarInformacionObjeto(PrestamoObjetos prestamoSeleccionado) {
                if(PrestamoSeleccionado != null){
                        txtMasPrestado.setText(PrestamoSeleccionado.rango());


                }
        }


        private void initDataBinding() {
                colBuscarDescripcion.setCellValueFactory( cellData -> new
                       SimpleStringProperty(cellData.getValue().getDescripcion()));
                colBuscarFechaFin.setCellValueFactory( cellData -> new
                        SimpleStringProperty(cellData.getValue().getFechaEntrega()));
                colBuscarFechaInicio.setCellValueFactory( cellData -> new
                        SimpleStringProperty(cellData.getValue().getFechaPrestamo()));
                colBuscarId.setCellValueFactory( cellData -> new
                        SimpleStringProperty(cellData.getValue().getNumeroPrestamo()));


        }

        @FXML
        void OnBuscarClienteMasPrestamos(ActionEvent event) {


        }

        @FXML
        void OnBuscarId(ActionEvent event) {

        }

        @FXML
        void OnListaMasPrestados(ActionEvent event) {

        }



}

