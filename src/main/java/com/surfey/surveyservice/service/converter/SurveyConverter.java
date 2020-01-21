package com.surfey.surveyservice.service.converter;

import com.surfey.surveyservice.entity.SurveyEntity;
import com.surfey.surveyservice.model.Answer;
import com.surfey.surveyservice.model.Question;
import com.surfey.surveyservice.model.Survey;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class SurveyConverter {
    public Survey convertEntityToSurveyWithoutRelated(SurveyEntity surveyEntity) {
        return Survey.builder()
                .name(surveyEntity.getName())
                .uuid(surveyEntity.getUuid())
                .build();
    }

    public Survey convertEntityToSurveyWithRelated(SurveyEntity surveyEntity) {
        return Survey.builder().name(surveyEntity.getName())
                .uuid(surveyEntity.getUuid())
                .questions(surveyEntity.getQuestions()
                        .stream()
                        .map(questionEntity -> Question.builder()
                                .uuid(questionEntity.getUuid())
                                .answers(questionEntity.getAnswers()
                                        .stream()
                                        .map(answerEntity -> Answer.builder()
                                                .content(answerEntity.getAnswer())
                                                .uuid(answerEntity.getUuid()).build()).collect(Collectors.toList()))
                                .content(questionEntity.getContent())
                                .build())
                        .collect(Collectors.toList()))
                .build();
    }
}
