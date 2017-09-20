package ru.parsentev.task_007;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Expression {
    private static final Logger log = getLogger(Expression.class);

    private String expr;

    public Expression(final String expr) {
        this.expr = expr;
    }

    public double calc() {
        double value = 0;
        double a = Double.parseDouble(String.valueOf(expr.charAt(0)));
        double b = Double.parseDouble(String.valueOf(expr.charAt(2)));
        char c = expr.charAt(1);

        try {
            if (expr.length() > 2) {
                if (c == '+') {
                    value = a + b;
                } else if (c == '-') {
                    value = a - b;
                } else if (c == '*') {
                    value = a * b;
                } else if (c == '/') {
                    value = a / b;
                } else if (c == '^') {
                    value = Math.pow(a, b);
                }
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        return value;
    }
}

