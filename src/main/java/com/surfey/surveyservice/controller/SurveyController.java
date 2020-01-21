package com.surfey.surveyservice.controller;

import com.surfey.surveyservice.model.Survey;
import com.surfey.surveyservice.model.Surveys;
import com.surfey.surveyservice.service.SurveyService;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/surveys")
@AllArgsConstructor
@Value // makes all fields private final
public class SurveyController {

    SurveyService surveyService;

    /**
     * @param loadRelated Determines whether all the surveys from data source
     *                    are retrieved with all related questions or with UIDs of those.
     * @return JSON object of all surveys in the data source
     */

    @GetMapping
    public Surveys getSurveys(@RequestParam(required = false) boolean loadRelated) {
        return surveyService.findAll(loadRelated);
    }

    @GetMapping("/{surveyId}")
    public Survey findSurvey(@PathVariable UUID surveyId, @RequestParam(required = false) boolean loadRelated) {
        return surveyService.find(surveyId, loadRelated);
    }
}
