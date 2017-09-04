package ru.parsentev.task_003;

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
public class Triangle {
    private static final Logger log = getLogger(Triangle.class);

    protected final Point first;
    protected final Point second;
    protected final Point third;

    public Triangle(final Point first, final Point second, final Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public double mathSqrt(Point second, Point first) {
        return Math.sqrt((Math.pow(this.second.getX() - this.first.getX(), 2)) + (Math.pow(this.second.getY() - this.first.getY(), 2)));
    }

    public boolean exists() {
        double ab = mathSqrt(first, second);
        double bc = mathSqrt(second, third);
        double ca = mathSqrt(third, first);
        if ((ab + bc) < ca || (bc + ca) < ab || (ca + ab) < bc) {
            return false;
        } else {
            return true;
        }
    }

    public double area() {
        double ab = mathSqrt(first, second);
        double bc = mathSqrt(second, third);
        double ca = mathSqrt(third, first);
        if ((ab + bc) < ca || (bc + ca) < ab || (ca + ab) < bc) {
            throw new IllegalStateException();
        } else {
            double p = (ab + bc + ca) / 2;
            return Math.sqrt(p * ((p - ab) * (p - bc) * (p - ca)));
        }
    }
}
