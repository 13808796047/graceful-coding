package com.summer.question.rest;

import com.summer.question.domain.application.QuestionApplicationService;
import com.summer.question.domain.application.command.CreateQuestionCommand;
import com.summer.question.rest.request.CreateQuestionRequest;
import com.summer.question.rest.response.QuestionCreatedReponse;
import lombok.val;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Summer
 * @Since 2022/4/23 4:21 PM
 * @Version 1.0
 */
@RestController
@RequestMapping("/questions")
public class QuestionCommandRestController {
private final QuestionApplicationService questionApplicationService;

    public QuestionCommandRestController(QuestionApplicationService questionApplicationService) {
        this.questionApplicationService = questionApplicationService;
    }

    @PostMapping
    public QuestionCreatedReponse create(@RequestBody CreateQuestionRequest request){
        val command = new CreateQuestionCommand(request.questionerId(), request.title(), request.detail());
        val question = questionApplicationService.createQuestion(command);
        return new QuestionCreatedReponse(question.questionId());
    }
}
