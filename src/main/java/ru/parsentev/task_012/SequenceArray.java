package ru.parsentev.task_012;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class SequenceArray {
    private static final Logger log = getLogger(SequenceArray.class);

    private final int[] values;

    public SequenceArray(final int[] values) {
        this.values = values;
    }

    public boolean containsOneSequence() {
        int count = 0;
        int one = 1;

        boolean sequence = false;
        int length = values.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (one == values[i]) {
                    count++;
                    if (count >= 3) {
                        sequence = true;
                        break;
                    }
                }
                if (one != values[i + j]) {
                    count++;
                    if (count < 2) {
                        sequence = false;
                        break;
                    }
                }
            }
            if (sequence) break;
        }
        return sequence;
    }
}

