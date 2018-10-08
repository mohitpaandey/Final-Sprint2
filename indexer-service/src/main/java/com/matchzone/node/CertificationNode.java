package com.matchzone.node;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class CertificationNode {
	@Id
	//private Long id;
	private String certificateName;
	//private String certificateLicense;
	
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	
	public CertificationNode(String certificateName) {
		super();
	
		this.certificateName = certificateName;
		
	}
	

}
