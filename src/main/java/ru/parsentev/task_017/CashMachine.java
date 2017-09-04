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



    public List<List<Integer>> exchange(int note) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(NUMBER_OF_ONE);
        list.add(NUMBER_OF_TWO);
        list.add(NUMBER_OF_FIVE);
        list.add(NUMBER_OF_TEN);

        for (int i = 0; i < values.length; i++) {
                //money = values/note
                //values -= note/[i];
                list.get(note + money - 1 / note);
                list.add(i);
            }



      /*  for (values[note] = 0; values[note] <= 10; values[note]++)
            System.out.println(values);*/


        return null;
    }
}
