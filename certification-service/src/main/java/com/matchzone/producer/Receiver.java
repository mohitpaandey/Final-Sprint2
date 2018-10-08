package com.matchzone.producer;

import org.aspectj.asm.internal.Relationship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.matchzone.model.Certification;
import com.matchzone.indexer.Index;
import com.matchzone.indexer.Indexer;
import com.matchzone.indexer.RelationshipProperty;
import com.matchzone.indexer.SourceNodeProperty;
import com.matchzone.indexer.TargetNodeProperty;

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
    
    
	 public void consumeJson(Certification certification) {
		
		 
	    	//Target Node Type
	    	studiedAtIndexer.setTargetNodeType("Certification");
	    	
	    	//Source Node Type
	    	studiedAtIndexer.setSourceNodeType("User");
	    	studiedAtIndexer.setRelationshipName("CertifiedIn");
	    	
	    	
	    	studiedAtIndexer.setSourceNodeProperty(sourceNodeProperty);
	    	
	    	targetNodeProperty.setProfileId(index.getProfileId());
	    	
	    	studiedAtIndexer.setTargetNodeProperty(targetNodeProperty);
	    	
	    	
	    
   	relationshipProperty.setRelationshipName(relationshipProperty.getRelationshipName());
//	    	RelationshipProperty.setStream(academicDetail.getStream());
//	    	RelationshipProperty.setYearOfCompletion(academicDetail.getYearOfCompletion());
//	    	RelationshipProperty.setYearOfJoining(academicDetail.getYearOfJoining());
	    	
	    
	    	
	    	RelationshipProperty certifiedIn = new RelationshipProperty();
	    	studiedAtIndexer.setRelationshipProperty(certifiedIn);
	    	
	    	
	    	
	    	//Operations
	    	
//	    	studiedAtIndexer.setWeightage("5");
//	    	studiedAtIndexer.setOperation(qualification.getMessage());
	    	
	    index.setCertificationName((certification.getCertificationName()));
	    index.setLicenseNumber((certification.getLicenseNumber()));
	    index.setCertificationAuthority((certification.getCertificationAuthority()));
	    index.setDurationFrom(certification.getDurationFrom());
	    index.setLicenseNumber(certification.getLicenseNumber());
	    index.setDurationTo(certification.getDurationTo());
	    index.setProfileId(certification.getUserName());
	   
	    
	
//	qualificationIndexer.setInstituteName(qualification.getInstituteName());
//	qualificationIndexer.setMessage(qualification.getMessage());
//	qualificationIndexer.setProfileId(qualification.getProfileId());
//	qualificationIndexer.setQualification(qualification.getQualification());   
//	qualificationIndexer.setStream(qualification.getStream());
//	qualificationIndexer.setYearOfCompletion(qualification.getYearOfCompletion());
//	qualificationIndexer.setYearOfJoining(qualification.getYearOfJoining());        
	
	       producer.sendtoindexer(certification);
	        
	    }
}
