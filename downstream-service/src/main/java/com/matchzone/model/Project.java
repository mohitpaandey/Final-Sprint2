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
public class Project {

	@Id
	private String profileId;
	private String projectTitle;
	private String client;
	private String projectStatus;
	private Integer duration;
	private String projectDetails;
	private Integer projectMembers;
	private String role;
	private String projectLocation;
	private String projectAt;
	private Integer teamSize;
	private String skills;
	private String projectURL;

	}