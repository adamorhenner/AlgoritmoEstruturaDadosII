package br.edu.uni7.aed2.graph.algs;

import java.util.Iterator;

import br.edu.uni7.aed2.graph.Graph;

public class ConnectedComponents {
	private int count; // contador para rotular
	private int[] id; //a que componentes cada vertice pertence
	private boolean[] marked;//rastrear quem ja visitou

	public ConnectedComponents(Graph graph) {
		count = 0;
		id = new int[graph.getNumberOfVertices()];
		marked = new boolean[graph.getNumberOfVertices()];

		for (int v = 0; v < marked.length; v++) {
			if (!marked[v]) {
				dfs(graph, v);
				count++;
			}
		}
	}

	private void dfs(Graph graph, int v) {
		marked[v] = true;
		id[v] = count;

		Iterator<Integer> adj = graph.getAdjacents(v);
		while (adj.hasNext()) {
			int w = adj.next();

			if (!marked[w]) {
				dfs(graph, w);
			}
		}
	}
	
	public int getCount() {
		return count;
	}
	
	public int getId(int v) {
		return id[v];
	}
	
	public boolean connected(int v, int w) {
		return id[v] == id[w];
	}
	
	
	
}
