package Arrays;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {

        int[] arr = { 1, 4, 643, 134, 23 };
        swap(arr, 2, 1);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
