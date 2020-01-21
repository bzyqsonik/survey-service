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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String uid;
    // @JoinColumn(name = "surveyId", referencedColumnName = "id")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "surveyId")
    private List<QuestionEntity> questions;
    private String name;
}