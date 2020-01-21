package com.surfey.surveyservice.entity;

import com.surfey.surveyservice.model.Question;
import com.surfey.surveyservice.model.Survey;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private UUID uuid;
    @NonNull
    @OneToMany(cascade = CascadeType.ALL)
    @Fetch(FetchMode.SUBSELECT)
    @JoinColumn(name = "questionId")
    private List<AnswerEntity> answers;
    private String content;
}