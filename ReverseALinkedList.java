//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {

  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}

class GFG {

  static void printList(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
    System.out.println();
  }

  public static void main(String args[]) throws IOException {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t > 0) {
      int n = sc.nextInt();

      Node head = new Node(sc.nextInt());
      Node tail = head;

      for (int i = 0; i < n - 1; i++) {
        tail.next = new Node(sc.nextInt());
        tail = tail.next;
      }

      Solution ob = new Solution();
      head = ob.reverseList(head);
      printList(head);
      t--;
    }
  }
}

// } Driver Code Ends

//function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {

  //Function to reverse a linked list.
  Node reverseList(Node head) {
    // code here
    Node p1 = null;
    Node p2 = head;
    // head->next=head;
    while (p2 != null) {
      Node n = p2.next;
      p2.next = p1;
      p1 = p2;
      p2 = n;
    }
    return p1;
  }
}
