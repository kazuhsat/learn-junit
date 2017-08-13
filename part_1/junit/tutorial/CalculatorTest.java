package junit.tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class CalculatorTest {
    /*
    @Test
    public void test() {
        fail("fail");
    }

    @Before
    public void setUp() {
        System.out.println("Before");
    }

    @After
    public void tearDown() {
        System.out.println("After");
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass");
    }

    @Ignore
    public void multiplyで乗算結果が取得できる_無視されるテスト() {
        Calculator sut = new Calculator();

        int actual = sut.multiply(6, 3);
        int expected = 20;

        assertThat(actual, is(expected));
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
