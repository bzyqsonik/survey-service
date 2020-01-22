package com.surfey.surveyservice.model;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

// Wszystkie adnotacje do osobnej linii + static import na PRIVATE
@Value @Builder @AllArgsConstructor(access = AccessLevel.PRIVATE) @NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class Questions {
    @NotNull //@NonNull lombok
    List<Question> questions;
}
