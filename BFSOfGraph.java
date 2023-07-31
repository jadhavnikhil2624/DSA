//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine().trim());
    while (T-- > 0) {
      String[] s = br.readLine().trim().split(" ");
      int V = Integer.parseInt(s[0]);
      int E = Integer.parseInt(s[1]);
      ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
      for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
      for (int i = 0; i < E; i++) {
        String[] S = br.readLine().trim().split(" ");
        int u = Integer.parseInt(S[0]);
        int v = Integer.parseInt(S[1]);
        adj.get(u).add(v);
        // adj.get(v).add(u);
      }
      Solution obj = new Solution();
      ArrayList<Integer> ans = obj.bfsOfGraph(V, adj);
      for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
      System.out.println();
    }
  }
}

// } Driver Code Ends

class Solution {

  // Function to return Breadth First Traversal of given graph.
  public ArrayList<Integer> bfsOfGraph(
    int V,
    ArrayList<ArrayList<Integer>> adj
  ) {
    // Initialize a queue to perform BFS
    Queue<Integer> queue = new LinkedList<>();
    // Mark the 0th vertex as visited and enqueue it
    boolean[] visited = new boolean[V];
    queue.add(0);
    visited[0] = true;

    // Result list to store the BFS traversal
    ArrayList<Integer> result = new ArrayList<>();

    // Perform BFS
    while (!queue.isEmpty()) {
      // Dequeue a vertex from the front of the queue
      int currentVertex = queue.poll();
      // Add it to the result list
      result.add(currentVertex);

      // Enqueue all adjacent vertices of the current vertex that are not visited yet
      for (int neighbor : adj.get(currentVertex)) {
        if (!visited[neighbor]) {
          queue.add(neighbor);
          visited[neighbor] = true;
        }
      }
    }

    return result;
  }
}
