package com.matchzone.indexer;


public class Indexer {
	

private String sourceNodetype;	
private SourceNodeProperty sourcenodeproperty;
private String targetNodeType;
private TargetNodeProperty targetnodeproperty;
private String relationshipName;
private RelationshipProperty relationshipproperty;
public String getSourceNodetype() {
	return sourceNodetype;
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
public RelationshipProperty getRelationshipproperty() {
	return relationshipproperty;
}
public void setRelationshipproperty(RelationshipProperty relationshipproperty) {
	this.relationshipproperty = relationshipproperty;
}

}
