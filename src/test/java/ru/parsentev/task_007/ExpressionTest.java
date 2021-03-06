package ru.parsentev.task_007;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
@Ignore
public class ExpressionTest {
    @Test
    public void expr() {
        Expression expr = new Expression("2+2");
        double result = expr.calc();
        assertThat(result, is(4d));
    }
    @Test
    public void expr1() {
        Expression expr = new Expression("100500+100500");
        double result = expr.calc();
        assertThat(result, is(4d));
    }
    @Test
    public void expr2() {
        Expression expr = new Expression("2-2");
        double result = expr.calc();
        assertThat(result, is(0d));
    }@Test
    public void expr3() {
        Expression expr = new Expression("2*2");
        double result = expr.calc();
        assertThat(result, is(4d));
    }@Test
    public void expr4() {
        Expression expr = new Expression("2/2");
        double result = expr.calc();
        assertThat(result, is(1d));
    }@Test
    public void expr5() {
        Expression expr = new Expression("2^2");
        double result = expr.calc();
        assertThat(result, is(4d));
    }

    @Test(expected = IllegalStateException.class)
    public void noValid() {
        new Expression("2+").calc();
    }
}