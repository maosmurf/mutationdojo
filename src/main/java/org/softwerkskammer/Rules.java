package org.softwerkskammer;

public class Rules {

    public static final boolean ALIVE = true;
    public static final boolean DEAD = false;

    public boolean next(boolean isAlive, int livingNeighbours) {
        // Any live cell with fewer than two live neighbours dies, as if by underpopulation.
        if (isAlive && livingNeighbours < 2) {
            return false;
        }
        // Any live cell with two or three live neighbours lives on to the next generation.
        if (isAlive && (livingNeighbours == 2 || livingNeighbours == 3)) {
            return true;
        }
        // Any live cell with more than three live neighbours dies, as if by overpopulation.
        if (isAlive && livingNeighbours > 3) {
            return false;
        }
        // Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
        if (!isAlive && livingNeighbours == 3) {
            return true;
        }
        return isAlive;
    }
}
