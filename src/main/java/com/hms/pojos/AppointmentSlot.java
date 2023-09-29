package com.hms.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@Table(name = "appslot",    uniqueConstraints=
@UniqueConstraint(columnNames={"appDate", "appSlot","doctorId"})
)
public class AppointmentSlot extends BaseClass{
	private LocalDate appDate;
	@Column(name = "appslot", length = 10)
	private String appSlot;
	private int doctorId;
	public AppointmentSlot(LocalDate appDate, String appSlot, int doctorId) {
		super();
		this.appDate = appDate;
		this.appSlot = appSlot;
		this.doctorId = doctorId;
	}
	
	public AppointmentSlot(){
		
	}

	public LocalDate getAppDate() {
		return appDate;
	}

	public String getAppSlot() {
		return appSlot;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setAppDate(LocalDate appDate) {
		this.appDate = appDate;
	}

	public void setAppSlot(String appSlot) {
		this.appSlot = appSlot;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	
	
	
	
}
