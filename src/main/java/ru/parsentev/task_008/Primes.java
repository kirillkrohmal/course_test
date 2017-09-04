package ru.parsentev.task_008;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Primes {
    private static final Logger log = getLogger(Primes.class);

    private final int limit;

    public Primes(final int limit) {
        this.limit = limit;
    }

    public List<Integer> calc() {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 2; i <= limit; i++) {
            for (int j = 2; j <= i; j++) {
                if (i == j)
                    result.add(j);
                if (i % j == 0) {
                    break;
                }
            }
        }
        return result;
    }
}

