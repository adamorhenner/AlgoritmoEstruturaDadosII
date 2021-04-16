package br.edu.uni7.aed2.util;

import br.edu.uni7.aed2.graph.Graph;
import br.edu.uni7.aed2.graph.GraphFactory;
import br.edu.uni7.aed2.graph.UndirectedGraphFactory;

public class MyGraph {
	public static void main(String[] args) {
		GraphFactory factory = new UndirectedGraphFactory();
		Graph graph = factory.newGraphAsMatrix(5);

		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
	}
}
