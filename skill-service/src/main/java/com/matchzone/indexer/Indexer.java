package com.matchzone.indexer;

public class Indexer {
private String sourceNodetype;	
private SourceNodeProperty sourcenodeproperty;
private String targetNodeType;
private TargetNodeProperty targetnodeproperty;
private RelationshipProperty relationshipProperty;
private String relationshipName;
public String getSourceNodetype() {
	return sourceNodetype;
}

public RelationshipProperty getRelationshipProperty() {
	return relationshipProperty;
}

public void setRelationshipProperty(RelationshipProperty relationshipProperty) {
	this.relationshipProperty = relationshipProperty;
}

public void setSourceNodetype(String sourceNodetype) {
	this.sourceNodetype = sourceNodetype;
}
public SourceNodeProperty getSourcenodeproperty() {
	return sourcenodeproperty;
}
public void setSourcenodeproperty(SourceNodeProperty sourcenodeproperty) {
	this.sourcenodeproperty = sourcenodeproperty;
}
public String getTargetNodeType() {
	return targetNodeType;
}
public void setTargetNodeType(String targetNodeType) {
	this.targetNodeType = targetNodeType;
}
public TargetNodeProperty getTargetnodeproperty() {
	return targetnodeproperty;
}
public void setTargetnodeproperty(TargetNodeProperty targetnodeproperty) {
	this.targetnodeproperty = targetnodeproperty;
}
public String getRelationshipName() {
	return relationshipName;
}
public void setRelationshipName(String relationshipName) {
	this.relationshipName = relationshipName;
}
public Indexer(String sourceNodetype, SourceNodeProperty sourcenodeproperty, String targetNodeType,
		TargetNodeProperty targetnodeproperty, String relationshipName,RelationshipProperty relationshipProperty) {
	super();
	this.sourceNodetype = sourceNodetype;
	this.sourcenodeproperty = sourcenodeproperty;
	this.targetNodeType = targetNodeType;
	this.targetnodeproperty = targetnodeproperty;
	this.relationshipName = relationshipName;
	this.relationshipProperty=relationshipProperty;
	
}
public Indexer() {
	super();
}

}
