package ru.parsentev.task_018;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Pool {
    private static final Logger log = getLogger(Pool.class);

    private final int[][] values;
    private int counter = 0;
    private final int connected = 3;
    private int count1 = 0;
    private int count2 = 0;

    public Pool(final int[][] values) {
        this.values = values;
    }

    public int maxUnion() {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[i][0] == values[i][j]) {
                    count1++;
                    break;
                } else if (values[j][i] == values[0][i]) {
                    count2++;
                    break;
                }
            }
        }
        if (count1 > count2) {
            return count1;
        } else if (count1 < count2) {
            return count2;
        }

        return counter;
    }
}
