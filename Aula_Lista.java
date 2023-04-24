package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula_Lista {

	public static void main(String[] args) {
		
		//criando uma lista do tipo array com um objeto wrapper do tipo Integer:		
		List<Integer> minhaLista = new ArrayList<>();
		
		//adicionando elementos para dentro do meu ArrayList:
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(5);
		minhaLista.add(3);
		minhaLista.add(7);
		minhaLista.add(5);
		minhaLista.add(8);
		minhaLista.add(1);
		
		System.out.println("Mostrando os elementos da lista:");
		//for "each" (tipodedados nomedavariavel:nomedaLista)
		for (Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		
		System.out.println("\nRemovendo um elemento da lista - no caso o Zero:");
		minhaLista.remove(0);
		
		for (Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		
		int primeiroElemento = minhaLista.get(0);
		System.out.println("\nMostrando agora o 1º elemento da lista: " + primeiroElemento);

		
		System.out.println("\nMostrando os elementos atualizados:");
		for(int i= 0; i< minhaLista.size(); i++) {
			System.out.println(minhaLista.get(i));
		}
		
		System.out.println("\n =============== ");
		
		//sort para colocar em ordem crescente:
		Collections.sort(minhaLista);		
		System.out.println("\nSort para ordenar a lista:" + minhaLista);
	}
}
