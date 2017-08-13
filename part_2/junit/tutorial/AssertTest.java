package junit.tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import static org.junit.matchers.JUnitMatchers.*;
import java.util.Arrays;
import java.util.List;

import junit.tutorial.IsTest.*;


public class AssertTest {
    /* ========================================= */
    /*  CoreMatchers                             */
    /* ========================================= */

    @Test
    public void assertEqualsの確認() {
        int actual = 1;
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void CoreMatchers_assertThat() {
        int actual = 1;
        int expected = 1;

        assertThat(actual, is(expected));
    }

    @Test
    public void CoreMatchers_not() {
        int actual = 1;
        int expected = 2;

        assertThat(actual, is(not(expected)));
    }

    @Test
    public void CoreMatchers_nullValue() {
        String actual = null;

        assertThat(actual, is(nullValue()));
    }

    @Test
    public void CoreMatchers_notNullValue() {
        String actual = "test";

        assertThat(actual, is(notNullValue()));
    }

    @Test
    public void CoreMatchers_sameInstance() {
        String actual = "test";
        String expected = "test";

        assertThat(actual, is(sameInstance(expected)));
    }

    @Test
    public void CoreMatchers_instanceOf() {
        String actual = "test";

        assertThat(actual, is(instanceOf(String.class)));
    }

    /* ========================================= */
    /*  JunitMatchers                            */
    /* ========================================= */

    @Test
    public void JunitMatchers_hasItem() {
        List<Integer> actual = Arrays.asList(1, 2, 3);

        assertThat(actual, hasItem(2));
    }

    @Test
    public void JunitMatchers_hasItems() {
        List<Integer> actual = Arrays.asList(1, 2, 3);

        assertThat(actual, hasItems(1, 2));
    }

    /* ========================================= */
    /*  Custom Matchers                          */
    /* ========================================= */

    @Test
    public void CustomMatchers_test() {
        String actual = "test";

        assertThat(actual, is(IsTest.test()));
    }
}
