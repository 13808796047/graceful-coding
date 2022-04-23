package com.summer.question.rest.request;

/**
 * @Author Summer
 * @Since 2022/4/23 4:25 PM
 * @Version 1.0
 */
public record CreateQuestionRequest(
        String questionerId,
        String title,
        String detail
) {
}
