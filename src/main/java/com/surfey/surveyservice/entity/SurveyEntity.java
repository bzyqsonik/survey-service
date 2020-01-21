package com.surfey.surveyservice.entity;

import com.surfey.surveyservice.model.Question;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;
import java.util.List;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Table(name = "Survey")
public class SurveyEntity {
    private List<Question> questions;
}