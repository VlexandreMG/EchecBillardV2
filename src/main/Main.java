package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import layout.RootLayout;
import game.components.ChessBoard;
import game.components.Piece;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Créer le layout racine
        RootLayout rootLayout = new RootLayout();
        
        // Créer le plateau d'échecs
        ChessBoard chessBoard = new ChessBoard();
        
        // Ajouter quelques pièces de test
        chessBoard.addPiece(new Piece(0, 0, "R", 5, false)); // Roi noir
        chessBoard.addPiece(new Piece(7, 7, "R", 5, true));  // Roi blanc
        chessBoard.addPiece(new Piece(3, 3, "Q", 4, true));  // Dame blanche
        
        // Placer le plateau au centre
        rootLayout.setCenter(chessBoard);
        
        // Créer la scène
        Scene scene = new Scene(rootLayout, 1000, 850);
        
        // Configurer la fenêtre
        primaryStage.setTitle("Échecs Ping-Pong - JavaFX Version");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}