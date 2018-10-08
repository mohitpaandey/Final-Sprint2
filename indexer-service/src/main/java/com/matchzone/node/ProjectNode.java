package com.matchzone.node;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class ProjectNode {
	@Id
	
	private String projectName;
	//private String projectDuration;
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public ProjectNode( String projectName) {
		super();
		//this.id = id;
		this.projectName = projectName;
		//this.projectDuration = projectDuration;
	}
	
	

}
