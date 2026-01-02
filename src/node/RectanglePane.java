package node;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectanglePane extends Pane {

    public RectanglePane() {
        // Version avec un Rectangle enfant au lieu de style CSS
        Rectangle rect = new Rectangle(400, 400);
        rect.setFill(Color.RED); // ROUGE vif
        rect.setStroke(Color.YELLOW);
        rect.setStrokeWidth(10);
        
        this.getChildren().add(rect);
        
        // Forcer la taille
        this.setPrefSize(400, 400);
        this.setMinSize(400, 400);
        this.setMaxSize(400, 400);
    }
}