package br.edu.uni7.aed2.util;

import java.util.Iterator;

import br.edu.uni7.aed2.graph.DigraphFactory;
import br.edu.uni7.aed2.graph.Graph;
import br.edu.uni7.aed2.graph.GraphFactory;

public class TestDigraph {
	public static void main(String[] args) {
		GraphFactory factory = new DigraphFactory();
		Graph g1 = factory.newGraphAsMatrix(13);
		
		g1.addEdge(0, 1);
		g1.addEdge(0, 5);
		g1.addEdge(2, 0);
		g1.addEdge(2, 3);
		
		g1.addEdge(3, 2);
		g1.addEdge(3, 5);
		g1.addEdge(4, 2);
		g1.addEdge(4, 3);
		
		g1.addEdge(5, 4);
		g1.addEdge(6, 0);
		g1.addEdge(6, 4);
		g1.addEdge(6, 8);
		
		g1.addEdge(6, 9);
		g1.addEdge(7, 6);
		g1.addEdge(7, 9);
		g1.addEdge(8, 6);
		
		g1.addEdge(9, 10);
		g1.addEdge(9, 11);
		g1.addEdge(10, 12);
		g1.addEdge(11, 4);
		
		g1.addEdge(11, 12);
		g1.addEdge(12, 9);
		
		System.out.println("Vertices: " + g1.getNumberOfVertices());
		System.out.println("Edges: " + g1.getNumberOfEdges());
		
		System.out.println("Vizinhos do 6: ");
		Iterator<Integer> adj = g1.getAdjacents(6);
		while (adj.hasNext()) {
			int w = adj.next();
			
			System.out.print(w + ", ");
		}
	}
}
