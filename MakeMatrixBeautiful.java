import java.util.*;

class Solution {

  public static int findMinOperation(int N, int[][] matrix) {
    // code here
    int a[] = new int[N];
    int m = Integer.MIN_VALUE;
    for (int i = 0; i < N; i++) {
      int s = 0;
      int s1 = 0;
      for (int j = 0; j < N; j++) {
        s += matrix[i][j];
        s1 += matrix[j][i];
      }
      m = Math.max(m, Math.max(s, s1));
      a[i] = s;
    }
    int ans = 0;
    for (int i = 0; i < N; i++) {
      ans += Math.abs(a[i] - m);
    }
    return ans;
  }
}
