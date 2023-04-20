/*
Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. 
O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e 
deverá adicioná-las individualmente no ArrayList. 
Em seguida, faça o que se pede:
Mostre na tela todas as cores que foram adicionadas. 
Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.

*/

package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		ArrayList<String> listaCores = new ArrayList<>();
		
		String cores;
		
		Scanner ler = new Scanner(System.in);
				
		for (int i = 0; i < 5; i++ ) {
			System.out.println("Digite a " + (i+1) + "º cor: ");
			cores = ler.next();
			
			listaCores.add(cores);
		}
		
		System.out.println("\nListar todas as cores: " + listaCores);
		
		Collections.sort(listaCores);
		System.out.println("\nOrdenar as cores:" );
		System.out.println(listaCores);
	}
}
