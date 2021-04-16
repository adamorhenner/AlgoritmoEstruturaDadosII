package br.edu.uni7.aed2.util;

import java.util.LinkedList;
import java.util.Queue;

public class TestCollection {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 0; i < 10; i++) {
			queue.add(i);
		}
		
		System.out.println(queue);

		while (!queue.isEmpty()) {
			int n = queue.remove();

			System.out.println("O numero " + n + " foi removido da fila");
		}
	}
}
