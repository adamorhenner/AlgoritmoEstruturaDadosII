package br.edu.uni7.aed2.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Graph {
	protected int numberOfVertices;
	protected int numberOfEdges;
	
	public Graph(int nVertices) {
		this.numberOfVertices = nVertices;
	}
	
	public abstract void addEdge(int v, int w);
	
	public abstract Iterator<Integer> getAdjacents(int v);
	
	public int getNumberOfEdges() {
		return numberOfEdges;
	}
	
	public int getNumberOfVertices() {
		return numberOfVertices;
	}
	
	public Iterator<Integer> getVertices(){
		List<Integer> vertices = new ArrayList<Integer>();
		
		for (int index = 0; index < numberOfVertices; index++) {
			vertices.add(index);
		}
		
		return vertices.iterator();
	}
}
