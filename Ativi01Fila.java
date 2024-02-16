package EstruturasDados;

import java.util.LinkedList; //importa a classe linkedList, da biblioteca java que sera usada para implemendar a fila de clientes
import java.util.Queue; //importa essa interface que será usada para definir a estrutura de dados da fila 
import java.util.Scanner;

public class Ativi01Fila {

	public static void main(String[] args) {
		// 1) Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos
		// da Classe String, para organizar a ordem de chegada dos Clientes de um Banco.
		// O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
		// ● 1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
		// ● 2: Listar todos os Clientes na fila
		// ● 3: Chamar (retirar) uma pessoa da fila
		// ● 0: O programa deve ser finalizado.
		// Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao
		// tentar retirar (chamar) um cliente da fila..

		Queue<String> filaClientes = new LinkedList<>(); //declara uma fila chamada filaClientes que armazenará os nomes de clientes. é uma instancia da classe LinkedList que implementa a interface Queue

		Scanner scanner = new Scanner(System.in);

		int opcao;

		do {

			System.out.println("\nDigite o código da opção que precisa: ");
			System.out.println("(1) Adicionar novo cliente a fila");
			System.out.println("(2) Listar todos os clientes que estão na fila");
			System.out.println("(3) Chamar o próximo cliente da fila");
			System.out.println("(0) Finalizar o programa");

			opcao = scanner.nextInt();

			switch (opcao) {

			case 1:

				System.out.println("Digite o nome do cliente: ");
				scanner.nextLine();
				String nomeCliente = scanner.nextLine();
				
				//adiciona um elemento á fila. O nomeCliente é o nome que o usuario digitou para adicionar á fila de clientes. O método offer é usado para adicionar 
                //um elemento a fila e retorna true se o elemento foi adicionado com sucesso e false se não puder ser adcionado devido a restrições de capacidade.
				filaClientes.offer(nomeCliente); 

				System.out.println("Cliente adicionado com sucesso!");
				break;

			case 2:
				
				//o metodo isEmpty() é usado para verificar se a fila está vazia. Retorna true se a fila estiver vazia e falso se não estiver. Neste caso estamos verificando 
				//se a fila está vazia antes de listar ou chamar o proximo cliente.
				if (filaClientes.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Os clientes que estão na fila são: ");

					for (String cliente : filaClientes) {

						System.out.println(cliente);
					}
				}
				break;

			case 3:
				//o metodo isEmpty() é usado para verificar se a fila está vazia. Retorna true se a fila estiver vazia e falso se não estiver. Neste caso estamos verificando 
				//se a fila está vazia antes de listar ou chamar o proximo cliente.
				if (filaClientes.isEmpty()) {

					System.out.println("A fila está vazia, impossível chamar cliente!");

				} else {
					
					//fila.poll() o metodo poll é usado para recuperar e remover o proximo elemento da fila. Elel retorna o próximo elemento da fila.Neste caso estamos chamando 
					//o próximo cliente da fila e armazenando seu nome na váriavel proximoCliente
					String proximoCliente = filaClientes.poll();
					System.out.println("Proximo cliente chamado: " + proximoCliente);
				}
				break;

			default:

				if (opcao == 0) {
					System.out.println("Programa Finalizado!");
				} else {
					System.out.println("Inválido. Essa opção não existe!");
				}
				break;
			}

		} while (opcao != 0);

		scanner.close();

	}

}
