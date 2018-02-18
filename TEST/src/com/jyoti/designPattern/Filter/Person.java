package com.jyoti.designPattern.Filter;

public class Person {

	private String Name;
	private String Gender;
	private String MaritalStatus;
		
	public Person(String name, String gender, String maritalStatus) {
		super();
		Name = name;
		Gender = gender;
		MaritalStatus = maritalStatus;
	}

	public String getName() {
		return Name;
	}
	public String getGender() {
		return Gender;
	}
	public String getMaritalStatus() {
		return MaritalStatus;
	}

}
