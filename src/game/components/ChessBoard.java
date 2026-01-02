package game.components;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import game.constants.GameConstants;

public class ChessBoard extends Pane {
    
    public ChessBoard() {
        // Taille fixe du plateau
        this.setPrefSize(GameConstants.BOARD_SIZE, GameConstants.BOARD_SIZE);
        this.setMinSize(GameConstants.BOARD_SIZE, GameConstants.BOARD_SIZE);
        this.setMaxSize(GameConstants.BOARD_SIZE, GameConstants.BOARD_SIZE);
        
        // Dessiner l'échiquier 8×8
        drawChessBoard();
    }
    
    private void drawChessBoard() {
        // Créer les cases de l'échiquier
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Rectangle cell = new Rectangle(
                    col * GameConstants.CELL_SIZE,
                    row * GameConstants.CELL_SIZE,
                    GameConstants.CELL_SIZE,
                    GameConstants.CELL_SIZE
                );
                
                // Couleur alternée
                if ((row + col) % 2 == 0) {
                    cell.setFill(GameConstants.LIGHT_CELL);
                } else {
                    cell.setFill(GameConstants.DARK_CELL);
                }
                
                // Bordure des cases
                cell.setStroke(GameConstants.GRID_COLOR);
                cell.setStrokeWidth(1);
                
                this.getChildren().add(cell);
            }
        }
    }
    
    // Méthode pour ajouter une pièce
    public void addPiece(Piece piece) {
        double centerX = piece.getColumn() * GameConstants.CELL_SIZE + GameConstants.CELL_SIZE / 2;
        double centerY = piece.getRow() * GameConstants.CELL_SIZE + GameConstants.CELL_SIZE / 2;
        
        // Dessiner le cercle de la pièce
        Circle pieceCircle = new Circle(
            centerX, 
            centerY, 
            GameConstants.PIECE_RADIUS
        );
        
        pieceCircle.setFill(piece.isWhite() ? GameConstants.WHITE_PIECE : GameConstants.BLACK_PIECE);
        pieceCircle.setStroke(Color.BLACK);
        pieceCircle.setStrokeWidth(2);
        
        // Ajouter le type de pièce
        Text pieceType = new Text(piece.getType());
        pieceType.setFont(javafx.scene.text.Font.font(GameConstants.PIECE_FONT, 18));
        pieceType.setX(centerX - 8);
        pieceType.setY(centerY + 6);
        
        // Ajouter les vies
        Text healthText = new Text("(" + piece.getHealth() + ")");
        healthText.setFont(javafx.scene.text.Font.font(GameConstants.HEALTH_FONT, 12));
        healthText.setX(centerX - 12);
        healthText.setY(centerY + 22);
        
        this.getChildren().addAll(pieceCircle, pieceType, healthText);
    }
}