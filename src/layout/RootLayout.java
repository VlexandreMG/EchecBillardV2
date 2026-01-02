package layout;

import javafx.scene.layout.BorderPane;

public class RootLayout extends BorderPane {
    
    public RootLayout() {
        this.setPrefSize(1000, 850); // Plus grand pour accommoder les contrôles
        
        // Style de base
        this.setStyle("-fx-background-color: #2c3e50;");
    }
}