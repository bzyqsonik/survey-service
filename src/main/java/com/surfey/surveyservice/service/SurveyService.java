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
@Value //USUN TO NA BOGA
public class SurveyService {

    //PRIVATE FINAL
    SurveyRepository surveyRepository;
    SurveyConverter surveyConverter;

    //Jebac ta flage, jak dla mnie to laduj wszystko jak leci
    //Ten serwis powinien zwracac kolekcje Surveyow, dopiero na poziomie kontrolera powinien byc opakowany w Surveys
    //Jebac ta flage, ale jak juz to argument powinien byc final
    public Surveys findAll(boolean loadRelated) {
        if (loadRelated)
            return Surveys.builder().surveys(
                    surveyRepository.findAll().stream()
            //Kazda operacja streamu powinna byc w innej linii, czyli collect zrzuc nizej
            //toList() zaimportuj statycznie
                            .map(surveyConverter::convertEntityToSurveyWithRelated).collect(Collectors.toList())).build();
        else
            return Surveys.builder().surveys(
                    surveyRepository.findAll().stream()
                            .map(surveyConverter::convertEntityToSurveyWithoutRelated).collect(Collectors.toList())).build();
    }

    //Jebac flage i argumety powinny byc final
    public Survey find(UUID surveyId, boolean loadRelated) {
        if (loadRelated)
            return surveyConverter.convertEntityToSurveyWithRelated(surveyRepository.findByUuid(surveyId));
        else
            return surveyConverter.convertEntityToSurveyWithoutRelated(surveyRepository.findByUuid(surveyId));
    }
}
