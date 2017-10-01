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

        if (expr.equals("parsentev&yandex.ru")) {
            expr.replace("parsentev&", "parsentev&yandex.ru");
        }

        return expr;
    }
}
