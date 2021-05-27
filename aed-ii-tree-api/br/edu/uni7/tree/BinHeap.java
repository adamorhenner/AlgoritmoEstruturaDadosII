package br.edu.uni7.tree;

import java.util.ArrayList;
import java.util.List;

public class BinHeap {
	private List<Integer> heapList;
	private Integer currentSize;
	
	public BinHeap() {
		heapList = new ArrayList<Integer>();
		heapList.add(0);
		currentSize = 0;	
	}
	
	public Integer findMin() {
		return heapList.get(1);
	}
	
	public boolean isEmpty() {
		return currentSize == 0;
	}
	
	public int size() {
		return currentSize;
	}
	
	private void percUp(Integer i) {
		while (i/2 > 0) {
			if (heapList.get(i) < heapList.get(i/2)) {
				Integer tmp = heapList.get(i/2);
				heapList.set(i/2, heapList.get(i));
				heapList.set(i, tmp);
			}
			
			i= i/2;
		}
	}
		
	public void insert(Integer k) {
		heapList.add(k);
		currentSize++;
		
		percUp(currentSize);
		
	}


	
}
