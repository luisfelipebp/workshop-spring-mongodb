package com.luisfelipebp.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.luisfelipebp.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
