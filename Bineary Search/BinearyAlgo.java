/**
 * BinearyAlgo
 */
public class BinearyAlgo {

    // return the index
    // return -1 if it does not exist
    static int binearySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2 (this may exceed the int range)
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // ans found
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 13, 45, 57, 78, 92 };
        int targer = 78;
        int ans = binearySearch(arr, targer);
        System.out.println(ans);
    }
}
