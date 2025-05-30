package servicos;

import java.util.ArrayList;
import java.util.List;

import entidades.Emprestimo;
import entidades.Usuario;
import entidades.Publicacao;

public class ServicoEmprestimo {
	List<Emprestimo> listaEmprestimo = new ArrayList<>();
	Integer numeroEmprestimo = 1;
	
	public void cadastrarEmprestimo(Usuario usuario, Publicacao publicacao) {
        Emprestimo e = new Emprestimo(usuario, publicacao);
        listaEmprestimo.add(e);
        System.out.println("Emprestimo realizado com sucesso! Numero: " + e.getNumeroEmprestimo());
    }
	
	public void listarEmprestimos() {
		for(Emprestimo e : listaEmprestimo) {
			System.out.println(e);
		}
	}
	
	public boolean devolverEmprestimo(int numeroEmprestimo) {
        for (Emprestimo e : listaEmprestimo) {
            if (e.getNumeroEmprestimo() == numeroEmprestimo && !e.estaDevolvido()) {
                e.devolver();
                System.out.println("Empréstimo devolvido com sucesso!");
                return true;
            }
        }
        System.out.println("Empréstimo não encontrado ou já devolvido.");
        return false;
    }
}
