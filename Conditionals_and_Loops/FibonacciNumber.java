package Conditionals_and_Loops;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while(count<=n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println(n+"th Fibonacci number is: "+ b);

    }
}
