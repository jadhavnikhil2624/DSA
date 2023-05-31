import java.util.*;

class Solution {

  // Function to find largest number with minimum frequency
  public static int LargButMinFreq(int arr[], int n) {
    // Your code here
    HashMap<Integer, Integer> mp = new HashMap<>();
    for (int i = 0; i < n; i++) {
      int x = arr[i];
      if (mp.containsKey(x)) {
        mp.put(x, mp.get(x) + 1);
      } else {
        mp.put(x, 1);
      }
    }
    int max = Integer.MAX_VALUE;
    int ans = 0;
    for (Integer e : mp.keySet()) {
      if (max >= mp.get(e)) {
        if (e > ans) {
          ans = e;
          max = mp.get(e);
        }
      }
    }
    return ans;
  }
}
