package br.com.livros.model;


import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.util.Assert;

@RepositoryEventHandler
public class AutorRepositoryEventHandler {

    @HandleBeforeCreate
    public void handleBeforeCreates(Autor autor){
        autor.setNome("Leandro Handler");
        Assert.isTrue(Autor.Status.ACTIVE == autor.getStatus(), "Teste");
    }

    @HandleBeforeSave
    public void handleBeforeSave(Autor autor){
        autor.setNome("Leandro update");
    }
}
