package br.edu.uni7.aed2.util;

import java.util.Iterator;
import java.util.Stack;

import br.edu.uni7.aed2.graph.UndirectedGraph;

public class DepthFirstPaths {
	private boolean[] marked;
	private int edgeTo[];
	private int s;

	public DepthFirstPaths(UndirectedGraph graph, int source) {
		s = source;

		marked = new boolean[graph.getNumberOfVertices()];
		edgeTo = new int[graph.getNumberOfVertices()];
		
		dfs(graph, source);

		marked[source] = false;
	}
	
	// O(1) == constante
	public boolean hasPathTo(int v) {
		return marked[v];
	}
	
	public Iterator<Integer> pathTo(int v){
		if ((v == s) || !hasPathTo(v)) {
			return null;
		}
		
		Stack<Integer> path = new Stack<Integer>();
		for (int x = v;x != s; x = edgeTo[x]) {
			path.push(x);
		}
		
		path.push(s);
		
		return path.iterator();
	}

	private void dfs(UndirectedGraph graph, int v) {
		marked[v] = true;
		
		Iterator<Integer> adjacents = graph.getAdjacents(v);
		while (adjacents.hasNext()) {
			int w = adjacents.next();
			
			if (!marked[w]) {
				edgeTo[w] = v;
				dfs(graph, w);
			}
		}
	}
}
