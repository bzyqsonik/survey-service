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
@Value // USUN TO NA BOGA
public class SurveyController {

    // Wyjeb @Value i zrob z tego private final
    SurveyService surveyService;

    /**
     * @param loadRelated Determines whether all the surveys from data source
     *                    are retrieved with all related questions or with UIDs of those.
     * @return JSON object of all surveys in the data source
     */ 
    //JEBAC JAVA DOCI

    @GetMapping
    //Ta flaga jest chujowa, nie powinno sie tak sterowac odpowiedzia. Jak juz to powinienes miec 2 osobne endpointy i 2 modele danych
    //Wszystkie zmienne, argumenty metod TEZ powinny byc final
    public Surveys getSurveys(@RequestParam(required = false) boolean loadRelated) {
        return surveyService.findAll(loadRelated);
    }

    @GetMapping("/{surveyId}")
    //Ta flaga jest chujowa, nie powinno sie tak sterowac odpowiedzia. Jak juz to powinienes miec 2 osobne endpointy i 2 modele danych
    //Wszystkie zmienne, argumenty metod TEZ powinny byc final
    public Survey findSurvey(@PathVariable UUID surveyId, @RequestParam(required = false) boolean loadRelated) {
        return surveyService.find(surveyId, loadRelated);
    }
}
