class Solution {
    public int maximumLength(int[] nums, int k) {
        //Initialize 2D DP array of size k x k
        int[][] dp = new int[k][k];
        int res = 0;

         // nums = [1, 4, 1, 4], k = 3
        for(int num : nums) {
            num %= k;
              // Let's dry run for current num = 1 (first number)
            // num = 1 % 3 = 1
            for (int i = 0; i < k; i++) {
                 // dp[prev][num] = dp[num][prev] + 1;
                // So, dp[0][1] = dp[1][0] + 1 = 0 + 1 = 1
                //     dp[1][1] = dp[1][1] + 1 = 0 + 1 = 1
                //     dp[2][1] = dp[1][2] + 1 = 0 + 1 = 1
                dp[i][num] = dp[num][i] + 1;
                res = Math.max(res, dp[i][num]);
                // After first 1, dp looks like this (just [][1] column updated):
            // dp = [
            //   [0, 1, 0],
            //   [0, 1, 0],
            //   [0, 1, 0]
            // ]
            // res = 1

            // Second number is 4 → 4 % 3 = 1 (same mod as before)
            // Again for all prev:
            // dp[0][1] = dp[1][0] + 1 = 0 + 1 = 1
            // dp[1][1] = dp[1][1] + 1 = 1 + 1 = 2
            // dp[2][1] = dp[1][2] + 1 = 0 + 1 = 1
            // dp[1][1] becomes 2 now
            // res = 2

            // Third number is 1 → mod 1
            // dp[1][1] = dp[1][1] + 1 = 2 + 1 = 3
            // res = 3

            // Fourth number is 4 → mod 1
            // dp[1][1] = dp[1][1] + 1 = 3 + 1 = 4
            // res = 4
            }
        }
        return res;
        // Final result: longest valid subsequence = 4
        // Valid sequence: [1, 4, 1, 4]
    }
}