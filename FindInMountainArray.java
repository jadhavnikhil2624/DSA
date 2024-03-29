/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {

  public int findInMountainArray(int target, MountainArray mountainArr) {
    int n = mountainArr.length();
    int low = 0;
    int high = n - 1;
    int peak = -1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (low < mid && mountainArr.get(mid) < mountainArr.get(mid - 1)) {
        high = mid - 1;
      } else if (
        high > mid && mountainArr.get(mid) < mountainArr.get(mid + 1)
      ) {
        low = mid + 1;
      } else {
        peak = mid;
        break;
      }
    }
    if (peak == -1) {
      peak = high;
    }
    int peakEle = mountainArr.get(peak);
    if (peakEle == target) {
      return peak;
    }
    if (peakEle < target) {
      return -1;
    }
    int index = find(0, peak - 1, target, mountainArr, true);
    if (index != -1) {
      return index;
    }
    index = find(peak + 1, n - 1, target, mountainArr, false);
    return index;
  }

  private int find(
    int low,
    int high,
    int target,
    MountainArray nums,
    boolean up
  ) {
    if (up) {
      while (low <= high) {
        int mid = (low + high) / 2;
        if (nums.get(mid) == target) {
          return mid;
        } else if (nums.get(mid) < target) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
      return -1;
    } else {
      while (low <= high) {
        int mid = (low + high) / 2;
        if (nums.get(mid) == target) {
          return mid;
        } else if (nums.get(mid) > target) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
      return -1;
    }
  }
}
