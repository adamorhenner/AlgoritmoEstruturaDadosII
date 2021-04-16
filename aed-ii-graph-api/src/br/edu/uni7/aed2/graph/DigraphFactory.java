package br.edu.uni7.aed2.graph;

public class DigraphFactory extends GraphFactory{

	@Override
	protected Graph createGraphAsMatrix(int vertices) {
		return new DigraphAsMatrix(vertices);
	}

	@Override
	protected Graph createGraphAsList(int vertices) {
		return new DigraphAsList(vertices);
	}
}
