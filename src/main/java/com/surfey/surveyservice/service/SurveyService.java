package com.surfey.surveyservice.service;

import com.surfey.surveyservice.entity.SurveyEntity;
import com.surfey.surveyservice.model.Questions;
import com.surfey.surveyservice.model.Survey;
import com.surfey.surveyservice.model.Surveys;
import com.surfey.surveyservice.repository.SurveyRepository;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        surveyRepository.save(new SurveyEntity(0, Collections.emptyList(), "name"));
        if (loadRelated)
            return null; // surveyRepository.findAllWithRelated();
        else {
            List<Survey> surveys = new ArrayList<>();
            for (SurveyEntity surveyEntity : surveyRepository.findAll()) {
                /*
                surveys.add(
                        Survey.builder()
                                .name(surveyEntity.getName())
                                .questions(
                                        Questions.builder()
                                                .questions()
                                )
                                .build()
                );

                 */
            }
            return Surveys.builder().surveys(surveys).build();
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
