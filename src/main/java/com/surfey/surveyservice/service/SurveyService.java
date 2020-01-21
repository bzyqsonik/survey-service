package com.surfey.surveyservice.service;

import com.surfey.surveyservice.entity.SurveyEntity;
import com.surfey.surveyservice.model.*;
import com.surfey.surveyservice.repository.SurveyRepository;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
@Value
public class SurveyService {

    SurveyRepository surveyRepository;

    /*
    private Answer EntityToAnswer(AnswerEntity answerEntity) {
        return Answer.builder()
                .question()
    }

    private Survey EntityToSurvey(SurveyEntity surveyEntity) {
        return Survey.builder().
    }
    */

    public Surveys findAll(boolean loadRelated) {
        if (loadRelated)
            return null; // surveyRepository.findAllWithRelated();
        else {
            return Surveys.builder().surveys(
                    surveyRepository.findAll().stream()
                            .map(surveyEntity -> Survey.builder()
                                    .name(surveyEntity.getName())
                                    .questions(surveyEntity.getQuestions()
                                            .stream()
                                            .map(questionEntity -> Question.builder()
                                                    .id(surveyEntity.getId())
                                                    .answers(questionEntity.getAnswers()
                                                            .stream()
                                                            .map(answerEntity -> Answer.builder()
                                                                    .content(answerEntity.getAnswer())
                                                                    .uid(answerEntity.getUid()).build()).collect(Collectors.toList()))
                                                    .content(questionEntity.getContent())
                                                    .build())
                                            .collect(Collectors.toList()))
                                    .build()).collect(Collectors.toList())).build();
        }
    }

    public Survey findSurvey(int surveyId, boolean loadRelated) {
        if (loadRelated)
            return null; // surveyRepository.findWithRelated(surveyId);
        else
            return null; // surveyRepository.find(surveyId);
    }


    public Questions findQuestions(int surveyId, boolean loadRelated) {
        if (loadRelated)
            return null; // surveyRepository.findQuestionsWithRelated(surveyId);
        else
            return null; // surveyRepository.findQuestions(surveyId);
    }

    public Questions findQuestion(int surveyId, int questionId, boolean loadRelated) {
        if (loadRelated)
            return null; // surveyRepository.findQuestionWithRelated(surveyId, questionId);
        else
            return null; // surveyRepository.findQuestion(surveyId, questionId);
    }

    public Questions findAnswers(int surveyId, int questionId, boolean loadRelated) {
        if (loadRelated)
            return null; // surveyRepository.findAnswersWithRelated(surveyId, questionId);
        else
            return null; // surveyRepository.findAnswers();
    }

    public Questions findAnswer(int surveyId, int questionId, int answerId) {
        return null; // surveyRepository.findAnswer(surveyId, questionId, answerId);
    }
}
