package ru.parsentev.extra_task_007;

import org.junit.Test;
import ru.parsentev.task_001.Calculator;
import ru.parsentev.task_007.Expression;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Expression2Test {
    @Test
    public void expr() {
        Expression2 expr = new Expression2("parsentev&yandex.ru");
        String result = expr.calc();
        assertThat(result, is("parsentev&"));
    }
}
