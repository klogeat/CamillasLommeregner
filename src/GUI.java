import FrontStage.FrontStage;
import VariansStage.Varians;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Varians.setStage(primaryStage);
        FrontStage.setStage(primaryStage);

        Parent root = FXMLLoader.load(getClass().getResource("FrontStage/FrontStage.fxml"));
        Scene frontScene = new Scene(root);
        primaryStage.setTitle("Camillas Lommeregner");
        primaryStage.setScene(frontScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void changeScene(Parent root){

    }
}
