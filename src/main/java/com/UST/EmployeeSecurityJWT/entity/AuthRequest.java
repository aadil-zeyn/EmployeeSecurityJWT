package com.UST.EmployeeSecurityJWT.entity;

public class AuthRequest {
	private String usesrname;
	private String password;
	public String getUsesrname() {
		return usesrname;
	}
	public void setUsesrname(String usesrname) {
		this.usesrname = usesrname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AuthRequest(String usesrname, String password) {
		
		this.usesrname = usesrname;
		this.password = password;
	}
	
}
