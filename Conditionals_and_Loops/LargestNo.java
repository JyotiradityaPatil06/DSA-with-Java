package Conditionals_and_Loops;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        
        System.out.println("Enter three No.s: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Largest No is: "+max);
    }
}
