package br.edu.uni7.aed2.graph;

public class UndirectedGraphFactory extends GraphFactory {

	@Override
	protected Graph createGraphAsMatrix(int vertices) {
		return new UndirectedGraphAsMatrix(vertices);
	}

	@Override
	protected Graph createGraphAsList(int vertices) {
		return new UndirectedGraphAsList(vertices);
	}
}
