package br.edu.uni7.aed2.graph.algs;

import java.util.Iterator;
import java.util.Stack;

import br.edu.uni7.aed2.graph.Graph;

public abstract class Paths {
	protected boolean[] marked;
	protected int edgeTo[];
	private int source;
	protected int distTo[];

	public Paths(Graph graph, int source) {
		this.source = source;

		marked = new boolean[graph.getNumberOfVertices()];
		edgeTo = new int[graph.getNumberOfVertices()];
		distTo = new int[graph.getNumberOfVertices()];

		execute(graph, source);

		marked[source] = false;
	}

	protected abstract void execute(Graph graph, int v);

	public boolean hasPathTo(int v) {
		return marked[v];
	}

	public Iterator<Integer> pathTo(int v) {
		if ((v == source) || !hasPathTo(v)) {
			return null;
		}

		Stack<Integer> path = new Stack<Integer>();
		for (int x = v; x != source; x = edgeTo[x]) {
			path.push(x);
		}

		path.push(source);

		return path.iterator();
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public int getDistanceTo(int v) {
		return distTo[v];
	}

	public boolean isMarked(int v) {
		return marked[v];
	}

	public boolean[] getMarked() {
		return marked;
	}

	public int[] getDistTo() {
		return distTo;
	}

	public int[] getEdgeTo() {
		return edgeTo;
	}
}
