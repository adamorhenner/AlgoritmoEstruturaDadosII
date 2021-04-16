package br.edu.uni7.aed2.util;

import java.util.Iterator;

import br.edu.uni7.aed2.graph.Graph;
import br.edu.uni7.aed2.graph.GraphFactory;
import br.edu.uni7.aed2.graph.UndirectedGraphFactory;
import br.edu.uni7.aed2.graph.algs.BreadthFirst;
import br.edu.uni7.aed2.graph.algs.DepthFirst;
import br.edu.uni7.aed2.graph.algs.Paths;

public class TesteGraph {
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


		Iterator<Integer> vertices = g1.getVertices();
		while (vertices.hasNext()) {
			int v = vertices.next();
			
			System.out.println(v);
		}
		
		

		DepthFirst search = new DepthFirst(g1, 0);
		
		int source = 0;
		Paths paths = new DepthFirst(g1, source);
		vertices = g1.getVertices();
		while (vertices.hasNext()) {
			int v = vertices.next();

			if (paths.hasPathTo(v)) {
				Iterator<Integer> path = paths.pathTo(v);
				System.out.println("Path from " + source + " to " + v + ": ");

				while (path.hasNext()) {
					System.out.print(path.next() + ", ");
				}

				System.out.println("Distance: " + paths.getDistanceTo(v));

				System.out.println();
			} else {
				System.err.println("There is no path from " + source + " to " + v);
			}
		}

		System.out.println();

		Paths bfs = new BreadthFirst(g1, source);
		vertices = g1.getVertices();
		while (vertices.hasNext()) {
			int v = vertices.next();

			if (bfs.hasPathTo(v)) {
				Iterator<Integer> path = bfs.pathTo(v);
				System.out.println("Path from " + source + " to " + v + ": ");

				while (path.hasNext()) {
					System.out.print(path.next() + ", ");
				}

				System.out.println("Distance: " + bfs.getDistanceTo(v));

				System.out.println();
			} else {
				System.err.println("There is no path from " + source + " to " + v);
			}
		}
	}
}