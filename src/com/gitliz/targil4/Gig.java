package com.gitliz.targil4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Gig {

	private String name;
	private Date date;
	private String location;
	private Band band;
	
	public Gig(Gig originalGig) {
		this.name = new String(originalGig.getName());
		this.date = new Date(originalGig.getDate().getTime());
		this.band = new Band(originalGig.getBand());
		this.location = new String(originalGig.getLocation());
	}
	
	public Gig(String name, Date date, Band band, String location) {
		this.name = name;
		this.date = date;
		this.band = band;
		this.location = location;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Band getBand() {
		return band;
	}
	public void setBand(Band band) {
		this.band = band;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getHtmlDescription() {
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String dateStr = df.format(getDate());
		
		/*Date tmp = getDate();
		String ret = "<b>Name: </b>" + this.getName() + ", <b>Date: </b>" + tmp.getDate() + "/" + tmp.getMonth() + "/" + (1900 + tmp.getYear()) + "<br> <b>Band: </b>" + this.band.getHtmlDescription();*/
		String ret = "<b>Name: </b>" + this.getName() + ", <b>Date: </b>" + dateStr + "<br> <b>Band: </b>" + this.band.getHtmlDescription();
		
		return ret;
	}
	
	
	
	
	
	
	/*public String getHtmlDescription() {
		
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		String dateStr = df.format(getDate());
		
		//String ret = "<b>Gig:: Name: </b>" + getName() + ", <b>Date: </b>" + getDate().getMonth() + "/" + getDate().getDate() + "/" + (1900 + getDate().getYear()) + ", &emsp;<br>Band: </b>" + band.getHtmlDescription();
		String ret = "<b>Gig:: Name: </b>" + getName() + ", <b>Date: </b>" + dateStr + ", &emsp;<br>Band: </b>" + band.getHtmlDescription();
		
		return ret;
	}*/
	
	
}
