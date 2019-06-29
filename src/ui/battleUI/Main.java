package ui.battleUI;

import controller.BattleController;
import javafx.application.Application;
import javafx.stage.Stage;
import models.GamePlay.Match;

public class Main extends Application {

    public static Match match;

    @Override
    public void start(Stage primaryStage) {
        BattleController.battleUI = new BattleUI(match);
        BattleController.battleUI.battleUI(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
