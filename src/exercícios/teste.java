package exercícios;

import java.util.ArrayList;

public class teste {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(100);
		System.out.println(a.size());
		a.set(a.size()-1, 42);
		System.out.println(a.get(0));
	}
}
