package org.softwerkskammer;

public class Rules {

    public boolean next(boolean isAlive, int livingNeighbours) {
        if (livingNeighbours < 2) {
            return false;
        }
        if (livingNeighbours > 3) {
            return false;
        }
        return true;
    }
}
