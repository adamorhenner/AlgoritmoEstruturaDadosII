package br.edu.uni7.aed2.graph;

import java.util.Iterator;

public abstract class UndirectedGraph extends Graph {
	
	public UndirectedGraph(int nVertices) {
		super(nVertices);
	}

	public abstract boolean areNeighbors(int v, int w);

	// Template Method
	public int getDegree(int v) {
		int degree = 0;

		Iterator<Integer> iterator = getAdjacents(v);
		while (iterator.hasNext()) {
			iterator.next();

			degree++;
		}

		return degree;
	}
}
