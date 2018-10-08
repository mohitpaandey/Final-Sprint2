package com.matchzone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Certification {

	private String profileId;
	private String certificationName;
	private String certificationAuthority;
	private String licenseNumber;
	private Integer durationFrom;
	private Integer durationTo;
	private String certificationURL;

	
}
