//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {

  public static void main(String args[]) throws IOException {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();

      int matrix[][] = new int[n][n];
      for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) matrix[i][j] =
        sc.nextInt();

      Solution ob = new Solution();
      ArrayList<Integer> ans = ob.sumTriangles(matrix, n);
      for (Integer val : ans) System.out.print(val + " ");
      System.out.println();
    }
  }
}

// } Driver Code Ends

//User function Template for Java

class Solution {

  //Function to return sum of upper and lower triangles of a matrix.
  static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
    // code here
    ArrayList<Integer> list = new ArrayList<>();

    int lower_sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j <= i; j++) {
        lower_sum += matrix[i][j];
      }
    }

    int upper_sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = matrix.length - 1; j >= i; j--) {
        upper_sum += matrix[i][j];
      }
    }
    list.add(upper_sum);
    list.add(lower_sum);
    return list;
  }
}
