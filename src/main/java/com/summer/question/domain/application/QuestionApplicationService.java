package com.summer.question.domain.application;

import com.summer.question.domain.application.command.CreateQuestionCommand;
import com.summer.question.domain.application.result.QuestionCreateResult;
import com.summer.question.domain.model.Question;
import com.summer.question.domain.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @Author Summer
 * @Since 2022/4/23 4:00 PM
 * @Version 1.0
 */
@Service
@Transactional
public class QuestionApplicationService {
    private QuestionRepository questionRepository;

    public QuestionApplicationService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public QuestionCreateResult createQuestion(CreateQuestionCommand command){

        Question question = new Question(command.questionerId(), command.title(), command.detail());
        questionRepository.save(question);
        return new QuestionCreateResult(question.getId());
    }
}
