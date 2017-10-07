package ru.parsentev.extra_task_007;

import org.slf4j.Logger;
import ru.parsentev.task_007.Expression;

import static org.slf4j.LoggerFactory.getLogger;

public class Expression2 {
    private static final Logger log = getLogger(Expression.class);

    private String expr;

    public Expression2(final String expr) {
        this.expr = expr;
    }

    public String calc() {
        char[] chars = expr.toCharArray();

        int length = chars.length;
        int length2 = chars.length - 1;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length2; j++) {

            }
        }

        return expr;
    }
}
