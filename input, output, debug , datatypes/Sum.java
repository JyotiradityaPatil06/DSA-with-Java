import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter two integers: ");
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a + b;
        
        System.out.println("Sum = "+c);
    }
}
