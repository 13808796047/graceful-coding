package com.summer.question.domain.repository;

import com.summer.question.domain.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Summer
 * @Since 2022/4/23 11:18 AM
 * @Version 1.0
 */
public interface QuestionRepository extends JpaRepository<Question ,String> {

}
