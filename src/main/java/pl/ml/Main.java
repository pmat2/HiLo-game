package pl.ml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @author pmatusiak
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/root.fxml"));
        fxmlLoader.load();

        Parent root = fxmlLoader.getRoot();
        primaryStage.getIcons().add(new Image("question-mark-square-01.png"));
        primaryStage.setTitle("Hi-Lo Game");
        GuessingGame game = fxmlLoader.getController();
        game.setStage(primaryStage);
        game.newGame();

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
