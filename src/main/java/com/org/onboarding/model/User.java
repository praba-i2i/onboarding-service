package com.org.onboarding.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "user_")
public class User {

	@Id
	@Field(name="user_id")
	private int userId;
	
	@Field(name="user_name")
	private String userName;
		
	@Field(name="password")
	private String password;
	
	@Field(name="role")
	private String role;
}
