package servicos;

import java.util.ArrayList;
import java.util.List;

import entidades.Livro;

public class ServicoLivro implements Servicos{
	private List<Livro> listaLivros = new ArrayList<>();
	
	public void cadastrarAutomaticamente() {
		listaLivros.add(new Livro("Java Básico", 2020, "João Silva", "TechEdit", 300));
		listaLivros.add(new Livro("POO Avançado", 2021, "Maria Lima", "CodeBooks", 280));
		listaLivros.add(new Livro("Estruturas de Dados", 2022, "Carlos Dias", "BookTec", 350));
		listaLivros.add(new Livro("Algoritmos", 2021, "Ana Souza", "Editora Códigos", 400));
		listaLivros.add(new Livro("Banco de Dados", 2019, "Ricardo Mendes", "SQL Press", 320));
		listaLivros.add(new Livro("Engenharia de Software", 2023, "Fernanda Braga", "SoftHouse", 290));
		listaLivros.add(new Livro("Java Web", 2020, "Luana Torres", "WebDev", 310));
	}
	
	public void cadastrarLivro(String titulo, Integer anoPublicacao, String autor, String editora, Integer paginas) {
		listaLivros.add(new Livro(titulo, anoPublicacao, autor, editora, paginas));
	}
	
	public boolean alterarLivro(Integer id, String novoTitulo, Integer novoAno, String novoAutor, String novaEditora, Integer novasPaginas) {
		for (Livro livro : listaLivros) {
			if (livro.getId() == id) {
				livro.setTitulo(novoTitulo);
				livro.setAnoPublicacao(novoAno);
				livro.setAutor(novoAutor);
				livro.setEditora(novaEditora);
				livro.setNumeroPaginas(novasPaginas);
				System.out.println("Livro com ID: " + id + " alterado com sucesso");
				return true;
			}
		}
		System.out.println("Livro com ID: " + id + " nao encontrado");
		return false;
	}
	
	public void listar() {
		for (Livro livro : listaLivros) {
			System.out.println(livro);
		}
	}
	
	public Livro buscarPorId(int id) {
        for (Livro livro : listaLivros) {
            if (livro.getId() == id) {
            	return livro;
            }
        }
        return null;
    }
	
	public boolean excluir(int id) {
		return listaLivros.removeIf(r -> r.getId() == id);
	}
	
	public void apresentarPorId(int id) {
		Livro livro = buscarPorId(id);
		if (livro != null) {
			System.out.println("\n\nLivro encontrado:");
			System.out.println("ID: " + livro.getId());
			System.out.println("Titulo: " + livro.getTitulo());
			System.out.println("Ano de Publicacao: " + livro.getAnoPublicacao());
			System.out.println("Autor: " + livro.getAutor());
			System.out.println("Editora: " + livro.getEditora());
			System.out.println("Número de Paginas: " + livro.getNumeroPaginas());
		} else {
			System.out.println("Livro com ID " + id + " nao encontrado.");
		}
	}

}
