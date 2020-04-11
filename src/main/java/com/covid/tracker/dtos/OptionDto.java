package com.covid.tracker.dtos;

import com.covid.tracker.dtos.excerpt.OptionExcerpt;

public class OptionDto implements OptionExcerpt {
	private Integer id;
	private String option;
	private String comments;
	private int percentage;
	private QuestionDto question;

	public OptionDto() {
		super();
	}

	public OptionDto(Integer id, String option, String comments, int percentage, QuestionDto question) {
		super();
		this.id = id;
		this.option = option;
		this.comments = comments;
		this.percentage = percentage;
		this.question = question;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.covid.tracker.dtos.a#getId()
	 */
	@Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.covid.tracker.dtos.a#getOption()
	 */
	@Override
	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.covid.tracker.dtos.a#getComments()
	 */
	@Override
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.covid.tracker.dtos.a#getPercentage()
	 */
	@Override
	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}


	public QuestionDto getQuestion() {
		return question;
	}

	public void setQuestion(QuestionDto question) {
		this.question = question;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OptionDto [id=");
		builder.append(id);
		builder.append(", option=");
		builder.append(option);
		builder.append(", comments=");
		builder.append(comments);
		builder.append(", percentage=");
		builder.append(percentage);
		builder.append(", question=");
		builder.append(question);
		builder.append("]");
		return builder.toString();
	}

}
