package com.project.portfolio.services;

import com.project.portfolio.models.User;
import com.project.portfolio.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository repository;

    @Autowired
    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public Iterable<User> findAll(){ return repository.findAll();}

    public User create(User user){
        return repository.save(user);
    }


}
