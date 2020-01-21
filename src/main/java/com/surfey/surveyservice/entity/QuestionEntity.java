package com.surfey.surveyservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Table;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Table(name = "Question")
public class QuestionEntity {
    private int id;
    private int surveyId;
    private String content;
}