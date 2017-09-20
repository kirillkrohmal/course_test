package ru.parsentev.task_017;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class CashMachine {
    private static final Logger log = getLogger(CashMachine.class);
    private static final int NUMBER_OF_ONE = 1;
    private static final int NUMBER_OF_TWO = 2;
    private static final int NUMBER_OF_FIVE = 5;
    private static final int NUMBER_OF_TEN = 10;

    private final int[] values;
    int money = 0;

    public CashMachine(final int[] values) {
        this.values = values;
    }

    public List<Integer> change (int a, int b, int c, int g) {
        a = NUMBER_OF_ONE;
        b = NUMBER_OF_TWO;
        c = NUMBER_OF_FIVE;
        g = NUMBER_OF_TEN;
        List<Integer> result = null;
        int num = 0;

        for (int i = 0; a < i; i++) {
            for (int j = 0; b < j; j++) {
                for (int k = 0; c < k; k++) {
                    for (int l = 0; g < l; l++) {
                       num = a/1 + b/2 + c/5 + g/10;
                       result.add(num);
                    }
                }
            }
        }
        return result;
    }


    public List<List<Integer>> exchange(int note) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(NUMBER_OF_ONE);
        list.add(NUMBER_OF_TWO);
        list.add(NUMBER_OF_FIVE);
        list.add(NUMBER_OF_TEN);

        for (int i = 0; i < values.length; i++) {
            list.add(i);
        }
        for (int i = 0; i < values.length; i++) {
            list.add(i);
        }
        for (int i = 0; i < values.length; i++) {
            list.add(i);
        }
        for (int i = 0; i < values.length; i++) {
            list.add(i);
        }

        return null;
    }
}
