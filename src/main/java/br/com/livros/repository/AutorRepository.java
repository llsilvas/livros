package br.com.livros.repository;

import br.com.livros.model.Autor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestController
public interface AutorRepository extends MongoRepository<Autor, ObjectId> {
}
