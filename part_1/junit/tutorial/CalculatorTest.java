package junit.tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class CalculatorTest {
    /*
    @Test
    public void test() {
        fail("まだ実装されていません");
    }
    */

    @Test
    public void multiplyで乗算結果が取得できる() {
        Calculator sut = new Calculator();

        int actual = sut.multiply(5, 4);
        int expected = 20;

        assertThat(actual, is(expected));
    }

    @Test
    public void divideで除算結果が取得できる() {
        Calculator sut = new Calculator();

        int actual = sut.divide(10, 5);
        int expected = 2;

        assertThat(actual, is(expected));
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideで0で除算結果を取得しようとした場合例外を投げる()
    {
        Calculator sut = new Calculator();
        sut.divide(10, 0);
    }
}
