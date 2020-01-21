package com.surfey.surveyservice.model;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Value @Builder @AllArgsConstructor(access = AccessLevel.PRIVATE) @NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class Question {
    UUID uuid;
    String content;
    @NotNull
    List<Answer> answers;
}