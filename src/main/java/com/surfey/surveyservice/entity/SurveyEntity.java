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
//@Data
//@Builder
//@NoArgsConstructor(access = PRIVATE, force = true)
//@AllArgsConstructor(access = PRIVATE)
//@Entity(table(?) = "surveys")
// tabele nie nazywaja sie duza litera i powinny byc w liczbie mnogiej
public class SurveyEntity {
    @Id
    @GeneratedValue // strategy = IDENTITY
    private int id;
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // to nie jest generated
    // @NonNull
    // final 
    private UUID uuid;
    @OneToMany(cascade = CascadeType.ALL) //static import
    @Fetch(FetchMode.SUBSELECT) //static import
    @JoinColumn(name = "surveyId") //survey_id
    @NonNull
    private List<QuestionEntity> questions; //final
    //@NonNull
    private String name; //final - chyba nie bedzie zmieniane
}
