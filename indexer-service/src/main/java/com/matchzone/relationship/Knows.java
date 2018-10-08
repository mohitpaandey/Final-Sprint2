package com.matchzone.relationship;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.matchzone.node.SkillNode;
import com.matchzone.node.UserNode;

@RelationshipEntity(type="Knows")

public class Knows {

	//private String name;
	@StartNode
	UserNode user;
	@EndNode
	SkillNode skill;
	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public Knows() {
		super();
	}

	public UserNode getUser() {
		return user;
	}

	public void setUser(UserNode user) {
		this.user = user;
	}

	public SkillNode getSkill() {
		return skill;
	}

	public void setSkill(SkillNode skill) {
		this.skill = skill;
	}

	public Knows( UserNode user, SkillNode skill) {
		super();
		//this.name = name;
		this.user = user;
		this.skill = skill;
	}

	

}
