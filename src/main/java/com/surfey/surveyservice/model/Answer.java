package com.surfey.surveyservice.model;

import lombok.*;

@Value  // makes all fields private final
@Builder @AllArgsConstructor(access = AccessLevel.PRIVATE) @NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class Answer {
    String uid;
    int questionId;
    String answer;
}