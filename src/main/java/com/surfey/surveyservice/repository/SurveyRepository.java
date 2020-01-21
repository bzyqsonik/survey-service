package com.surfey.surveyservice.repository;

import com.surfey.surveyservice.entity.SurveyEntity;
import com.surfey.surveyservice.model.Questions;
import com.surfey.surveyservice.model.Survey;
import com.surfey.surveyservice.model.Surveys;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends JpaRepository<SurveyEntity, Integer> {

    /*
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

    public Questions findQuestionsWithRelated(int surveyId) {
        return null;
    }

    public Questions findQuestions(int surveyId) {
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
    *
     */
}