package br.edu.uni7.tree.util;

import br.edu.uni7.tree.BinHeap;

public class TesteBinHeap {
	public static void main(String[] args) {
		BinHeap bh = new BinHeap();
		bh.insert(5);
		bh.insert(7);
		bh.insert(3);
		bh.insert(11);
		bh.insert(2);
		bh.insert(10);
		bh.insert(1);
		
		System.out.println(bh);


	}
}
