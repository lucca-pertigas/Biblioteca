package aplicacao;

import servicos.ServicoUsuario;
import java.util.Scanner;

public class MenuUsuario {
	private ServicoUsuario servicoUsuario;
	private Scanner sc;
	
	public MenuUsuario(ServicoUsuario servicoUsuario, Scanner sc) {
		this.servicoUsuario = servicoUsuario;
		this.sc = sc;
	}
	
	public void executarMenuUsuario() {
		int escolha;
		
		do {
			System.out.println("\n\n--------MENU USUARIO--------");
			System.out.println("1 - Cadastrar usuario");
			System.out.println("2 - Listar usuarios");
			System.out.println("3 - Modificar dados do usuario");
			System.out.println("4 - Excluir usuario");
			System.out.println("5 - Buscar usuario por numero de matricula");
			System.out.println("0 - Voltar");
			escolha = sc.nextInt();
			sc.nextLine();
			
			switch (escolha) {
				case 1:
					System.out.println("Digite o nome do usuario: ");
					String nome = sc.nextLine();
					
					System.out.println("Digite o email do usuario: ");
					String email = sc.nextLine();
					
					System.out.println("Digite o telefone do usuario: ");
					String telefone = sc.nextLine();
					
					servicoUsuario.cadastrar(nome, email, telefone);
					break;
				case 2:
					servicoUsuario.listar();
					break;
				case 3:
					System.out.println("Qual o numero do id do usuario que voce quer modificar: ");
					int id = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Qual o novo nome: ");
					String novoNome = sc.nextLine();
					
					System.out.println("Qual o novo email: ");
					String novoEmail = sc.nextLine();
					
					System.out.println("Qual o novo telefone: ");
					String novoTelefone = sc.nextLine();
					
					servicoUsuario.alterarUsuario(id, novoNome, novoEmail, novoTelefone);
					break;
				case 4:
					System.out.println("Digite a matricula do usuario que voce quer excluir: ");
					int matricula = sc.nextInt();
					
					servicoUsuario.excluir(matricula);
					break;
				case 5:
					System.out.println("Digite a matricula do usuario que voce quer busca: ");
					int busca = sc.nextInt();
					
					servicoUsuario.apresentarPorId(busca);
					break;
				case 0:
					System.out.println("Voltando ao menu principal");
					break;
				default:
					System.out.println("Escolha uma opcao valida !");
					break;
			}
		} while (escolha != 0);
	}
}
