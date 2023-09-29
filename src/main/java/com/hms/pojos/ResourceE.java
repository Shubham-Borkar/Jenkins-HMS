package com.hms.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name="resource")
public class ResourceE extends BaseClass {
	@Column(length=30,unique=true)
	private String resource;
	private int totalCount;
	private int availableCount;
	
	
	public ResourceE() {
		
	}
	
	public ResourceE(String resource, int totalCount, int availableCount) {
		super();
		this.resource = resource;
		this.totalCount = totalCount;
		this.availableCount = availableCount;
	}
	public String getResource() {
		return resource;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public int getAvailableCount() {
		return availableCount;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}
	
	

}
