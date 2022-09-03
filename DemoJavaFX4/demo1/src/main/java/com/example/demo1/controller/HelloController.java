package com.example.demo1.controller;

import com.example.demo1.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField tfNombre;

    @FXML
    protected void onHelloButtonClick() throws IOException {

        welcomeText.setText("Welcome " + tfNombre.getText() + " to JavaFX Application!");


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menu-principal.fxml"));
        Pane root = (Pane) fxmlLoader.load();
        Scene scene = new Scene(root, 600, 500);
        Stage stage = new Stage();
        stage.setTitle("UMG APP");
        stage.setScene(scene);
        stage.show();


    }
}