//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }

      Solution obj = new Solution();
      boolean ans = obj.lemonadeChange(n, a);
      System.out.println(ans ? "True" : "False");
    }
  }
}

// } Driver Code Ends

// User function Template for Java

class Solution {

  static boolean lemonadeChange(int N, int bills[]) {
    // code here
    int five = 0;
    int ten = 0;
    //int tw=0;
    for (int i = 0; i < N; i++) {
      if (bills[i] == 5) {
        five = five + 1;
      }
      if (bills[i] == 10) {
        if (five == 0) {
          return false;
        }
        ten = ten + 1;
        five = five - 1;
      }
      if (bills[i] == 20) {
        //tw=tw+1;
        if (ten > 0) {
          ten = ten - 1;
          five = five - 1;
        } else {
          five = five - 3;
        }
        if (five < 0 || ten < 0) {
          return false;
        }
      }
    }
    if (five >= 0 && ten >= 0) {
      return true;
    }
    return false;
  }
}
