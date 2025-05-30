package entidades;

public class Revista extends Publicacao{
	private Integer numeroEdicao;
	private Integer mesPublicacao;
	
	public Revista(String titulo, Integer anoPublicacao, String editora, Integer numeroEdicao,
			Integer mesPublicacao) {
		super(titulo, anoPublicacao, editora);
		this.numeroEdicao = numeroEdicao;
		this.mesPublicacao = mesPublicacao;
	}

	public Integer getNumeroEdicao() {
		return numeroEdicao;
	}

	public void setNumeroEdicao(Integer numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}

	public Integer getMesPublicacao() {
		return mesPublicacao;
	}

	public void setMesPublicacao(Integer mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}
	
	public String toString() {
		return "\n\nRevista: " + "\nId: " + getId() + "\nTitulo: " + getTitulo() + "\nAno de publicacao: " + getAnoPublicacao() + "\nEdicao: " + numeroEdicao
				+ "\nEditora: " + getEditora() + "\nMes da publicacao: " + mesPublicacao;
	}
	
}
