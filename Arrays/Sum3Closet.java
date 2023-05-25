package Arrays;

/**
 * Sum3Closet
 */
public class Sum3Closet {

    public class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int min_diff = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length - 2; ++i) {
                int p = i + 1, q = nums.length - 1;
                while (p < q) {
                    int diff = nums[i] + nums[p] + nums[q] - target;
                    if (diff == 0)
                        return target;
                    min_diff = Math.abs(diff) < Math.abs(min_diff) ? diff : min_diff;
                    if (diff > 0)
                        --q;
                    else
                        ++p;
                }
            }
            return target + min_diff;
        }
    }

    public static void main(String[] args) {

    }

}