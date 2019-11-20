package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {

    @FXML
    private Button exitBtn;
    @FXML
    private Button startBtn;


    /**
     * Method will be preformed when exit button is pressed
     * @param event
     */
    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    /**
     * Method will be preformed when start button is pressed
     * @param event
     * @throws IOException
     */
    @FXML
    void startgame(ActionEvent event) throws IOException {
        Parent diceRollParent = FXMLLoader.load(getClass().getResource("diceRoll.fxml"));
        Scene diceRollScene = new Scene(diceRollParent);

        //Get current Stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Set new Scene
        window.setScene(diceRollScene);


    }

    }