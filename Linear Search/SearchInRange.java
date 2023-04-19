public class SearchInRange {

    static int searchRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 53, 623, 124, 42, 12, 214 };
        int target = 42;

        System.out.println(searchRange(nums, target, 1, 4));
    }
}
