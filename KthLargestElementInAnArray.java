import java.util.*;

class Solution {

  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> heap = new PriorityQueue<>(
      Collections.reverseOrder()
    );
    for (int i = 0; i < nums.length; i++) {
      heap.add(nums[i]);
    } //End for
    for (int i = 0; i < k - 1; i++) {
      heap.poll();
    } //End for
    return heap.peek();
  } //End main
} //End class
