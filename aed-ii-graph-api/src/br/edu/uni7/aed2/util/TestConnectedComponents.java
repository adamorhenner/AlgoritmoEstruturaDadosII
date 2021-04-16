package br.edu.uni7.aed2.util;

import br.edu.uni7.aed2.graph.Graph;
import br.edu.uni7.aed2.graph.GraphFactory;
import br.edu.uni7.aed2.graph.UndirectedGraphFactory;
import br.edu.uni7.aed2.graph.algs.ConnectedComponents;

public class TestConnectedComponents {
	public static void main(String[] args) {
		GraphFactory factory = new UndirectedGraphFactory();
		Graph g1 = factory.newGraphAsList(13);

		g1.addEdge(0, 1);
		g1.addEdge(0, 2);
		g1.addEdge(0, 5);
		g1.addEdge(0, 6);

		g1.addEdge(3, 4);
		g1.addEdge(3, 5);

		g1.addEdge(4, 5);
		g1.addEdge(4, 6);

		g1.addEdge(7, 8);
		g1.addEdge(9, 10);
		g1.addEdge(9, 11);
		g1.addEdge(9, 12);
		g1.addEdge(11, 12);
		
		ConnectedComponents cc = new ConnectedComponents(g1);
		
		System.out.println("Número de Componentes: " + cc.getCount());
		
		int v = 6;
		System.out.println("Vértice " + v + " pertence ao componente: " + cc.getId(v));
		
		v = 8;
		System.out.println("Vértice " + v + " pertence ao componente: " + cc.getId(v));
		
		v = 9;
		System.out.println("Vértice " + v + " pertence ao componente: " + cc.getId(v));
		
		int i = 2;
		int j = 5;
		System.out.println("Os vértices " + i + " e " + j + " estão conectados? " + cc.connected(i, j));
		
		i = 7;
		j = 9;
		System.out.println("Os vértices " + i + " e " + j + " estão conectados? " + cc.connected(i, j));
		
		i = 7;
		j = 8;
		System.out.println("Os vértices " + i + " e " + j + " estão conectados? " + cc.connected(i, j));
	}
}
