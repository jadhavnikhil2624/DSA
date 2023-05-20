import java.util.*;
class Solution {
    class Graph {
		private Map<String, HashMap<String, Double>> adj;
		Graph(int v) {
			this.adj = new HashMap<String, HashMap<String, Double>>();
		}

		public void addEdge(String src, String dest, Double weight) {
			HashMap<String, Double> map = adj.getOrDefault(src, new HashMap<String, Double>());
			map.put(dest, weight);
			adj.put(src, map);
			map = adj.getOrDefault(dest, new HashMap<String, Double>());
			map.put(src, 1 / weight);
			adj.put(dest, map);
		}

		public double dfs(String from, String to, HashSet<String> visited) {
			if (!adj.containsKey(from)) {
				return -1.0;
			}
			if (adj.get(from).containsKey(to)) {
				return adj.get(from).get(to);
			}
			visited.add(from);
			for (Map.Entry<String, Double> entry : adj.get(from).entrySet()) {
				if (!visited.contains(entry.getKey())) {
					double ans = dfs(entry.getKey(), to, visited);
					if (ans != -1.0) {
						return (ans * entry.getValue());
					}
				}
			}
			return -1.0;
		}
	}

	public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
		Graph graph = new Graph(equations.size());
		for (int i = 0; i < equations.size(); i++) {
			graph.addEdge(equations.get(i).get(0), equations.get(i).get(1), values[i]);
		}
		double ans[] = new double[queries.size()];
		for (int i = 0; i < queries.size(); i++) {
			HashSet<String> visited = new HashSet<>();
			ans[i] = graph.dfs(queries.get(i).get(0), queries.get(i).get(1), visited);
		}
		return ans;
	}
}