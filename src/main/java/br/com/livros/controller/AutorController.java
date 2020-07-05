package br.com.livros.controller;

import br.com.livros.AutorService;
import br.com.livros.model.Autor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutorController {

    @Autowired
    private AutorService service;

    @PostMapping("/autor")
    public ObjectId create(Autor autor){
        return service.save(autor);
    }

}
