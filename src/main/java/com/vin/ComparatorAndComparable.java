package com.vin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAndComparable {
	public static void main(String args[]) {
		List<Vehicle> l1 = new ArrayList<Vehicle>();
		l1.add(new Vehicle("1000CC", "RED", 4, "Car"));
		l1.add(new Vehicle("100CC", "BLUE", 2, "Bike"));
		l1.add(new Vehicle("2000CC", "RED", 6, "Truck"));
		l1.add(new Vehicle("200CC", "PINK", 3, "Auto"));
		
		Collections.sort(l1);
		l1.forEach(x-> System.out.println(x.getName()));
		
		List<student> l2 = new ArrayList<student>();
		l2.add(new student(3, "ram"));
		l2.add(new student(12, "rahim"));
		l2.add(new student(1, "mohan"));
		l2.add(new student(4, "sohan"));

//		Comparator<student> cmp = new Comparator<student>() {
//			public int compare(student o1, student o2) {
//				int retValue = o1.getRollnumber() > o2.getRollnumber() ? 1 : -1;
//				return o1.getRollnumber() == o2.getRollnumber() ? 0 : retValue;
//			};
//		};
//		
//		Collections.sort(l2, (o1,o2) -> {
//			int retValue = o1.getRollnumber() > o2.getRollnumber() ? 1 : -1;
//			return o1.getRollnumber() == o2.getRollnumber() ? 0 : retValue;
//		});
		
		
		Collections.sort(l2, (student1,student2) -> student1.getRollnumber() > student2.getRollnumber() ? 1 : -1);

		
		l2.forEach(x-> System.out.println(x.getName()));

	}
}

class student {
	private int rollnumber;
	private String Name;
	
	student(int rollnumber,String Name) {
		this.rollnumber = rollnumber;
		this.Name = Name;
	}
	
	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}


class Vehicle implements Comparable<Vehicle> {
	private String engine;
	private String color;
	private int noOfWheels;
	private String Name;
	
	Vehicle(String engine,String color,int noOfWheels,String Name) {
		this.color = color;
		this.engine = engine;
		this.noOfWheels = noOfWheels;
		this.Name = Name;
	}
	
	public int compareTo(Vehicle v) {
		int retValue = v.noOfWheels > this.noOfWheels ? 1 : -1;
		return v.noOfWheels == this.noOfWheels ? 0 : retValue;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
	
}