import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public long calculate(int n){

        long a = 0;
        long b = 1;
        long temp;
           for (int i = 1; i <= n ; i++ ) {
            temp = a + b;
            b = a;
            a = temp;
        }
        return a;
    }

    static Map<Integer, Long> cache = new HashMap<>();

    public long recursion(int n){
        Long precalculatedValue = cache.get(n);
        if (precalculatedValue !=null){
            return precalculatedValue;
        }
        long result;

        if(n == 0){
            result=0;
            cache.put(n, result);
            return 0;
        }
        if(n == 1 || n == 2){
            result =1;
            cache.put(n, result);
            return 1;
        }

        result = recursion(n-2) + recursion(n-1);
        cache.put(n, result);
        return result;
    }


}
