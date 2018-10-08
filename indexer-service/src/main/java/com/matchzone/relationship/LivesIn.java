package com.matchzone.relationship;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.matchzone.node.CityNode;
import com.matchzone.node.UserNode;

@RelationshipEntity(type="LivesIn")
public class LivesIn {
	
	//private String name;
	@StartNode
	UserNode user;
	
	@EndNode
	CityNode city;
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public UserNode getUser() {
		return user;
	}

	public void setUser(UserNode user) {
		this.user = user;
	}

	public CityNode getCity() {
		return city;
	}

	public void setCity(CityNode city) {
		this.city = city;
	}

	public LivesIn(UserNode user, CityNode city) {
		super();
		this.user = user;
		this.city = city;
	}

	

	
	
}
