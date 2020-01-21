package com.surfey.surveyservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter @AllArgsConstructor
@Table(name = "Answer")
public class AnswerEntity {
    @Id @GeneratedValue
    private int id;
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String uid;
    private int questionId;
    private String answer;
}