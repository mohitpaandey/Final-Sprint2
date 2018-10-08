package com.matchzone.relationship;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.matchzone.node.CertificationNode;
import com.matchzone.node.UserNode;

@RelationshipEntity(type="CertifiedIn")
public class CertifiedIn {
	//private String name;
	@StartNode
	UserNode user;
	@EndNode
	CertificationNode certi;
	
	public UserNode getUser() {
		return user;
	}
	public void setUser(UserNode user) {
		this.user = user;
	}
	
	
	public CertificationNode getCerti() {
		return certi;
	}
	public void setCerti(CertificationNode certi) {
		this.certi = certi;
	}
	public CertifiedIn(UserNode user, CertificationNode certi) {
		super();
		this.user = user;
		this.certi = certi;
	}
	public CertifiedIn() {
		super();
	}
	
	
	

}
