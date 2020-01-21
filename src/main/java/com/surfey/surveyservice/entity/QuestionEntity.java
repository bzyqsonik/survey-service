package com.surfey.surveyservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Question")
public class QuestionEntity {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private SurveyEntity survey;
    @OneToMany(mappedBy = "question")
    private List<AnswerEntity> answers;
    private String content;
}