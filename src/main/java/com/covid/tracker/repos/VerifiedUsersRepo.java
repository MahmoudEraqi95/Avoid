package com.covid.tracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.covid.tracker.models.VerifiedUsers;

@Repository
@RepositoryRestResource(path = "users")
public interface VerifiedUsersRepo extends JpaRepository<VerifiedUsers, Integer> {

}
