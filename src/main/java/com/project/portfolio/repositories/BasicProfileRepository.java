package com.project.portfolio.repositories;

import com.project.portfolio.models.profiles.BasicProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicProfileRepository extends CrudRepository<BasicProfile, Long> {
}
