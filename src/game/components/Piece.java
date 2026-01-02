package game.components;

public class Piece {
    private int column;
    private int row;
    private String type;
    private int health;
    private int maxHealth;
    private boolean isWhite;
    
    public Piece(int column, int row, String type, int maxHealth, boolean isWhite) {
        this.column = column;
        this.row = row;
        this.type = type;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.isWhite = isWhite;
    }
    
    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }

}