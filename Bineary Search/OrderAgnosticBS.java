import java.net.Socket;

public class OrderAgnosticBS {

    static int orderAgnosticBS(int[] arr, int target) {
        int s = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[s] < arr[end];

        while (s <= end) {
            int mid = s + (end - s) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 99, 87, 75, 64, 23, 12, 5 };
        int target = 5;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
}
