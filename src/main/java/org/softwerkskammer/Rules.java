package org.softwerkskammer;

public class Rules {

    public static final boolean ALIVE = true;
    public static final boolean DEAD = false;

    public boolean next(boolean isAlive, int livingNeighbours) {
        // Any live cell with ...
        if (isAlive) {
            // ...fewer than two live neighbours dies, as if by underpopulation.
            // ...two or three live neighbours lives on to the next generation.
            // ...more than three live neighbours dies, as if by overpopulation.
            return (livingNeighbours == 2 || livingNeighbours == 3);
        }
        // Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
        return livingNeighbours == 3;
    }
}
