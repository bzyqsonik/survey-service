package com.surfey.surveyservice.entity;

import com.surfey.surveyservice.model.Question;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
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
    int id;
    // tu nie było adnotacji dlatego hibernate wypluwał błąd
    //private List<Question> questions;
}