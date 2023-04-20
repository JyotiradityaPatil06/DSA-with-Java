public class FindMiniNum {

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 132, 45, 12, 75, 2, 14 };

        System.out.println(min(nums));
    }
}
