package Collection;

import java.util.Iterator;
import java.util.Stack;

public class Aula_Pilha {

	public static void main(String[] args) {
		
		//collection stack para pilha:
		Stack<String> pilha = new Stack<>();
		
		System.out.println("Adicionando itens na pilha:");
		pilha.push("Pratos");
		pilha.push("Copos");
		pilha.push("Garfo");
		pilha.push("Faca");
		pilha.push("Colher");
		System.out.println("Mostrando a pilha: " + pilha);
		
		System.out.println("\nRetirando elemento da pilha: " + pilha.pop());
		System.out.println("Mostrando a pilha: " + pilha);
		
		System.out.println("\nMostrar elemento no topo da pilha: " + pilha.peek());
		System.out.println("Adicionar elemento na pilha: " + pilha.push("Panela"));
		
		System.out.println("Mostrando a pilha: " + pilha);
		
		System.out.println("Tamanho da pilha: " + pilha.size());
		System.out.println("Mostrando a pilha: " + pilha);
		
		System.out.println("Confirmar se o elemento garfo está na pilha: " + pilha.contains("Garfo"));
		
		System.out.println("\n===================");
		System.out.println("Usando iterator: ");
		
		Iterator<String> iterator = pilha.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("Mostrando os elementos da pilha: " + iterator.next());
		}
		
		pilha.clear();
		System.out.println("\nVerificar se a pilha está vazia: " + pilha.isEmpty());
	}
}
