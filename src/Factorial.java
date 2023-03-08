import java.math.BigInteger;

public class Factorial {
    public BigInteger calculate(long n){

       BigInteger sum = BigInteger.ONE;
        for (long i = n; i > 0 ; i--) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }

    public long divide(long n, long m) {
        BigInteger sum_n = calculate(n);
        BigInteger sum_m = calculate(m);
        BigInteger divide = sum_n.divide(sum_m);
        return divide.longValue();
    }
}