import java.util.*;

class Solution {

  ArrayList<String> CamelCase(int N, String[] Dictionary, String Pattern) {
    ArrayList<String> ans = new ArrayList<>();

    for (String word : Dictionary) {
      if (isPatternMatch(word, Pattern)) {
        ans.add(word);
      }
    }

    Collections.sort(ans);

    if (ans.isEmpty()) {
      ans.add("-1");
    }

    return ans;
  }

  boolean isPatternMatch(String word, String Pattern) {
    if (word.length() < Pattern.length()) {
      return false;
    }

    int i = 0, j = 0;

    while (i < word.length() && j < Pattern.length()) {
      if (Character.isUpperCase(word.charAt(i))) {
        if (word.charAt(i) != Pattern.charAt(j)) {
          return false;
        }
        j++;
      }
      i++;
    }

    return j == Pattern.length();
  }
}
