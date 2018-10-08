package com.matchzone.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.matchzone.model.CertificationIndex;
import com.matchzone.model.LocationIndex;
import com.matchzone.model.ProjectIndex;
import com.matchzone.model.QualifiactionIndex;
import com.matchzone.model.SkillsIndex;
import com.matchzone.node.AcademicNode;
import com.matchzone.node.CertificationNode;
import com.matchzone.node.CityNode;
import com.matchzone.node.ProjectNode;
import com.matchzone.node.SkillNode;
import com.matchzone.node.UserNode;
import com.matchzone.relationship.CertifiedIn;
import com.matchzone.relationship.Holds;
import com.matchzone.relationship.Knows;
import com.matchzone.relationship.LivesIn;
import com.matchzone.relationship.WorkedOn;
import com.matchzone.repository.CertifiedInRepository;
import com.matchzone.repository.HoldsRepository;
import com.matchzone.repository.KnowsRepository;
import com.matchzone.repository.LivesInRepository;
import com.matchzone.repository.WorkedOnRepository;


@Service
public class KafkaConsumer {
	

	
	private KnowsRepository hasSkillRepository;
	private LivesInRepository livesIn;
	private CertifiedInRepository cerIn;
	private WorkedOnRepository workedOn;
	private HoldsRepository holds;
	
	



	@Autowired
	public KafkaConsumer(KnowsRepository hasSkillrepository) {
		this.hasSkillRepository=hasSkillrepository;
		this.livesIn=livesIn;
		this.cerIn=cerIn;
		this.workedOn=workedOn;
		this.holds=holds;
		
	}

	@KafkaListener(topics = "skill1_data", groupId = "skill_json", containerFactory = "skillKafkaListenerFactory")
	public void consumeJson(@Payload SkillsIndex skillIndex)
		{
		System.out.println("Consumed JSON Message: " + skillIndex);
		SkillNode skill = new SkillNode(skillIndex.getITSkills());
		UserNode userNode = new UserNode(skillIndex.getProfileId());
		Knows hasSkill = new Knows(userNode, skill);

//		if (skillIndex.getMessage().equals("save") || skillIndex.getMessage().contains("update"))
//		{
			hasSkillRepository.save(hasSkill);
		//}
//	        else if (skillIndex.getMessage().contains("delete")) 
//	        {
//	            hasSkillRepository.delete();
//	        }

	}
	
	/** Location **/
	


	@KafkaListener(topics = "loc1_data", groupId = "loc_json", containerFactory = "locationKafkaListenerFactory")
	public void consumeJson(@Payload LocationIndex locationIndex)
		{
		System.out.println("Consumed JSON Message: " + locationIndex);
		CityNode city = new CityNode(locationIndex.getCity());
		UserNode userNode = new UserNode(locationIndex.getProfileId());
		LivesIn livesInn = new LivesIn(userNode, city);

//		if (locationIndex.getMessage().equals("save") || locationIndex.getMessage().contains("update"))
//		{
			livesIn.save(livesInn);
	//	}


	}

//	/** Certification **/
	


	@KafkaListener(topics = "certi1_data", groupId = "certi_json", containerFactory = "certiKafkaListenerFactory")
	public void consumeJson(@Payload CertificationIndex certificationIndex)
		{
		System.out.println("Consumed JSON Message: " + certificationIndex);
		CertificationNode cer = new CertificationNode(certificationIndex.getCertificationName());
		UserNode userNode = new UserNode(certificationIndex.getProfileId());
		CertifiedIn cerInn = new CertifiedIn(userNode, cer);

//		if (certificationIndex.getMessage().equals("save") || certificationIndex.getMessage().contains("update"))
//		{
			cerIn.save(cerInn);
		//}


	}
  

///** Project **/
	
	


	@KafkaListener(topics = "proj1_data", groupId = "project_json", containerFactory = "projKafkaListenerFactory")
	public void consumeJson(@Payload ProjectIndex projectIndex)
		{
		System.out.println("Consumed JSON Message: " + projectIndex);
		ProjectNode pro = new ProjectNode(projectIndex.getProjectTitle());
		UserNode userNode = new UserNode(projectIndex.getProfileId());
		WorkedOn worked= new WorkedOn(userNode, pro);

//		if (projectIndex.getMessage().equals("save") || projectIndex.getMessage().contains("update"))
//		{
			workedOn.save(worked);
		//}

	}
	
//	/** Qualification **/
  
	


	@KafkaListener(topics = "acad1_data", groupId = "qual_json", containerFactory = "qualKafkaListenerFactory")
	public void consumeJson(@Payload QualifiactionIndex qualIndex)
		{
		System.out.println("Consumed JSON Message: " + qualIndex);
		AcademicNode aca = new AcademicNode(qualIndex.getCourse());
		UserNode userNode = new UserNode(qualIndex.getProfileId());
		Holds hold= new Holds(userNode, aca);

		//if (qualIndex.getMessage().equals("save") || qualIndex.getMessage().contains("update"))
		//{
			holds.save(hold);
		//}

	}
}
	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//	  
//
//	  
//}
