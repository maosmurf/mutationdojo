package org.softwerkskammer;

import static org.softwerkskammer.State.ALIVE;
import static org.softwerkskammer.State.DEAD;

public class Rules {

    public State next(State state, int livingNeighbours) {

        if ((state == ALIVE && livingNeighbours == 2) || livingNeighbours == 3) {
            return ALIVE;
        }
        return DEAD;
//        // Any live cell with ...
//        if (isAlive) {
//            // ...fewer than two live neighbours dies, as if by underpopulation.
//            // ...two or three live neighbours lives on to the next generation.
//            // ...more than three live neighbours dies, as if by overpopulation.
//            if (livingNeighbours == 2)
//                return true;
//        }
//        // Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
//        return livingNeighbours == 3;
    }
}
