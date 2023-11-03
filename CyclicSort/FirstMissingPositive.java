package CyclicSort;

//Leetcode 41
public class FirstMissingPositive {
    class Solution {

        public int firstMissingPositive(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                int correctInd = nums[i] - 1;
                if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correctInd]) {
                    swap(nums, i, correctInd);
                } else {
                    i++;
                }
            }

            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index + 1) {
                    return index + 1;
                }
            }

            return nums.length + 1;
        }

        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
}
