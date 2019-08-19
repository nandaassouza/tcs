package com.springAngular.demo.repositories;

import com.springAngular.demo.models.Users;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, String> {

    Users findByEmail(String email);

}