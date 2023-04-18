import java.util.Scanner;

public class SearchInString {

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String name = str.nextLine();

        System.out.println("Enter the target: ");
        char c = str.next().charAt(0);

        System.out.println(search(name, c));

    }
}
