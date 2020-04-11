package com.covid.tracker.dtos.excerpt;

import java.util.Collection;

import org.springframework.data.rest.core.config.Projection;

import com.covid.tracker.dtos.QuestionDto;
import com.covid.tracker.models.Options;

@Projection(name = "questions", types = { QuestionDto.class })
public interface QuestionExcerpt {
	Integer getId();

	String getQuestion();

	String getType();

	Collection<Options> getOptionsCollection();
}
