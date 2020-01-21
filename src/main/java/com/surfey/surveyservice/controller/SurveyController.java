package com.surfey.surveyservice.controller;

import com.surfey.surveyservice.model.Answer;
import com.surfey.surveyservice.model.Questions;
import com.surfey.surveyservice.model.Surveys;
import com.surfey.surveyservice.model.Survey;
import com.surfey.surveyservice.service.SurveyService;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.web.bind.annotation.*;

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
    public Survey findSurvey(@PathVariable int surveyId, @RequestParam(required = false) boolean loadRelated) {
        return surveyService.findSurvey(surveyId, loadRelated);
    }

    @GetMapping("/{surveyId}/questions")
    public Questions findQuestions(@PathVariable int surveyId, @RequestParam(required = false) boolean loadRelated) {
        return surveyService.findQuestions(surveyId, loadRelated);
    }

    @GetMapping("/{surveyId}/questions/{questionId}")
    public Questions findQuestion(@PathVariable int surveyId, @PathVariable int questionId, @RequestParam(required = false) boolean loadRelated) {
        return surveyService.findQuestion(surveyId, questionId, loadRelated);
    }

    @GetMapping("/{surveyId}/questions/{questionId}/answers")
    public Questions findAnswers(@PathVariable int surveyId, @PathVariable int questionId, @RequestParam(required = false) boolean loadRelated) {
        return surveyService.findAnswers(surveyId, questionId, loadRelated);
    }

    /**
     *
     * @param surveyId Specifies the UID of the requested survey
     * @param questionId Specifies the UID of the requested question
     * @param answerId Specifies the UID of the requested answer
     * @return JSON object of the requested answers
     */
    @GetMapping("/{surveyId}/questions/{questionId}/answers/{answerId}")
    public Questions findAnswer(@PathVariable int surveyId, @PathVariable int questionId, @PathVariable int answerId) {
        return surveyService.findAnswer(surveyId, questionId, answerId);
    }
}
