//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine().trim());
    while (T-- > 0) {
      int n = Integer.parseInt(br.readLine().trim());
      Solution ob = new Solution();
      int ans = ob.is_bleak(n);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends

//User function Template for Java

class Solution {

  public int countSetBits(int m) {
    if (m == 0) return 0;
    int count = 0;
    while (m > 0) {
      count++;
      m = m & (m - 1);
    }
    return count;
  }

  public int is_bleak(int n) {
    // Code here
    for (int i = Math.max(n - 32, 1); i < n; i++) {
      if (i + countSetBits(i) == n) return 0;
    }
    return 1;
  }
}
