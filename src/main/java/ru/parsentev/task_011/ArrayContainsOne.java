package ru.parsentev.task_011;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class ArrayContainsOne {
    private final int[] values;
    private int count = 0;

    public ArrayContainsOne(final int[] values) {
        this.values = values;
    }

    public boolean containsOnlyOne() {
        boolean sequence = false;
        int length = values.length;
        int unit = 1;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (values[j] == unit) {
                    sequence = true;
                    continue;
                } else if (values[i + j] != unit) {
                    return false;
                }
            }
            if (sequence) break;
        }
        return sequence;
    }
}
