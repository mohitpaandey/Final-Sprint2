package com.matchzone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matchzone.model.AcademicDetails;
import com.matchzone.model.Certification;
import com.matchzone.model.Location;
import com.matchzone.model.PersonalInfo;
import com.matchzone.model.Project;
import com.matchzone.model.Skills;
import com.matchzone.repository.AcademicDetailsRepository;
import com.matchzone.repository.CertificationRepository;
import com.matchzone.repository.LocationRepository;
import com.matchzone.repository.PersonalInfoRepository;
import com.matchzone.repository.ProjectRepository;
import com.matchzone.repository.SkillsRepository;

@Service
public class DownstreamServiceImpl implements DownstreamService
{

	private AcademicDetailsRepository academicDetailsRepository;
	private CertificationRepository certificationRepository;
	private LocationRepository locationRepository;
	private PersonalInfoRepository personalInfoRepository;
	private ProjectRepository projectRepository;
	private SkillsRepository skillsRepository;
	
	@Autowired
	public DownstreamServiceImpl(AcademicDetailsRepository academicDetailsRepository,
			CertificationRepository certificationRepository, LocationRepository locationRepository,
			PersonalInfoRepository personalInfoRepository, ProjectRepository projectRepository,
			SkillsRepository skillsRepository) 
	{
		super();
		this.academicDetailsRepository = academicDetailsRepository;
		this.certificationRepository = certificationRepository;
		this.locationRepository = locationRepository;
		this.personalInfoRepository = personalInfoRepository;
		this.projectRepository = projectRepository;
		this.skillsRepository = skillsRepository;
	}

	@Override
	public boolean createAcademicDetails(AcademicDetails academicDetails) 
	{
		if(academicDetailsRepository.insert(academicDetails) == null)
			return false;
		return true;
	}

	@Override
	public boolean deleteAcademicDetails(String id) 
	{
		AcademicDetails academicDetails = academicDetailsRepository.findById(id).get();
		if(academicDetails == null)
			return false;
		academicDetailsRepository.delete(academicDetails);
		return true;
	}

	@Override
	public AcademicDetails updateAcademicDetails(AcademicDetails academicDetails, String id) 
	{
		AcademicDetails localAcademicDetails = academicDetailsRepository.findById(id).get();
		
		if(localAcademicDetails == null)
			return null;
		
		if(academicDetails.getCourse() != null)
			localAcademicDetails.setCourse(academicDetails.getCourse());
		
		if(academicDetails.getEducation() != null)
			localAcademicDetails.setEducation(academicDetails.getEducation());
		
		if(academicDetails.getGradingSystem() != null)
			localAcademicDetails.setGradingSystem(academicDetails.getGradingSystem());
		
		if(academicDetails.getHighDuration() != null)
			localAcademicDetails.setHighDuration(academicDetails.getHighDuration());
		
		if(academicDetails.getHigherSecondary() != null)
			localAcademicDetails.setHigherSecondary(academicDetails.getHigherSecondary());
		
		if(academicDetails.getHighLocation() != null)
			localAcademicDetails.setHighLocation(academicDetails.getHighLocation());
		
		if(academicDetails.getPassingYear() != null)
			localAcademicDetails.setPassingYear(academicDetails.getPassingYear());
		
		if(academicDetails.getSenDuration() != null)
			localAcademicDetails.setSenDuration(academicDetails.getSenDuration());
		
		if(academicDetails.getSenLocation() != null)
			localAcademicDetails.setSenLocation(academicDetails.getSenLocation());
		
		if(academicDetails.getSpecialisation() != null)
			localAcademicDetails.setSpecialisation(academicDetails.getSpecialisation());
		
		if(academicDetails.getUniversityInstitute() != null)
			localAcademicDetails.setUniversityInstitute(academicDetails.getUniversityInstitute());
		
		academicDetailsRepository.save(localAcademicDetails);
		return localAcademicDetails;
	}

	@Override
	public AcademicDetails getAcademicDetails(String id) {
		return academicDetailsRepository.findById(id).get();
	}

