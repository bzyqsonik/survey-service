package com.surfey.surveyservice.model;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

// Osobne linie + static import i NonNull z lomboka na liscie
@Value @Builder @AllArgsConstructor(access = AccessLevel.PRIVATE) @NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
public class Surveys {
    @NotNull
    List<Survey> surveys;
}
