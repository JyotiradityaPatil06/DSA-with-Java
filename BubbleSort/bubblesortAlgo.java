package BubbleSort;

import java.util.Arrays;

/**
 * bubblesortAlgo
 */
public class bubblesortAlgo {

    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 45, -32, 67, 34 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}