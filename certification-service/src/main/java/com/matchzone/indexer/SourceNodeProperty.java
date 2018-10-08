package com.matchzone.indexer;

public class SourceNodeProperty {
private String certificateName;
private String certificateLicenseNumber;
public String getCertificateName() {
	return certificateName;
}
public void setCertificateName(String certificateName) {
	this.certificateName = certificateName;
}
public String getCertificateLicenseNumber() {
	return certificateLicenseNumber;
}
public void setCertificateLicenseNumber(String certificateLicenseNumber) {
	this.certificateLicenseNumber = certificateLicenseNumber;
}
public SourceNodeProperty(String certificateName, String certificateLicenseNumber) {
	//super();
	this.certificateName = certificateName;
	this.certificateLicenseNumber = certificateLicenseNumber;
}
public SourceNodeProperty() {
	super();
}


}
