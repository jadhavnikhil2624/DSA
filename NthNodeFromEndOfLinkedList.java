import java.util.*;

class Solution {

  //Function to find the data of nth node from the end of a linked list.
  int getNthFromLast(Node head, int n) {
    // Your code here
    int length = 0;

    Node rear = head;
    Node front = head;

    if (n == 0) {
      return -1;
    }
    while (length < n) {
      length++;
      rear = rear.next;
      if (rear == null && length < n) {
        return -1;
      }
    }
    while (rear != null) {
      rear = rear.next;
      front = front.next;
    }
    return front.data;
  }
}
