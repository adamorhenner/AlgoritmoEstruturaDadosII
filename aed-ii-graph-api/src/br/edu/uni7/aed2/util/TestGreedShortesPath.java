package br.edu.uni7.aed2.util;

import java.util.Collection;

import br.edu.uni7.aed2.graph.WeightedGraph;
import br.edu.uni7.aed2.graph.algs.GreedShortesPath;

public class TestGreedShortesPath {
	public static void main(String[] args) {
		WeightedGraph graph = new WeightedGraph(7);

		graph.addEdge(0, 1, 3);
		graph.addEdge(0, 2, 8);
		graph.addEdge(0, 3, 4);
		graph.addEdge(0, 5, 10);
		graph.addEdge(1, 3, 6);

		graph.addEdge(2, 4, 7);

		graph.addEdge(3, 4, 1);
		graph.addEdge(3, 5, 3);
		graph.addEdge(4, 5, 1);

		GreedShortesPath greed = new GreedShortesPath(graph, 0);

		Collection<Integer> path = greed.pathTo(5);
		System.out.println("O camminho de 0 a 5: " + path);
		System.out.println("A distancia é: " + greed.getDistanceTo(5));
	}
}
