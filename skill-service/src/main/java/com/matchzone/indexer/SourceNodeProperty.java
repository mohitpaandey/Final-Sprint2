package com.matchzone.indexer;

public class SourceNodeProperty {

	private String skills;
	private String levels;
	
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getLevels() {
		return levels;
	}
	public void setLevels(String levels) {
		this.levels = levels;
	}
	public SourceNodeProperty(String skills, String levels) {
		super();
		this.skills = skills;
		this.levels = levels;
	}
	public SourceNodeProperty() {
		super();
	}
	
	
}
