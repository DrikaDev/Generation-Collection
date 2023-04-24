/*
Escreva um programa Java para criar uma Collection Set de Objetos da 
Classe Wrapper Integer. O programa deverá solicitar ao usuário, 
que ele digite via teclado 10 valores inteiros não repetidos e 
adicione-os individualmente na Collection Set. 
Em seguida, faça o que se pede:
Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 
*/

package Collection;

import java.util.*;

public class Atividade3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int num = 0;

		HashSet<Integer> valoresInteiros = new HashSet<Integer>();

		System.out.println("Digite 10 valores inteiros.");
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº número: ", (i+1), num);
			num = leia.nextInt();
			valoresInteiros.add(num);
		}
		
		Iterator<Integer> resultado = valoresInteiros.iterator();
				
		System.out.println("\nListar números digitados sem repetir: " + valoresInteiros);	
		
		leia.close();
	}
}
