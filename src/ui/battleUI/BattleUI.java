package ui.battleUI;

import javafx.scene.Group;
import javafx.scene.ImageCursor;
import javafx.scene.image.*;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import models.GamePlay.Match;
import models.Unit;
import ui.ImageLibrary;

import java.awt.*;

public class BattleUI {

    private Match match;

    private ImageView background;
    private TableBuilder tableBuilder = new TableBuilder();

    public BattleUI(Match match) {
        this.match = match;
    }


    public void battleUI() {

        Stage mainStage = new Stage();

        Pane pane = new Pane();
        background = new ImageView(ImageLibrary .Background.getImage());
        background.fitHeightProperty().bind(mainStage.heightProperty());
        background.fitWidthProperty().bind(mainStage.widthProperty());

        GridPane polygons = tableBuilder.getPolygons();

        pane.getChildren().addAll(background, polygons, header());
        Scene scene = new Scene(pane, 1280, 720);
        scene.getStylesheets().add(getClass().getResource("/ui/style/style.css").toExternalForm());
        scene.setCursor(new ImageCursor(ImageLibrary.CursorImage.getImage()));
        mainStage.setScene(scene);
        mainStage.setResizable(false);
        mainStage.show();
    }


    public Group header() {

        Group group = new Group();
        group.getChildren().addAll(imageHeader());
        return group;
    }

    public AnchorPane imageHeader() {

        AnchorPane headerImage = new AnchorPane();
        headerImage.relocate(0, 0);

        ImageView leftImageHeader = new ImageView(ImageLibrary.LeftImageHeader.getImage());
        ImageView rightImageHeader = new ImageView(ImageLibrary.RightImageHeader.getImage());

        leftImageHeader.setScaleX(.4);
        leftImageHeader.setScaleY(.4);
        rightImageHeader.setScaleX(.4);
        rightImageHeader.setScaleY(.4);

        leftImageHeader.setLayoutX(-150);
        leftImageHeader.setLayoutY(-80);
        rightImageHeader.setLayoutX(800);
        rightImageHeader.setLayoutY(-65);

        int player1HeroHp = ((Unit) (match.getPlayer1().getHand().getHero())).getHP();
        int player2HeroHp = ((Unit) (match.getPlayer2().getHand().getHero())).getHP();
        Label labelPlayer1HeroHP = new Label(Integer.toString(player1HeroHp));
        Label labelPlayer2HeroHP = new Label(Integer.toString(player2HeroHp));

        labelPlayer1HeroHP.setLocation(100, 100);
        labelPlayer2HeroHP.setLocation(800, 100);

        headerImage.getChildren().addAll(leftImageHeader, rightImageHeader);
        return headerImage;
    }
}
