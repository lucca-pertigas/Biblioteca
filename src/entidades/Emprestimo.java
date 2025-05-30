package entidades;

import java.time.LocalDate;

public class Emprestimo {
	private Integer numeroEmprestimo;
	private Usuario usuario;
	private Publicacao publicacao;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	
	public Emprestimo(Integer numeroEmprestimo, Usuario usuario, Publicacao publicacao, LocalDate dataEmprestimo,
			LocalDate dataDevolucao) {
		this.numeroEmprestimo = numeroEmprestimo;
		this.usuario = usuario;
		this.publicacao = publicacao;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}

	public Integer getNumeroEmprestimo() {
		return numeroEmprestimo;
	}

	public void setNumeroEmprestimo(Integer numeroEmprestimo) {
		this.numeroEmprestimo = numeroEmprestimo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Publicacao getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	@Override
	public String toString() {
		return "Emprestimo: \nNumero emprestimo: " + numeroEmprestimo + "\nUsuario: " + usuario + "\nPublicacao: "
				+ publicacao + "\nData emprestimo: " + dataEmprestimo + "\nData devolucao: " + dataDevolucao;
	}
	
}
