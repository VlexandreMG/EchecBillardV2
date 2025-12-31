package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import layout.RootLayout;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // 1. Créer le Root Layout (notre BorderPane personnalisé)
        RootLayout rootLayout = new RootLayout();
        
        // 2. Créer la Scene avec ce layout comme racine
        Scene scene = new Scene(rootLayout.getBorderPane(), 800, 600);
        
        // 3. Configurer la fenêtre principale (Stage)
        primaryStage.setTitle("Mon Projet JavaFX - Structure Propre");
        primaryStage.setScene(scene);
        
        // 4. Afficher la fenêtre
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}