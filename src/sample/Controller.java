package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

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
    void startgame(ActionEvent event) {
        String spelare = players.getValue().toString();
        System.out.println(spelare);


    }



    @FXML
    void initialize() {
        players.getItems().addAll("2","3","4","5");

    }



    }