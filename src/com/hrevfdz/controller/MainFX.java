package com.hrevfdz.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
           try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/hrevfdz/view/LoginView.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Login");
            primaryStage.setResizable(false);
            primaryStage.setIconified(false);
            primaryStage.show();
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
