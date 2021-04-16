package br.edu.uni7.aed2.graph.algs;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import br.edu.uni7.aed2.graph.WeightedGraph;

public class GreedShortesPath {
	private boolean[] marked;
	private int edgeTo[];
	private int distTo[];
	private int source;

	public GreedShortesPath(WeightedGraph graph, int source) {
		this.source = source;
		marked = new boolean[graph.getNumberOfVertices()];
		edgeTo = new int[graph.getNumberOfVertices()];
		distTo = new int[graph.getNumberOfVertices()];

		bfs(graph, source);
	}

	private void bfs(WeightedGraph graph, int s) {
		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(s);
		marked[s] = true;
		distTo[s] = 0;

		while (!queue.isEmpty()) {
			int v = queue.remove();

			List<Integer> adjacents = graph.getAdjacentes(v);

			int bestWeight = Integer.MAX_VALUE;
			int bestOption = -1;
			for (int i = 0; i < adjacents.size(); i++) {
				int w = adjacents.get(i);

				int weight = graph.getWeight(v, w);
				if (!marked[w]) {
					if (weight < bestWeight) {
						bestWeight = weight;
						bestOption = w;
					}
				}
			}

			if (bestOption != -1) {
				queue.add(bestOption);
				marked[bestOption] = true;
				edgeTo[bestOption] = v;
				distTo[bestOption] = distTo[v] + graph.getWeight(v, bestOption);
			}
		}
	}
	
	public Collection<Integer> pathTo(int v){
		if ((v == source) || !hasPathTo(v)) {
			return null;
		}
		
		Stack<Integer> path = new Stack<Integer>();
		for (int x = v;x != source; x = edgeTo[x]) {
			path.push(x);
		}
		
		path.push(source);
		
		return path;
	}
	
	public int getDistanceTo(int v) {
		return distTo[v];
	}
	
	public boolean hasPathTo(int v) {
		return marked[v];
	}
}
