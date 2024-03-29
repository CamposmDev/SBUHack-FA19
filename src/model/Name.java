package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Name implements Serializable {
	private String firstName;
	private String lastName;
	private Gender gender;
	
	public Name(String firstName, String lastName, Gender gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = Gender.Not_Specified;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Gender getGender() {
		return gender;
	}
	
	
}
