package snakeLadder.model;

public class Board {
    private int endSize;
    private int startSize;

    public Board(int endSize) {
        this.startSize = 1;
        this.endSize = endSize;
    }

    public int getEndSize() {
        return endSize;
    }

    public void setEndSize(int endSize) {
        this.endSize = endSize;
    }

    public int getStartSize() {
        return startSize;
    }

    public void setStartSize(int startSize) {
        this.startSize = startSize;
    }
}
