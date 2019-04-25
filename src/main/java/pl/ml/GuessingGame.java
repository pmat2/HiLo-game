package pl.ml;

import java.util.Random;


/**
 * @author pmatusiak
 */
public class GuessingGame {

    private int number;
    private int tries;
    private Random random = new Random();

    public void newGame(){
        number = random.nextInt(100)+1;
    }

    public void checkGuess(){
        String guessText;

    }
}
