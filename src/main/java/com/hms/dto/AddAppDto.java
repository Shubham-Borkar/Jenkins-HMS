package com.hms.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AddAppDto {
	@NotNull(message = "Appointment Date must not be blank")
	private LocalDate apointdate;
	@NotNull(message = "Slot Must not be blank")
	private String slot;
	private String symptoms;
	private int pid;
	private int did;
	public LocalDate getApointdate() {
		return apointdate;
	}
//	public String getSlot() {
//		return slot;
//	}
//	public String getSymptoms() {
//		return symptoms;
//	}
//	public int getPid() {
//		return pid;
//	}
//	public int getDid() {
//		return did;
//	}
//	public void setApointdate(LocalDate apointdate) {
//		this.apointdate = apointdate;
//	}
//	public void setSlot(String slot) {
//		this.slot = slot;
//	}
//	public void setSymptoms(String symptoms) {
//		this.symptoms = symptoms;
//	}
//	public void setPid(int pid) {
//		this.pid = pid;
//	}
//	public void setDid(int did) {
//		this.did = did;
//	}
//	
	

}
