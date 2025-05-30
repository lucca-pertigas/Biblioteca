package aplicacao;

import servicos.ServicoLivro;
import java.util.Scanner;

public class MenuLivros {
	private ServicoLivro servicoLivro;
	private Scanner sc;
	
	public MenuLivros(ServicoLivro servicoLivro, Scanner sc) {
		this.servicoLivro = servicoLivro;
		this.sc = sc;
	}
	
	public void executarMenuLivro() {
		int escolha;
		
		do {
			System.out.println("\n\n--------MENU LIVRO--------");
			System.out.println("1 - Cadastrar livro");
			System.out.println("2 - Listar livros");
			System.out.println("3 - Modificar dados de um livro");
			System.out.println("4 - Excluir livro");
			System.out.println("0 - Voltar");
			System.out.println("Escolha uma opcao: ");
			escolha = sc.nextInt();
			sc.nextLine();
			
			switch (escolha) {
				case 1:
					System.out.println("Digite o nome do livro: ");
					String titulo = sc.nextLine();
					
					System.out.println("Digite o ano da publicacao: ");
					Integer anoPublicacao = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Digite o nome do autor: ");
					String autor = sc.nextLine();
					
					System.out.println("Digite a editora: ");
					String editora = sc.nextLine();
					
					System.out.println("Digite o numero de paginas: ");
					Integer numeroPaginas = sc.nextInt();
					
					servicoLivro.cadastrarLivro(titulo, anoPublicacao, autor, editora, numeroPaginas);
					
					break;
				case 2:
					servicoLivro.listar();
					break;
				case 3:
					System.out.println("Digite o id do livro que voce quer alterar: ");
					Integer id = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Qual o novo nome do livro: ");
					String novoTitulo = sc.nextLine();
					
					System.out.println("Digite o novo ano da publicacao: ");
					Integer novoAno = sc.nextInt();
					
					System.out.println("Digite o novo nome do autor: ");
					String novoAutor = sc.nextLine();
					
					System.out.println("Digite a nova editora: ");
					String novaEditora = sc.nextLine();
					
					System.out.println("Digite o novo numero de paginas: ");
					Integer novaPaginas = sc.nextInt();
					
					servicoLivro.alterarLivro(id, novoTitulo, novoAno, novoAutor, novaEditora, novaPaginas);
					break;
				case 4:
					System.out.println("Digite o id do livro que voce quer excluir");
					Integer matricula = sc.nextInt();
					
					servicoLivro.excluir(matricula);
					break;
				case 0:
					System.out.println("Retornando ao menu principal !");
					break;
				default:
					System.out.println("Escolha uma opcao valida!");
					break;
			}
			
		} while (escolha != 0); 
		
	}
}
