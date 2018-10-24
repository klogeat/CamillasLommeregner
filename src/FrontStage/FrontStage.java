package FrontStage;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FrontStage {

    @FXML
    TextField myTextField;
    @FXML
    Button myButton;

    public void buttonPressed(){
        System.out.println(myTextField.getText());
    }
}
