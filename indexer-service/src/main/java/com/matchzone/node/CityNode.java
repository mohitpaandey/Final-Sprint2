package com.matchzone.node;

//import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class CityNode {
	
	
//	   private Long id;
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
	 @Id 
	 //@GeneratedValue
	private String name;
	//private String level;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public String getLevel() {
//		return level;
//	}
//	public void setLevel(String level) {
//		this.level = level;
//	}
	public CityNode( String name) {
		super();
		//this.id = id;
		this.name = name;
	//	this.level = level;
	}
	
}
