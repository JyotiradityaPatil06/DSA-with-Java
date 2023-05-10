// leetcode 441 

public class ArrangingCoins {

    class Solution {
        public int arrangeCoins(int n) {
            long start = 1;
            long end = n;

            while (start <= end) {
                long mid = start + (end - start) / 2;
                long sum = (mid * (mid + 1)) / 2;

                if (sum == n) {
                    return (int) mid;
                } else if (sum > n) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return (int) end;
        }
    }

    public static void main(String[] args) {

    }
}
