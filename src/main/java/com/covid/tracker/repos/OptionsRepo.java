package com.covid.tracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.covid.tracker.dtos.excerpt.OptionExcerpt;
import com.covid.tracker.models.Options;

@Repository
@RepositoryRestResource(excerptProjection = OptionExcerpt.class, path = "options")
public interface OptionsRepo extends JpaRepository<Options, Integer> {

}
