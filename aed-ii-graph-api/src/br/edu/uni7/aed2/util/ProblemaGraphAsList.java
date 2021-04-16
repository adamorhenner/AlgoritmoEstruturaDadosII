package br.edu.uni7.aed2.util;

import java.util.Iterator;

import br.edu.uni7.aed2.graph.Graph;
import br.edu.uni7.aed2.graph.GraphFactory;
import br.edu.uni7.aed2.graph.UndirectedGraphFactory;

public class ProblemaGraphAsList {
	public static void main(String[] args) {
		GraphFactory factory = new UndirectedGraphFactory();
		Graph graph = factory.newGraphAsList(10);

		graph.addEdge(0, 5);
		graph.addEdge(0, 6);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		
		graph.addEdge(1, 3);
		graph.addEdge(1, 2);
		graph.addEdge(1, 6);

		Iterator<Integer> adj = graph.getAdjacents(0);
		while (adj.hasNext()) {
			System.out.println(adj.next());
		}
		
		System.out.println("OK");
	}
}
