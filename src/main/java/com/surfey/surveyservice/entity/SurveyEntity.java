package com.surfey.surveyservice.entity;

import com.surfey.surveyservice.model.Question;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

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
    private UUID uuid;
    @OneToMany(cascade = CascadeType.ALL)
    @Fetch(FetchMode.SUBSELECT)
    @JoinColumn(name = "surveyId")
    @NonNull
    private List<QuestionEntity> questions;
    private String name;
}