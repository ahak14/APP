package ui.battleUI;

import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import ui.ImageLibrary;


public class HandBuilder {

    HBox getHand() {

        HBox hand = new HBox();

        for (int i = 0; i < 6; i++) {

            ImageView cardAroundImage = new ImageView(ImageLibrary.HandCardAround.getImage());
            cardAroundImage.getStyleClass().add("enterMouseOnHandCard");
            hand.getChildren().add(cardAroundImage);
        }

        hand.relocate(250, 570);
        hand.setSpacing(20);
        return hand;
    }
}
