package com.surfey.surveyservice.model;

import lombok.*;

import java.util.List;

@Value @Builder @AllArgsConstructor(access = AccessLevel.PRIVATE) @NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class Questions {
    List<Question> questions;
}
