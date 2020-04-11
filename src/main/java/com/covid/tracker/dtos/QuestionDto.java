package com.covid.tracker.dtos;

import java.util.Collection;

import com.covid.tracker.dtos.excerpt.QuestionExcerpt;
import com.covid.tracker.models.Options;

public class QuestionDto implements QuestionExcerpt {
	private Integer id;
	private String question;
	private String type;
	private Collection<Options> optionsCollection;

	public QuestionDto() {
		super();
	}

	public QuestionDto(Integer id, String question, String type, Collection<Options> optionsCollection) {
		super();
		this.id = id;
		this.question = question;
		this.type = type;
		this.optionsCollection = optionsCollection;
	}

	/* (non-Javadoc)
	 * @see com.covid.tracker.dtos.a#getId()
	 */
	@Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see com.covid.tracker.dtos.a#getQuestion()
	 */
	@Override
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	/* (non-Javadoc)
	 * @see com.covid.tracker.dtos.a#getType()
	 */
	@Override
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see com.covid.tracker.dtos.a#getOptionsCollection()
	 */
	@Override
	public Collection<Options> getOptionsCollection() {
		return optionsCollection;
	}

	public void setOptionsCollection(Collection<Options> optionsCollection) {
		this.optionsCollection = optionsCollection;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QuestionDto [id=");
		builder.append(id);
		builder.append(", question=");
		builder.append(question);
		builder.append(", type=");
		builder.append(type);
		builder.append(", optionsCollection=");
		builder.append(optionsCollection);
		builder.append("]");
		return builder.toString();
	}

}
