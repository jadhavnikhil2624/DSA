//{ Driver Code Starts
import java.util.*;

class Triplets {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }
      Solution g = new Solution();
      if (g.findTriplets(a, n)) System.out.println(
        "1"
      ); else System.out.println("0");
    }
  }
}

// } Driver Code Ends

/*Complete the function below*/

class Solution {

  // arr[]: input array
  // n: size of the array
  //Function to find triplets with zero sum.
  public boolean findTriplets(int arr[], int n) {
    Arrays.sort(arr);
    for (int i = n - 1; i >= 0; i--) {
      int s = 0;
      int e = i - 1;
      int find = arr[i];
      while (s < e) {
        if (arr[s] + arr[e] + find == 0) {
          return true;
        } else if (arr[s] + arr[e] < (-1) * find) {
          s++;
        } else {
          e--;
        }
      }
    }
    return false;
  }
} //end Solution
