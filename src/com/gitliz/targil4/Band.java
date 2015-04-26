package com.gitliz.targil4;

import java.util.Date;

public class Band {

	private String name;
	private String[] members;
	private Date creationDate;
	
	public Band(String name) {
		this.name = name;
	}
	
	public Band(Band band) {
		this.name = new String(band.getName());
		//this.members =
		this.creationDate= new Date(band.getCreationDate().getTime());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getMembers() {
		return members;
	}
	public void setMembers(String[] members) {
		this.members = members;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public String getHtmlDescription() {
		return "<b>Name: </b>" + getName();
	}
	
	
}
