package ru.parsentev.task_015;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class CycleShift {
    private static final Logger log = getLogger(CycleShift.class);

    private final int[] values;

    public CycleShift(final int[] values) {
        this.values = values;
    }

    public int[] shift(int position) {
        position = position % values.length;
        for (int i = 0; i < position; i++) {
            int temp = values[0];
            for (int j = 1; j < values.length; j++) {
                values[j - 1] = values[j];
                values[j] = temp;
            }
        }
        return values;
    }
}
