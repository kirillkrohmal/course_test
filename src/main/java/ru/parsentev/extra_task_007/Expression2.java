package ru.parsentev.extra_task_007;

import org.slf4j.Logger;
import ru.parsentev.task_007.Expression;

import static org.slf4j.LoggerFactory.getLogger;

public class Expression2 {
    private static final Logger log = getLogger(Expression.class);

    private String expr;

    /**
     * Тебе надо найти в строке символ & и скопировать в новую строку, то что находится до этого символа.
     */
    public Expression2(final String expr) {
        this.expr = expr;
    }

    public String calc() {
        String expr2 = "&";
        return expr = expr.substring(0, expr.indexOf(expr2));
    }
}

