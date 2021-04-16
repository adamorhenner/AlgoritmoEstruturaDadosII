package br.edu.uni7.aed2.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import br.edu.uni7.aed2.graph.UndirectedGraph;

public class BreadthFirstPaths {
	private boolean[] marked;
	private int edgeTo[];
	private int source;
	private int distTo[];
	
	public BreadthFirstPaths(UndirectedGraph graph, int source) {
		this.source = source;
		
		marked = new boolean[graph.getNumberOfVertices()];
		edgeTo = new int[graph.getNumberOfVertices()];
		distTo = new int[graph.getNumberOfVertices()];
		
		bfs(graph, source);
		marked[source] = false;
	}
	
	public boolean hasPathTo(int v) {
		return marked[v];
	}
	
	public Iterator<Integer> pathTo(int v){
		if ((v == source) || !hasPathTo(v)) {
			return null;
		}
		
		Stack<Integer> path = new Stack<Integer>();
		for (int x = v;x != source; x = edgeTo[x]) {
			path.push(x);
		}
		
		path.push(source);
		
		return path.iterator();
	}
	
	public int getDistanceTo(int v) {
		return distTo[v];
	}

	private void bfs(UndirectedGraph graph, int s) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(s);
		marked[s] = true;
		distTo[s] = 0;
		
		while (!queue.isEmpty()) {
			int v = queue.remove();
			
			Iterator<Integer> neighbors = graph.getAdjacents(v);
			while (neighbors.hasNext()) {
				int w = neighbors.next();
				
				if (!marked[w]) {
					queue.add(w);
					marked[w] = true;
					edgeTo[w] = v;
					distTo[w] = distTo[v] + 1;
				}
			}
		}
	}
}
