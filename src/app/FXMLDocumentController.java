/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package app;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

/**
 *
 * @author Mafeg
 */
public class FXMLDocumentController implements Initializable {
    
    private int contador = 0;
    @FXML
    private Button btnReiniciar;

    @FXML
    private Button btnSumar;

    @FXML
    private Label label;

    @FXML
    private Label lblContador;

    @FXML
    void incrementarContador(ActionEvent event) {
        this.contador++;
        this.lblContador.setText(String.valueOf(contador));
    }

    @FXML
    void reestablecerFuente(MouseEvent event) {
        this.lblContador.setFont(new Font(30));
    }

    @FXML
    void reiniciarContador(ActionEvent event) {
      
        this.contador = 0;
        this.lblContador.setText(String.valueOf(contador));
        this.lblContador.setFont(new Font(12));
    }

   
    

       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
