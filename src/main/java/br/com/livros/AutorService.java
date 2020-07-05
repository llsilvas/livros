package br.com.livros;

import br.com.livros.model.Autor;
import br.com.livros.repository.AutorRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    @Autowired
    public AutorRepository autorRepository;

    public ObjectId save(Autor autor){
        return autorRepository.save(autor).getId();
    }

    public Autor carregaAutor(ObjectId autorId) {
        return autorRepository.findById(autorId).get();
    }
}
