package aplicacao;

import servicos.ServicoRevista;
import java.util.Scanner;

public class MenuRevistas {
	private ServicoRevista servicoRevista;
	private Scanner sc;
	
	public MenuRevistas(ServicoRevista servicoRevista, Scanner sc) {
		this.servicoRevista = servicoRevista;
		this.sc = sc;
	}
	
	public void executarMenuRevista() {
		int escolha;
		
		do {
			System.out.println("\n\n--------MENU REVISTA--------");
			System.out.println("1 - Cadastrar revista");
			System.out.println("2 - Listar revistas");
			System.out.println("3 - Modificar dados de uma revista");
			System.out.println("4 - Excluir revista");
			System.out.println("0 - Voltar");
			System.out.println("Escolha uma opcao: ");
			escolha = sc.nextInt();
			sc.nextLine();
			
			switch (escolha) {
			case 1:
				System.out.println("Digite o titulo da revista: ");
				String titulo = sc.nextLine();
				
				System.out.println("Digite o ano da publicacao: ");
				Integer anoPublicacao = sc.nextInt();
				
				System.out.println("Digite a editora: ");
				String editora = sc.nextLine();
				
				System.out.println("Digite o numero da edicao");
				Integer edicao = sc.nextInt();
				
				System.out.println("Digite o mes da publicacao (1 - Janeiro / 2 - fevereiro / 3 - Marco...");
				Integer mesPublicacao = sc.nextInt();
				
				servicoRevista.cadastrar(titulo, anoPublicacao, editora, edicao, mesPublicacao);
				break;
			case 2:
				servicoRevista.listar();
				break;
			case 3:
				System.out.println("Digite o id da revista que voce quer alterar: ");
				Integer id = sc.nextInt();
				
				System.out.println("Digite o novo titulo da revista: ");
				String novoTitulo = sc.nextLine();
				
				System.out.println("Digite o novo ano da publicacao: ");
				Integer novoAno = sc.nextInt();
				
				System.out.println("Digite a nova editora: ");
				String novaEditora = sc.nextLine();
				
				System.out.println("Digite o novo numero da edicao");
				Integer novoEdicao = sc.nextInt();
				
				System.out.println("Digite o novo mes da publicacao (1 - Janeiro / 2 - fevereiro / 3 - Marco...");
				Integer novoMes = sc.nextInt();
				
				servicoRevista.alterarRevista(escolha, novoTitulo, novoAno, novaEditora, novoEdicao, novoMes);
				break;
			case 4:
				System.out.println("Digite o id da revista que voce quer excluir: ");
				Integer matricula = sc.nextInt();
				servicoRevista.excluir(matricula);
				break;
			case 0:
				System.out.println("Voltando ao menu anterior...");
				break;
			default:
				System.out.println("Escolha um valor valido !");
				break;
			}
			
		} while (escolha != 0);
	}
}
