//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays;

public class Driver {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    while (tc-- > 0) {
      String s1 = br.readLine();
      String s2 = br.readLine();

      Solution obj = new Solution();

      boolean a = obj.areIsomorphic(s1, s2);
      if (a) System.out.println(1); else System.out.println(0);
    }
  }
}

// } Driver Code Ends

class Solution {

  public static boolean areIsomorphic(String str1, String str2) {
    //if length ob both string is not same then return false
    if (str1.length() != str2.length()) {
      return false;
    }

    //check both string
    boolean first = check(str1, str2);
    boolean second = check(str2, str1);
    return (first && second);
  }

  public static boolean check(String str1, String str2) {
    HashMap<Character, Character> map = new HashMap<>();
    for (int i = 0; i < str1.length(); i++) {
      if (!map.containsKey(str1.charAt(i))) {
        map.put(str1.charAt(i), str2.charAt(i));
      } else {
        if (map.get(str1.charAt(i)) != str2.charAt(i)) {
          return false;
        }
      }
    }
    return true;
  }
}
