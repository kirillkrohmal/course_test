package ru.parsentev.task_006;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Square {
    private static final Logger log = getLogger(Square.class);

    private final Point first;
    private final Point second;
    private final Point third;
    private final Point fourth;

    public Square(final Point first, final Point second, final Point third, final Point fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public double S(Point first, Point second) {
        return ((Math.pow(this.second.getX() - this.first.getX(), 2)) + (Math.pow(this.second.getY() - this.first.getY(), 2)));
    }

    public boolean exists() {
        double ab = S(first, second);
        double bc = S(second, third);
        double cd = S(third, fourth);
        double da = S(fourth, first);
        if (ab == bc && bc == cd && cd == da && da == ab) {
            return true;
        } else if ((Math.pow(ab, 2) + Math.pow(bc, 2) == Math.pow(cd, 2)) || (Math.pow(bc, 2) + Math.pow(cd, 2) == Math.pow(da, 2)) || (Math.pow(cd, 2) + Math.pow(da, 2) == Math.pow(ab, 2)) || (Math.pow(da, 2) + Math.pow(ab, 2) == Math.pow(bc, 2))) {
            return true;
        } else {
            return false;
        }
    }

    public double area() {
        double ab = S(first, second);
        double bc = S(second, third);
        double cd = S(third, fourth);
        double da = S(fourth, first);
        if ((Math.pow(ab, 2) + Math.pow(bc, 2) != Math.pow(cd, 2)) || (Math.pow(bc, 2) + Math.pow(cd, 2) != Math.pow(da, 2)) || (Math.pow(cd, 2) + Math.pow(da, 2) != Math.pow(ab, 2)) || (Math.pow(da, 2) + Math.pow(ab, 2) != Math.pow(bc, 2))) {
            throw new IllegalStateException();
        } else {
            double p = (ab + bc + cd + da) / 2;
            return Math.pow(p, 2);
        }
    }
}
