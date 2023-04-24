/*
Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe 
Wrapper Integer, inicializada com 10 valores inteiros. 
O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro 
e caso ele seja encontrado no ArrayList, exiba na tela a posição deste número na Collection. 
Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: 
O número NN não foi encontrado!

*/

package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		ArrayList<Integer> listaValores = new ArrayList<>();

		int num;

		Scanner ler = new Scanner(System.in);

		listaValores.add(2);
		listaValores.add(5);
		listaValores.add(1);
		listaValores.add(3);
		listaValores.add(4);
		listaValores.add(9);
		listaValores.add(7);
		listaValores.add(8);
		listaValores.add(10);
		listaValores.add(6);

		System.out.println("Digite o nº que deseja encontrar:");
		System.out.println(listaValores);
		num = ler.nextInt();

		if (listaValores.contains(num)) {
			System.out.printf("\nO nº digitado %d está localizado na posição %d", num, listaValores.indexOf(num));
		} else {
			System.out.printf("\nO nº digitado %d não foi encontrado!", num);
		}
		
		ler.close();
	}
}
