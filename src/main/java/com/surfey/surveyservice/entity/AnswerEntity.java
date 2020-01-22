package com.surfey.surveyservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Answer") 
@NoArgsConstructor
//@Data
//@Builder
//@NoArgsConstructor(access = PRIVATE, force = true)
//@AllArgsConstructor(access = PRIVATE)
//@Entity(table(?) = "answers")
// tabele nie nazywaja sie duza litera i powinny byc w liczbie mnogiej
public class AnswerEntity {
    @Id
    @GeneratedValue //strategy = IDENTITY
    private int id;
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // To nie jest generated value
    // uuid jest final, nie bedzie sie zmienial
    private UUID uuid;
    private String answer;
}
