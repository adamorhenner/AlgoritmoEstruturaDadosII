package br.edu.uni7.aed2.graph.algs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import br.edu.uni7.aed2.graph.Graph;

public class BreadthFirst extends Paths {
	public BreadthFirst(Graph graph, int source) {
		super(graph, source);
	}

	public void execute(Graph graph, int s) {
		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(s);
		marked[s] = true;

		while (!queue.isEmpty()) {
			int v = queue.remove();

			Iterator<Integer> neighbors = graph.getAdjacents(v);
			while (neighbors.hasNext()) {
				int w = neighbors.next();

				if (!marked[w]) {
					queue.add(w);
					marked[w] = true;
					edgeTo[w] = v;
					distTo[w] = distTo[v] + 1;
				}
			}
		}
	}
}
