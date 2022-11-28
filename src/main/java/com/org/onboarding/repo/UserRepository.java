package com.org.onboarding.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.org.onboarding.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

	User findByUserName(String userName);

}
