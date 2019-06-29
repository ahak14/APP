package ui.battleUI;

import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import ui.ImageLibrary;


public class HandBuilder {

    HBox getHand() {

        HBox hand = new HBox();

        for (int i = 0; i < 6; i++) {

            ImageView cardAroundImage = new ImageView(ImageLibrary.HandCardAround.getImage());
            cardAroundImage.setScaleX(0.7);
            cardAroundImage.setScaleY(0.7);
            cardAroundImage.getStyleClass().add("enterMouseOnHandCard");
            hand.getChildren().add(cardAroundImage);
        }

        hand.relocate(330, 570);
        hand.setSpacing(-10);
        return hand;
    }
}
