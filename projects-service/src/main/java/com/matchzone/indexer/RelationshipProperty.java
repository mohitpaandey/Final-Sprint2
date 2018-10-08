package com.matchzone.indexer;
public class RelationshipProperty {
private String relationshipName;

public String getRelationshipName() {
	return relationshipName;
}

public void setRelationshipName(String relationshipName) {
	this.relationshipName = relationshipName;
}

public RelationshipProperty(String relationshipName)
{
	super();
	this.relationshipName = relationshipName;
}

public RelationshipProperty() {
	super();
}

}
