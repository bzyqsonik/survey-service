package com.surfey.surveyservice.model;

import lombok.*;

import java.util.UUID;

@Value
@Builder
// Static import na PRIVATE
@AllArgsConstructor(access = AccessLevel.PRIVATE)
// Static import na PRIVATE
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class Answer {
    // @NonNull
    UUID uuid;
    // @NonNull
    String content;
}
