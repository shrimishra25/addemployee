package com.employee.model;

public class User {
	private int empid;
	private String empname;
	private String careerlevel;
	private String duname;
	private String worklocation;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getCareerlevel() {
		return careerlevel;
	}
	public void setCareerlevel(String careerlevel) {
		this.careerlevel = careerlevel;
	}
	public String getDuname() {
		return duname;
	}
	public void setDuname(String duname) {
		this.duname = duname;
	}
	public String getWorklocation() {
		return worklocation;
	}
	public void setWorklocation(String worklocation) {
		this.worklocation = worklocation;
	}
	public User() {
		super();
	}
}
