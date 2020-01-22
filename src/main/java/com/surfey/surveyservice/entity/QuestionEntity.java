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
//@Data
//@Builder
//@NoArgsConstructor(access = PRIVATE, force = true)
//@AllArgsConstructor(access = PRIVATE)
//@Entity(table(?) = "questions")
// tabele nie nazywaja sie duza litera i powinny byc w liczbie mnogiej
public class QuestionEntity {
    @Id
    @GeneratedValue //strategy = IDENTITY
    private int id;
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //To nie jest generated value
    //@NonNull
    // final
    private UUID uuid;
    @NonNull
    @OneToMany(cascade = CascadeType.ALL) //static import
    @Fetch(FetchMode.SUBSELECT) // static import
    @JoinColumn(name = "questionId") //question_id, na bazie nie piszemy camel casem
    //final
    private List<AnswerEntity> answers;
    //to raczej tez final, chyba nie bedziemy tego updatowac
    // @NonNull
    private String content;
}
