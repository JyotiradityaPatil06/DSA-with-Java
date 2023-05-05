package BubbleSort;

import java.util.Arrays;

public class bubblesortAlgo {

    static void bubble(int[] arr) {
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            // for each step, max iteam will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the iteam is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

}
