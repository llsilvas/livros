package br.com.livros.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class Autor implements Serializable {

    @Id
    private ObjectId id;

    @NotBlank
    private String nome;

    private Status status;

    public Autor(@NotBlank String nome, Status status) {
        this.nome = nome;
        this.status = status;
    }

    public enum Status {

        ACTIVE,

        INACTIVE

    }


}
