class Solution {
    static int perfectSum(int[] arr, int n, int sum) {
        int[][] dp = new int[n + 1][sum + 1];
        dp[0][0] = 1;
        int mod = (int) 1e9 + 7;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                int ans = dp[i - 1][j];
                if (j - arr[i - 1] >= 0)
                    ans += dp[i - 1][j - arr[i - 1]];
                dp[i][j] = ans % mod;
            }
        }

        return dp[n][sum];
    }

}