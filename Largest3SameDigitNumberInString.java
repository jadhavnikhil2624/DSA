public class Solution {

  public String largestGoodInteger(String num) {
    int target = -1;
    for (int i = 0; i < num.length() - 2; i++) {
      if (
        num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)
      ) {
        int current = Integer.parseInt(num.substring(i, i + 3));
        if (current > target) {
          target = current;
        }
      }
    }
    if (target != -1) {
      if (target == 0) {
        return target + "00";
      }
      return Integer.toString(target);
    }
    return "";
  }
}
