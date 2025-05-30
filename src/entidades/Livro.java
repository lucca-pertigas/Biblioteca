package entidades;

public class Livro extends Publicacao{
	private String autor;
	private Integer numeroPaginas;
	
	public Livro(String titulo, Integer anoPublicacao, String editora, String autor,
			Integer numeroPaginas) {
		super(titulo, anoPublicacao, editora);
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String toString() {
		return "Livro: " + "\nId: " + getId() + "\nTitulo: " + getTitulo() + "\nAno de publicacao: " + getAnoPublicacao() + "\nAutor: " + autor
				+ "\nEditora: " + getEditora() + "\nNumero de paginas: " + numeroPaginas;
	}
	
}
