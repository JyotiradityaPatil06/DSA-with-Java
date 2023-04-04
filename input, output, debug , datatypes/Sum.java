import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.print("Enter two integers: ");
        Scanner input = new Scanner(System.in);
        
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = a + b;
        
        System.out.println("Sum = "+c);
    }
}