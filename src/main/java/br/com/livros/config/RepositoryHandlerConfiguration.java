package br.com.livros.config;

import br.com.livros.model.AutorRepositoryEventHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryHandlerConfiguration {

    @Bean
    public AutorRepositoryEventHandler autorRepositoryEventHandler(){
        return new AutorRepositoryEventHandler();
    }
}
