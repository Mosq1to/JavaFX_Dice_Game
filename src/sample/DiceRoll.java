/**
 * Controller class for fxml file second scene
 */

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.IOException;



public class DiceRoll {

    private int players;
    @FXML
    private Button goBackbtn;

    @FXML
    private Button rollBtn;

    @FXML
    private Label winner;

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


    /**
     * Method will be preformed when back button is pressed
     * @param event
     */
    @FXML
    void goBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene revertToOld = new Scene(root);

        //Get current Stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Set new Scene
        window.setScene(revertToOld);

    }

    /**
     * Method will be preformed when roll button is pressed
     * @param event
     */
    @FXML
    void roll(ActionEvent event) {
        Dice d1 = new Dice();
        int [] roll = new int[6];
        for(int i=1;i<6;i++){

            d1.rolldie();
            roll[i] = d1.getValue();
            Image temp = new Image("sample/Dice_Six.jpg");
            temp = setScorePictures(roll[i]);


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
        int win = findWinner(roll);
        setWinner(win);
        System.out.println(win);

    }

    /**
     * method to set picture according to score
     * @param score
     * @return
     */

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

    /**
     * Method to find the highest number in array
     * @param roll
     * @return
     */
    public int findWinner(int[] roll){

        int biggestValue = 0;
        int arrayIndex =0;
        for(int i=1;i<6;i++){

            if(roll[i]>biggestValue){
                biggestValue = roll[i];
                arrayIndex = i;
            }
        }

        for(int i= 1;i<6;i++){
            System.out.println(arrayIndex);
            System.out.println(biggestValue);
            if (roll[i]==biggestValue && i != arrayIndex){
                    return 6;
            }

        }

        return arrayIndex;
    }

    /**
     * Set Winner Label
     * @param i
     */
    public void setWinner (int i){

        switch (i){

            case 1:
                winner.setText("Player 1 Won");
                break;
            case 2:
                winner.setText("Player 2 Won");
                break;
            case 3:
                winner.setText("Player 3 Won");
                break;
            case 4:
                winner.setText("Player 4 Won");
                break;
            case 5:
                winner.setText("Player 5 Won");
                break;
            case 6:
                winner.setText("Tie");
                break;
        }

    }


}
