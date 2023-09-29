package com.hms.dto;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@AllArgsConstructor
//@NoArgsConstructor
public class DoctorDto {
	    private Integer id;
	    @NotEmpty(message="Name must not be Empty")
	    @Size(min=2,max=40,message="Name must be between 2 and 40 characters")
		private String name;
	    @NotEmpty(message="Gender must not be Empty")
		private String gender;
		private LocalDate dob;
		private long phone;
		private String address;
	    
		
		private String education;
	    private String speciality;
	    @JsonProperty(access=Access.READ_ONLY)
	    private int staffid;
	    
	    
	    
	    public DoctorDto() {
	    	
	    }
		public DoctorDto(Integer id,
				@NotEmpty(message = "Name must not be Empty") @Size(min = 2, max = 40, message = "Name must be between 2 and 40 characters") String name,
				@NotEmpty(message = "Gender must not be Empty") String gender, LocalDate dob, long phone,
				String address, String education, String speciality, int staffid) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.dob = dob;
			this.phone = phone;
			this.address = address;
			this.education = education;
			this.speciality = speciality;
			this.staffid = staffid;
		}
		public Integer getId() {
			return id;
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
		public String getEducation() {
			return education;
		}
		public String getSpeciality() {
			return speciality;
		}
		public int getStaffid() {
			return staffid;
		}
		public void setId(Integer id) {
			this.id = id;
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
		public void setEducation(String education) {
			this.education = education;
		}
		public void setSpeciality(String speciality) {
			this.speciality = speciality;
		}
		public void setStaffid(int staffid) {
			this.staffid = staffid;
		}
	    

}
