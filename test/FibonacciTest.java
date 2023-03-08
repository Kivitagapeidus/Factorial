import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    private final Fibonacci fibonacci = new Fibonacci();

    @Test
    void calculate() {
        assertEquals(3L,fibonacci.calculate(5));
    }
    @Test
    void calculate_2() {
        assertEquals(1,fibonacci.calculate(2));
    }
    @Test
    void calculate_1() {
        assertEquals(0,fibonacci.calculate(1));
    }
    @Test
    void calculate_22() {
        assertEquals(17711,fibonacci.calculate(23));
    }
}