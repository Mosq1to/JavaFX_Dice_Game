package sample;

public class Dice {
    private static final int diceMAX = 6;
    private static final int diceMin = 1;
    private int value;
    public void Dice () {

    }

    public void rolldie(){

        this.value = (int)(Math.random()* diceMAX - diceMin) + diceMin;
    }

    public int getValue(){
        return value;
    }
}
