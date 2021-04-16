package br.edu.uni7.aed2.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class UndirectedGraphAsList extends UndirectedGraph {
	private List<Integer>[] adj;

	public UndirectedGraphAsList(int nVertices) {
		super(nVertices);

		adj = new ArrayList[this.numberOfVertices];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}
	}

	public void addEdge(int v, int w) {
		int index = Collections.binarySearch(adj[v], w);
		int insertion = -index - 1;
		adj[v].add(insertion, w);

		index = Collections.binarySearch(adj[w], v);
		insertion = -index - 1;
		adj[w].add(insertion, v);

		numberOfEdges++;
	}

	public Iterator<Integer> getAdjacents(int v) {
		return adj[v].iterator();
	}

	public boolean areNeighbors(int v, int w) {
		boolean result = false;

		List<Integer> neighbors = adj[v];

		for (Integer neighbor : neighbors) {
			if (neighbor == w) {
				result = true;
				break;
			}
		}

		return result;
	}
}
