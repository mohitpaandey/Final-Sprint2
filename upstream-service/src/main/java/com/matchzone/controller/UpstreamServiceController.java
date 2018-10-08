package com.matchzone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.matchzone.model.AcademicDetails;
import com.matchzone.model.Certification;
import com.matchzone.model.Location;
import com.matchzone.model.PersonalInfo;
import com.matchzone.model.Project;
import com.matchzone.model.Skills;

@CrossOrigin("*")
@RestController
public class UpstreamServiceController {

	private KafkaTemplate<String, AcademicDetails> acadKafkaTemplate;
	private KafkaTemplate<String, Certification> certiKafkaTemplate;
	private KafkaTemplate<String, Location> locKafkaTemplate;
	private KafkaTemplate<String, PersonalInfo> personKafkaTemplate;
	private KafkaTemplate<String, Project> projKafkaTemplate;
	private KafkaTemplate<String, Skills> skillsKafkaTemplate;
	private String ACAD_TOPIC = "acad_data";
	private String CERTI_TOPIC = "certi_data";
	private String LOC_TOPIC = "loc_data";
	private String PERSON_TOPIC = "person_data";
	private String PROJ_TOPIC = "proj_data";
	private String SKILL_TOPIC = "skill_data";
	
	@Autowired
	public UpstreamServiceController(
			KafkaTemplate<String, AcademicDetails> acadKafkaTemplate,
			KafkaTemplate<String, Certification> certiKafkaTemplate, KafkaTemplate<String, Location> locKafkaTemplate,
			KafkaTemplate<String, PersonalInfo> personKafkaTemplate, KafkaTemplate<String, Project> projKafkaTemplate,
			KafkaTemplate<String, Skills> skillsKafkaTemplate) {
		super();
		this.acadKafkaTemplate = acadKafkaTemplate;
		this.certiKafkaTemplate = certiKafkaTemplate;
		this.locKafkaTemplate = locKafkaTemplate;
		this.personKafkaTemplate = personKafkaTemplate;
		this.projKafkaTemplate = projKafkaTemplate;
		this.skillsKafkaTemplate = skillsKafkaTemplate;
	}

	@PostMapping("api/v1/acad")
	public ResponseEntity<?> registerAcademicDetails(@RequestBody AcademicDetails academicDetails) {
		ResponseEntity<?> responseEntity;
		try {
			acadKafkaTemplate.send(ACAD_TOPIC, academicDetails);
			responseEntity = new ResponseEntity<String>("Created", HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>("Failed", HttpStatus.BAD_REQUEST);
		}
		return responseEntity;
	}

	@PostMapping("api/v1/certi")
	public ResponseEntity<?> registerCertification(@RequestBody Certification certification) {
		ResponseEntity<?> responseEntity;
		try {
			certiKafkaTemplate.send(CERTI_TOPIC, certification);
			responseEntity = new ResponseEntity<String>("Created", HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>("Failed", HttpStatus.BAD_REQUEST);
		}
		return responseEntity;
	}

	@PostMapping("api/v1/loc")
	public ResponseEntity<?> registerLocation(@RequestBody Location location) {
		ResponseEntity<?> responseEntity;
		try {
			locKafkaTemplate.send(LOC_TOPIC, location);
			responseEntity = new ResponseEntity<String>("Created", HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>("Failed", HttpStatus.BAD_REQUEST);
		}
		return responseEntity;
	}

	@PostMapping("api/v1/person")
	public ResponseEntity<?> registerPersonalInfo(@RequestBody PersonalInfo personalInfo) {
		ResponseEntity<?> responseEntity;
		try {
			personKafkaTemplate.send(PERSON_TOPIC, personalInfo);
			responseEntity = new ResponseEntity<String>("Created", HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>("Failed", HttpStatus.BAD_REQUEST);
		}
		return responseEntity;
	}

	@PostMapping("api/v1/proj")
	public ResponseEntity<?> registerProject(@RequestBody Project project) {
		ResponseEntity<?> responseEntity;
		try {
			projKafkaTemplate.send(PROJ_TOPIC, project);
			responseEntity = new ResponseEntity<String>("Created", HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>("Failed", HttpStatus.BAD_REQUEST);
		}
		return responseEntity;
	}

	@PostMapping("api/v1/skills")
	public ResponseEntity<?> registerSkills(@RequestBody Skills skills) {
		ResponseEntity<?> responseEntity;
		try {
			skillsKafkaTemplate.send(SKILL_TOPIC, skills);
			responseEntity = new ResponseEntity<String>("Created", HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>("Failed", HttpStatus.BAD_REQUEST);
		}
		return responseEntity;
	}
	
}
