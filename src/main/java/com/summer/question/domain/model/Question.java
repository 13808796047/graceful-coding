package com.summer.question.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author Summer
 * @Since 2022/4/23 11:10 AM
 * @Version 1.0
 *
 */
@Entity
@Data
@NoArgsConstructor
public class Question {
    @Id
    private Long id;
    private String questionerId;
    private String title;
    private String detail;

    public Question(String questionerId, String title, String detail) {
        this.questionerId = questionerId;
        this.title = title;
        this.detail = detail;
    }
}
