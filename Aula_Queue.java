package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Aula_Queue {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<Integer>();

		// FIFO = first in, first out - primeiro que entra, primeiro que sai;

		for(int i=0; i<=10; i++) {
			fila.add(i);
		}

		System.out.println("Elementos da fila" + fila);
		System.out.println("Removendo um elemento da lista: " + fila.remove());

		System.out.println("Fila atualizada: " + fila);

		System.out.println("Adicionando o elemento na 11º posição: " + fila.add(11));
		System.out.println("Fila atualizada: " + fila);

		System.out.println("Pegar o 1º elemento da fila: " + fila.peek());
		System.out.println("Pegar qualquer elemento da fila? " + fila.peek());

		System.out.println("Pra saber qts elementos tem a fila: " + fila.size());

		System.out.println("Pra verificar/pesquisar um elemento da fila, o 12 por ex: " + fila.contains(12));
		// ele retorn um boolean: vai dar true ou false

		System.out.println("Exibir e retirar o 1º elemento da fila: " + fila.poll());
		System.out.println("Fila atualizada: " + fila);

		Iterator<Integer> iterator = fila.iterator();

		while (iterator.hasNext()) {
			System.out.println("o que é isso: " + iterator.next());
		}

		fila.clear();
		System.out.println("\n .clear para limpar a fila: ");

		System.out.println("Verificar se a fila está vazia: " + fila.isEmpty());

	}
}