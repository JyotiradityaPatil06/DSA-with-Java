package Arrays;

public class MaxNum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        System.out.println(maxRange(arr, 1, 3));
    }

    // // to find max number in array
    // static int max(int[] arr) {
    // int maxVal = arr[0];
    // for (int i = 1; i < arr.length; i++) {
    // if (arr[i] > maxVal) {
    // maxVal = arr[i];
    // }
    // }
    // return maxVal;
    // }

    // to find max number in the given range
    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
