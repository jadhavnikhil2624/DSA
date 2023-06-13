import java.util.*;

class Solution {

  int[] kLargest(int[] arr, int n, int k) {
    // code here

    Arrays.sort(arr);
    int result[] = new int[k];
    for (int i = n - 1; i >= n - k; i--) {
      result[n - 1 - i] = arr[i];
    }

    return result;
  }
}
