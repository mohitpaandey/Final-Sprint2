package com.matchzone.Kafkalistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.matchzone.model.AcademicDetails;
import com.matchzone.model.Certification;
import com.matchzone.model.Location;
import com.matchzone.model.PersonalInfo;
import com.matchzone.model.Project;
import com.matchzone.model.Skills;
import com.matchzone.service.DownstreamService;

@Service
public class KafkaConsumer 
{

	@Autowired
	private DownstreamService downstreamService;
	
	@KafkaListener(topics = "acad_data", groupId="acad_json", containerFactory = "kafkaListenerContainerFactory")
	public void saveAcademicDetails(@Payload AcademicDetails academicDetails){
		downstreamService.createAcademicDetails(academicDetails);
	}
	
//	@KafkaListener(topics = "acad_data", groupId="acad_json", containerFactory = "kafkaListenerContainerFactory")
//	public void removeAcademicDetails(@Payload AcademicDetails academicDetails){
//		downstreamService.deleteAcademicDetails(academicDetails.getProfileId());
//	}
//	
//	@KafkaListener(topics = "acad_data", groupId="acad_json", containerFactory = "kafkaListenerContainerFactory")
//	public void updateAcademicDetails(@Payload AcademicDetails academicDetails){
//		downstreamService.updateAcademicDetails(academicDetails, academicDetails.getProfileId());
//	}
	
	@KafkaListener(topics = "certi_data", groupId="certi_json", containerFactory = "certiKafkaListenerContainerFactory")
	public void saveCertification(@Payload Certification certification){
		downstreamService.createCertification(certification);
	}
	
//	@KafkaListener(topics = "certi_data", groupId="certi_json", containerFactory = "certiKafkaListenerContainerFactory")
//	public void removeCertification(@Payload Certification certification){
//		downstreamService.deleteCertification(certification.getProfileId());
//	}
//	
//	@KafkaListener(topics = "certi_data", groupId="certi_json", containerFactory = "certiKafkaListenerContainerFactory")
//	public void updateCertification(@Payload Certification certification){
//		downstreamService.updateCertification(certification, certification.getProfileId());
//	}
	
	@KafkaListener(topics = "loc_data", groupId="loc_json", containerFactory = "locKafkaListenerContainerFactory")
	public void saveLocation(@Payload Location location){
		downstreamService.createLocation(location);
	}
	
//	@KafkaListener(topics = "loc_data", groupId="loc_json", containerFactory = "locKafkaListenerContainerFactory")
//	public void removeLocation(@Payload Location location){
//		downstreamService.deleteLocation(location.getProfileId());
//	}
//	
//	@KafkaListener(topics = "loc_data", groupId="loc_json", containerFactory = "locKafkaListenerContainerFactory")
//	public void updateLocation(@Payload Location location){
//		downstreamService.updateLocation(location, location.getProfileId());
//	}
	
	@KafkaListener(topics = "person_data", groupId="person_json", containerFactory = "personKafkaListenerContainerFactory")
	public void savePersonalInfo(@Payload PersonalInfo personalInfo){
		downstreamService.createPersonalInfo(personalInfo);
	}
	
//	@KafkaListener(topics = "person_data", groupId="person_json", containerFactory = "personKafkaListenerContainerFactory")
//	public void removePersonalInfo(@Payload PersonalInfo personalInfo){
//		downstreamService.deleteLocation(personalInfo.getProfileId());
//	}
//	
//	@KafkaListener(topics = "person_data", groupId="person_json", containerFactory = "personKafkaListenerContainerFactory")
//	public void updatePersonalInfo(@Payload PersonalInfo personalInfo){
//		downstreamService.updatePersonalInfo(personalInfo, personalInfo.getProfileId());
//	}
	
	@KafkaListener(topics = "proj_data", groupId="proj_json", containerFactory = "projectKafkaListenerContainerFactory")
	public void saveProject(@Payload Project project){
		downstreamService.createProject(project);
	}
	
//	@KafkaListener(topics = "proj_data", groupId="proj_json", containerFactory = "projectKafkaListenerContainerFactory")
//	public void removeProject(@Payload Project project){
//		downstreamService.deleteProject(project.getProfileId());
//	}
//	
//	@KafkaListener(topics = "proj_data", groupId="proj_json", containerFactory = "projectKafkaListenerContainerFactory")
//	public void updateProject(@Payload Project project){
//		downstreamService.updateProject(project, project.getProfileId());
//	}
	
	@KafkaListener(topics = "skill_data", groupId="skill_json", containerFactory = "skillsKafkaListenerContainerFactory")
	public void saveSkills(@Payload Skills skills){
		downstreamService.createSkills(skills);
	}
	
//	@KafkaListener(topics = "skill_data", groupId="skill_json", containerFactory = "skillsKafkaListenerContainerFactory")
//	public void removeSkills(@Payload Skills skills){
//		downstreamService.deleteSkills(skills.getProfileId());
//	}
//	
//	@KafkaListener(topics = "skill_data", groupId="skill_json", containerFactory = "skillsKafkaListenerContainerFactory")
//	public void updateSkills(@Payload Skills skills){
//		downstreamService.updateSkills(skills, skills.getProfileId());
//	}
		
}
