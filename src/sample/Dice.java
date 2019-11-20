/**
 * Object class dice
 */
package sample;
public class Dice {
    private static final int diceMAX = 7;
    private static final int diceMin = 1;
    private int value;
    public void dice () {

    }

    /**
     * method to roll dice and get a value between 1-6
     */
    public void rolldie(){

        this.value = (int)(Math.random()* diceMAX - diceMin) + diceMin;
    }

    /**
     * Method to get dice roll value
     * @return
     */
    public int getValue(){
        return value;
    }
}
