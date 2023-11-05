//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine().trim());
    while (T-- > 0) {
      String[] s = br.readLine().trim().split(" ");
      int n = Integer.parseInt(s[0]);
      int[] nums = new int[n];
      for (int i = 0; i < n; i++) {
        nums[i] = Integer.parseInt(s[i + 1]);
      }
      int k = Integer.parseInt(br.readLine().trim());
      Solution obj = new Solution();
      int[] ans = obj.topK(nums, k);
      for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
      System.out.println();
    }
  }
}

// } Driver Code Ends

class Solution {

  public int[] topK(int[] nums, int k) {
    // Code here
    int res[] = new int[k];

    HashMap<Integer, Integer> hm = new HashMap<>();
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
    }

    PriorityQueue<Integer> pq = new PriorityQueue<>(
      new Comparator<Integer>() {
        public int compare(Integer num1, Integer num2) {
          int freq1 = hm.get(num1);
          int freq2 = hm.get(num2);
          if (freq1 == freq2) {
            return Integer.compare(num2, num1);
          }
          return Integer.compare(freq2, freq1);
        }
      }
    );

    for (int num : hm.keySet()) {
      pq.offer(num);
    }

    for (int i = 0; i < k; i++) res[i] = pq.poll();

    return res;
  }
}
