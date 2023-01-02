package forTraining.recursion;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(count7(777));
    }

    private static void recursionFunc() {
        System.out.println("Привет, JavaRush!");
        recursionFunc();
    }

    private static int factorial(int n) {
        if (n == 1 || n == 0) return 1;
        else return n * factorial(n - 1);
    }

    private static String printNumbers(int n) {
        // Базовый случай
        if (n == 1) {
            return "1";
        }
        // Шаг рекурсии / рекурсивное условие
        return printNumbers(n - 1) + " " + n;
    }

    private static String printAB(int a, int b) {
        if (a < b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + printAB(a + 1, b);
        } else {
            if (b == a) {
                return Integer.toString(a);
            }
            return a + " " + printAB(a - 1, b);
        }
    }

    private static int sum(int a) {
        if (a == 1) {
            return 1;
        } else return a + sum(a - 1);
    }

    public static int count7(int n) {

        if (n < 7) return 0;
        if (n % 10 == 7) {
            return 1;
        } else return count7(n / 10);
    }
}
