
package br.com.criandoapi.projeto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:mysql://localhost:3306/banco_de_usuarios?useTimezone=true&serverTimezone=UTC")
                .username("root")
                .password("suaSenha")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .build();
    }
}
