package com.hms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
public class SigninResponse {
	private String jwt;
	private String mesg;
	private String role;
	public SigninResponse(String jwt, String mesg, String role) {
		super();
		this.jwt = jwt;
		this.mesg = mesg;
		this.role = role;
	}
	
	
}
