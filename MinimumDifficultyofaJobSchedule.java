class Solution {
    Integer[][] dp = new Integer[12][302];

    public int minDifficulty(int[] arr, int day) {
        int n = arr.length;

        // Illegal
        if (n < day)
            return -1;

        // Initialize
        for (int i = 0; i <= day; i++) {
            Arrays.fill(dp[i], null); // Initialize with null values
        }

        int result = dfs(arr, day, 0);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private int dfs(int[] arr, int day, int index) {
        if (day == 0 && index == arr.length) {
            return 0;
        }

        if (day == 0 || index == arr.length) {
            return Integer.MAX_VALUE;
        }

        if (dp[day][index] != null) {
            return dp[day][index];
        }

        int maxDifficulty = 0;
        int minDiff = Integer.MAX_VALUE;

        for (int i = index; i < arr.length; i++) {
            maxDifficulty = Math.max(maxDifficulty, arr[i]);
            int rest = dfs(arr, day - 1, i + 1);
            if (rest != Integer.MAX_VALUE) {
                minDiff = Math.min(minDiff, maxDifficulty + rest);
            }
        }

        dp[day][index] = minDiff;
        return minDiff;
    }
}