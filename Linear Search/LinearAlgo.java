import java.util.Scanner;

/**
 * LinearAlgo
 */
public class LinearAlgo {

    static int linearSearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target value: ");
        int target = in.nextInt();

        int[] nums = { 1, 5, 82, 46, 14, 12 };

        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }
}