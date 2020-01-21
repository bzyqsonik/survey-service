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
public class AnswerEntity {
    @Id
    @GeneratedValue
    private int id;
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private UUID uuid;
    private String answer;
}