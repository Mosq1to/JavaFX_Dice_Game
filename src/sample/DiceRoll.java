package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class DiceRoll {

    @FXML
    private Button goBackbtn;
    @FXML
    private Label rollOne;
    @FXML
    private Label rollTwo;
    @FXML
    private Label rollThree;
    @FXML
    private Label rollFour;
    @FXML
    private Label rollFive;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene revertToOld = new Scene(root);

        //Get current Stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Set new Scene
        window.setScene(revertToOld);

    }



}
