package com.surfey.surveyservice;

import com.surfey.surveyservice.entity.AnswerEntity;
import com.surfey.surveyservice.entity.QuestionEntity;
import com.surfey.surveyservice.entity.SurveyEntity;
import com.surfey.surveyservice.repository.SurveyRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class SurveyServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SurveyServiceApplication.class, args);

		SurveyRepository surveyRepository = ctx.getBean(SurveyRepository.class);

		/*
		AnswerEntity answerEntity = new AnswerEntity(0, "asdfsdf", null, "Dupa");
		QuestionEntity questionEntity = new QuestionEntity(0, "dsadsa", null, List.of(answerEntity), "Co robisz?");
		answerEntity.setQuestion(questionEntity);
		SurveyEntity surveyEntity = new SurveyEntity(0, "2342323", List.of(questionEntity), "Ankietka");
		questionEntity.setSurvey(surveyEntity);

		surveyRepository.save(surveyEntity);
		*/

		surveyRepository.saveAll(new ArrayList<>(
				Arrays.asList(
						new SurveyEntity(0, "uid0",
								Collections.singletonList(
										new QuestionEntity(0,
												"uid1",
												Arrays.asList(
														new AnswerEntity(0, "ads", "Coś"),
														new AnswerEntity(0, "fdsb", "Heh"),
														new AnswerEntity(0, "cgfd",  "Lol"),
														new AnswerEntity(0, "dsdf", "Foo")
												)
												, "Co pan robi?")
								)
								, "Ankietka 1"),
						new SurveyEntity(0, "uidfefsd0",
								Collections.singletonList(
										new QuestionEntity(0,
												"uidfzfgdd1",
												Arrays.asList(
														new AnswerEntity(0, "aghjhty","Coś"),
														new AnswerEntity(0, "tyuyb",  "Heh"),
														new AnswerEntity(0, "dfgsc",  "Lol"),
														new AnswerEntity(0, "dcvx",  "Foo")
												)
												, "Co pan robi?")
								)
								, "Ankietka 2"),
						new SurveyEntity(0, "uiadfgadfd0",
								Collections.singletonList(
										new QuestionEntity(0,
												"uigfadfgfadfnbd1",
												Arrays.asList(
														new AnswerEntity(0, "afgbv", "Coś"),
														new AnswerEntity(0, "cvb",  "Heh"),
														new AnswerEntity(0, "sdfc",  "Lol"),
														new AnswerEntity(0, "hd","Foo")
												)
												, "Co pan robi?")
								)
								, "Ankietka 3")

				)
		));
	}

}
