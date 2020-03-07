package com.agrawal.tiffin.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class User {

	private String userName;
	private String mobileNumber;
	private String email;
	private String dateOfBirth;
	
}
