package br.edu.uni7.aed2.util;

import java.util.Iterator;

import br.edu.uni7.aed2.graph.UndirectedGraph;

public class DepthFirstSearch {
	private boolean[] marked;

	public DepthFirstSearch(UndirectedGraph graph, int source) {
		marked = new boolean[graph.getNumberOfVertices()];

		dfs(graph, source);
	}

	private void dfs(UndirectedGraph graph, int v) {
		marked[v] = true;

		Iterator<Integer> adjacents = graph.getAdjacents(v);
		while (adjacents.hasNext()) {
			int w = adjacents.next();

			if (!marked[w]) {
				dfs(graph, w);
			}
		}
	}
	
	public boolean isMarkerd(int v) {
		return marked[v];
	}
}
