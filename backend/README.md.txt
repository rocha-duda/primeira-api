# Back-end do Projeto

## Descrição
Esta é a aplicação de back-end do projeto, desenvolvida utilizando **Java** e o framework **Spring Boot**. Ela fornece as APIs necessárias para o funcionamento do sistema.

## Requisitos
Certifique-se de que as seguintes ferramentas estão instaladas no seu ambiente:
- [Java 17+](https://www.oracle.com/java/technologies/javase-downloads.html) (ou a versão especificada no projeto)
- [Maven](https://maven.apache.org/)
- [MySQL](https://www.mysql.com/) ou o banco de dados configurado no projeto

##Configuração

Configure o banco de dados:

1- Certifique-se de que o banco de dados está rodando.
Atualize as configurações no arquivo application.properties:
properties

# Configurações do Banco de Dados
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco_de_dados
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

# Configurações do JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

2- Compile o projeto: Use o Maven para compilar o projeto e gerar o arquivo executável.

3- A API estará disponível no endereço:
	http://localhost:8080
##Problemas Comuns

Erro ao conectar ao banco de dados:
Certifique-se de que as configurações do banco (spring.datasource.url, username, password) estão corretas e o banco está rodando.

Porta em uso:
Se o erro "Port 8080 already in use" aparecer, troque a porta no arquivo application.properties:

properties
Copiar
Editar
server.port=8081
