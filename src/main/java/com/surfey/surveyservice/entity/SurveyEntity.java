package com.surfey.surveyservice.entity;

import com.surfey.surveyservice.model.Question;
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
@Table(name = "Survey")
public class SurveyEntity {
    @Id
    @GeneratedValue
    private int id;
    // @JoinColumn(name = "surveyId", referencedColumnName = "id")
    @OneToMany(mappedBy = "survey")
    private List<QuestionEntity> questions;
    private String name;
}