package com.surfey.surveyservice.repository;

import com.surfey.surveyservice.entity.SurveyEntity;
import com.surfey.surveyservice.model.Questions;
import com.surfey.surveyservice.model.Survey;
import com.surfey.surveyservice.model.Surveys;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SurveyRepository extends JpaRepository<SurveyEntity, Integer> {
    SurveyEntity findByUuid(UUID uuid);
}