	@Override
	public boolean createCertification(Certification certification) 
	{
		if(certificationRepository.insert(certification) == null)
			return false;
		return true;
	}

	@Override
	public boolean deleteCertification(String id) 
	{
		Certification certification = certificationRepository.findById(id).get();
		if(certification == null)
			return false;
		certificationRepository.delete(certification);
		return true;
	}

	@Override
	public Certification updateCertification(Certification certification, String id) 
	{
		Certification localCertification = certificationRepository.findById(id).get();
		
		if(localCertification == null)
			return null;
		
		if(certification.getCertificationAuthority() != null)
			localCertification.setCertificationAuthority(certification.getCertificationAuthority());
		
		if(certification.getCertificationName() != null)
			localCertification.setCertificationName(certification.getCertificationName());
		
		if(certification.getCertificationURL() != null)
			localCertification.setCertificationURL(certification.getCertificationURL());
		
		if(certification.getDurationFrom() != null)
			localCertification.setDurationFrom(certification.getDurationFrom());
		
		if(certification.getDurationTo() != null)
			localCertification.setDurationTo(certification.getDurationTo());
		
		if(certification.getLicenseNumber() != null)
			localCertification.setLicenseNumber(certification.getLicenseNumber());

		certificationRepository.save(localCertification);
		return localCertification;
	}

	@Override
	public Certification getCertification(String id) {
		return certificationRepository.findById(id).get();
	}

	@Override
	public boolean createLocation(Location location) 
	{
		if(locationRepository.insert(location) == null)
			return false;
		return true;
	}

	@Override
	public boolean deleteLocation(String id) 
	{
		Location location = locationRepository.findById(id).get();
		if(location == null)
			return false;
		locationRepository.delete(location);
		return true;
	}

	@Override
	public Location updateLocation(Location location, String id) 
	{
		Location localLocation = locationRepository.findById(id).get();
		
		if(localLocation == null)
			return null;
		
		if(location.getCity() != null)
			localLocation.setCity(location.getCity());
		
		if(location.getCountry() != null)
			localLocation.setCountry(location.getCountry());
		
		if(location.getState() != null)
			localLocation.setState(location.getState());
		
		locationRepository.save(localLocation);
		return localLocation;
	}

	@Override
	public Location getLocation(String id) {
		return locationRepository.findById(id).get();
	}

	@Override
	public boolean createPersonalInfo(PersonalInfo personalinfo) 
	{
		if(personalInfoRepository.insert(personalinfo) == null)
			return false;
		return true;
	}

	@Override
	public boolean deletePersonalInfo(String id) 
	{
		PersonalInfo personalInfo = personalInfoRepository.findById(id).get();
		if(personalInfo == null)
			return false;
		personalInfoRepository.delete(personalInfo);
		return true;
	}

	@Override
	public PersonalInfo updatePersonalInfo(PersonalInfo personalinfo, String id) 
	{
		PersonalInfo localPersonalInfo = personalInfoRepository.findById(id).get();
		
		if(localPersonalInfo == null)
			return null;
		
		if(personalinfo.getAge() != null)
			localPersonalInfo.setAge(personalinfo.getAge());
		
		if(personalinfo.getBloodGroup() != null)
			localPersonalInfo.setBloodGroup(personalinfo.getBloodGroup());
		
		if(personalinfo.getDateOfBirth() != null)
			localPersonalInfo.setDateOfBirth(personalinfo.getDateOfBirth());
		
		if(personalinfo.getGender() != null)
			localPersonalInfo.setGender(personalinfo.getGender());
		
		if(personalinfo.getGitHubUrl() != null)
			localPersonalInfo.setGitHubUrl(personalinfo.getGitHubUrl());
		
		if(personalinfo.getHomeTown() != null)
			localPersonalInfo.setHomeTown(personalinfo.getHomeTown());
		
		if(personalinfo.getLanguages() != null)
			localPersonalInfo.setLanguages(personalinfo.getLanguages());
		
		if(personalinfo.getLinkedinUrl() != null)
			localPersonalInfo.setLinkedinUrl(personalinfo.getLinkedinUrl());
		
		if(personalinfo.getMaritalStatus() != null)
			localPersonalInfo.setMaritalStatus(personalinfo.getMaritalStatus());
		
		if(personalinfo.getPermanentAddress() != null)
			localPersonalInfo.setPermanentAddress(personalinfo.getPermanentAddress());
		
		if(personalinfo.getPinCode() != null)
			localPersonalInfo.setPinCode(personalinfo.getPinCode());
		
		if(personalinfo.getUserId() != null)
			localPersonalInfo.setUserId(personalinfo.getUserId());
		
		if(personalinfo.getUserName() != null)
			localPersonalInfo.setUserName(personalinfo.getUserName());
		
		if(personalinfo.getEmailId() != null)
			localPersonalInfo.setEmailId(personalinfo.getEmailId());
		
		personalInfoRepository.save(localPersonalInfo);
		return localPersonalInfo;
	}

