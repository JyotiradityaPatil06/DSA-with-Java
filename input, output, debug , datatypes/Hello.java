import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello!!");
        System.out.println("Enter your name");
        Scanner input = new Scanner(System.in);
        System.out.println(input.next());
    }
}