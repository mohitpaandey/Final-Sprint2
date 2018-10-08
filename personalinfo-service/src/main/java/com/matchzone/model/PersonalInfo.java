package com.matchzone.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PersonalInfo {

	private String userId;
	private String userName;
	private Date dateOfBirth;
	private String gender;
	private String maritalStatus;
	private String permanentAddress;
	private String homeTown;
	private Integer pinCode;
	private String languages;
	private Integer age;
	private String bloodGroup;
	private String linkedinUrl;
	private String emailId;
	private String gitHubUrl;

	
}
