package br.edu.uni7.tree.util;

import br.edu.uni7.tree.BinHeap;

public class TesteBinHeap {
	public static void main(String[] args) {
		BinHeap bh = new BinHeap();
		
		// 1..50 - idoso e gestantes
		//51..100 - Atendimento normal
		
		bh.insert(51);
		bh.insert(52);
		bh.insert(53);
		bh.insert(1);
		bh.insert(54);
		bh.insert(2);
		bh.insert(3);
		bh.insert(55);
		bh.insert(4);
		bh.insert(56);
		bh.insert(57);

		while(!bh.isEmpty()) {
			Integer min = bh.delMin();
			System.out.println("Min: " + min);
		}

	}
}
