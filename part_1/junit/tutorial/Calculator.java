package junit.tutorial;

/**
 * Calculator
 *
 */
public class Calculator {
    /**
     * 乗算結果を取得する
     *
     * @param x 数
     * @param y 数
     * @return 乗算結果
     */
    public int multiply(int x, int y) {
        return x * y;
    }

    /**
     * 除算結果を取得する
     *
     * @param x 数
     * @param y 数
     * @return 除算結果
     */
    public int divide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("divide by zero.");
        }

        return x / y;
    }
}
