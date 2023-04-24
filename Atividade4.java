/*
Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer,
inicializada com 10 valores inteiros. 
O programa deverá solicitar ao usuário que ele digite via teclado 1 número inteiro 
e caso ele seja encontrado no Set, exiba na tela a mensagem: 
Número 00 Encontrado! 
Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: 
O número NN não foi encontrado!
*/

package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite o nº que deseja encontrar:");
		int n = ler.nextInt();
		
		//verificar se o numero tá dentro do HashSet
		boolean verifica;
		verifica = numeros.contains(n);
		
		if(verifica == true) {
			System.out.println("O número " + n + " foi encontrado!");
		}else {
			System.out.println("O número " + n + " não foi encontrado!");
		}
		
		ler.close();
	}
}
