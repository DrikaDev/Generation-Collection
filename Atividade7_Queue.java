package Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade7_Queue {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int op;

		Queue<String> filaCliente = new LinkedList<>();

		do {
			System.out.println("** Seja Bem-Vindo ao Banco Generation **");
			System.out.println("\n***** Menu *****");
			System.out.println("1 - Adicionar cliente na fila;");
			System.out.println("2 - Listar os clientes da fila;");
			System.out.println("3 - Chamar um cliente da fila;");
			System.out.println("0 - Sair.");
			System.out.println("Digite a opção desejada: ");
			op = ler.nextInt();

			switch (op) {
			case 1:
				ler.nextLine();
				System.out.println("Digite o nome do cliente por favor: ");
				String adicionarCliente = ler.nextLine();
				filaCliente.add(adicionarCliente);
				System.out.println("\nCliente adicionado!");
				System.out.println("Aperte Enter para retornar ao Menu.");
				ler.nextLine();
				break;

			case 2:
				ler.nextLine();
				System.out.println("Lista dos nomes dos clientes cadastrados:");
				System.out.println(filaCliente);
				System.out.println("Aperte Enter para retornar ao Menu.");
				ler.nextLine();
				break;

			case 3:
				ler.nextLine();
				System.out.println("Digite o nome do cliente que deseja chamar: ");
				String chamarCliente = ler.nextLine();

				if (filaCliente.contains(chamarCliente)) {
					filaCliente.remove(chamarCliente);
					System.out.println("\nCliente removido da fila!");
					System.out.println("Aperte Enter para retornar ao Menu.");
					ler.nextLine();
				} else {
					System.out.println("\nEste cliente não está mais na fila!");
					System.out.println("Aperte Enter para retornar ao Menu.");
					ler.nextLine();
				}
				break;

			default:
				System.out.println("\nPrograma Finalizado!");
				break;
			}

		} while (op != 0);

		ler.close();
	}
}