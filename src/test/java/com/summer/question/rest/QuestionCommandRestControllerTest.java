package com.summer.question.rest;

import com.summer.question.domain.application.QuestionApplicationService;
import com.summer.question.domain.application.result.QuestionCreateResult;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @Author Summer
 * @Since 2022/4/23 4:36 PM
 * @Version 1.0
 */
@WebMvcTest
class QuestionCommandRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private QuestionApplicationService questionApplicationService;
    @Test
    void should_return_ok_when_create_question() throws Exception {
        given(questionApplicationService.createQuestion(any()))
                .willReturn(new QuestionCreateResult(1L));
        byte[] bytes = new ClassPathResource("request.question.create-question/200-ok.json").getInputStream().readAllBytes();
        mockMvc.perform(
                post("/questions")
                        .contentType(MediaType.APPLICATION_JSON)
                .content(bytes)
        ).andExpect(status().isOk())
                .andExpect(jsonPath("$.questionId").value(1L));
    }
}