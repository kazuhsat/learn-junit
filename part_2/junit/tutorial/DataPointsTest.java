package junit.tutorial;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theory;

@RunWith(Theories.class)
public class DataPointsTest {
    @DataPoints
    public static String[][] data = {
        {"Tokyo", "03"},
        {"Osaka", "06"}
    };

    @Theory
    public void test(String[] data) {
        String actual = data[0] == "Tokyo" ? "03" : "06";   // tmp
        String expected = data[1];

        assertThat(actual, is(expected));
    }
}
