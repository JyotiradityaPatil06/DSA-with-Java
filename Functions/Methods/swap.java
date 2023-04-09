package Functions.Methods;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        Swap(num1, num2);
    }

    static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
}
