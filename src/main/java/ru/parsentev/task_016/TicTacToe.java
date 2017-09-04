package ru.parsentev.task_016;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class TicTacToe {
    private static final Logger log = getLogger(TicTacToe.class);

    private int count = 0;
    private int counter = 3;
    private int[][] values;

    public TicTacToe(final int[][] values) {
        for (int i = 0; i < counter - count; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[i][0] == values[i][j]) {
                    count++;
                    if (count == 3) {
                        break;
                    }
                }
                if (values[i] == values[j]) {
                    count++;
                    if (count == 3) {
                        break;
                    }
                }
                if (values[j][i] == values[0][i]) {
                    count++;
                    if (count == 3) {
                        break;
                    }
                }
            }
        }
    }

    public boolean hasWinner() {
        return (counter == count) ? true : false;
    }
}
