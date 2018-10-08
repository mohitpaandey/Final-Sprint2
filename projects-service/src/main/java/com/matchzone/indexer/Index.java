package com.matchzone.indexer;

public class Index {
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

	
	
	public Index() {
		super();
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(String projectDetails) {
		this.projectDetails = projectDetails;
	}

	public Integer getProjectMembers() {
		return projectMembers;
	}

	public void setProjectMembers(Integer projectMembers) {
		this.projectMembers = projectMembers;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getProjectLocation() {
		return projectLocation;
	}

	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}

	public String getProjectAt() {
		return projectAt;
	}

	public void setProjectAt(String projectAt) {
		this.projectAt = projectAt;
	}

	public Integer getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(Integer teamSize) {
		this.teamSize = teamSize;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getProjectURL() {
		return projectURL;
	}

	public void setProjectURL(String projectURL) {
		this.projectURL = projectURL;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public Index(String profileId, String projectTitle, String client, String projectStatus, Integer duration,
			String projectDetails, Integer projectMembers, String role, String projectLocation, String projectAt,
			Integer teamSize, String skills, String projectURL) {
		super();
		this.profileId = profileId;
		this.projectTitle = projectTitle;
		this.client = client;
		this.projectStatus = projectStatus;
		this.duration = duration;
		this.projectDetails = projectDetails;
		this.projectMembers = projectMembers;
		this.role = role;
		this.projectLocation = projectLocation;
		this.projectAt = projectAt;
		this.teamSize = teamSize;
		this.skills = skills;
		this.projectURL = projectURL;
	}


}
