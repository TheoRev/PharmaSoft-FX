package com.hrevfdz.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;

public class StartWorkViewController implements Initializable {
    
    @FXML
    private JFXTextField txtMontoCaja;

    @FXML
    private JFXButton btnGuardar;

    @FXML
    private DatePicker dpFecha;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
