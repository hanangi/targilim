package com.gitliz.targil6;

import java.util.Date;

public class Car {

	public enum Color {
		White, Black, Blue
	}

	private String id;
	private Color color;
	private Date creation;
	private String brand;

	private Sit[] sits;

	public Car(String id, String brand, int numberOfSits) {
		this.id = id;
		this.brand = brand;

		this.sits = new Sit[numberOfSits];
	}

	public Car(Car car) {
		this(new String (car.getId()), new String (car.getBrand()), car.getSits().length);

		//		this.setId( new String(car.getId()) );
		this.setColor(car.getColor());
		
		this.creation = new Date( car.getCreation().getTime()  );
		
		//		this.setBrand( new String (car.getBrand()) );

		Sit[] coppied = car.getSits();
		for (int i = 0; i < coppied.length; i++) {
			this.sits[i] = new Sit( coppied[i] );
		}

	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Date getCreation() {
		return creation;
	}
	public void setCreation(Date creation) {
		this.creation = creation;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", color=" + color + ", creation=" + creation
				+ ", brand=" + brand + "]";
	}

	public Sit[] getSits() {
		return sits;
	}

	public void setSits(Sit[] sits) {
		this.sits = sits;
	}



}
