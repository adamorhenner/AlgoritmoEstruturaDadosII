package br.edu.uni7.aed2.graph;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class GraphFactory {
	private static enum GraphType { 
		AsList, AsMatrix
	};

	public Graph newGraphAsList(int vertices) {
		return createGraphAsList(vertices);
	}

	public Graph newGraphAsMatrix(int vertices) {
		return createGraphAsList(vertices);
	}

	public Graph newGraphAsList(String path) {
		return createGraph(path, GraphType.AsList);
	}

	public Graph newGraphAsMatrix(String path) {
		return createGraph(path, GraphType.AsMatrix);
	}

	private Graph createGraph(String path, GraphType type) {
		Graph graph = null;

		try {
			FileInputStream stream = new FileInputStream(path);
			BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

			int count = 0;
			while (reader.ready()) {
				String line = reader.readLine();

				if (count < 1) {
					if ((line == null) || line.trim().isEmpty()) {//trim remove os espa�os
						throw new IllegalArgumentException("Número de vértices inválido na linha: " + (count + 1));
					}

					int vertices = -1;

					try {
						vertices = Integer.parseInt(line);
					} catch (NumberFormatException e) {
						throw new IllegalArgumentException("Número de vértices inválido na linha: " + (count + 1));
					}

					if (type.equals(GraphType.AsList)) {
						graph = createGraphAsList(vertices);
					} else {
						graph = createGraphAsMatrix(vertices);
					}

				} else {
					String[] values = line.split(" ");//split: vai quebrar onde tem " " espa�o e converter em array
					if ((values == null) || (values.length < 2)) {
						throw new IllegalArgumentException("Formato de arquivo inválido na linha: " + (count + 1));
					}

					int v = -1;
					int w = -1;

					try {
						v = Integer.parseInt(values[0]);//Convesao de string para inteiro
						w = Integer.parseInt(values[1]);
					} catch (NumberFormatException e) {
						throw new IllegalArgumentException(
								"Formato de arquivo inválido na linha: " + (count + 1) + ": " + line);
					}

					graph.addEdge(v, w);
				}

				count++;
			}
		} catch (IOException e) {
			throw new IllegalStateException("Problemas ao carregar o arquivo de dados");
		}

		return graph;
	}

	protected abstract Graph createGraphAsMatrix(int vertices);

	protected abstract Graph createGraphAsList(int vertices);
}
