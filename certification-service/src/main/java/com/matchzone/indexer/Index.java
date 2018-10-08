package com.matchzone.indexer;

public class Index {
	private String profileId;
	private String certificationName;
	private String certificationAuthority;
	private String licenseNumber;
	private Integer durationFrom;
	private Integer durationTo;
	private String certificationURL;

	public String getCertificationName() {
		return certificationName;
	}

	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}

	public String getCertificationAuthority() {
		return certificationAuthority;
	}

	public void setCertificationAuthority(String certificationAuthority) {
		this.certificationAuthority = certificationAuthority;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public Integer getDurationFrom() {
		return durationFrom;
	}

	public void setDurationFrom(Integer durationFrom) {
		this.durationFrom = durationFrom;
	}

	public Integer getDurationTo() {
		return durationTo;
	}

	public void setDurationTo(Integer durationTo) {
		this.durationTo = durationTo;
	}

	public String getCertificationURL() {
		return certificationURL;
	}

	public void setCertificationURL(String certificationURL) {
		this.certificationURL = certificationURL;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public Index(String profileId, String certificationName, String certificationAuthority, String licenseNumber,
			Integer durationFrom, Integer durationTo, String certificationURL) {
		super();
		this.profileId = profileId;
		this.certificationName = certificationName;
		this.certificationAuthority = certificationAuthority;
		this.licenseNumber = licenseNumber;
		this.durationFrom = durationFrom;
		this.durationTo = durationTo;
		this.certificationURL = certificationURL;
	}

	public Index() {
		super();
	}
	
	

}
