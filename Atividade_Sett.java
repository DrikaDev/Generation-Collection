package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Atividade_Sett {

	public static void main(String[] args) {

		Set<Integer> meuSet = new HashSet<>();
		meuSet.add(8);
		meuSet.add(5);
		meuSet.add(3);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(5);
		meuSet.add(9);
		meuSet.add(1);
		
		//iMeuSet é um nome qualquer
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		System.out.println("O Iterator ordena e elimina os elementos da lista que estiver duplicados:");
		//for "each" (tipodedados nomedavariavel:nomedaLista)
		for (Integer minhaLista:meuSet) {
			System.out.println(minhaLista);
		}
		
		//hasNext percorre os elementos do Iterator:
		System.out.println("Ele ordena e elimina o que tiver duplicado:");
		while(iMeuSet.hasNext()) {
			System.out.println(iMeuSet.next());
			
		}
	}
}
