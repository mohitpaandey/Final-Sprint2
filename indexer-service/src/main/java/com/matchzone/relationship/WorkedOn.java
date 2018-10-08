package com.matchzone.relationship;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.matchzone.node.ProjectNode;
import com.matchzone.node.UserNode;

@RelationshipEntity(type="WorkedOn")
public class WorkedOn {
//	private String name;
	@StartNode
	UserNode user;
	@EndNode
	ProjectNode projectNode;
	
	public UserNode getUser() {
		return user;
	}
	public void setUser(UserNode user) {
		this.user = user;
	}
	public ProjectNode getProjectNode() {
		return projectNode;
	}
	public void setProjectNode(ProjectNode projectNode) {
		this.projectNode = projectNode;
	}
	public WorkedOn() {
		super();
	}
	public WorkedOn(UserNode user, ProjectNode projectNode) {
		super();
		this.user = user;
		this.projectNode = projectNode;
	}
	

}
