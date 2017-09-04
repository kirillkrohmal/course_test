package ru.parsentev.task_005;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;
import ru.parsentev.task_003.Triangle;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class RightTriangle extends Triangle {
    private static final Logger log = getLogger(RightTriangle.class);

    public RightTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    @Override
    public boolean exists() {
        double ab = mathSqrt(first, second);
        double bc = mathSqrt(second, third);
        double ca = mathSqrt(third, first);
        if ((Math.pow(ab, 2) + Math.pow(bc, 2) == Math.pow(ca, 2)) || (Math.pow(bc, 2) + Math.pow(ca, 2) == Math.pow(ab, 2)) || (Math.pow(ca, 2) + Math.pow(ab, 2) == Math.pow(bc, 2))) {
            return true;
        } else if ((Math.pow(ab, 2) + Math.pow(bc, 2) != Math.pow(ca, 2)) || (Math.pow(bc, 2) + Math.pow(ca, 2) != Math.pow(ab, 2)) || (Math.pow(ca, 2) + Math.pow(ab, 2) != Math.pow(bc, 2))) {
            return false;
        }
        return true;
    }

    public double mathSqrt(Point first, Point b) {
        return Math.sqrt((Math.pow(this.second.getX() - this.first.getX(), 2)) + (Math.pow(this.second.getY() - this.first.getY(), 2)));
    }

    public double area() {
        double ab = mathSqrt(first, second);
        double bc = mathSqrt(second, third);
        double ca = mathSqrt(third, first);
        if ((Math.pow(ab, 2) + Math.pow(bc, 2) != Math.pow(ca, 2)) || (Math.pow(bc, 2) + Math.pow(ca, 2) != Math.pow(ab, 2)) || (Math.pow(ca, 2) + Math.pow(ab, 2) != Math.pow(bc, 2))) {
            throw new IllegalStateException();
        } else {
            double p = (ab + bc + ca) / 2;
            return Math.sqrt(p * ((p - ab) * (p - bc) * (p - ca)));
        }
    }
}
