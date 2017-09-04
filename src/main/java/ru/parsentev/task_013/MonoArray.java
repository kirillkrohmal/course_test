package ru.parsentev.task_013;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class MonoArray {
    private static final Logger log = getLogger(MonoArray.class);

    private final int[] values;

    public MonoArray(final int[] values) {
        this.values = values;
    }

    public boolean exists() {
        //int count = 0;

        boolean sequence = false;
        int length = values.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (values[j] == values[values.length - 1]) {
                    sequence = true;
                } else if (values[i + j] == values[j + 1]) {
                    sequence = true;
                    break;
                } else if (values[i + j] != values[j + 1]) {
                    sequence = false;
                    break;
                }
            }
        }
        return sequence;
    }
}

