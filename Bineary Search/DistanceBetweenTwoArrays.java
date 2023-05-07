
//1385. Find the Distance Value Between Two Arrays
import java.util.Arrays;

public class DistanceBetweenTwoArrays {

    class Solution {
        public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            Arrays.sort(arr2); // Sorting arr2 in O(mlogm)
            int distance = 0;
            for (int i = 0; i < arr1.length; i++) // traversing arr1 in O(n)
            {
                int from = arr1[i] - d; // We want to search for a Number in arr2 thats ranging between 'from'
                int to = arr1[i] + d; // to 'to'.
                boolean flag = false; // Assuming that there aint any such numbers in arr2

                int start = 0; // Using Binary Search to find the number in O(logm) making complexity O(nlogm)
                int end = arr2.length - 1;

                while (start <= end) {
                    int mid = (end + start) / 2;
                    if (arr2[mid] >= from && arr2[mid] <= to) {
                        flag = true; // to denote we have found such a number between 'from' and 'to'
                        break;
                    } else if (arr2[mid] < from) {
                        start = mid + 1; // search in the subarray greater than mid
                    } else {
                        end = mid - 1; // search in the subarray lesser than mid
                    }
                }
                if (!flag) // We dont want any 'distance' value to satisfy, so negating the flag
                    distance++;
            }
            return distance;
        }
    }

    public static void main(String[] args) {

    }
}
