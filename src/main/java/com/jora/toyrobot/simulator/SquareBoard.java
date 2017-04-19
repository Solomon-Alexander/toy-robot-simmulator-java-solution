package com.jora.toyrobot.simulator;

/**
*
* @author Solomon Alexander
* created on 18/04/2017
*/
public class SquareBoard implements Board {

    int rows;
    int columns;

    public SquareBoard(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    @Override
    public boolean isValidPosition(Position position) {
        return !(
                position.getX() > this.columns || position.getX() < 0 ||
                        position.getY() > this.rows || position.getY() < 0
        );
    }
}
