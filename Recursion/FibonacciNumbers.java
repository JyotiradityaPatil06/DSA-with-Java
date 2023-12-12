package Recursion;

/**
 * FibonacciNumbers
 */
public class FibonacciNumbers {

    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    static int fibo(int n) {

        // base condition
        if (n < 2) {
            return n;
        }

        // recurance relartion
        return fibo(n - 1) + fibo(n - 2);
    }
}
