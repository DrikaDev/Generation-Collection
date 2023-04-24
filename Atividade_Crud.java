package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_Crud {

	public static void main(String[] args) {
		
		int op;
		Scanner ler = new Scanner(System.in);
		
		//4 operações executadas em um banco de dados:
		//comandos SQL: create, read, update e delete.
		//verbos do protocolo http: post, get, put, delete
		
		//CRUD de um estoque - para usuario manipular: colocar/retirar/produtoVelhor
		
		ArrayList<String> estoque = new ArrayList<>();
		
		do {
			
			System.out.println("\n\tMenu do Estoque:");
			System.out.println("\n1 - Adicionar item no estoque:");
			System.out.println("\n2 - Remover item no estoque:");
			System.out.println("\n3 - Atualizar item no estoque:");
			System.out.println("\n4 - Visualizar item no estoque:");
			System.out.println("\n0 - Encerrar.");
			System.out.println("\nDigite a sua opção:");
			op = ler.nextInt();
			
			switch(op) {
			case 1:
				//limpar o cache de memória
				ler.nextLine();
				System.out.println("Digite o produto que será adicionado ao estoque:");
				String produtoEntra = ler.nextLine();
				estoque.add(produtoEntra);
				break;
			
			case 2:
				ler.nextLine();
				System.out.println("Digite o produto que será removido do estoque:");
				String produtoSai = ler.nextLine();
				if(estoque.contains(produtoSai)) {
					estoque.remove(produtoSai);
					System.out.println("Produto removido.");
				}else {
					System.out.println("Produto não existe no estoque para ser removido:");
				}
				break;
			
			case 3:
				ler.nextLine();
				System.out.println("Digite o produto velho que deseja retirar:");
				String produtoVelho = ler.nextLine();
								
				if(estoque.contains(produtoVelho)) {
					estoque.remove(produtoVelho);
					
					System.out.println("Digite o nome do novo produto: ");
					String produtoNovo = ler.nextLine();
					estoque.add(produtoNovo);
					
				}else {
					System.out.println("Produto não existe no estoque para ser retirado.");
				}
				break;
				
			case 4:
				ler.nextLine();
				System.out.println("Lista dos produtos do estoque:");
				System.out.println(estoque);
				break;
				
				default:
				System.out.println("Programa Encerrado - Volte Sempre!");
			}
			
		}while(op != 0);
	}
}
