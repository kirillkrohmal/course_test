package ru.parsentev.task_004;

import org.slf4j.Logger;
import ru.parsentev.task_002.Point;
import ru.parsentev.task_003.Triangle;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class IsoscelesTriangle extends Triangle {
    private static final Logger log = getLogger(IsoscelesTriangle.class);

    public IsoscelesTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    @Override
    public boolean exists() {
        double ab = mathSqrt(first, second);
        double bc = mathSqrt(second, third);
        double ca = mathSqrt(third, first);
        if ((ab == bc) || (bc == ca) || (ca == ab)) {
            return true;
        } else if ((ab != bc) || (bc != ca) || (ca != ab)) {
            return false;
        }
        return false;
    }

    public double mathSqrt(Point first, Point second) {
        return Math.sqrt((Math.pow(this.second.getX() - this.first.getX(), 2)) + (Math.pow(this.second.getY() - this.first.getY(), 2)));
    }

    public double area() {
        double ab = mathSqrt(first, second);
        double bc = mathSqrt(second, third);
        double ca = mathSqrt(third, first);
        if ((ab != bc) || (bc != ca) || (ca != ab)) {
            throw new IllegalStateException();
        } else {
            double p = (ab + bc + ca) / 2;
            return Math.sqrt(p * ((p - ab) * (p - bc) * (p - ca)));
        }
    }
}
