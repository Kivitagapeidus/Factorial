import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    private final Fibonacci fibonacci = new Fibonacci();

    @Test
    void calculate() {
        assertEquals(5,fibonacci.calculate(5));
    }
    @Test
    void calculate_2() {
        assertEquals(1,fibonacci.calculate(2));
    }
    @Test
    void calculate_1() {
        assertEquals(1,fibonacci.calculate(1));
    }
    @Test
    void calculate_19() {
        assertEquals(4181,fibonacci.calculate(19));
    }
    @Test
    void recursion_5() {
        assertEquals(5,fibonacci.recursion(5));
    }
    @Test
    void recursion_8() {
        assertEquals(21,fibonacci.recursion(8));
    }
}