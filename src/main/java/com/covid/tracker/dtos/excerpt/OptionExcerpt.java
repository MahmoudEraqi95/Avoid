package com.covid.tracker.dtos.excerpt;

import org.springframework.data.rest.core.config.Projection;

import com.covid.tracker.dtos.OptionDto;

@Projection(name = "options", types = { OptionDto.class })
public interface OptionExcerpt {
	Integer getId();

	String getOption();

	String getComments();

	int getPercentage();

	QuestionExcerpt getQuestion();
}
