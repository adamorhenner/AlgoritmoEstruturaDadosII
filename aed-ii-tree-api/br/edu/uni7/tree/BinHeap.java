package br.edu.uni7.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinHeap {
	private static final int FIRST = 1;
	private List<Integer> heapList;
	private int currentSize;
	
	public BinHeap() {
		heapList = new ArrayList<Integer>();
		heapList.add(0);
		currentSize = 0;	
	}
	
	public Integer delMin() {
		Integer retval = heapList.get(FIRST);
		heapList.set(FIRST, heapList.get(currentSize));
		heapList.remove(currentSize);
		currentSize--;
		
		percDown(FIRST);
		
		return retval;
	}
	
	public void buildHeap(Integer[] alist) {
		int i = alist.length / 2 ;
		currentSize = alist.length;
		
		heapList = new ArrayList<Integer>();
		heapList.add(0);
		heapList.addAll(Arrays.asList(alist));
		
		while (i > 0) {
			percDown(i);
			i = i - 1;
		}
	
	
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
	
	private void percDown(int i) {
		while (i * 2 <= currentSize) {
			int mc = minChild(i);
			
			if(heapList.get(i) > heapList.get(mc)) {
				Integer tmp = heapList.get(i);
				heapList.set(i, heapList.get(mc));
				heapList.set(mc, tmp);
			}
			
			i = mc;
		}
	}

	private int minChild(int i) {
		int result = - 1;
		
		if ((i * 2 + 1)> currentSize) {
			result = i * 2;
		} else if (heapList.get(2 * i) < heapList.get(2 * i + 1)) {
			result = 2 * i;
		} else {
			result = 2 * i + 1;
		}

		return result;
	}

	public Integer findMin() {
		return heapList.get(FIRST);
	}
	
	public boolean isEmpty() {
		return currentSize == 0;
	}
	
	public int size() {
		return currentSize;
	}
	

		
	public void insert(Integer k) {
		heapList.add(k);
		currentSize++;
		
		percUp(currentSize);
		
	}


	
}
