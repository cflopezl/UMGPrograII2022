package umg.edu.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import umg.edu.model.Pelicula;
import umg.edu.utils.VariableGlobales;

public class MainController {

    @FXML
    Button btnUsuario;
    @FXML
    Button btnPeliculas;
    @FXML
    Button btnCartelera;
    @FXML
    Pane panelPelicula;
    @FXML
    Pane panelCartelera;
    @FXML
    Pane panelUsuario;
    @FXML
    TextField txtNombre;
    @FXML
    TextField txtRaiting;
    @FXML
    TextField txtDuracion;
    @FXML
    TableView tvPeliculas;
    @FXML
    TableColumn tcId;
    @FXML
    TableColumn tcNombre;
    @FXML
    TableColumn tcRating;
    @FXML
    TableColumn tcDuracion;

    public MainController() {
    }

    public void initialize(){

        tcId.setCellValueFactory( new PropertyValueFactory<Pelicula, Integer>("id"));
        tcNombre.setCellValueFactory( new PropertyValueFactory<Pelicula, String>("nombre"));
        tcRating.setCellValueFactory( new PropertyValueFactory<Pelicula, String>("rating"));
        tcDuracion.setCellValueFactory( new PropertyValueFactory<Pelicula, Integer>("duracion"));

        ObservableList<Pelicula> data = FXCollections.observableArrayList(VariableGlobales.vgPeliculas);
        tvPeliculas.setItems( data );

    }

    public void onClickMenu(ActionEvent actionEvent){

        if( actionEvent.getSource() == btnUsuario){
            panelUsuario.toFront();
        }

        if( actionEvent.getSource() == btnPeliculas){
            panelPelicula.toFront();
        }

        if( actionEvent.getSource() == btnCartelera){
            panelCartelera.toFront();
        }

    }

    public void onClickAgregarPelicula(ActionEvent actionEvent){

        // 1. obtener datos de la GUI
        String nombre = txtNombre.getText();
        String rating = txtRaiting.getText();
        int duracion = Integer.parseInt(txtDuracion.getText());

        // 2. crear la instancia del modelo pelicula
        Pelicula pelicula = new Pelicula(nombre, rating, duracion);

        // 3. guardarlo en el arreglo
        VariableGlobales.vgPeliculas.add(pelicula);

        // 4. limpiar los campos
        txtNombre.setText("");
        txtRaiting.setText("");
        txtDuracion.setText("");

        ObservableList<Pelicula> data = FXCollections.observableArrayList(VariableGlobales.vgPeliculas);
        tvPeliculas.setItems( data );

    }


}
