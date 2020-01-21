package com.surfey.surveyservice.service;

import com.surfey.surveyservice.entity.SurveyEntity;
import com.surfey.surveyservice.model.Answer;
import com.surfey.surveyservice.model.Question;
import com.surfey.surveyservice.model.Survey;
import com.surfey.surveyservice.model.Surveys;
import com.surfey.surveyservice.repository.SurveyRepository;
import com.surfey.surveyservice.service.converter.SurveyConverter;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Value
public class SurveyService {

    SurveyRepository surveyRepository;
    SurveyConverter surveyConverter;

    public Surveys findAll(boolean loadRelated) {
        if (loadRelated)
            return Surveys.builder().surveys(
                    surveyRepository.findAll().stream()
                            .map(surveyConverter::convertEntityToSurveyWithRelated).collect(Collectors.toList())).build();
        else
            return Surveys.builder().surveys(
                    surveyRepository.findAll().stream()
                            .map(surveyConverter::convertEntityToSurveyWithoutRelated).collect(Collectors.toList())).build();
    }

    public Survey find(UUID surveyId, boolean loadRelated) {
        if (loadRelated)
            return surveyConverter.convertEntityToSurveyWithRelated(surveyRepository.findByUuid(surveyId));
        else
            return surveyConverter.convertEntityToSurveyWithoutRelated(surveyRepository.findByUuid(surveyId));
    }
}
