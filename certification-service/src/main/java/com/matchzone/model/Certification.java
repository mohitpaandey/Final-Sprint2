package com.matchzone.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class Certification {

	private String userName;
	private String certificationName;
	private String certificationAuthority;
	private String licenseNumber;
	private Integer durationFrom;
	private Integer durationTo;
	private String certificationURL;

	
}
