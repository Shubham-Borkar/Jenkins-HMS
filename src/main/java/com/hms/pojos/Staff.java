package com.hms.pojos;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Staff")
@NoArgsConstructor
@Getter
@Setter
public class Staff extends BaseClass {

	private String name;
	private String gender;
	private String address;
	@DateTimeFormat(pattern = "yy-MM-dd")
	private LocalDate dob;
	private long phone;
	@OneToOne(mappedBy = "staff", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Entry login;
	@JsonManagedReference 
	@OneToOne(mappedBy = "staff", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Doctor doctor;
	
	@Column(length=50)
	private String role;
	
	private String imagePath;

	@Override
	public String toString() {
		return "Staff [name=" + name + ", gender=" + gender + ", address=" + address + ", dob=" + dob + ", phone="
				+ phone + "]";
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}

	public LocalDate getDob() {
		return dob;
	}

	public long getPhone() {
		return phone;
	}

	public Entry getLogin() {
		return login;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public String getRole() {
		return role;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public void setLogin(Entry login) {
		this.login = login;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	

}
