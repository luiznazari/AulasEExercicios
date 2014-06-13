package br.edu.unoesc.segundoPeriodo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lista05_01 {
	public static void main(String[] args) {
		Set<Integer> numeros_set = new HashSet<>();
		ArrayList<Integer> numeros_list = new ArrayList<>();
		numeros_set.add(2);
		numeros_set.add(5);
		numeros_set.add(3);
		numeros_set.add(9);
		numeros_set.add(2);
		numeros_set.add(4);
		numeros_set.add(3);
		numeros_set.add(8);
		numeros_set.add(5);
		numeros_list.add(2);
		numeros_list.add(5);
		numeros_list.add(3);
		numeros_list.add(9);
		numeros_list.add(2);
		numeros_list.add(4);
		numeros_list.add(3);
		numeros_list.add(8);
		numeros_list.add(5);
		// A declação do iterator precisa ser após a determinação dos valores do Array, pois ele seta o tamanho
		Iterator<Integer> it_set = numeros_set.iterator();
		Iterator<Integer> it_list = numeros_list.iterator();
		System.out.print("Set: ");
		while (it_set.hasNext()){
			System.out.print(it_set.next()+" ");
		}
		System.out.print("\nList: ");
		while (it_list.hasNext()){
			System.out.print(it_list.next()+" ");
		}
	}
}
