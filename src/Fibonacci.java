public class Fibonacci {

    public long calculate(int n){

        long a = 0;
        long b = 1;
        long temp;
           for (int i = 2; i <= n ; i++ ) {
            temp = a + b;
            b = a;
            a = temp;
        }
        return a;
    }

    public long recursive (int n){
        return
    }
}
