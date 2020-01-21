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

@SpringBootApplication
public class SurveyServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SurveyServiceApplication.class, args);

		SurveyRepository surveyRepository = ctx.getBean(SurveyRepository.class);
		surveyRepository.saveAll(new ArrayList<>(
				Arrays.asList(
						new SurveyEntity(0, "uid0",
								Collections.singletonList(
										new QuestionEntity(0,
												"uid1",
												null,
												Arrays.asList(
														new AnswerEntity(0, "ads", null, "Coś"),
														new AnswerEntity(0, "fdsb", null, "Heh"),
														new AnswerEntity(0, "cgfd", null, "Lol"),
														new AnswerEntity(0, "dsdf", null, "Foo")
												)
												, "Co pan robi?")
								)
								, "Ankietka 1"),
						new SurveyEntity(0, "uidfefsd0",
								Collections.singletonList(
										new QuestionEntity(0,
												"uidfzfgdd1",
												null,
												Arrays.asList(
														new AnswerEntity(0, "aghjhty", null, "Coś"),
														new AnswerEntity(0, "tyuyb", null, "Heh"),
														new AnswerEntity(0, "dfgsc", null, "Lol"),
														new AnswerEntity(0, "dcvx", null, "Foo")
												)
												, "Co pan robi?")
								)
								, "Ankietka 2"),
						new SurveyEntity(0, "uiadfgadfd0",
								Collections.singletonList(
										new QuestionEntity(0,
												"uigfadfgfadfnbd1",
												null,
												Arrays.asList(
														new AnswerEntity(0, "afgbv", null, "Coś"),
														new AnswerEntity(0, "cvb", null, "Heh"),
														new AnswerEntity(0, "sdfc", null, "Lol"),
														new AnswerEntity(0, "hd", null, "Foo")
												)
												, "Co pan robi?")
								)
								, "Ankietka 3")

				)
		));
	}

}
