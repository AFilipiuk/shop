package CakeShop.shop.domain;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Person {

	private String firstName = "unknown";
	private String surName = "unknown";
	private String zipCode = "XX-XXX";
	private String address = "max 100 znaków";
	private String pin = "XXXX";
	private String spec = "max 30 znaków";
	private Date dateOfBirth = new Date();


	@Size(min = 2, max = 20)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Pattern(regexp = "[0-9]{2}-[0-9]{3}")
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Size(min = 2)
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}


	@Past
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}

}