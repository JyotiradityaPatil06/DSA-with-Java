package Recursion;

/**
 * NumberEx
 */
public class NumberEx {

    public static void main(String[] args) {
        printNum(1);
    }

    static void printNum(int n) {
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        printNum(n + 1);
    }
}