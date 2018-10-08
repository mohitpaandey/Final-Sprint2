package com.matchzone.producer;

import org.aspectj.asm.internal.Relationship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matchzone.indexer.Index;
import com.matchzone.indexer.Indexer;
import com.matchzone.indexer.RelationshipProperty;
import com.matchzone.indexer.SourceNodeProperty;
import com.matchzone.indexer.TargetNodeProperty;
import com.matchzone.model.Skills;

@SuppressWarnings("unused")
@Service
public class Receiver {
	@Autowired
	private Producer producer;

	public Indexer skillIndexer = new Indexer();
	public TargetNodeProperty targetNodeProperty = new TargetNodeProperty();
	public RelationshipProperty relationshipProperty = new RelationshipProperty();
	public SourceNodeProperty sourceNodeProperty = new SourceNodeProperty();
	Index index = new Index();

	public void consumeJson(Skills skills) {

		// Target Node Type
		skillIndexer.setTargetNodeType("Skill");

		// Source Node Type
		skillIndexer.setSourceNodetype("User");
		skillIndexer.setRelationshipName("Knows");

		skillIndexer.setSourcenodeproperty(sourceNodeProperty);

		targetNodeProperty.setProfileId(index.getProfileId());

		skillIndexer.setTargetnodeproperty(targetNodeProperty);

		relationshipProperty.setRelationshipName(relationshipProperty.getRelationshipName());

		index.setiTSkills(skills.getITSkills());
		index.setLastUsed(skills.getLastUsed());

		index.setLevel(skills.getLevel());
		index.setProfileId(skills.getUserName());
		index.setVersion(skills.getVersion());
		RelationshipProperty skillRelationship = new RelationshipProperty();
		skillIndexer.setRelationshipProperty(relationshipProperty);

		producer.sendtoindexer(skills);

	}
}
