package Quick_Sort;

import java.util.Arrays;

/**
 * QuickSortAlgo
 */
public class QuickSortAlgo {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int piv = nums[m];

        while (s <= e) {
            while (nums[s] < piv) {
                s++;
            }
            while (nums[e] > piv) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now pivot is at correct index, now sort two halves
        sort(nums, low, e);
        sort(nums, s, hi);
    }
}