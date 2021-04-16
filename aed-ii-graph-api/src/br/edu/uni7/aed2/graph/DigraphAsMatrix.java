package br.edu.uni7.aed2.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class DigraphAsMatrix extends Digraph {
	private int[][] adj;

	public DigraphAsMatrix(int vertices) {
		super(vertices);
		
		adj = new int[numberOfVertices][numberOfVertices];
	}

	public void addEdge(int v, int w) {
		adj[v][w] = 1;
		
		numberOfEdges++;
	}

	public Iterator<Integer> getAdjacents(int v) {
		List<Integer> adjacents = new ArrayList<Integer>();
		
		for (int i = 0; i < numberOfVertices; i++) {
			if (adj[v][i] == 1) {
				adjacents.add(i);
			}
		}
		
		return adjacents.iterator();
	}
}
