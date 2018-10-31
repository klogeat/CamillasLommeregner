package FrontStage;

import VariansStage.Varians;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FrontStage {
    static public Stage primaryStage;



    static public void setStage(Stage stage){primaryStage = stage; }

    static public void setScene(){
        Parent root = null;
        try {
            root = FXMLLoader.load(FrontStage.class.getResource("frontStage.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
    }

    public void variansPressed() {
        Varians.setScene();
    }

    public void gennemsnitPressed() {
    }

    public void buttonPressed(){
    }


}
