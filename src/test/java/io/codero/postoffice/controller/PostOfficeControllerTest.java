package io.codero.postoffice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.codero.postoffice.dto.CreatePostOfficeDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class PostOfficeControllerTest extends AbstractControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;
/*
    @Test
    void shouldReturnNotEmptyList() throws Exception {
        String dtoAsJson = jsonGenerate();
        mvc.perform(post("/post-office")
                        .content(dtoAsJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        mvc.perform(get("/post-office"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        mvc.perform(get("/post-office/1"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(dtoAsJson));
    }

    @Test
    void shouldReturnExceptionIfFileNotExist() throws Exception {
        mvc.perform(get("/post-office/0"))
                .andExpect(status().isNotFound())
                .andReturn();
    }

    private String jsonGenerate() throws JsonProcessingException {
        CreatePostOfficeDto dto = new CreatePostOfficeDto();
        dto.setName("Post");
        dto.setAddress("Ильинская 4");
        dto.setStartTime("08:00");
        dto.setEndTime("22:00");
        return objectMapper.writeValueAsString(dto);
    }

 */
}