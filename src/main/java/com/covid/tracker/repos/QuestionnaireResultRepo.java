package com.covid.tracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.covid.tracker.models.QuestionnaireResult;

@Repository
@RepositoryRestResource( path = "result")
public interface QuestionnaireResultRepo extends JpaRepository< QuestionnaireResult, Integer>{

}
