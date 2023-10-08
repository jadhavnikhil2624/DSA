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

      int k = sc.nextInt();

      Solution g = new Solution();
      head = g.sortedInsert(head, k);

      printList(head);
      t--;
    }
  }
}

// } Driver Code Ends

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {

  Node sortedInsert(Node head1, int key) {
    // Add your code here.
    Node d = new Node(Integer.MIN_VALUE);
    Node p = d;
    d.next = head1;
    Node h = head1;
    if (key > head1.data && key < head1.next.data && head1.next.next == null) {
      Node n = new Node(key);
      n.next = head1.next;
      head1.next = n;
      return head1;
    }
    while (h.next != null) {
      if (p.data <= key && key < h.data) {
        Node n = new Node(key);
        n.next = h;
        p.next = n;
        return d.next;
      }
      p = p.next;
      h = h.next;
      if (h.next == null && p.data <= key && key < h.data) {
        Node n = new Node(key);
        n.next = h;
        p.next = n;
        return d.next;
      }
    }

    if (key >= h.data) {
      h.next = new Node(key);
      return d.next;
    }
    return d.next;
  }
}
