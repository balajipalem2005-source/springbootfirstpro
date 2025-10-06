package com.example.FirstStart.Pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String fathername;
	private String mothername;
	private String currentaddress;
	private String tempopraryaddress;
	private String state;
	private String country;
	private String email;
	private String adharnumber;
	private String passpoartnumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getCurrentaddress() {
		return currentaddress;
	}

	public void setCurrentaddress(String currentaddress) {
		this.currentaddress = currentaddress;
	}

	public String getTempopraryaddress() {
		return tempopraryaddress;
	}

	public void setTempopraryaddress(String tempopraryaddress) {
		this.tempopraryaddress = tempopraryaddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdharnumber() {
		return adharnumber;
	}

	public void setAdharnumber(String adharnumber) {
		this.adharnumber = adharnumber;
	}

	public String getPasspoartnumber() {
		return passpoartnumber;
	}

	public void setPasspoartnumber(String passpoartnumber) {
		this.passpoartnumber = passpoartnumber;
	}

}
