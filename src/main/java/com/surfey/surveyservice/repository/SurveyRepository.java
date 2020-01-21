package com.surfey.surveyservice.repository;

import com.surfey.surveyservice.model.Questions;
import com.surfey.surveyservice.model.Survey;
import com.surfey.surveyservice.model.Surveys;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class SurveyRepository {

    public Surveys findAllWithRelated() {
        return null;
    }

    public Surveys findAll() {
        return null;
    }

    public Survey findWithRelated(int surveyId) {
        return null;
    }

    public Survey find(int surveyId) {
        return null;
    }

    public Questions findQuestionsWithRelated() {
        return null;
    }

    public Questions findQuestions() {
        return null;
    }

    public Questions findQuestionWithRelated(int surveyId, int questionId) {
        return null;
    }

    public Questions findQuestion(int surveyId, int questionId) {
        return null;
    }


    public Questions findAnswersWithRelated(int surveyId, int questionId) {
        return null;
    }

    public Questions findAnswers() {
        return null;
    }

    public Questions findAnswer(int surveyId, int questionId, int answerId) {
        return null;
    }
}