package com.matchzone.indexer;

public class Indexer {
	private String sourceNodeType;
	private SourceNodeProperty sourceNodeProperty;
	private String targetNodeType;
	private TargetNodeProperty targetNodeProperty;
	private String relationshipName;
	private RelationshipProperty relationshipProperty;
	public String getSourceNodeType() {
		return sourceNodeType;
	}
	public void setSourceNodeType(String sourceNodeType) {
		this.sourceNodeType = sourceNodeType;
	}
	public Indexer() {
		super();
	}
	public SourceNodeProperty getSourceNodeProperty() {
		return sourceNodeProperty;
	}
	public void setSourceNodeProperty(SourceNodeProperty sourceNodeProperty) {
		this.sourceNodeProperty = sourceNodeProperty;
	}
	public String getTargetNodeType() {
		return targetNodeType;
	}
	public void setTargetNodeType(String targetNodeType) {
		this.targetNodeType = targetNodeType;
	}
	public TargetNodeProperty getTargetNodeProperty() {
		return targetNodeProperty;
	}
	public void setTargetNodeProperty(TargetNodeProperty targetNodeProperty) {
		this.targetNodeProperty = targetNodeProperty;
	}
	public String getRelationshipName() {
		return relationshipName;
	}
	public void setRelationshipName(String relationshipName) {
		this.relationshipName = relationshipName;
	}
	public RelationshipProperty getRelationshipProperty() {
		return relationshipProperty;
	}
	public void setRelationshipProperty(RelationshipProperty relationshipProperty) {
		this.relationshipProperty = relationshipProperty;
	}
	public Indexer(String sourceNodeType, SourceNodeProperty sourceNodeProperty, String targetNodeType,
			TargetNodeProperty targetNodeProperty, String relationshipName, RelationshipProperty relationshipProperty) {
		super();
		this.sourceNodeType = sourceNodeType;
		this.sourceNodeProperty = sourceNodeProperty;
		this.targetNodeType = targetNodeType;
		this.targetNodeProperty = targetNodeProperty;
		this.relationshipName = relationshipName;
		this.relationshipProperty = relationshipProperty;
	}
	

}
