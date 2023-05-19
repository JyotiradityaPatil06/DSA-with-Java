// Approach:
// The approach taken here is to keep a counter variable count for keeping track of elements other than val and then loop through all the elements of the array. For each element, if it's not equal to val, it is placed at index count of the array, and count is incremented.

// Finally, the length of the new array is equal to count. This approach modifies the input array in-place without using any additional space.

package Arrays;

public class RemoveElement {

    class Solution {
        public int removeElement(int[] nums, int val) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[count++] = nums[i];
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {

    }
}
