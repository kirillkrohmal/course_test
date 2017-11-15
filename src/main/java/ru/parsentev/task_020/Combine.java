package ru.parsentev.task_020;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Combine {
    private static final Logger log = getLogger(Combine.class);
    private final int[] values;

    public Combine(final int[] values) {
        this.values = values;
    }

    public List<List<Integer>> generate() {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();

        result.add(new ArrayList<Integer>());
        
        for (int i = 0; i < values.length; i++) {
            ArrayList<ArrayList<Integer>> gen = new ArrayList<ArrayList<Integer>>();

            for (List<Integer> integers : result) {
                for (int j = 0; j < integers.size() + 1; j++) {
                    integers.add(j, values[i]);

                    ArrayList<Integer> res = new ArrayList<Integer>();
                    gen.add(res);

                    integers.remove(j);
                }
            }
            result = new ArrayList<List<Integer>>(gen);
        }
        return result;
    }
}
