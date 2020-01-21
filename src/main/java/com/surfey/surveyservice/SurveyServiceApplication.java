package com.surfey.surveyservice;

import com.surfey.surveyservice.entity.AnswerEntity;
import com.surfey.surveyservice.entity.QuestionEntity;
import com.surfey.surveyservice.entity.SurveyEntity;
import com.surfey.surveyservice.repository.SurveyRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

@SpringBootApplication
public class SurveyServiceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SurveyServiceApplication.class, args);

        SurveyRepository surveyRepository = ctx.getBean(SurveyRepository.class);

        surveyRepository.saveAll(new ArrayList<>(
                Arrays.asList(
                        new SurveyEntity(0, UUID.randomUUID(),
                                Collections.singletonList(
                                        new QuestionEntity(0,
                                                UUID.randomUUID(),
                                                Arrays.asList(
                                                        new AnswerEntity(0, UUID.randomUUID(), "Coś"),
                                                        new AnswerEntity(0, UUID.randomUUID(), "Heh"),
                                                        new AnswerEntity(0, UUID.randomUUID(), "Lol"),
                                                        new AnswerEntity(0, UUID.randomUUID(), "Foo")
                                                )
                                                , "Co pan robi?")
                                )
                                , "Ankietka 1"),
                        new SurveyEntity(0, UUID.randomUUID(),
                                Collections.singletonList(
                                        new QuestionEntity(0,
                                                UUID.randomUUID(),
                                                Arrays.asList(
                                                        new AnswerEntity(0, UUID.randomUUID(), "Coś"),
                                                        new AnswerEntity(0, UUID.randomUUID(), "Heh"),
                                                        new AnswerEntity(0, UUID.randomUUID(), "Lol"),
                                                        new AnswerEntity(0, UUID.randomUUID(), "Foo")
                                                )
                                                , "Co pan robi?")
                                )
                                , "Ankietka 2"),
                        new SurveyEntity(0, UUID.randomUUID(),
                                Collections.singletonList(
                                        new QuestionEntity(0,
                                                UUID.randomUUID(),
                                                Arrays.asList(
                                                        new AnswerEntity(0, UUID.randomUUID(), "dupa"),
                                                        new AnswerEntity(0, UUID.randomUUID(), "Heh"),
                                                        new AnswerEntity(0, UUID.randomUUID(), "Lol"),
                                                        new AnswerEntity(0, UUID.randomUUID(), "Foo")
                                                )
                                                , "Co pan robi?")
                                )
                                , "Ankietka 3")

                )
        ));
    }

}
