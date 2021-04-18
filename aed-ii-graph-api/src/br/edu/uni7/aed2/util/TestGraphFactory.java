package br.edu.uni7.aed2.util;

import java.util.Iterator;

import br.edu.uni7.aed2.graph.Graph;
import br.edu.uni7.aed2.graph.GraphFactory;
import br.edu.uni7.aed2.graph.UndirectedGraphFactory;

public class TestGraphFactory {
	public static void main(String[] args) {
		GraphFactory factory = new UndirectedGraphFactory();
		
		Graph g2 = factory.newGraphAsList(10);
		
		Graph g1 = factory.newGraphAsMatrix(
				"C:\\Users\\Adamor\\git\\AlgoritmoEstruturaDadosII\\aed-ii-graph-api\\src\\resources\\graph-noite.txt");
		
		System.out.println("Vértices: " + g1.getNumberOfVertices());
		System.out.println("Arestas: " + g1.getNumberOfEdges());
		
		int i = 3;
		System.out.println("Vizinhos de " + i);
		Iterator<Integer> adj = g1.getAdjacents(i);
		while (adj.hasNext()) {
			int v = adj.next();
			
			System.out.print(v + ", ");
		}
	}
}
