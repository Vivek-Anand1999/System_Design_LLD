package snakeLadder.model;

public class Players {
    private int piecePosition;
    private String playerName;

    public Players() {
        this.piecePosition = 0;
    }

    public int getPiecePosition() {
        return piecePosition;
    }

    public void setPiecePosition(int piecePosition) {
        this.piecePosition = piecePosition;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
