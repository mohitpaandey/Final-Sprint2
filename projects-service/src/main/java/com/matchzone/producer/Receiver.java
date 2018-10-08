package com.matchzone.producer;

import org.aspectj.asm.internal.Relationship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matchzone.indexer.Index;
import com.matchzone.indexer.Indexer;
import com.matchzone.indexer.RelationshipProperty;
import com.matchzone.indexer.SourceNodeProperty;
import com.matchzone.indexer.TargetNodeProperty;
import com.matchzone.model.Project;



@SuppressWarnings("unused")
@Service
public class Receiver {
@Autowired
	private Producer producer;

	public Indexer studiedAtIndexer = new Indexer();
	public TargetNodeProperty targetNodeProperty = new TargetNodeProperty();
	 public RelationshipProperty relationshipProperty = new RelationshipProperty();
	 public SourceNodeProperty sourceNodeProperty = new SourceNodeProperty();
	 Index index = new Index();
    
    
	 public void consumeJson(Project project) {
		
		 
	    	//Target Node Type
	    	studiedAtIndexer.setTargetNodeType("Project");
	    	
	    	//Source Node Type
	    	studiedAtIndexer.setSourceNodeType("User");
	    	studiedAtIndexer.setRelationshipName("WorkedOn");
	    	
	    	
	    	studiedAtIndexer.setSourceNodeProperty(sourceNodeProperty);
	    	
	    	targetNodeProperty.setProfileId(index.getProfileId());
	    	
	    	studiedAtIndexer.setTargetNodeProperty(targetNodeProperty);
	    	
	    	
	    
   	relationshipProperty.setRelationshipName(relationshipProperty.getRelationshipName());
//	    	RelationshipProperty.setStream(academicDetail.getStream());
//	    	RelationshipProperty.setYearOfCompletion(academicDetail.getYearOfCompletion());
//	    	RelationshipProperty.setYearOfJoining(academicDetail.getYearOfJoining());
	    	
	    
	    	
	    	RelationshipProperty studyRelationship = new RelationshipProperty();
	    	studiedAtIndexer.setRelationshipProperty(studyRelationship);
	    	
	    	
	
	    
	    index.setClient(project.getClient());
	    index.setDuration(project.getDuration());
	    index.setProfileId(project.getUserName());
	    index.setProjectAt(project.getProjectDetails());
	    index.setProjectDetails(project.getProjectDetails());
	    index.setProjectLocation(project.getProjectLocation());
	    index.setProjectMembers(project.getProjectMembers());
	    index.setProjectStatus(project.getProjectStatus());
	    index.setProjectTitle(project.getProjectTitle());
	    index.setProjectURL(project.getProjectURL());

	       producer.sendtoindexer(project);
	        
	    }
}
