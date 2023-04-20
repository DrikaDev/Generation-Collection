package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Atividade_Lista {

	public static void main(String[] args) {
		
		//criando uma lista do tipo array com um objeto wrapper do tipo Integer:		
		ArrayList<Integer> minhaLista = new ArrayList<>();
		
		//adicionando elementos para dentro do meu ArrayList:
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(5);
		minhaLista.add(3);
		minhaLista.add(7);
		minhaLista.add(8);
		
		System.out.println("Mostrando os elementos da lista:");
		//for (wrapper nomedavariavel:nomedaLista)
		for (Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		
		System.out.println("\nRemovendo um elemento da lista - no caso o Zero:");
		minhaLista.remove(0);
		
		for (Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		
		int primeiroElemento = minhaLista.get(0);
		System.out.println("\nMostrando agora o elemento zero da lista: " + primeiroElemento + "\n");

		for(int i= 0; i< minhaLista.size(); i++) {
			System.out.println("Elemento: " + minhaLista.get(i));
		}
		
		Collections.sort(minhaLista);
		System.out.println("Lista ordenada:");
		System.out.println(minhaLista);
		System.out.println();
		
		//=====================================
		
		Set<Integer> meuSet = new HashSet<Integer>();
		meuSet.add(8);
		meuSet.add(5);
		meuSet.add(3);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(9);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		
		while(iMeuSet.hasNext()) {
			System.out.println("Ordenando:" + iMeuSet.next());
			
		}
	}

}
