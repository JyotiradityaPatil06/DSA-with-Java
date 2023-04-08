package Functions.Methods;

import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        //Sum();
        // int ans = Sum2();
        // System.out.println(ans);

        int ans = sum3(45, 12);
        System.out.println(ans);

    }

    //parameters
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    //return the value
    static int Sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        return sum;
    }

    static void Sum(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum is: "+sum);
    }
}
