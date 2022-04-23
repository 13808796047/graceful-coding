package com.summer.question.domain.application.command;

/**
 * @Author Summer
 * @Since 2022/4/23 4:04 PM
 * @Version 1.0
 */
public record CreateQuestionCommand(
        String questionerId,
        String title,
        String detail

) {
}
