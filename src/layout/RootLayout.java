package layout;

import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;

public class RootLayout {

    private BorderPane borderPane;

    public RootLayout() {
        borderPane = new BorderPane();
        borderPane.setPrefSize(800, 600);
        applyDebugBorders();
    }

    public BorderPane getBorderPane() {
        return borderPane;
    }

    private void applyDebugBorders() {
        // Créer des conteneurs avec des tailles fixes pour bien voir les zones
        Region topRegion = new Region();
        topRegion.setStyle("-fx-border-color: red; -fx-border-width: 3px; -fx-background-color: #ffeeee;");
        topRegion.setMinHeight(80); // Hauteur fixe pour TOP
        topRegion.setPrefHeight(80);
        
        Region centerRegion = new Region();
        centerRegion.setStyle("-fx-border-color: green; -fx-border-width: 3px; -fx-background-color: #eeffee;");
        
        Region bottomRegion = new Region();
        bottomRegion.setStyle("-fx-border-color: blue; -fx-border-width: 3px; -fx-background-color: #eeeeff;");
        bottomRegion.setMinHeight(60); // Hauteur fixe pour BOTTOM
        bottomRegion.setPrefHeight(60);
        
        Region leftRegion = new Region();
        leftRegion.setStyle("-fx-border-color: orange; -fx-border-width: 3px; -fx-background-color: #ffffee;");
        leftRegion.setMinWidth(120); // Largeur fixe pour LEFT
        leftRegion.setPrefWidth(120);
        
        Region rightRegion = new Region();
        rightRegion.setStyle("-fx-border-color: purple; -fx-border-width: 3px; -fx-background-color: #ffeeff;");
        rightRegion.setMinWidth(120); // Largeur fixe pour RIGHT
        rightRegion.setPrefWidth(120);
        
        // Ajouter des labels au-dessus des régions pour identifier
        Label topLabel = new Label("TOP ZONE");
        topLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        
        Label centerLabel = new Label("CENTER ZONE");
        centerLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
        
        Label bottomLabel = new Label("BOTTOM ZONE");
        bottomLabel.setStyle("-fx-font-size: 14px;");
        
        Label leftLabel = new Label("LEFT");
        leftLabel.setStyle("-fx-font-size: 14px; -fx-rotate: 90;");
        
        Label rightLabel = new Label("RIGHT");
        rightLabel.setStyle("-fx-font-size: 14px; -fx-rotate: -90;");
        
        // Ajouter au BorderPane
        borderPane.setTop(topRegion);
        borderPane.setCenter(centerRegion);
        borderPane.setBottom(bottomRegion);
        borderPane.setLeft(leftRegion);
        borderPane.setRight(rightRegion);
        
        // Superposer les labels (optionnel)
        // Pour l'instant on garde simple
    }

    // Méthodes d'accès aux zones
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