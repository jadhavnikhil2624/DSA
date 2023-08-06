//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    sc.nextLine();
    while (T-- > 0) {
      Solution ob = new Solution();

      String S = sc.nextLine();

      ArrayList<String> arr = ob.permutation(S);
      for (String s : arr) {
        System.out.print(s + " ");
      }
      System.out.println();
    }
  }
}

// } Driver Code Ends

//User function Template for Java

class Solution {

  public void GenerateAllPermutation(
    String input,
    StringBuilder traverse,
    ArrayList<String> list,
    String output
  ) {
    if (output.length() == input.length()) {
      list.add(output);
      return;
    }
    for (int i = 0; i < input.length(); i++) {
      if (traverse.charAt(i) != '#') {
        traverse.setCharAt(i, '#');
        GenerateAllPermutation(input, traverse, list, output + input.charAt(i));
        traverse.setCharAt(i, input.charAt(i));
      }
    }
  }

  public ArrayList<String> permutation(String S) {
    ArrayList<String> list = new ArrayList<>();
    HashSet<String> set = new HashSet<>();

    StringBuilder traverse = new StringBuilder(S);

    GenerateAllPermutation(S, traverse, list, "");
    Collections.sort(list);
    return list;
  }
}
