package com.matchzone.relationship;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.matchzone.node.AcademicNode;
import com.matchzone.node.UserNode;

@RelationshipEntity(type="Holds")
public class Holds {
	
	//private String name;
	@StartNode
	UserNode user;
	@EndNode
	AcademicNode academicNode;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public UserNode getUser() {
		return user;
	}
	public void setUser(UserNode user) {
		this.user = user;
	}
	public Holds(UserNode user, AcademicNode academicNode) {
		super();
		this.user = user;
		this.academicNode = academicNode;
	}
	public AcademicNode getAcademicNode() {
		return academicNode;
	}
	public void setAcademicNode(AcademicNode academicNode) {
		this.academicNode = academicNode;
	}
	public Holds() {
		super();
	}
	
	

}
