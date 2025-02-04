package br.com.criandoapi.projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data

@Entity //trata isso como uma entidade
@Table(name = "usuario") //identifica para tratar a tabela como usuario
public class Usuario {
	@Id //Identifica o id como chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // avisa que o campo vai ser autoincrement, no caso o id
	
	

	@Column(name="id")
	private Integer id;
	
	@NotBlank(message = "O nome é obrigatório!")
	@Size(min = 3, message = " Muito curto para um nome!")
	@Column(name="nome", length = 200, nullable = false)
	private String nome;
	
	@Email(message = "Insira um email valido!")
	@NotBlank(message = "O email é obrigatório!")
	@Column(name="email", length = 200, nullable = false)
	private String email;
	
	@NotBlank(message = "A senha é obrigatória!")
	@Column(name="senha", columnDefinition = "TEXT", nullable = false)
	private String senha;
	
	@NotBlank(message = "O telefone é obrigatório!")
	@Column(name="telefone", length = 15, nullable = false)
	private String telefone;
	


}
