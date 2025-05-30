package servicos;

import java.util.List;
import java.util.ArrayList;

import entidades.Usuario;

public class ServicoUsuario implements Servicos{
	private List<Usuario> listaUsuarios = new ArrayList<>();
	private Integer proximoId = 1;

	public void cadastrarAutomaticamente() {
		listaUsuarios.add(new Usuario(proximoId++, "Ana Silva", "ana.silva@email.com", "11999990001"));
        listaUsuarios.add(new Usuario(proximoId++, "Bruno Souza", "bruno.souza@email.com", "11999990002"));
        listaUsuarios.add(new Usuario(proximoId++, "Carla Pereira", "carla.pereira@email.com", "11999990003"));
        listaUsuarios.add(new Usuario(proximoId++, "Daniel Oliveira", "daniel.oliveira@email.com", "11999990004"));
        listaUsuarios.add(new Usuario(proximoId++, "Elisa Santos", "elisa.santos@email.com", "11999990005"));
        listaUsuarios.add(new Usuario(proximoId++, "Felipe Costa", "felipe.costa@email.com", "11999990006"));
        listaUsuarios.add(new Usuario(proximoId++, "Gabriela Lima", "gabriela.lima@email.com", "11999990007"));
	}
	
	public void cadastrar(String nome, String email, String telefone) {
		listaUsuarios.add(new Usuario(proximoId++, nome, email, telefone));
	}
	
	public boolean alterarUsuario(Integer id, String novoNome, String novoEmail, String novoTelefone) {
		for (Usuario usuario : listaUsuarios) {
			usuario.setNome(novoNome);
			usuario.setEmail(novoEmail);
			usuario.setTelefone(novoTelefone);
			System.out.println("Usuario com id: " + id + " alterado com sucesso");
			return true;
		}
		System.out.println("Usuario com id: " + id + " nao encontrado");
		return false;
	}
	
	public void listar() {
		for (Usuario usuario : listaUsuarios) {
			System.out.println(usuario);
		}
	}
	
	public boolean excluir(int matricula) {
		return listaUsuarios.removeIf(r -> r.getMatricula() == matricula);
	}
}
