package pl.ml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author pmatusiak
 */
public class Main extends Application {
    /**
     * Program ma za zadanie wylosować liczbę, a użytkownik ma ją zgadnąć.
     * Jeśli użytkownik poda mniejszą niż wylosowana - program wypisuje tekst "za mała liczba", jeśli poda większą wypisuje "za duża liczba".
     */

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/root.fxml"));
        fxmlLoader.load();

        Parent root = fxmlLoader.getRoot();
        GuessingGame game = fxmlLoader.getController();
        game.setStage(primaryStage);
        game.newGame();

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
