package pl.ml;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;


/**
 * @author pmatusiak
 */
public class GuessingGame implements Initializable {

    @FXML
    private Button tryButton;

    @FXML
    private TextField guess;

    @FXML
    private Label message;

    private Stage stage;
    private int number;
    private int tries = 1;
    private Random random = new Random();

    public void newGame() {
        number = random.nextInt(100) + 1;
    }

    public void checkGuess() {

        String guessText = guess.getText();

        try {
            int guess = Integer.parseInt(guessText);
            if (guess < number) {
                message.setText(guess + " is too low!");
            } else if (guess > number) {
                message.setText(guess + " is too high!");
            } else {
                message.setText(guess + " is correct! It only took you " + tries + " tries.");
                newGame();
            }
        } catch (Exception e) {
            message.setText("Enter whole number in range 1 to 100");
        } finally {
            tries++;
            guess.requestFocus();
            guess.selectAll();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void setStage(Stage primaryStage) {
        this.stage = primaryStage;
    }
}
