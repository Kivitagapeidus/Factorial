import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    private final Factorial factorial = new Factorial();

    @Test
     void calculate_0() {
       assertEquals(1,factorial.calculate(0));
    }
    @Test
     void calculate_1() {
       assertEquals(1,factorial.calculate(1));
    }
    @Test
     void calculate_2() {
       assertEquals(2,factorial.calculate(2));
    }
    @Test
     void calculate_3() {
       assertEquals(6,factorial.calculate(3));
    }


}