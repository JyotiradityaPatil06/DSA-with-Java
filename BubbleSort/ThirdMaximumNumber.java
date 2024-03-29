public class ThirdMaximumNumber {
    class Solution {
        public static int thirdMax(int[] nums) {
            bubbleSort(nums);
            int k = removeDuplicate(nums);
            return (k >= 3) ? nums[k - 3] : nums[k - 1];
        }

        public static void bubbleSort(int[] arr) {
            for (int i = 0; i < arr.length; ++i) {
                boolean isSorted = false;
                for (int j = 0; j < arr.length - i - 1; ++j) {
                    if (arr[j + 1] < arr[j]) {
                        isSorted = true;
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
                if (!isSorted) {
                    break;
                }
            }
        }

        public static int removeDuplicate(int[] arr) {
            int k = 0;
            for (int i = 0; i < arr.length - 1; ++i) {
                if (arr[i] != arr[i + 1]) {
                    arr[k++] = arr[i];
                }
            }
            arr[k++] = arr[arr.length - 1];
            return k;
        }

    }
}
