package com.surfey.surveyservice.service.converter;

import com.surfey.surveyservice.entity.SurveyEntity;
import com.surfey.surveyservice.model.Answer;
import com.surfey.surveyservice.model.Question;
import com.surfey.surveyservice.model.Survey;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
// Ja bym to nazwal mapper bardziej niz converter, bo to co tu robisz to mapowani
public class SurveyConverter {
    //final arg
    public Survey convertEntityToSurveyWithoutRelated(SurveyEntity surveyEntity) {
        return Survey.builder()
                .name(surveyEntity.getName())
                .uuid(surveyEntity.getUuid())
                .build();
    }

    //final arg
    public Survey convertEntityToSurveyWithRelated(SurveyEntity surveyEntity) {
        // name do nastepnej linii
        return Survey.builder().name(surveyEntity.getName())
                .uuid(surveyEntity.getUuid())
                .questions(surveyEntity.getQuestions()
                        .stream()
                           //mapowanie questionEntity -> question wyjeb do osobnej metody i uzyj tu this::toQuestion
                        .map(questionEntity -> Question.builder()
                                .uuid(questionEntity.getUuid())
                                .answers(questionEntity.getAnswers()
                                        .stream()
                                         //mapowanie answerEntity -> answer wyjeb do osobnej metody i uzyj tu this::toAnswer
                                        .map(answerEntity -> Answer.builder()
                                                .content(answerEntity.getAnswer())
                                             //collect do nowej linii
                                             //static import na toList()
                                                .uuid(answerEntity.getUuid()).build()).collect(Collectors.toList()))
                                .content(questionEntity.getContent())
                                .build())
                           //static import
                        .collect(Collectors.toList()))
                .build();
    }
}
