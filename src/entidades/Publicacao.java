package entidades;

public abstract class Publicacao {
	private static int contadorId = 0;
	
	private Integer id;
	private String titulo;
	private Integer anoPublicacao;
	private String editora;
	
	public Publicacao(String titulo, Integer anoPublicacao, String editora) {
		this.id = ++contadorId;
		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
	}
	public int getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(Integer anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
}
