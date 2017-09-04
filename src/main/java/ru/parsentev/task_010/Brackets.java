package ru.parsentev.task_010;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Brackets {
    private static final Logger log = getLogger(Brackets.class);
    private final String line;


    public Brackets(final String line) {
        this.line = line;
    }

    public boolean isCorrect() {
        boolean isChoice = false;
        int uniq = line.length();
        int count = 0;
        int count2 = 0;
        String[] brakets = line.split("");
        String[] brkts = {"("};
        String[] brkts2 = {")"};
        for (int i = 0; i < uniq; i++) {
            for (int j = 0; j < uniq; j++) {
                if (brakets[i].equals(brkts[j])) {
                    count++;
                    break;
                } else if (brakets[i].equals(brkts2[j])) {
                    count2++;
                    break;
                }
            }
        }

        if (count == count2) {
            isChoice = true;
        } else {
            isChoice = false;
        }
        return isChoice;
    }
}

