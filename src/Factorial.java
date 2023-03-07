public class Factorial {
    public int calculate(int n){
        if(n == 0 || n == 1) {
            return 1;
        }
        int sum = n;
        for (int i = 1; i < n ; i++) {
            sum = sum * (n-i);
        }
        return sum;
    }
}