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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DiceRoll implements Initializable {

    private int players;
    @FXML
    private Button goBackbtn;

    @FXML
    private Button rollBtn;

    @FXML
    private ImageView playerOneScore;

    @FXML
    private ImageView playerTwoScore;

    @FXML
    private ImageView playerThreeScore;

    @FXML
    private ImageView playerFourScore;

    @FXML
    private ImageView playerFiveScore;

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
        for(int i=1;i<6;i++){

            d1.rolldie();
            int d1Roll = d1.getValue();
            System.out.println(d1Roll);
            Image temp = new Image("sample/Dice_Six.jpg");
            temp = setScorePictures(d1Roll);


            switch (i){
                case 1:
                    playerOneScore.setImage(temp);
                    break;
                case 2:
                    playerTwoScore.setImage(temp);
                    break;
                case 3:
                    playerThreeScore.setImage(temp);
                    break;
                case 4:
                    playerFourScore.setImage(temp);
                    break;
                case 5:
                    playerFiveScore.setImage(temp);
                    break;
            }

        }

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

    public Image setScorePictures(int score){

        Image dieImage = new Image("sample/Dice_Six.jpg");

        switch (score){

            case 1:
                Image imgOne = new Image("sample/Dice_one.jpg");
                return imgOne;

            case 2:
                Image imgTwo = new Image("sample/Dice_Two.jpg");
                return imgTwo;

            case 3:
                Image imgThree = new Image("sample/Dice_Three.jpg");
                return imgThree;

            case 4:
                Image imgFour = new Image("sample/Dice_four.jpg");
                return imgFour;

            case 5:
                Image imgFive = new Image("sample/Dice_Five.jpg");
                return imgFive;

            case 6:
                Image imgSix = new Image("sample/Dice_Six.jpg");
                return imgSix;
        }
        return dieImage;
    }


}
