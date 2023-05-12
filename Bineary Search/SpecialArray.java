//leetcode 1608

import java.util.Arrays;

public class SpecialArray {

    class Solution {

        public int specialArray(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            for (int num = 0; num <= nums[n - 1]; num++) {
                int index = findFirstGreaterOrEqual(nums, num);
                if (n - index == num) {
                    return num;
                }
            }
            return -1;
        }

        private int findFirstGreaterOrEqual(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] >= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            if (nums[left] >= target) {
                return left;
            }
            return right;
        }
    }

    public static void main(String[] args) {

    }
}
