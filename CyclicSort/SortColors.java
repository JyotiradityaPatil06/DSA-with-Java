package CyclicSort;

public class SortColors {
    class Solution {
        public void sortColors(int[] nums) {
            sort(nums, 0, nums.length - 1);
        }

        private void sort(int[] nums, int l, int r) {
            if (l < r) {
                int m = (l + r) / 2;
                sort(nums, l, m);
                sort(nums, m + 1, r);
                merge(nums, l, m, r);
            }
        }

        private void merge(int[] nums, int l, int m, int r) {
            int[] left = new int[m - l + 1];
            int[] right = new int[r - m];
            System.arraycopy(nums, l, left, 0, left.length);
            System.arraycopy(nums, m + 1, right, 0, right.length);

            int i = l, j = 0, k = 0;
            while (j < left.length && k < right.length) {
                if (left[j] <= right[k]) {
                    nums[i] = left[j++];
                } else {
                    nums[i] = right[k++];
                }
                i++;
            }
            while (j < left.length) {
                nums[i++] = left[j++];
            }
            while (k < right.length) {
                nums[i++] = right[k++];
            }
        }
    }
}
