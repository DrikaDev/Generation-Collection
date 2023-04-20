package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_Crud {

	public static void main(String[] args) {
		
		int op;
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList<>();
		
		do {
			
			System.out.println("\tMenu do Estoque:");
			System.out.println("\n1 - Adicionar item no estoque:");
			System.out.println("\n2 - Remover item no estoque:");
			System.out.println("\n3 - Atualizar item no estoque:");
			System.out.println("\n4 - Visualizar item no estoque:");
			System.out.println("\n0 - Encerrar.");
			System.out.println("Digite a sua opção:");
			op = ler.nextInt();
			
			switch(op) {
			case 1:
				//limpar o cache de memória
				ler.nextLine();
				System.out.println("Digite o produto que será adicionado ao estoque:");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
			
			case 2:
				System.out.println("Digite o produto que será removido do estoque:");
				String removerProduto = ler.nextLine();
				if(estoque.contains(removerProduto)) {
					estoque.remove(removerProduto);
				}else {
					System.out.println("Produto não existe no estoque para ser removido:");
				}
				System.out.println(estoque);
				break;
			
			case 3:
				ler.nextLine();
				System.out.println("Digite o produto que deseja atualizar:");
				String verifica = ler.nextLine();
				System.out.println("Digite o nome do novo produto: " + verifica);
				String novo = ler.nextLine();
				
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}else {
					System.out.println("Produto não existe no estoque para ser atualizado");
				}
				System.out.println(estoque);
				break;
				
			case 4:
				System.out.println("Lista dos produtos do estoque:");
				System.out.println(estoque);
				break;
			
			case 0:
				System.out.println("Programa Encerrado - Volte Sempre!");
				break;
				
				default:
				System.out.println("Opção inválida!");
			}
			
		}while(op != 0);
	}
}
