package com.summer.question.domain.repository;

import com.summer.question.domain.model.Question;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;



/**
 * @Author Summer
 * @Since 2022/4/23 11:23 AM
 * @Version 1.0
 */
@DataJpaTest
class QuestionRepositoryTest {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void repository_should_successfully__save_question(){


        Question question = new Question(1L,"UID_00001","A test title","A test detail");
        Question result = questionRepository.save(question);
        System.out.println(result);
//        assertThat(result.getQuestionerId(),equals(question.getQuestionerId()));
//        assertThat(result.getTitle(),equals(question.getTitle()));
    }


}