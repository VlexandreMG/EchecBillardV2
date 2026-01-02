package game.constants;

import javafx.scene.paint.Color;

public class GameConstants {
    
    public static final double BOARD_SIZE = 800.0;
    public static final double CELL_SIZE = BOARD_SIZE / 8;
    
    public static final int BALL_RADIUS = 10;
    public static final int PIECE_RADIUS = 25;
    
    public static final Color LIGHT_CELL = Color.WHITE;
    public static final Color DARK_CELL = Color.rgb(210, 180, 140);
    
    public static final Color GRID_COLOR = Color.BLACK;
    public static final Color WHITE_PIECE = Color.LIGHTBLUE;
    public static final Color BLACK_PIECE = Color.DIMGRAY;
    public static final Color BALL_COLOR = Color.RED;
    public static final Color TARGET_FILL = Color.rgb(0, 255, 0, 0.4);
    public static final Color TARGET_BORDER = Color.GREEN;
    
    public static final String PIECE_FONT = "Arial Bold";
    public static final String HEALTH_FONT = "Arial";
}