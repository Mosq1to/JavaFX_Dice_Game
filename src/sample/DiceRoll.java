package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DiceRoll implements Initializable {

    private int players;
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
    private Button rollBtn;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene revertToOld = new Scene(root);

        //Get current Stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Set new Scene
        window.setScene(revertToOld);

    }

    @FXML
    void roll(ActionEvent event) {
        Dice d1 = new Dice();
        d1.rolldie();
        int d1Roll = d1.getValue();
        rollOne.setText(String.valueOf(d1Roll));

    }

    public void setPlayers(int players){
        this.players = players;
        System.out.println(players);
    }

    /**
     * Will act ass a constructor for second scene
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }
}
