package com.surfey.surveyservice.service;

import com.surfey.surveyservice.model.Questions;
import com.surfey.surveyservice.model.Survey;
import com.surfey.surveyservice.model.Surveys;
import com.surfey.surveyservice.repository.SurveyRepository;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Value
public class SurveyService {

    SurveyRepository surveyRepository;

    public Surveys findAll(boolean loadRelated) {
        if(loadRelated)
            return surveyRepository.findAllWithRelated();
        else
            return surveyRepository.findAll();
    }

    public Survey findSurvey(int surveyId, boolean loadRelated) {
        if(loadRelated)
            return surveyRepository.findWithRelated(surveyId);
        else
            return surveyRepository.find(surveyId);
    }


    public Questions findQuestions(int surveyId, boolean loadRelated) {
        if(loadRelated)
            return surveyRepository.findQuestionsWithRelated();
        else
            return surveyRepository.findQuestions();
    }

    public Questions findQuestion(int surveyId, int questionId, boolean loadRelated) {
        if(loadRelated)
            return surveyRepository.findQuestionWithRelated(surveyId, questionId);
        else
            return surveyRepository.findQuestion(surveyId, questionId);
    }

    public Questions findAnswers(int surveyId, int questionId, boolean loadRelated) {
        if(loadRelated)
            return surveyRepository.findAnswersWithRelated(surveyId, questionId);
        else
            return surveyRepository.findAnswers();
    }

    public Questions findAnswer(int surveyId, int questionId, int answerId) {
            return surveyRepository.findAnswer(surveyId, questionId, answerId);
    }
}
