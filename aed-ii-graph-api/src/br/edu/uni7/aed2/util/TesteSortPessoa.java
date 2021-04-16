package br.edu.uni7.aed2.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteSortPessoa {
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa(20, "Maria"));
		pessoas.add(new Pessoa(2, "Jose"));
		pessoas.add(new Pessoa(12, "Joao"));
		pessoas.add(new Pessoa(4, "Carlos"));
		
		System.out.println(pessoas);
		
		Collections.sort(pessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getId() - o2.getId();
			}
		});
		
		System.out.println(pessoas);
		
		Collections.sort(pessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
		
		System.out.println(pessoas);
	}
}
