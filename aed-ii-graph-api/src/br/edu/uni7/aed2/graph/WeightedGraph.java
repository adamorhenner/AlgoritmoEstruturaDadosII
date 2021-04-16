package br.edu.uni7.aed2.graph;

import java.util.ArrayList;
import java.util.List;

public class WeightedGraph {
	private int[][] adj;
	private int numberOfEdges;
	private int numberOfVertices;

	public WeightedGraph(int numberOfVertices) {
		this.numberOfEdges = 0;
		this.numberOfVertices = numberOfVertices;
		adj = new int[this.numberOfVertices][this.numberOfVertices];

		for (int i = 0; i < adj.length; i++) {
			for (int j = 0; j < adj.length; j++) {
				adj[i][j] = Integer.MAX_VALUE;
			}
		}
	}

	public void addEdge(int v, int w, int weight) {
		adj[v][w] = weight;
		adj[w][v] = weight;

		numberOfEdges++;
	}

	public List<Integer> getAdjacentes(int v) {
		List<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < adj.length; i++) {
			if (adj[v][i] < Integer.MAX_VALUE) {
				result.add(i);
			}
		}

		return result;
	}

	public int getWeight(int v, int w) {
		return adj[v][w];
	}

	public boolean areNeighbors(int v, int w) {
		return getWeight(v, w) != Integer.MAX_VALUE;
	}

	public int getNumberOfEdges() {
		return numberOfEdges;
	}

	public int getNumberOfVertices() {
		return numberOfVertices;
	}
}
