package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button exitBtn;
    @FXML
    private Button startBtn;
    @FXML
    private ComboBox players;


    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }


    @FXML
    void startgame(ActionEvent event) throws IOException {
        String spelare = players.getValue().toString();
        System.out.println(spelare);
        Parent diceRollParent = FXMLLoader.load(getClass().getResource("diceRoll.fxml"));
        Scene diceRollScene = new Scene(diceRollParent);

        //Get current Stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Set new Scene
        window.setScene(diceRollScene);

    }



    @FXML
    void initialize() {
        players.setValue("2");
        players.getItems().addAll("2","3","4","5");
    }

    }