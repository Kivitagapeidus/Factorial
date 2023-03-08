import java.math.BigInteger;

public class Factorial {
    public BigInteger calculate(long n){

       BigInteger sum = BigInteger.ONE;
        for (long i = n; i > 0 ; i--) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }
}