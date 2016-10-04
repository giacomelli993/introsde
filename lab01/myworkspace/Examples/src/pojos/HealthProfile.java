package pojos;

import java.util.Date;

public class HealthProfile {
	private double weight; // in kg
	private double height; // in m

	public HealthProfile(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	public HealthProfile() {
		this.weight = 85.5;
		this.height = 1.72;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public Person createPerson(String fname, String lname, Date date){
		Person p = new Person(fname, lname, date);
		return p;
	}
	public void updateHealthProfile(double weight,double height ){
		this.height = height;
		this.weight = weight;
	}
	public String toString() {
		return "Height="+height+", Weight="+weight;
	}

	// add accessor for the newly created BMI
	// the getter can respond with the calculation (weight divided the height in meters elevated to the power of 2) 
}
