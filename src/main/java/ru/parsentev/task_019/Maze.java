package ru.parsentev.task_019;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Maze {
    private static final Logger log = getLogger(Maze.class);

    private final int[][] values;
    private int count;

    public Maze(final int[][] values) {
        this.values = values;
    }

    public List<Point> solution(Point start, Point finish) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[i][0] == values[i][j]) {
                    count++;
                    if (count == 3) {
                        break;
                    }
                }
                if (values[i] == values[j]) {
                    count++;
                    if (count == 3) {
                        break;
                    }
                }
                if (values[j][i] == values[0][i]) {
                    count++;
                    if (count == 3) {
                        break;
                    }
                }

            }
        }
        return null;
    }
}
