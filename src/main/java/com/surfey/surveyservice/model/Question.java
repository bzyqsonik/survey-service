package com.surfey.surveyservice.model;

import lombok.*;

@Value @Builder @AllArgsConstructor(access = AccessLevel.PRIVATE) @NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class Question {
    int id;
    int surveyId;
    String content;
}