package br.edu.uni7.aed2.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSearch {
	public static void main(String[] args) {
		int k = 4;
		Integer[] pessoas = { 1, 3, 5, 6, 12, 20, 25, 30, 40 };
		int index = Arrays.binarySearch(pessoas, k);
		if (index >= 0) {
			System.out.println("Achei o k na posição " + index);	
		} else {
			int insertionPoint = -index - 1;
			System.out.println("A chave deveria estar na posição: " + insertionPoint);
		}
		
		List<Integer> numbers = Arrays.asList(pessoas);
		index = Collections.binarySearch(numbers, 22);
		if (index >= 0) {
			System.out.println("Achei o número na posição " + index);	
		} else {
			int insertionPoint = -index - 1;
			System.out.println("A chave deveria estar na posição: " + insertionPoint);
		}
		
//		(-(insertionPoint) - 1) = index
//		-(insertionPoint) = index + 1
	}
}
