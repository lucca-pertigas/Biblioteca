package aplicacao;

import java.util.Scanner;

import servicos.ServicoUsuario;
import servicos.ServicoLivro;
import servicos.ServicoRevista;
import servicos.ServicoEmprestimo;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ServicoUsuario servicoUsuario = new ServicoUsuario();
		ServicoLivro servicoLivro = new ServicoLivro();
        ServicoRevista servicoRevista = new ServicoRevista();
        ServicoEmprestimo servicoEmprestimo = new ServicoEmprestimo();
        		
        servicoUsuario.cadastrarAutomaticamente();
        servicoLivro.cadastrarAutomaticamente();
        servicoRevista.cadastrarAutomaticamente();	
        
        MenuUsuario menuUsuario = new MenuUsuario(servicoUsuario, sc);
        MenuLivros menuLivros = new MenuLivros(servicoLivro, sc);
        MenuRevistas menuRevistas = new MenuRevistas(servicoRevista, sc);
        MenuEmprestimo menuEmprestimo = new MenuEmprestimo(servicoEmprestimo, servicoRevista,servicoLivro, servicoUsuario, sc);
        
		int escolha;
		
		do {
			System.out.println("\n\n--------BIBLIOTECA--------");
			System.out.println("1 - Gerenciar Usuario");
			System.out.println("2 - Gerenciar Livros");
			System.out.println("3 - Gerenciar Revistas");
			System.out.println("4 - Gerenciar Emprestimos");
			System.out.println("0 - Sair");
			System.out.println("Escolha uma opcao: ");
			escolha = sc.nextInt();
			sc.nextLine();
			
			switch (escolha) {
				case 1:
					menuUsuario.executarMenuUsuario();
					break;
				case 2:
					menuLivros.executarMenuLivro();
					break;
				case 3:
					menuRevistas.executarMenuRevista();
					break;
				case 4:
					menuEmprestimo.executarMenuEmprestimo();
					break;
				case 0:
					System.out.println("Encerrando o aplicativo !");
					break;
				default: 
					System.out.println("Escolha um valor valido !");
					break;
			}
		} while (escolha != 0);
		

	}

}
