package com.matchzone.model;

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
public class QualifiactionIndex {
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
