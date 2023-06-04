import java.util.*;

class Solution {

  String reverseEqn(String S) {
    Stack<String> st = new Stack<>();
    int n = S.length();
    int p1 = 0, p2 = 0;

    while (p2 < n) {
      if (!Character.isDigit(S.charAt(p2))) {
        st.push(S.substring(p1, p2));
        st.push(Character.toString(S.charAt(p2)));
        p1 = p2 + 1;
      }

      p2++;
    }

    st.push(S.substring(p1, n));
    StringBuilder sb = new StringBuilder();

    while (!st.isEmpty()) {
      sb.append(st.peek());
      st.pop();
    }

    return sb.toString();
  }
}
