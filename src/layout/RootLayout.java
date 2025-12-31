package layout;

import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;

public class RootLayout {

    private BorderPane borderPane;

    public RootLayout() {
        //Initialiser le borderPane
        borderPane = new BorderPane();

        //Conig de base 
        borderPane.setPrefSize(800, 600);

        //Visualiser les zones durant le dev
        applyDebugStyles();
    }

    public BorderPane getBorderPane() {
        return borderPane;
    }

    private void applyDebugStyles() {
         // Créer des labels simples avec bordures
        Label topLabel = new Label("TOP");
        topLabel.setStyle("-fx-border-color: red; -fx-border-width: 2px; -fx-padding: 10px;");
        
        Label centerLabel = new Label("CENTER");
        centerLabel.setStyle("-fx-border-color: green; -fx-border-width: 2px; -fx-padding: 10px;");
        
        Label bottomLabel = new Label("BOTTOM");
        bottomLabel.setStyle("-fx-border-color: blue; -fx-border-width: 2px; -fx-padding: 10px;");
        
        Label leftLabel = new Label("LEFT");
        leftLabel.setStyle("-fx-border-color: orange; -fx-border-width: 2px; -fx-padding: 10px;");
        
        Label rightLabel = new Label("RIGHT");
        rightLabel.setStyle("-fx-border-color: purple; -fx-border-width: 2px; -fx-padding: 10px;");
        
        // Ajouter au BorderPane
        borderPane.setTop(topLabel);
        borderPane.setCenter(centerLabel);
        borderPane.setBottom(bottomLabel);
        borderPane.setLeft(leftLabel);
        borderPane.setRight(rightLabel);
    }

    //Methodes pour acceder au differentes zones 
    public void setTopContent(javafx.scene.Node node) {
        borderPane.setTop(node);
    }

    public void setCenterContent(javafx.scene.Node node) {
        borderPane.setCenter(node);
    }
    
    public void setBottomContent(javafx.scene.Node node) {
        borderPane.setBottom(node);
    }
    
    public void setLeftContent(javafx.scene.Node node) {
        borderPane.setLeft(node);
    }
    
    public void setRightContent(javafx.scene.Node node) {
        borderPane.setRight(node);
    }

    
}

