//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {

  public static void main(String args[]) throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(read.readLine());
    while (t-- > 0) {
      int N = Integer.parseInt(read.readLine());
      Solution ob = new Solution();
      System.out.println(ob.nextHappy(N));
    }
  }
}

// } Driver Code Ends

//User function Template for Java

class Solution {

  static int nextHappy(int N) {
    // code here
    HashSet<Integer> temp = new HashSet<>();
    temp.add(2);
    temp.add(4);
    temp.add(16);
    temp.add(37);
    temp.add(58);
    temp.add(89);
    temp.add(145);
    temp.add(42);
    temp.add(20);

    int i = N + 1;
    int sum = i;
    while (sum != 1) {
      int val = 0;
      int res = sum;
      while (res != 0) {
        int rem = res % 10;
        val += rem * rem;
        res = res / 10;
      }
      sum = val;
      if (temp.contains(sum)) {
        i++;
        sum = i;
      }
    }
    return i;
  }
}
