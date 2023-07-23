//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Node {

  int data;
  Node next;

  Node(int key) {
    data = key;
    next = null;
  }
}

class Driverclass {

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    int t = Integer.parseInt(in.readLine().trim());

    while (t-- > 0) {
      int n = Integer.parseInt(in.readLine().trim());
      String s[] = in.readLine().trim().split(" ");
      Node head = new Node(Integer.parseInt(s[0]));
      Node tail = head;
      for (int i = 1; i < n; i++) {
        tail.next = new Node(Integer.parseInt(s[i]));
        tail = tail.next;
      }

      head = new Solution().segregate(head);
      printList(head, out);
      out.println();
    }
    out.close();
  }

  public static void printList(Node head, PrintWriter out) {
    if (head == null) return;

    Node temp = head;
    while (temp != null) {
      out.print(temp.data + " ");
      temp = temp.next;
    }
  }
}

// } Driver Code Ends

//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {

  //Function to sort a linked list of 0s, 1s and 2s.
  static Node segregate(Node head) {
    int arr[] = new int[3];
    Node ptr = head;

    while (ptr != null) {
      if (ptr.data == 0) arr[0]++; else if (
        ptr.data == 1
      ) arr[1]++; else arr[2]++;
      ptr = ptr.next;
    }

    ptr = head;

    while (ptr != null) {
      if (arr[0] != 0) {
        ptr.data = 0;
        arr[0]--;
      } else if (arr[1] != 0) {
        ptr.data = 1;
        arr[1]--;
      } else {
        ptr.data = 2;
        arr[2]--;
      }

      ptr = ptr.next;
    }

    return head;
  }
}
