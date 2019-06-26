package ui.battleUI;

import javafx.application.Application;
import javafx.stage.Stage;
import models.GamePlay.Match;

public class Main extends Application {

    public static Match match;

    @Override
    public void start(Stage primaryStage) {
        new BattleUI(match).battleUI(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
