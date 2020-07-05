package br.com.livros;

import br.com.livros.model.Autor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class AutorTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private AutorService autorService;

    @Test
    public void create() throws Exception {

        Autor teste = new Autor("Leandro", Autor.Status.ACTIVE);

        mockMvc.perform(post("/autor")
                .content(objectMapper.writeValueAsString(teste)))
                .andExpect(status().isOk());

        ObjectId objectId = autorService.save(teste);

        Assertions.assertNotNull(objectId);

    }
}
