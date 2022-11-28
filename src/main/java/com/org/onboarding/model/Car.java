package com.org.onboarding.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "car")
public class Car {

	@Id
	private int carId;
	
	private String carName;
		
	private int price;
	
	private String brand;
	
	private String owner;
	
}
