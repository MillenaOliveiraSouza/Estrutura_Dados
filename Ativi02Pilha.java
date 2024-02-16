package EstruturasDados;

import java.util.Stack; //importa a classe Stack da biblioteca java, essa classe é uma implementação de uma pilha, que segue o LIFO (o ultimo a entrar é o primeiro a sair)
import java.util.Scanner;

public class Ativi02Pilha {

	public static void main(String[] args) {
		// 2)Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos
		// da Classe String, para organizar a retirada de livros em uma pilha. O
		// programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
		// ● 1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
		// ● 2: Listar todos os livros da Pilha
		// ● 3: Retirar um livro da pilha
		// ● 0: O programa deve ser finalizado.
		// Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele
		// deverá informar que a pilha está vazia.

		//declaramos uma variavel chamada pilhaLivros que é do tipo Stack<String>. Isso significa que estamos criando uma pilha que conterá elementos do tipo String.O new Stack<>() cria uma nova instancia da classe Stack
		Stack<String> pilhaLivros = new Stack<>();
		Scanner scanner = new Scanner(System.in);

		int opcao;

		System.out.println("+++ VAMOS ADICIONAR LIVROS NA PILHA ++++");

		do {

			System.out.println("\n                MENU ");
			System.out.println("(1) Adicionar um novo livro na pilha. ");
			System.out.println("(2) Listar todos os livros da Pilha");
			System.out.println("(3) Retirar um livro da pilha ");
			System.out.println("(0) Finalizar programa ");

			System.out.print("\nDigite a opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:

				System.out.print("\nDigite o nome do livro: ");
				scanner.nextLine();
				String nomeLivro = scanner.nextLine();

				//adiciona um novo elemento a pilha pilhaLivros. O push() é um método da classe Stack que adiciona um elemento ao topo da pilha
				pilhaLivros.push(nomeLivro);

				System.out.println("\nLivro adicionado com sucesso!");

				break;

			case 2:

				//é um método da classe Stack que verifica se a pilha pilhaLivros está vazia, se tiver vazia retorna true e se não tiver vazia retorna false.
				if (pilhaLivros.isEmpty()) {

					System.out.println("\nA pilha está vazia.");

				} else {

					System.out.println("\nLivros na pilha:");

					for (String livros : pilhaLivros) {

						System.out.println(livros);
					}
				}
				break;

			case 3:

				if (pilhaLivros.isEmpty()) {

					System.out.println("\nA pilha está vazia. Impossível retirar livro.");

				} else {

					//.pop() é um método da classe Stack que remove e retorna o elemento no tpo da pilha pilhaLivros. O pop() remove o elemento da pilha e o retorna.
					String livroRetirado = pilhaLivros.pop();

					System.out.println("\nO Livro retirado da pilha é: " + livroRetirado);
				}
				break;

			case 0:

				System.out.println("\nPrograma Finalizado!");

				break;

			default:

				if (opcao != 1 || opcao != 2 || opcao != 3 || opcao != 0) {

					System.out.println("\nOpção inválida! Digite novamente uma opção.");
				}

				break;

			}

		} while (opcao != 0);

		scanner.close();

	}

}
