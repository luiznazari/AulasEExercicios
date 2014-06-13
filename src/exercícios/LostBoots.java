package exercícios;

import java.util.ArrayList;
import java.util.Scanner;

public class LostBoots {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> tamanho = new ArrayList<>();
		ArrayList<String> pe = new ArrayList<>();
		ArrayList<Integer> pares = new ArrayList<>();
		int t,i,j,n,cont;
		while (scan.hasNext()) {
			cont=0;
			tamanho.clear();
			pe.clear();
			n = scan.nextInt();
			for (i=0; i<n; i++) {
				tamanho.add(scan.nextInt());
				pe.add(scan.next());
				t = tamanho.size()-1;
				for (j=0; j<t; j++) {
					if (tamanho.get(t) == tamanho.get(j) && !(pe.get(t).equals(pe.get(j))) && t != j) {
						cont++;
						tamanho.remove(j);
						pe.remove(j);
						break;
					}
				}
			}
			pares.add(cont);
		}
		for (Integer I : pares)
			System.out.println(I);
		scan.close();
	}
}
