package servicos;

import java.util.List;
import java.util.ArrayList;

import entidades.Revista;

public class ServicoRevista implements Servicos{
	private List<Revista> listaRevistas = new ArrayList<>();
	
	public void cadastrarAutomaticamente() {
		listaRevistas.add(new Revista("Revista Tech", 2023, "Editora Alfa", 1, 1));
        listaRevistas.add(new Revista("Ciência Hoje", 2024, "Editora Beta", 5, 3));
        listaRevistas.add(new Revista("Mundo Digital", 2022, "Editora Gama", 10, 5));
        listaRevistas.add(new Revista("Saúde & Vida", 2023, "Editora Delta", 3, 7));
        listaRevistas.add(new Revista("História Viva", 2021, "Editora Épsilon", 8, 9));
        listaRevistas.add(new Revista("Esportes em Foco", 2024, "Editora Zeta", 12, 11));
        listaRevistas.add(new Revista("Arte & Cultura", 2023, "Editora Eta", 7, 12));
	}
	
	public void cadastrar(String titulo, Integer anoPublicacao, String editora, Integer edicao, Integer mesPublicacao) {
		listaRevistas.add(new Revista(titulo, anoPublicacao, editora, edicao, mesPublicacao));
	}
	
	public boolean alterarRevista (int id, String novoTitulo, Integer novoAno, String novaEditora, Integer novaEdicao, Integer novoMes) {
		for (Revista revista : listaRevistas) {
			if (revista.getId() == id) {
				revista.setTitulo(novoTitulo);
				revista.setAnoPublicacao(novoAno);
				revista.setEditora(novaEditora);
				revista.setNumeroEdicao(novaEdicao);
				revista.setMesPublicacao(novoMes);
				System.out.println("Revista com ID: " + id + " alterada com sucesso");
				return true;
			}
		}
		System.out.println("Revista com ID: " + id + " nao encontrada");
		return false;
	}
	
	public void listar() {
		for (Revista revista : listaRevistas) {
			System.out.println(revista);
		}
	}
	
	public Revista buscarPorId(int id) {
        for (Revista revista : listaRevistas) {
            if (revista.getId() == id) {
            	return revista;
            }
        }
        return null;
    }
	
	public boolean excluir(int id) {
		return listaRevistas.removeIf(r -> r.getId() == id);
	}
	
	public void apresentarPorId(int id) {
		Revista revista = buscarPorId(id);
		if (revista != null) {
			System.out.println("\n\nRevista encontrada:");
			System.out.println("ID: " + revista.getId());
			System.out.println("Titulo: " + revista.getTitulo());
			System.out.println("Ano de Publicacao: " + revista.getAnoPublicacao());
			System.out.println("Editora: " + revista.getEditora());
			System.out.println("Numero da Edicao: " + revista.getNumeroEdicao());
			System.out.println("Mes de Publicacao: " + revista.getMesPublicacao());
		} else {
			System.out.println("Revista com ID " + id + " nao encontrada.");
		}
	}
}
