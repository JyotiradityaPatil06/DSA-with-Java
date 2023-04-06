package Conditionals_and_Loops;

import java.util.Scanner;

public class ReversingNum {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //reversing
        int ans = 0;

        while (n>0) {
            int rem = n%10;
            n /= 10;
            ans = ans*10 + rem;
        }

        System.out.println(ans);

    }
}
