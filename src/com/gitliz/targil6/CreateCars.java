package com.gitliz.targil6;

import java.util.Calendar;

public class CreateCars {

	public static void main(String[] args) {

		Car first = new Car("12-fed-87", "Toyota", 4);
		first.setColor(Car.Color.White);

		Calendar cal = Calendar.getInstance();
		cal.set(1990, 1, 15);

		first.setCreation(cal.getTime());

		Car[] cars = new Car[10];
		for (int i = 0; i < 10; i++) {
			Car current = new Car(first);
			current.setId(current.getId() + "_" + i);
			cars[i] = current;
		}

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	}
}
