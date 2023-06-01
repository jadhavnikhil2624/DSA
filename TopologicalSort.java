import java.util.*;

class Solution {

  static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
    int[] indegree = new int[V];

    for (int i = 0; i < V; i++) {
      for (int it : adj.get(i)) {
        indegree[it]++;
      }
    }

    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < V; i++) {
      if (indegree[i] == 0) {
        q.offer(i);
      }
    }

    int[] res = new int[V];
    int index = 0;
    while (!q.isEmpty()) {
      int curr = q.poll();
      res[index++] = curr;
      for (int it : adj.get(curr)) {
        indegree[it]--;
        if (indegree[it] == 0) {
          q.offer(it);
        }
      }
    }
    return res;
  }
}
