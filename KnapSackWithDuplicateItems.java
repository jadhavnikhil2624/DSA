class Solution {

  static int knapSack(int N, int W, int val[], int wt[]) {
    // code here
    int dp[][] = new int[N + 1][W + 1];

    for (int i = 1; i < N + 1; i++) {
      for (int j = 1; j < W + 1; j++) {
        //check if valid
        if (wt[i - 1] <= j) {
          //include
          int include = val[i - 1] + dp[i][j - wt[i - 1]];
          //exclude
          int exclude = dp[i - 1][j];

          dp[i][j] = Math.max(include, exclude);
        } else {
          dp[i][j] = dp[i - 1][j];
        }
      }
    }
    return dp[N][W];
  }
}
