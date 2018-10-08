package com.matchzone.node;

//import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class SkillNode {
	

	// @GeneratedValue
	  // private Long id;
	 @Id 
	 private String name;

//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public SkillNode( String name) {
		super();
		//this.id = id;
		this.name = name;
		
	}
	
	

}
