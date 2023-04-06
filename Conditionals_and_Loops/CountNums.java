package Conditionals_and_Loops;

public class CountNums {
    public static void main(String[] args) {
        int n = 2544622;
        int count = 0;

        while (n>0) {
            int rem = n % 10;
            if (rem == 2) {
                count++;
            }
            n /= 10;
        }
        System.out.println("Total counting preferences: "+count);
    }
}
