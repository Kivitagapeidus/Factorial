import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    private final Factorial factorial = new Factorial();

    @Test
     void calculate_0() {
       assertEquals(new BigInteger("1"),factorial.calculate(0));
    }
    @Test
     void calculate_1() {
       assertEquals(new BigInteger("1"),factorial.calculate(1));
    }
    @Test
     void calculate_2() {
       assertEquals(new BigInteger("2"),factorial.calculate(2));
    }
    @Test
     void calculate_3() {
       assertEquals(new BigInteger("6"),factorial.calculate(3));
    }
    @Test
     void calculate_8() {
       assertEquals(new BigInteger("40320"),factorial.calculate(8));
    }
    @Test
     void calculate_20() {
       assertEquals(new BigInteger("2432902008176640000") ,factorial.calculate(20));
    }
    @Test
     void calculate_200() {
       assertEquals(new BigInteger("788657867364790503552363213932185062295135977687173263294742533244359449963403342920304284011984623904177212138919638830257642790242637105061926624952829931113462857270763317237396988943922445621451664240254033291864131227428294853277524242407573903240321257405579568660226031904170324062351700858796178922222789623703897374720000000000000000000000000000000000000000000000000"),factorial.calculate(200));
    }
@Test
    void divide_1_1() {
        assertEquals(1L, factorial.divide(1, 1));
}
@Test
    void divide_3_2() {
        assertEquals(3L, factorial.divide(3, 2));
}
@Test
    void divide_2_3() {
        assertEquals(0L, factorial.divide(2, 3));
}

}