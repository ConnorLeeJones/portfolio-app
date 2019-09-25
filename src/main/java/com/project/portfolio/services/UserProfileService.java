package com.project.portfolio.services;

import com.project.portfolio.models.User;
import com.project.portfolio.models.UserProfile;
import com.project.portfolio.repositories.UserProfileRepository;
import com.project.portfolio.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

    private UserProfileRepository repository;

    @Autowired
    public UserProfileService(UserProfileRepository repository){
        this.repository = repository;
    }

    public Iterable<UserProfile> findAll(){ return repository.findAll();}

    public UserProfile create(UserProfile profile){
        return repository.save(profile);
    }


}