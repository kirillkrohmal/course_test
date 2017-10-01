package ru.parsentev.task_008;

import org.junit.Ignore;
import org.junit.Test;
import ru.parsentev.task_007.Expression;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
@Ignore
public class PrimesTest {
    @Test
    public void calc() {
        Primes primes = new Primes(3);
        List<Integer> result = primes.calc();
        assertThat(result, is(asList(2, 3)));
    }

    @Test
    public void calc2() {
        Primes primes = new Primes(23);
        List<Integer> result = primes.calc();
        assertThat(result, is(asList(2, 3, 5, 7, 11, 13, 17, 19, 23)));
    }

    @Test
    public void calc3() {
        Primes primes = new Primes(113);
        List<Integer> result = primes.calc();
        assertThat(result, is(asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113)));
    }

    @Test
    public void calc4() {
        Primes primes = new Primes(47);
        List<Integer> result = primes.calc();
        assertThat(result, is(asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47)));
    }

    @Test
    public void calc5() {
        Primes primes = new Primes(79);
        List<Integer> result = primes.calc();
        assertThat(result, is(asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79)));
    }
}
