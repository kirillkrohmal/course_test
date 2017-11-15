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
        for (int i = 0; i < expr.length(); i++) {
            String[] strings = {"+", "-", "*", "/", "^"};

            int a = Integer.parseInt(expr.substring(0, expr.indexOf(String.valueOf(strings))));
            int b = Integer.parseInt(expr.substring(2, expr.indexOf(String.valueOf(strings))));
            //int mark = expr.indexOf(i + 7);
            try {
                if (expr.length() > 2) {
                    if (strings.equals("+")) {
                        value = a + b;
                    } else if (strings.equals("-")) {
                        value = a - b;
                    } else if (strings.equals("*")) {
                        value = a * b;
                    } else if (strings.equals("/")) {
                        value = a / b;
                    } else if (strings.equals("^")) {
                        value = Math.pow(a, b);
                    }
                }
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
        return value;
    }
}

