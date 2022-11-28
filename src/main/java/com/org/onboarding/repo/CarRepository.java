package com.org.onboarding.repo;

import com.org.onboarding.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CarRepository extends MongoRepository<Car, Integer> {

	Car findByCarName(String userName);

}
