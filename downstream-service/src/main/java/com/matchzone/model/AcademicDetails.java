package com.matchzone.model;

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
public class AcademicDetails 
{

	@Id
	private String profileId;
	private String education;
	private String course;
	private String specialisation;
	private String universityInstitute;
	private Integer passingYear;
	private String gradingSystem;
	private String higherSecondary;
	private Integer highDuration;
	private String highLocation;
	private String seniorSecondary;
	private Integer senDuration;
	private String senLocation;


}
