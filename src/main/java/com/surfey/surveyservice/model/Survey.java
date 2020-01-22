package com.surfey.surveyservice.model;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

//Kazda adnotacja do osobnej linii + static importy na PRIVATE
@Value @Builder @AllArgsConstructor(access = AccessLevel.PRIVATE) @NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class Survey {
    //@NonNull
    UUID uuid;
    @NotNull //@NonNull lombok
    List<Question> questions;
    //@NonNull
    String name;
}
