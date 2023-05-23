import java.time.*;

class Solution {

  int lvl;
  int stop;
  int index;

  public Node constructBTree(int pre[], int preM[], int size) {
    // your code here
    lvl = (int) (Math.log(size) / Math.log(2));
    stop = size / 2 + 1;
    index = 1;
    Node root = new Node(pre[0]);
    helper(root, root, pre, preM, 0);
    return root;
  }

  public void helper(Node n1, Node n2, int[] pre, int[] preM, int level) {
    if (lvl == level) return;
    if (index == stop) return;
    n1.left = new Node(pre[index]);
    n2.right = new Node(preM[index]);
    index = index + 1;
    helper(n1.left, n2.right, pre, preM, level + 1);
    n1.right = new Node(pre[index]);
    n2.left = new Node(preM[index]);
    index = index + 1;
    helper(n1.right, n2.left, pre, preM, level + 1);
  }
}
