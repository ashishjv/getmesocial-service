package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser(){
        User myUser = new User("Simpson","Get Me Hired, USA",24,"NA");
        return myUser;
    }
}
