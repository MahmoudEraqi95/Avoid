package com.covid.tracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.covid.tracker.dtos.excerpt.QuestionExcerpt;
import com.covid.tracker.models.Questions;

@Repository
@RepositoryRestResource(excerptProjection = QuestionExcerpt.class, path = "questions")
public interface QuestionsRepo extends JpaRepository<Questions, Integer> {

}
