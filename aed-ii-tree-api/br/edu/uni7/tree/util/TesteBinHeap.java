package br.edu.uni7.tree.util;

import br.edu.uni7.tree.BinHeap;
import sun.nio.cs.ext.Big5_HKSCS_2001;

public class TesteBinHeap {
	public static void main(String[] args) {
		BinHeap bh = new BinHeap();
		BinHeap bh2 = new BinHeap();

		// 1..50 - idoso e gestantes
		//51..100 - Atendimento normal
		
		bh.insert(2);
		bh.insert(1);
		bh.insert(4);
		bh.insert(3);

		
		bh2.insert(51);
		bh2.insert(52);
		bh2.insert(53);
		bh2.insert(54);
		bh2.insert(55);
		bh2.insert(56);
		bh2.insert(57);

		int priori = 0;
		int normal = 0;
		while(!bh.isEmpty() || !bh2.isEmpty()) {
			while (priori < 2) {
				if(!bh.isEmpty()) {
					System.out.println(bh.delMin());
					priori ++;
				} else {
					System.out.println("Filade prioridade vazia");
					break;
				}
			}
			priori = 0;
			
			while (normal < 1 ) {
				if (!bh2.isEmpty()) {
					System.out.println(bh2.delMin());
					normal++;
				} else {
					System.out.println("Fila normal vazia");
					break;
				}
			}
			normal = 0;
		}
	}
}
