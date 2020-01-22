package com.surfey.surveyservice.model;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

// Static import na PRIVATE
// Kazda adnotacja powinna byc w osobnej linii
@Value @Builder @AllArgsConstructor(access = AccessLevel.PRIVATE) @NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class Question {
    // @NonNull
    UUID uuid;
    // @NonNull
    String content;
    @NotNull // @NonNull - uzywaj lombokowych adnotacji
    List<Answer> answers;
}
