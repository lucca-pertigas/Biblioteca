package aplicacao;

import servicos.ServicoEmprestimo;
import servicos.ServicoRevista;
import servicos.ServicoLivro;
import servicos.ServicoUsuario;
import java.util.Scanner;
import entidades.Usuario;
import entidades.Publicacao;

public class MenuEmprestimo {
	private ServicoEmprestimo servicoEmprestimo;
	private ServicoRevista servicoRevista;
	private ServicoLivro servicoLivro;
	private ServicoUsuario servicoUsuario;
	private Scanner sc;

	

	public MenuEmprestimo(ServicoEmprestimo servicoEmprestimo, ServicoRevista servicoRevista, ServicoLivro servicoLivro,
			ServicoUsuario servicoUsuario, Scanner sc) {
		this.servicoEmprestimo = servicoEmprestimo;
		this.servicoRevista = servicoRevista;
		this.servicoLivro = servicoLivro;
		this.servicoUsuario = servicoUsuario;
		this.sc = sc;
	}

	public void executarMenuEmprestimo() {
		
		int escolha;
		
		do {
			System.out.println("\n--- Menu Emprestimos ---");
	        System.out.println("1 - Registrar Emprestimo");
	        System.out.println("2 - Listar Emprestimos");
	        System.out.println("3 - Registrar Devolucao");
	        System.out.println("0 - Voltar");
	        System.out.print("Escolha uma opcao: ");
	        escolha = sc.nextInt();
	        sc.nextLine();
	        
	        switch (escolha) {
	        case 1:
	        	System.out.println("Digite a matricula do usuario: ");
	        	int matricula = sc.nextInt();
	        	sc.nextLine();
	        	Usuario usuario = servicoUsuario.buscarPorId(matricula);
	        	if (usuario == null) {
	        		System.out.println("Usuario não encontrado");
	        		break;
	        	}
	        	
	        	System.out.print("Digite 1 para Livro ou 2 para Revista: ");
                int tipo = sc.nextInt();
                sc.nextLine();
                
                Publicacao publicacao = null;
                if (tipo == 1) {
                	System.out.println("Digite o ID do livro: ");
                	int idLivro = sc.nextInt();
                	sc.nextLine();
                	publicacao = servicoLivro.buscarPorId(idLivro);
                } else {
                	if (tipo == 2) {
                		System.out.println("Digite o ID da revista: ");
                		int idRevista = sc.nextInt();
                		sc.nextLine();
                		publicacao = servicoRevista.buscarPorId(idRevista);
                	} else {
                		System.out.println("Tipo invalido");
                		break;
                	}
                }
                if (publicacao == null) {
                	System.out.println("Publicacao não encontrada !");
                	break;
                }
                
                servicoEmprestimo.cadastrarEmprestimo(usuario, publicacao);
	        	break;
	        	
	        case 2:
	        	servicoEmprestimo.listarEmprestimos();
	        	break;
	        	
	        case 3:
	        	System.out.print("Digite o número do empréstimo para devolver: ");
                int numEmprestimo = sc.nextInt();
                sc.nextLine();
                servicoEmprestimo.devolverEmprestimo(numEmprestimo);
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
