package entidades;

public class Usuario {
	private Integer matricula;
	private String nome;
	private String email;
	private String telefone;
	
	public Usuario(Integer matricula, String nome, String email, String telefone) {
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String toString() {
		return "Usuario: \nMatricula: " + matricula + "\nNome: " + nome + "\nEmail: " + email + "\nTelefone: " + telefone;
	}
	
	
}
