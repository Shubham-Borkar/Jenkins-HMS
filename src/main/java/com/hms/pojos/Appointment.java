package com.hms.pojos;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Appointment")
@Getter
@Setter
@NoArgsConstructor
public class Appointment extends BaseClass {
	@DateTimeFormat(pattern = "yy-MM-dd")
	private LocalDate apointdate;
	@Column(length=10)
	private String slot;
	@Column(length=100)
	private String symptoms;
	@Column(length=100)
	private String prescribe;
	
	
	@ManyToOne
	@JoinColumn(name = "pid")
	private Patient patient;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;
	@JsonIgnore
	@OneToOne(mappedBy = "appoint")
	private Invoice invoice;
	@Column(columnDefinition="tinyint(1) default 0")
	private boolean status;
    @JsonIgnore
    @OneToOne
	private AppointmentSlot appointSlot;
//	private boolean checkedStatus;
//	private String Prescription;


	@Override
	public String toString() {
		return "Appointment [apointdate=" + apointdate + ", slot=" + slot + ", symptoms=" + symptoms + "]";
	}


	public LocalDate getApointdate() {
		return apointdate;
	}


	public String getSlot() {
		return slot;
	}


	public String getSymptoms() {
		return symptoms;
	}


	public String getPrescribe() {
		return prescribe;
	}


	public Patient getPatient() {
		return patient;
	}


	public Doctor getDoctor() {
		return doctor;
	}


	public Invoice getInvoice() {
		return invoice;
	}


	public boolean isStatus() {
		return status;
	}


	public AppointmentSlot getAppointSlot() {
		return appointSlot;
	}


	public void setApointdate(LocalDate apointdate) {
		this.apointdate = apointdate;
	}


	public void setSlot(String slot) {
		this.slot = slot;
	}


	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}


	public void setPrescribe(String prescribe) {
		this.prescribe = prescribe;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public void setAppointSlot(AppointmentSlot appointSlot) {
		this.appointSlot = appointSlot;
	}
	
	
	//
	

}
