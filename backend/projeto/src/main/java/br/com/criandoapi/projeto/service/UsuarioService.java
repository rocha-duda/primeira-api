package br.com.criandoapi.projeto.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.criandoapi.projeto.model.Usuario;
import br.com.criandoapi.projeto.repository.IUsuario;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
	private IUsuario repository;
	private PasswordEncoder passwordEncoder;
	
	public UsuarioService(IUsuario repository) {
		this.repository = repository;
		this.passwordEncoder = new BCryptPasswordEncoder();
	}
	
	public List<Usuario> listarUsuario(){
		List<Usuario> lista = repository.findAll();
		return lista;
	}
	
	public Usuario criarUsuario(Usuario usuario) {
		String encoder = this.passwordEncoder.encode(usuario.getSenha());
		usuario.setSenha(encoder);
		Usuario usuarioNovo = repository.save(usuario);
		return usuarioNovo;
	}
	
	public Usuario editarUsuario(Usuario usuario) {
		String encoder = this.passwordEncoder.encode(usuario.getSenha());
		usuario.setSenha(encoder);
		Usuario usuarioNovo = repository.save(usuario);
		return usuarioNovo;
	}
	
	public Boolean excluirUsuario(Integer id) {
		repository.deleteById(id);
		return true;
	}

	public Boolean validarSenha(Usuario usuario) {
	    Optional<Usuario> usuarioOptional = repository.findById(usuario.getId());
	    
	    if (usuarioOptional.isPresent()) {
	        String senha = usuarioOptional.get().getSenha();
	        return passwordEncoder.matches(usuario.getSenha(), senha);
	    }
	    
	    // Retorna false se o usuário não for encontrado
	    return false;
	}

	
}
