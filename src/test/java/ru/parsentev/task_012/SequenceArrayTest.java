package ru.parsentev.task_012;

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
public class SequenceArrayTest {

    @Test
    public void notContains3() {
        int[] array = {0, 1, 0, 1, 0};
        SequenceArray arrayChoice = new SequenceArray(array);
        boolean result = arrayChoice.containsOneSequence();
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void contains5() {
        int[] array = {1, 1, 1, 1, 1};
        SequenceArray arrayChoice = new SequenceArray(array);
        boolean result = arrayChoice.containsOneSequence();
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void contains4() {
        int[] array = {1, 1, 1, 1, 1, 1, 1};
        SequenceArray arrayChoice = new SequenceArray(array);
        boolean result = arrayChoice.containsOneSequence();
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void contains3() {
        int[] array = {0, 1, 1, 1, 0};
        SequenceArray arrayChoice = new SequenceArray(array);
        boolean result = arrayChoice.containsOneSequence();
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void notContains1() {
        int[] array = {0, 1, 0, 1, 0, 0, 1, 0, 1, 0};
        SequenceArray arrayChoice = new SequenceArray(array);
        boolean result = arrayChoice.containsOneSequence();
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void contains2() {
        int[] array = {0, 1, 1, 1, 1, 0, 1, 1, 1, 0};
        SequenceArray arrayChoice = new SequenceArray(array);
        boolean result = arrayChoice.containsOneSequence();
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void contains() {
        SequenceArray array = new SequenceArray(new int[] {0, 1, 1, 1, 0});
        boolean result = array.containsOneSequence();
        assertThat(result, is(true));
    }

    @Test
    public void notContains() {
        SequenceArray array = new SequenceArray(new int[] {0, 1, 0, 1, 0});
        boolean result = array.containsOneSequence();
        assertThat(result, is(false));
    }
}