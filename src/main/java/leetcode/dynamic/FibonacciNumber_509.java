package leetcode.dynamic;

public class FibonacciNumber_509 {
    public int fib(int n) {
        int number0 = 0;
        int number1 = 1;
        int current = 0;
        if (n == 0) {
            return number0;
        } else if (n == 1) {
            return number1;
        }

        for (int i = 1; i < n; i++) {
            current = number0 + number1;
            number0 = number1;
            number1 = current;
        }
        return current;
    }
}
