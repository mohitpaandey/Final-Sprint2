package com.matchzone.indexer;

public class SourceNodeProperty {
	private String secondaryPercentage;
	private String higherPercentage;
	private String btechPercentage;
	public String getSecondaryPercentage() {
		return secondaryPercentage;
	}
	public void setSecondaryPercentage(String secondaryPercentage) {
		this.secondaryPercentage = secondaryPercentage;
	}
	public String getHigherPercentage() {
		return higherPercentage;
	}
	public void setHigherPercentage(String higherPercentage) {
		this.higherPercentage = higherPercentage;
	}
	public String getBtechPercentage() {
		return btechPercentage;
	}
	public void setBtechPercentage(String btechPercentage) {
		this.btechPercentage = btechPercentage;
	}
	public SourceNodeProperty()
	{
		super();
	}
	public SourceNodeProperty(String secondaryPercentage, String higherPercentage, String btechPercentage) {
		super();
		this.secondaryPercentage = secondaryPercentage;
		this.higherPercentage = higherPercentage;
		this.btechPercentage = btechPercentage;
	}

}
