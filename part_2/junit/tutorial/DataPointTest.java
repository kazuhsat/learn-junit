package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theory;

@RunWith(Theories.class)
public class DataPointTest {
    @DataPoint
    public static String dataString = "TEST";

    @DataPoint
    public static int dataInt = 1;

    @Theory
    public void test1(String data) {
        assertThat(data, is("TEST"));
    }

    @Theory
    public void test2(String data) {
        assertThat(data, is("TEST"));
    }

    @Theory
    public void test3(int data) {
        assertThat(data, is(1));
    }
}
