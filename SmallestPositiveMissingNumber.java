import java.io.*;
import java.util.*;

class Solution {

  //Function to find the smallest positive number missing from the array.
  static int missingNumber(int arr[], int size) {
    // Your code here
    boolean flag = false;
    int ans = 0;
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < size; i++) {
      set.add(arr[i]);
    }
    for (int i = 0; i < size; i++) {
      if (set.contains(i + 1)) continue; else {
        return i + 1;
      }
    }
    return size + 1;
  }
}

//{ Driver Code Starts.

class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    //taking testcases
    int t = Integer.parseInt(in.readLine().trim());
    while (t-- > 0) {
      //input number n
      int n = Integer.parseInt(in.readLine().trim());
      int[] arr = new int[n];
      String s[] = in.readLine().trim().split(" ");

      //adding elements to the array
      for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

      Solution obj = new Solution();

      //calling missingNumber()
      int missing = obj.missingNumber(arr, n);
      out.println(missing);
    }
    out.close();
  }
}
// } Driver Code Ends
