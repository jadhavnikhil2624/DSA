class Solution {

  public String reverseWords(String s) {
    String[] words = s.split("\\s+");

    StringBuilder sb = new StringBuilder();

    for (String word : words) {
      StringBuilder reversed = new StringBuilder(word);
      reversed.reverse();
      sb.append(reversed).append(" ");
    } //End for

    return sb.toString().trim();
  } //End reverseWords
} //End class
