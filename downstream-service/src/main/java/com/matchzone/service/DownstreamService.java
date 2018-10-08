package com.matchzone.service;

import com.matchzone.model.AcademicDetails;
import com.matchzone.model.Certification;
import com.matchzone.model.Location;
import com.matchzone.model.PersonalInfo;
import com.matchzone.model.Project;
import com.matchzone.model.Skills;

public interface DownstreamService
{
	
	// Academic Details
	boolean createAcademicDetails(AcademicDetails academicDetails);
	boolean deleteAcademicDetails(String id); // Doubt
	AcademicDetails updateAcademicDetails(AcademicDetails academicDetails, String id);
	AcademicDetails getAcademicDetails(String id);
	
	// Certification
	boolean createCertification(Certification certification);
	boolean deleteCertification(String id); // Doubt
	Certification updateCertification(Certification certification, String id);
	Certification getCertification(String id);
	
	// Location
	boolean createLocation(Location location);
	boolean deleteLocation(String id); // Doubt
	Location updateLocation(Location location, String id);
	Location getLocation(String id);
	
	// PersonalInfo
	boolean createPersonalInfo(PersonalInfo personalinfo);
	boolean deletePersonalInfo (String id); // Doubt
	PersonalInfo updatePersonalInfo(PersonalInfo personalinfo, String id);
	PersonalInfo getPersonalInfo(String id);
	
	// Project
	boolean createProject(Project project);
	boolean deleteProject(String id); // Doubt
	Project updateProject(Project project, String id);
	Project getProject(String id);
	
	// Skills
	boolean createSkills(Skills skills);
	boolean deleteSkills(String id); // Doubt
	Skills updateSkills(Skills skills, String id);
	Skills getSkills(String id);
	
}
