package br.edu.uni7.aed2.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class DigraphAsList extends Digraph {
	private List<Integer>[] adj;

	public DigraphAsList(int vertices) {
		super(vertices);

		adj = new ArrayList[this.numberOfVertices];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}
	}

	public void addEdge(int v, int w) {
		int index = Collections.binarySearch(adj[v], w);
		int insertion = -index - 1;
		adj[v].add(insertion, w);

		numberOfEdges++;
	}

	public Iterator<Integer> getAdjacents(int v) {
		return adj[v].iterator();
	}
}
