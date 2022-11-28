package com.org.onboarding.service;

import com.org.onboarding.model.Car;

import java.util.List;
import java.util.Optional;


public interface ICarService {

	
	public List<Car> findAllCars() ;

	public Optional<Car> findCarById(int id);
	
	public Car findByCarName(String CarName) ;

}
