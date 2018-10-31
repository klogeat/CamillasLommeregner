package VariansStage;

import FrontStage.FrontStage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Varians {
    static public Stage primaryStage;

    static public void setStage(Stage stage){primaryStage = stage; }

    static public void setScene(){
        Parent root = null;
        try {
            root = FXMLLoader.load(Varians.class.getResource("varians.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
    }

    @FXML
    public void returnToFrontScene(){
        FrontStage.setScene();
    }
}
