package com.matchzone.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PersonalInfo {

	@Id
	private String userName;
	private String userId;
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
