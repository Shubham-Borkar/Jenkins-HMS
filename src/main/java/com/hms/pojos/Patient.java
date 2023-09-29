package com.hms.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Patient")
public class Patient extends BaseClass {

	private String name;
	private String gender;

	@DateTimeFormat(pattern = "yy-MM-dd")
	private LocalDate dob;
	private long phone;
	private String address;

	@JsonIgnore
	@OneToMany(mappedBy = "patient") // parent side ,inverse side
	private List<Appointment> appointmentList = new ArrayList<Appointment>();
	@JsonIgnore
	@OneToOne(mappedBy = "patient", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Entry login;
	
	private String imagePath;

	@Override
	public String toString() {
		return "Patient [name=" + name + ", gender=" + gender + ", dob=" + dob + ", phone=" + phone + ", address="
				+ address + "]";
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public long getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public Entry getLogin() {
		return login;
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

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

	public void setLogin(Entry login) {
		this.login = login;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	
	
}