	@Override
	public PersonalInfo getPersonalInfo(String id) {
		System.out.println(id);
		PersonalInfo personalInfo = personalInfoRepository.findById(id).get();
		return personalInfo;
	}

	@Override
	public boolean createProject(Project project) 
	{	
		if(projectRepository.insert(project) == null)
			return false;
		return true;
	}

	@Override
	public boolean deleteProject(String id) 
	{
		Project project = projectRepository.findById(id).get();
		if(project == null)
			return false;
		projectRepository.delete(project);
		return true;
	}

	@Override
	public Project updateProject(Project project, String id) 
	{
		Project localProject = projectRepository.findById(id).get();
		
		if(localProject == null)
			return null;
		
		if(project.getClient() != null)
			localProject.setClient(project.getClient());
		
		if(project.getDuration() != null)
			localProject.setDuration(project.getDuration());
		
		if(project.getProjectAt() != null)
			localProject.setProjectAt(project.getProjectAt());
		
		if(project.getProjectDetails() != null)
			localProject.setProjectDetails(project.getProjectDetails());
		
		if(project.getProjectLocation() != null)
			localProject.setProjectLocation(project.getProjectLocation());
		
		if(project.getProjectMembers() != null)
			localProject.setProjectMembers(project.getProjectMembers());
		
		if(project.getProjectStatus() != null)
			localProject.setProjectStatus(project.getProjectStatus());
		
		if(project.getProjectTitle() != null)
			localProject.setProjectTitle(project.getProjectTitle());
		
		if(project.getProjectURL() != null)
			localProject.setProjectURL(project.getProjectURL());
		
		if(project.getRole() != null)
			localProject.setRole(project.getRole());
		
		if(project.getSkills() != null)
			localProject.setSkills(project.getSkills());
		
		if(project.getTeamSize() != null)
			localProject.setTeamSize(project.getTeamSize());
		
		projectRepository.save(localProject);
		return localProject;
	}

	@Override
	public Project getProject(String id) {
		return projectRepository.findById(id).get();
	}

	@Override
	public boolean createSkills(Skills skills)
	{
		if(skillsRepository.insert(skills) == null)
			return false;
		return true;
	}

	@Override
	public boolean deleteSkills(String id) 
	{
		Skills skills = skillsRepository.findById(id).get();
		if(skills == null)
			return false;
		skillsRepository.delete(skills);
		return true;
	}

	@Override
	public Skills updateSkills(Skills skills, String id) 
	{
		Skills localSkills = skillsRepository.findById(id).get();
		
		if(localSkills == null)
			return null;
		
		if(skills.getITSkills() != null)
			localSkills.setITSkills(skills.getITSkills());
		
		if(skills.getLastUsed() != null)
			localSkills.setLastUsed(skills.getLastUsed());
		
		if(skills.getLevel() != null)
			localSkills.setLevel(skills.getLevel());
		
		if(skills.getVersion() != null)
			localSkills.setVersion(skills.getVersion());
	
		skillsRepository.save(localSkills);
		return localSkills;
	}

	@Override
	public Skills getSkills(String id) {
		return skillsRepository.findById(id).get();
	}

}
